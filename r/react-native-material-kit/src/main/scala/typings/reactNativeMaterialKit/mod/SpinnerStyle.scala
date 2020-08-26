package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerStyle extends js.Object {
  var strokeColor: js.UndefOr[js.Array[String]] = js.native
}

object SpinnerStyle {
  @scala.inline
  def apply(): SpinnerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerStyle]
  }
  @scala.inline
  implicit class SpinnerStyleOps[Self <: SpinnerStyle] (val x: Self) extends AnyVal {
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
    def setStrokeColorVarargs(value: String*): Self = this.set("strokeColor", js.Array(value :_*))
    @scala.inline
    def setStrokeColor(value: js.Array[String]): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
  }
  
}

