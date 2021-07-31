package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Followers Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait FollowersObject extends StObject {
  
  var href: String
  
  var total: Double
}
object FollowersObject {
  
  @scala.inline
  def apply(href: String, total: Double): FollowersObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowersObject]
  }
  
  @scala.inline
  implicit class FollowersObjectMutableBuilder[Self <: FollowersObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
