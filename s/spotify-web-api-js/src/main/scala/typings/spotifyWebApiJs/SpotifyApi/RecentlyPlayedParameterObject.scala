package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentlyPlayedParameterObject extends StObject {
  
  var after: js.UndefOr[Double] = js.native
  
  var before: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
}
object RecentlyPlayedParameterObject {
  
  @scala.inline
  def apply(): RecentlyPlayedParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentlyPlayedParameterObject]
  }
  
  @scala.inline
  implicit class RecentlyPlayedParameterObjectMutableBuilder[Self <: RecentlyPlayedParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
