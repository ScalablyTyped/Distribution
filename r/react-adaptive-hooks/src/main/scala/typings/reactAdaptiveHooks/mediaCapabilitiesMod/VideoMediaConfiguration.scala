package typings.reactAdaptiveHooks.mediaCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoMediaConfiguration extends js.Object {
  var bitrate: Double = js.native
  var contentType: String = js.native
  var framerate: Double = js.native
  var height: Double = js.native
  var width: Double = js.native
}

object VideoMediaConfiguration {
  @scala.inline
  def apply(bitrate: Double, contentType: String, framerate: Double, height: Double, width: Double): VideoMediaConfiguration = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMediaConfiguration]
  }
  @scala.inline
  implicit class VideoMediaConfigurationOps[Self <: VideoMediaConfiguration] (val x: Self) extends AnyVal {
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramerate(value: Double): Self = this.set("framerate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

