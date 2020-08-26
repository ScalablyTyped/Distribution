package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityValue extends js.Object {
  /**
    * The maximum value of this component's range. (should be an integer)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value of this component's range. (should be an integer)
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * The current value of this component's range. (should be an integer)
    */
  var now: js.UndefOr[Double] = js.native
  /**
    * A textual description of this component's value. (will override minimum, current, and maximum if set)
    */
  var text: js.UndefOr[String] = js.native
}

object AccessibilityValue {
  @scala.inline
  def apply(): AccessibilityValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityValue]
  }
  @scala.inline
  implicit class AccessibilityValueOps[Self <: AccessibilityValue] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setNow(value: Double): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

