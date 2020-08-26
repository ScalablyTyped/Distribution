package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.native
  var maximumAge: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object PositionOptions {
  @scala.inline
  def apply(): PositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionOptions]
  }
  @scala.inline
  implicit class PositionOptionsOps[Self <: PositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableHighAccuracy(value: scala.Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

