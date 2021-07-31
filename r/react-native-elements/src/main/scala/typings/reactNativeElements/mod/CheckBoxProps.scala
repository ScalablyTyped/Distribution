package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialTextProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckBoxProps extends StObject {
  
  /**
    *  Specify React Native component for main button
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  /**
    * Aligns checkbox to center
    *
    *  @default false
    */
  var center: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag for checking the icon
    *
    * @default false
    */
  var checked: Boolean
  
  /**
    * Default checked color
    *
    * @default 'green'
    */
  var checkedColor: js.UndefOr[String] = js.undefined
  
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'check-square-o'
    */
  var checkedIcon: js.UndefOr[String | ReactElement] = js.undefined
  
  /**
    * Specify a custom checked message
    */
  var checkedTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Style of main container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Specify different font family
    * @default 'System font bold (iOS)'
    * @default 'Sans Serif Bold (android)'
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Moves icon to right of text.
    *
    * @default false
    */
  var iconRight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Icon family, can be one of the following
    * (required only if specifying an icon that is not from font-awesome)
    */
  var iconType: js.UndefOr[IconType] = js.undefined
  
  /**
    * onPress function for checkbox
    */
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * onLongPress function for checkbox
    */
  var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * onLongPress function for checkbox
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * onPress function for container
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Aligns checkbox to right
    *
    * @default false
    */
  var right: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Size of the checkbox
    *
    * @default 24
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * style of text
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Title of checkbox
    */
  var title: js.UndefOr[String | ReactElement] = js.undefined
  
  /**
    * Additional props for the title
    */
  var titleProps: js.UndefOr[PartialTextProperties] = js.undefined
  
  /**
    * Default unchecked color
    * @default '#bfbfbf'
    */
  var uncheckedColor: js.UndefOr[String] = js.undefined
  
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'square-o'
    */
  var uncheckedIcon: js.UndefOr[String | ReactElement] = js.undefined
  
  /**
    * Style of container that wraps the check box and text
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object CheckBoxProps {
  
  @scala.inline
  def apply(checked: Boolean): CheckBoxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
  
  @scala.inline
  implicit class CheckBoxPropsMutableBuilder[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedColor(value: String): Self = StObject.set(x, "checkedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedColorUndefined: Self = StObject.set(x, "checkedColor", js.undefined)
    
    @scala.inline
    def setCheckedIcon(value: String | ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    @scala.inline
    def setCheckedTitle(value: String): Self = StObject.set(x, "checkedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedTitleUndefined: Self = StObject.set(x, "checkedTitle", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
    
    @scala.inline
    def setIconType(value: IconType): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setOnIconPress(value: () => Unit): Self = StObject.set(x, "onIconPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnIconPressUndefined: Self = StObject.set(x, "onIconPress", js.undefined)
    
    @scala.inline
    def setOnLongIconPress(value: () => Unit): Self = StObject.set(x, "onLongIconPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongIconPressUndefined: Self = StObject.set(x, "onLongIconPress", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleProps(value: PartialTextProperties): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
    
    @scala.inline
    def setUncheckedIcon(value: String | ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
