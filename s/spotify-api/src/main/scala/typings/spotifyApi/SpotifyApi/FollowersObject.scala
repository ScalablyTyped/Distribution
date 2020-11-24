package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Followers Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait FollowersObject extends js.Object {
  
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
  implicit class FollowersObjectOps[Self <: FollowersObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHref(value: Null): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
