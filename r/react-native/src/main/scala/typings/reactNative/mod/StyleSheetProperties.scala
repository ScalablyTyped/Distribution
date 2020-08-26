package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetProperties extends js.Object {
  var hairlineWidth: Double = js.native
  def flatten[T /* <: String */](style: T): T = js.native
}

object StyleSheetProperties {
  @scala.inline
  def apply(flatten: js.Any => js.Any, hairlineWidth: Double): StyleSheetProperties = {
    val __obj = js.Dynamic.literal(flatten = js.Any.fromFunction1(flatten), hairlineWidth = hairlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetProperties]
  }
  @scala.inline
  implicit class StyleSheetPropertiesOps[Self <: StyleSheetProperties] (val x: Self) extends AnyVal {
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
    def setFlatten(value: js.Any => js.Any): Self = this.set("flatten", js.Any.fromFunction1(value))
    @scala.inline
    def setHairlineWidth(value: Double): Self = this.set("hairlineWidth", value.asInstanceOf[js.Any])
  }
  
}

