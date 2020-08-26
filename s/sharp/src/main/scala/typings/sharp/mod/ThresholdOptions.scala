package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdOptions extends js.Object {
  /** alternative spelling for greyscale. (optional, default true) */
  var grayscale: js.UndefOr[Boolean] = js.native
  /** convert to single channel greyscale. (optional, default true) */
  var greyscale: js.UndefOr[Boolean] = js.native
}

object ThresholdOptions {
  @scala.inline
  def apply(): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdOptions]
  }
  @scala.inline
  implicit class ThresholdOptionsOps[Self <: ThresholdOptions] (val x: Self) extends AnyVal {
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
    def setGrayscale(value: Boolean): Self = this.set("grayscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrayscale: Self = this.set("grayscale", js.undefined)
    @scala.inline
    def setGreyscale(value: Boolean): Self = this.set("greyscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreyscale: Self = this.set("greyscale", js.undefined)
  }
  
}

