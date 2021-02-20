package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Followers Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait FollowersObject extends StObject {
  
  /**
    * A link to the Web API endpoint providing full details of the followers; `null` if not available.
    * Please note that this will always be set to `null`, as the Web API does not support it at the moment.
    */
  var href: Null = js.native
  
  /**
    * The total number of followers.
    */
  var total: Double = js.native
}
object FollowersObject {
  
  @scala.inline
  def apply(href: Null, total: Double): FollowersObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowersObject]
  }
  
  @scala.inline
  implicit class FollowersObjectMutableBuilder[Self <: FollowersObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: Null): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
