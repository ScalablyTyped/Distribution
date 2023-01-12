package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecentlyPlayedParameterObject extends StObject {
  
  var after: js.UndefOr[Double] = js.undefined
  
  var before: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
}
object RecentlyPlayedParameterObject {
  
  inline def apply(): RecentlyPlayedParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentlyPlayedParameterObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecentlyPlayedParameterObject] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
