package typings.steamcommunity

import typings.steamcommunity.mod.appid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classesCmarketsearchresultMod {
  
  inline def apply(row: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(row.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * A class which represents a search result on the Steam Community Market. Returned in the callback to marketSearch.
    */
  @JSImport("steamcommunity/classes/CMarketSearchResult", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CMarketSearchResult {
    def this(row: Any) = this()
    
    /** The AppID of the game to which this item belongs. */
    /* CompleteClass */
    var appid: typings.steamcommunity.mod.appid = js.native
    
    /** A URL to a 512x512 image of this item. You can get custom sizes by simply appending your desired size to this URL. For example, to get a 64x64 image, just use item.image + '64x64'. */
    /* CompleteClass */
    var image: String = js.native
    
    /** The market_hash_name of the item, otherwise known as the English version of the item's name on the market. */
    /* CompleteClass */
    var market_hash_name: String = js.native
    
    /** The lowest price of this item on the market, in the lowest denomination of your currency (e.g. USD cents). */
    /* CompleteClass */
    var price: Double = js.native
    
    /** How many of this item there are currently listed on the market. */
    /* CompleteClass */
    var quantity: Double = js.native
  }
  @JSImport("steamcommunity/classes/CMarketSearchResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A class which represents a search result on the Steam Community Market. Returned in the callback to marketSearch.
    */
  trait CMarketSearchResult extends StObject {
    
    /** The AppID of the game to which this item belongs. */
    var appid: typings.steamcommunity.mod.appid
    
    /** A URL to a 512x512 image of this item. You can get custom sizes by simply appending your desired size to this URL. For example, to get a 64x64 image, just use item.image + '64x64'. */
    var image: String
    
    /** The market_hash_name of the item, otherwise known as the English version of the item's name on the market. */
    var market_hash_name: String
    
    /** The lowest price of this item on the market, in the lowest denomination of your currency (e.g. USD cents). */
    var price: Double
    
    /** How many of this item there are currently listed on the market. */
    var quantity: Double
  }
  object CMarketSearchResult {
    
    inline def apply(appid: appid, image: String, market_hash_name: String, price: Double, quantity: Double): CMarketSearchResult = {
      val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], market_hash_name = market_hash_name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMarketSearchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CMarketSearchResult] (val x: Self) extends AnyVal {
      
      inline def setAppid(value: appid): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setMarket_hash_name(value: String): Self = StObject.set(x, "market_hash_name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    }
  }
}
