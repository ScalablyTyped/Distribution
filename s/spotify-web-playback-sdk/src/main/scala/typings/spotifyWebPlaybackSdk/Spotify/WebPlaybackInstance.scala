package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPlaybackInstance extends js.Object {
  var device_id: String = js.native
}

object WebPlaybackInstance {
  @scala.inline
  def apply(device_id: String): WebPlaybackInstance = {
    val __obj = js.Dynamic.literal(device_id = device_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPlaybackInstance]
  }
  @scala.inline
  implicit class WebPlaybackInstanceOps[Self <: WebPlaybackInstance] (val x: Self) extends AnyVal {
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
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
  }
  
}

