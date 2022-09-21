package typings.steamcommunity

import typings.steamcommunity.anon.Hour
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cmarketitemMod {
  
  inline def apply(appid: Any, hashName: Any, community: Any, body: Any, $: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(appid.asInstanceOf[js.Any], hashName.asInstanceOf[js.Any], community.asInstanceOf[js.Any], body.asInstanceOf[js.Any], $.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("steamcommunity/classes/CMarketItem", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CMarketItem {
    def this(appid: Any, hashName: Any, community: Any, body: Any, $: Any) = this()
  }
  @JSImport("steamcommunity/classes/CMarketItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait CMarketItem extends StObject {
    
    var assets: Any = js.native
    
    /** `true` if this is a commodity item (buy/sell orders) or `false` otherwise. */
    var commodity: Boolean = js.native
    
    /** If this is a commodity item, this will be the item's commodity ID. Not defined otherwise. */
    var commodityID: Double = js.native
    
    var firstAsset: Any = js.native
    
    /** The lowest price at which this item is sold, in cents. */
    var lowestPrice: Double = js.native
    
    var medianSalePrices: js.Array[Hour] = js.native
    
    /** How many copies of this item are currently available on the market. */
    var quantity: Double = js.native
    
    /**
      * If this is a commodity item, you can call this to fetch the latest prices.
      * If not a commodity, this will throw an Error. Once complete, quantity, lowestPrice, buyQuantity, and highestBuyOrder will be updated.
      *
      * @param currency
      * @param callback Optional. Fired when the data is updated.
      */
    def updatePrice(currency: String): Unit = js.native
    def updatePrice(currency: String, callback: Any): Unit = js.native
  }
}
