package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketOptions extends StObject {
  
  var market: js.UndefOr[String] = js.undefined
}
object MarketOptions {
  
  @scala.inline
  def apply(): MarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketOptions]
  }
  
  @scala.inline
  implicit class MarketOptionsMutableBuilder[Self <: MarketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarket(value: String): Self = StObject.set(x, "market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketUndefined: Self = StObject.set(x, "market", js.undefined)
  }
}
