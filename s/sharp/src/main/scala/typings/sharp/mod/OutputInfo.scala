package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputInfo extends js.Object {
  var channels: Double = js.native
  /** Only defined when using a crop strategy */
  var cropOffsetLeft: js.UndefOr[Double] = js.native
  /** Only defined when using a crop strategy */
  var cropOffsetTop: js.UndefOr[Double] = js.native
  var format: String = js.native
  var height: Double = js.native
  /** indicating if premultiplication was used */
  var premultiplied: Boolean = js.native
  var size: Double = js.native
  var width: Double = js.native
}

object OutputInfo {
  @scala.inline
  def apply(
    channels: Double,
    format: String,
    height: Double,
    premultiplied: Boolean,
    size: Double,
    width: Double
  ): OutputInfo = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], premultiplied = premultiplied.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputInfo]
  }
  @scala.inline
  implicit class OutputInfoOps[Self <: OutputInfo] (val x: Self) extends AnyVal {
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
    def setChannels(value: Double): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPremultiplied(value: Boolean): Self = this.set("premultiplied", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropOffsetLeft(value: Double): Self = this.set("cropOffsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropOffsetLeft: Self = this.set("cropOffsetLeft", js.undefined)
    @scala.inline
    def setCropOffsetTop(value: Double): Self = this.set("cropOffsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropOffsetTop: Self = this.set("cropOffsetTop", js.undefined)
  }
  
}

