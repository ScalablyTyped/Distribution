package typings.reactNativeMaterialDesignSearchbar.mod

import typings.reactNative.mod.ReturnKeyType
import typings.reactNative.mod.ReturnKeyTypeAndroid
import typings.reactNative.mod.ReturnKeyTypeIOS
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarProps extends js.Object {
  var alwaysShowBackButton: js.UndefOr[Boolean] = js.native
  var autoCorrect: js.UndefOr[Boolean] = js.native
  var height: Double = js.native
  var iconBackName: js.UndefOr[String] = js.native
  var iconCloseName: js.UndefOr[String] = js.native
  var iconColor: js.UndefOr[String] = js.native
  var iconPadding: js.UndefOr[Double] = js.native
  var iconSearchName: js.UndefOr[String] = js.native
  var iconSize: js.UndefOr[Double] = js.native
  var inputProps: js.UndefOr[TextInputProps] = js.native
  var inputStyle: js.UndefOr[TextStyle] = js.native
  var onBackPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onEndEditing: js.UndefOr[js.Function0[Unit]] = js.native
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var onSearchChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.native
  var padding: js.UndefOr[Double] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placeholderColor: js.UndefOr[String] = js.native
  var returnKeyType: js.UndefOr[ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS] = js.native
  var textStyle: js.UndefOr[TextStyle] = js.native
}

object SearchBarProps {
  @scala.inline
  def apply(height: Double): SearchBarProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarProps]
  }
  @scala.inline
  implicit class SearchBarPropsOps[Self <: SearchBarProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysShowBackButton(value: Boolean): Self = this.set("alwaysShowBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowBackButton: Self = this.set("alwaysShowBackButton", js.undefined)
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setIconBackName(value: String): Self = this.set("iconBackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconBackName: Self = this.set("iconBackName", js.undefined)
    @scala.inline
    def setIconCloseName(value: String): Self = this.set("iconCloseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconCloseName: Self = this.set("iconCloseName", js.undefined)
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setIconPadding(value: Double): Self = this.set("iconPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPadding: Self = this.set("iconPadding", js.undefined)
    @scala.inline
    def setIconSearchName(value: String): Self = this.set("iconSearchName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSearchName: Self = this.set("iconSearchName", js.undefined)
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    @scala.inline
    def setInputProps(value: TextInputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setInputStyle(value: TextStyle): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setOnBackPress(value: () => Unit): Self = this.set("onBackPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBackPress: Self = this.set("onBackPress", js.undefined)
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnEndEditing(value: () => Unit): Self = this.set("onEndEditing", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEndEditing: Self = this.set("onEndEditing", js.undefined)
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnSearchChange(value: /* text */ String => Unit): Self = this.set("onSearchChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSearchChange: Self = this.set("onSearchChange", js.undefined)
    @scala.inline
    def setOnSubmitEditing(value: () => Unit): Self = this.set("onSubmitEditing", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSubmitEditing: Self = this.set("onSubmitEditing", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderColor(value: String): Self = this.set("placeholderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderColor: Self = this.set("placeholderColor", js.undefined)
    @scala.inline
    def setReturnKeyType(value: ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS): Self = this.set("returnKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnKeyType: Self = this.set("returnKeyType", js.undefined)
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

