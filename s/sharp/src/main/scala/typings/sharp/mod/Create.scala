package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  /** Parsed by the [color](https://www.npmjs.org/package/color) module to extract values for red, green, blue and alpha. */
  var background: Color = js.native
  /** Number of bands e.g. 3 for RGB, 4 for RGBA */
  var channels: Channels = js.native
  /** Number of pixels high. */
  var height: Double = js.native
  /** Number of pixels wide. */
  var width: Double = js.native
}

object Create {
  @scala.inline
  def apply(background: Color, channels: Channels, height: Double, width: Double): Create = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
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
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannels(value: Channels): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

