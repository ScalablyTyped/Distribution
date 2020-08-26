package typings.sharp.mod

import typings.sharp.sharpNumbers.`1`
import typings.sharp.sharpNumbers.`2`
import typings.sharp.sharpNumbers.`3`
import typings.sharp.sharpNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Raw extends js.Object {
  var channels: `1` | `2` | `3` | `4` = js.native
  var height: Double = js.native
  var width: Double = js.native
}

object Raw {
  @scala.inline
  def apply(channels: `1` | `2` | `3` | `4`, height: Double, width: Double): Raw = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  @scala.inline
  implicit class RawOps[Self <: Raw] (val x: Self) extends AnyVal {
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
    def setChannels(value: `1` | `2` | `3` | `4`): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

