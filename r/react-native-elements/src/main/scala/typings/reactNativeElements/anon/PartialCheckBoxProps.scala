package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.CheckBoxProps> */
@js.native
trait PartialCheckBoxProps extends js.Object {
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  var center: js.UndefOr[Boolean] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var checkedColor: js.UndefOr[String] = js.native
  var checkedIcon: js.UndefOr[String | ReactElement] = js.native
  var checkedTitle: js.UndefOr[String] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var iconRight: js.UndefOr[Boolean] = js.native
  var iconType: js.UndefOr[IconType] = js.native
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var right: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var title: js.UndefOr[String | ReactElement] = js.native
  var titleProps: js.UndefOr[PartialTextProperties] = js.native
  var uncheckedColor: js.UndefOr[String] = js.native
  var uncheckedIcon: js.UndefOr[String | ReactElement] = js.native
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PartialCheckBoxProps {
  @scala.inline
  def apply(): PartialCheckBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckBoxProps]
  }
  @scala.inline
  implicit class PartialCheckBoxPropsOps[Self <: PartialCheckBoxProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCheckedColor(value: String): Self = this.set("checkedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedColor: Self = this.set("checkedColor", js.undefined)
    @scala.inline
    def setCheckedIcon(value: String | ReactElement): Self = this.set("checkedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedIcon: Self = this.set("checkedIcon", js.undefined)
    @scala.inline
    def setCheckedTitle(value: String): Self = this.set("checkedTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedTitle: Self = this.set("checkedTitle", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setIconRight(value: Boolean): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconRight: Self = this.set("iconRight", js.undefined)
    @scala.inline
    def setIconType(value: IconType): Self = this.set("iconType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    @scala.inline
    def setOnIconPress(value: () => Unit): Self = this.set("onIconPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnIconPress: Self = this.set("onIconPress", js.undefined)
    @scala.inline
    def setOnLongIconPress(value: () => Unit): Self = this.set("onLongIconPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLongIconPress: Self = this.set("onLongIconPress", js.undefined)
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = this.set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleProps(value: PartialTextProperties): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    @scala.inline
    def setUncheckedColor(value: String): Self = this.set("uncheckedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckedColor: Self = this.set("uncheckedColor", js.undefined)
    @scala.inline
    def setUncheckedIcon(value: String | ReactElement): Self = this.set("uncheckedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckedIcon: Self = this.set("uncheckedIcon", js.undefined)
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
  
}

