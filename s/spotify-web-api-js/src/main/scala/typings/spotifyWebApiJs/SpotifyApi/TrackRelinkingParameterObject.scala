package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackRelinkingParameterObject extends StObject {
  
  var market: js.UndefOr[String] = js.native
}
object TrackRelinkingParameterObject {
  
  @scala.inline
  def apply(): TrackRelinkingParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackRelinkingParameterObject]
  }
  
  @scala.inline
  implicit class TrackRelinkingParameterObjectMutableBuilder[Self <: TrackRelinkingParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarket(value: String): Self = StObject.set(x, "market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketUndefined: Self = StObject.set(x, "market", js.undefined)
  }
}
