package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Followers Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait FollowersObject extends StObject {
  
  /**
    * A link to the Web API endpoint providing full details of the followers; `null` if not available.
    * Please note that this will always be set to `null`, as the Web API does not support it at the moment.
    */
  var href: Null
  
  /**
    * The total number of followers.
    */
  var total: Double
}
object FollowersObject {
  
  inline def apply(href: Null, total: Double): FollowersObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowersObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FollowersObject] (val x: Self) extends AnyVal {
    
    inline def setHref(value: Null): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
