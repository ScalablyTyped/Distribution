package typings.reactNativeMaterialMenu.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.head
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.middle
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledTextColor: js.UndefOr[String] = js.native
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var testID: js.UndefOr[String] = js.native
  var textStyle: js.UndefOr[TextStyle] = js.native
  var underlayColor: js.UndefOr[String] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledTextColor(value: String): Self = this.set("disabledTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledTextColor: Self = this.set("disabledTextColor", js.undefined)
    @scala.inline
    def setEllipsizeMode(value: head | middle | tail | clip): Self = this.set("ellipsizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsizeMode: Self = this.set("ellipsizeMode", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
  
}

