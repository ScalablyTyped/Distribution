package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestrictionsObject extends js.Object {
  var reason: String = js.native
}

object RestrictionsObject {
  @scala.inline
  def apply(reason: String): RestrictionsObject = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictionsObject]
  }
  @scala.inline
  implicit class RestrictionsObjectOps[Self <: RestrictionsObject] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

