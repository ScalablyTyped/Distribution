package typings.reactNativeDialog.mod

import typings.react.mod.Ref
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProps[T] extends js.Object {
  var label: js.UndefOr[String] = js.native
  var textInputRef: js.UndefOr[Ref[T]] = js.native
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object InputProps {
  @scala.inline
  def apply[T](): InputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps[T]]
  }
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps[_], T] (val x: Self with InputProps[T]) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setTextInputRefFunction1(value: /* instance */ T | Null => Unit): Self = this.set("textInputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setTextInputRef(value: Ref[T]): Self = this.set("textInputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextInputRef: Self = this.set("textInputRef", js.undefined)
    @scala.inline
    def setTextInputRefNull: Self = this.set("textInputRef", null)
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
  
}

