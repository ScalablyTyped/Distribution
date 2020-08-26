package typings.reactNativeKeyboardSpacer.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardSpacerProps extends js.Object {
  var onToggle: js.UndefOr[js.Function2[/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double, Unit]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var topSpacing: js.UndefOr[Double] = js.native
}

object KeyboardSpacerProps {
  @scala.inline
  def apply(): KeyboardSpacerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardSpacerProps]
  }
  @scala.inline
  implicit class KeyboardSpacerPropsOps[Self <: KeyboardSpacerProps] (val x: Self) extends AnyVal {
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
    def setOnToggle(value: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Unit): Self = this.set("onToggle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTopSpacing(value: Double): Self = this.set("topSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopSpacing: Self = this.set("topSpacing", js.undefined)
  }
  
}

