package typings.reactNativeModalDropdown.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalDropdown.reactNativeModalDropdownStrings.always
import typings.reactNativeModalDropdown.reactNativeModalDropdownStrings.handled
import typings.reactNativeModalDropdown.reactNativeModalDropdownStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDropdownProps[T] extends ViewProps {
  var adjustFrame: js.UndefOr[js.Function1[/* positionStyle */ PositionStyle, PositionStyle]] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var defaultIndex: js.UndefOr[Double] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dropdownTextHighlightStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var dropdownTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var keyboardShouldPersistTaps: js.UndefOr[always | never | handled] = js.native
  var onDropdownWillHide: js.UndefOr[js.Function0[Unit | Boolean]] = js.native
  var onDropdownWillShow: js.UndefOr[js.Function0[Unit | Boolean]] = js.native
  var onSelect: js.UndefOr[js.Function2[/* index */ String, /* option */ T, Unit | Boolean]] = js.native
  var options: js.UndefOr[js.Array[T]] = js.native
  var renderButtonText: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  var renderRow: js.UndefOr[
    js.Function3[/* option */ T, /* index */ String, /* isSelected */ Boolean, ReactNode]
  ] = js.native
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ String, 
      /* index */ String, 
      /* adjacentRowHighlighted */ Boolean, 
      ReactNode
    ]
  ] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object ModalDropdownProps {
  @scala.inline
  def apply[T](): ModalDropdownProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDropdownProps[T]]
  }
  @scala.inline
  implicit class ModalDropdownPropsOps[Self <: ModalDropdownProps[_], T] (val x: Self with ModalDropdownProps[T]) extends AnyVal {
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
    def setAdjustFrame(value: /* positionStyle */ PositionStyle => PositionStyle): Self = this.set("adjustFrame", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdjustFrame: Self = this.set("adjustFrame", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setDefaultIndex(value: Double): Self = this.set("defaultIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIndex: Self = this.set("defaultIndex", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownStyle(value: StyleProp[ViewStyle]): Self = this.set("dropdownStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownStyle: Self = this.set("dropdownStyle", js.undefined)
    @scala.inline
    def setDropdownStyleNull: Self = this.set("dropdownStyle", null)
    @scala.inline
    def setDropdownTextHighlightStyle(value: StyleProp[TextStyle]): Self = this.set("dropdownTextHighlightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownTextHighlightStyle: Self = this.set("dropdownTextHighlightStyle", js.undefined)
    @scala.inline
    def setDropdownTextHighlightStyleNull: Self = this.set("dropdownTextHighlightStyle", null)
    @scala.inline
    def setDropdownTextStyle(value: StyleProp[TextStyle]): Self = this.set("dropdownTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownTextStyle: Self = this.set("dropdownTextStyle", js.undefined)
    @scala.inline
    def setDropdownTextStyleNull: Self = this.set("dropdownTextStyle", null)
    @scala.inline
    def setKeyboardShouldPersistTaps(value: always | never | handled): Self = this.set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShouldPersistTaps: Self = this.set("keyboardShouldPersistTaps", js.undefined)
    @scala.inline
    def setOnDropdownWillHide(value: () => Unit | Boolean): Self = this.set("onDropdownWillHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDropdownWillHide: Self = this.set("onDropdownWillHide", js.undefined)
    @scala.inline
    def setOnDropdownWillShow(value: () => Unit | Boolean): Self = this.set("onDropdownWillShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDropdownWillShow: Self = this.set("onDropdownWillShow", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* index */ String, /* option */ T) => Unit | Boolean): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRenderButtonText(value: /* text */ String => String): Self = this.set("renderButtonText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderButtonText: Self = this.set("renderButtonText", js.undefined)
    @scala.inline
    def setRenderRow(value: (/* option */ T, /* index */ String, /* isSelected */ Boolean) => ReactNode): Self = this.set("renderRow", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderRow: Self = this.set("renderRow", js.undefined)
    @scala.inline
    def setRenderSeparator(
      value: (/* sectionID */ String, /* index */ String, /* adjacentRowHighlighted */ Boolean) => ReactNode
    ): Self = this.set("renderSeparator", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderSeparator: Self = this.set("renderSeparator", js.undefined)
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = this.set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowsVerticalScrollIndicator: Self = this.set("showsVerticalScrollIndicator", js.undefined)
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
  }
  
}

