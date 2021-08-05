package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackRelinkingParameterObject extends StObject {
  
  var market: js.UndefOr[String] = js.undefined
}
object TrackRelinkingParameterObject {
  
  inline def apply(): TrackRelinkingParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackRelinkingParameterObject]
  }
  
  extension [Self <: TrackRelinkingParameterObject](x: Self) {
    
    inline def setMarket(value: String): Self = StObject.set(x, "market", value.asInstanceOf[js.Any])
    
    inline def setMarketUndefined: Self = StObject.set(x, "market", js.undefined)
  }
}
