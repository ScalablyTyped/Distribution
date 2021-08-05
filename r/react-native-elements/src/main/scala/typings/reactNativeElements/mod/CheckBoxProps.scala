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
  
  inline def apply(checked: Boolean): CheckBoxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
  
  extension [Self <: CheckBoxProps](x: Self) {
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedColor(value: String): Self = StObject.set(x, "checkedColor", value.asInstanceOf[js.Any])
    
    inline def setCheckedColorUndefined: Self = StObject.set(x, "checkedColor", js.undefined)
    
    inline def setCheckedIcon(value: String | ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    inline def setCheckedTitle(value: String): Self = StObject.set(x, "checkedTitle", value.asInstanceOf[js.Any])
    
    inline def setCheckedTitleUndefined: Self = StObject.set(x, "checkedTitle", js.undefined)
    
    inline def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
    
    inline def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
    
    inline def setIconType(value: IconType): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setOnIconPress(value: () => Unit): Self = StObject.set(x, "onIconPress", js.Any.fromFunction0(value))
    
    inline def setOnIconPressUndefined: Self = StObject.set(x, "onIconPress", js.undefined)
    
    inline def setOnLongIconPress(value: () => Unit): Self = StObject.set(x, "onLongIconPress", js.Any.fromFunction0(value))
    
    inline def setOnLongIconPressUndefined: Self = StObject.set(x, "onLongIconPress", js.undefined)
    
    inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleProps(value: PartialTextProperties): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
    
    inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
    
    inline def setUncheckedIcon(value: String | ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
