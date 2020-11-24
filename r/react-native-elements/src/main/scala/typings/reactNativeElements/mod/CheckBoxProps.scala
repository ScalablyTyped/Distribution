package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialTextProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxProps extends js.Object {
  
  /**
    *  Specify React Native component for main button
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  
  /**
    * Aligns checkbox to center
    *
    *  @default false
    */
  var center: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag for checking the icon
    *
    * @default false
    */
  var checked: Boolean = js.native
  
  /**
    * Default checked color
    *
    * @default 'green'
    */
  var checkedColor: js.UndefOr[String] = js.native
  
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'check-square-o'
    */
  var checkedIcon: js.UndefOr[String | ReactElement] = js.native
  
  /**
    * Specify a custom checked message
    */
  var checkedTitle: js.UndefOr[String] = js.native
  
  /**
    * Style of main container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Specify different font family
    * @default 'System font bold (iOS)'
    * @default 'Sans Serif Bold (android)'
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Moves icon to right of text.
    *
    * @default false
    */
  var iconRight: js.UndefOr[Boolean] = js.native
  
  /**
    * Icon family, can be one of the following
    * (required only if specifying an icon that is not from font-awesome)
    */
  var iconType: js.UndefOr[IconType] = js.native
  
  /**
    * onPress function for checkbox
    */
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * onLongPress function for checkbox
    */
  var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * onLongPress function for checkbox
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * onPress function for container
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Aligns checkbox to right
    *
    * @default false
    */
  var right: js.UndefOr[Boolean] = js.native
  
  /**
    * Size of the checkbox
    *
    * @default 24
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * style of text
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Title of checkbox
    */
  var title: js.UndefOr[String | ReactElement] = js.native
  
  /**
    * Additional props for the title
    */
  var titleProps: js.UndefOr[PartialTextProperties] = js.native
  
  /**
    * Default unchecked color
    * @default '#bfbfbf'
    */
  var uncheckedColor: js.UndefOr[String] = js.native
  
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'square-o'
    */
  var uncheckedIcon: js.UndefOr[String | ReactElement] = js.native
  
  /**
    * Style of container that wraps the check box and text
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object CheckBoxProps {
  
  @scala.inline
  def apply(checked: Boolean): CheckBoxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
  
  @scala.inline
  implicit class CheckBoxPropsOps[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
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
