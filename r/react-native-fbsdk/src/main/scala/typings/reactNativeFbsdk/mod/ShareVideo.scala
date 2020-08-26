package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareVideo extends js.Object {
  /**
    * The URL to the video. Must point to the location of the video on disk.
    */
  var localUrl: String = js.native
}

object ShareVideo {
  @scala.inline
  def apply(localUrl: String): ShareVideo = {
    val __obj = js.Dynamic.literal(localUrl = localUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareVideo]
  }
  @scala.inline
  implicit class ShareVideoOps[Self <: ShareVideo] (val x: Self) extends AnyVal {
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
    def setLocalUrl(value: String): Self = this.set("localUrl", value.asInstanceOf[js.Any])
  }
  
}

