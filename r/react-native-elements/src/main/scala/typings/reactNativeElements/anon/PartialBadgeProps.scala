package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.error
import typings.reactNativeElements.reactNativeElementsStrings.primary
import typings.reactNativeElements.reactNativeElementsStrings.success
import typings.reactNativeElements.reactNativeElementsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.BadgeProps> */
trait PartialBadgeProps extends StObject {
  
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var status: js.UndefOr[primary | success | warning | error] = js.undefined
  
  var textProps: js.UndefOr[TextProperties] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var value: js.UndefOr[ReactNode] = js.undefined
}
object PartialBadgeProps {
  
  @scala.inline
  def apply(): PartialBadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBadgeProps]
  }
  
  @scala.inline
  implicit class PartialBadgePropsMutableBuilder[Self <: PartialBadgeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadgeStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeStyleNull: Self = StObject.set(x, "badgeStyle", null)
    
    @scala.inline
    def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
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
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStatus(value: primary | success | warning | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTextProps(value: TextProperties): Self = StObject.set(x, "textProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPropsUndefined: Self = StObject.set(x, "textProps", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
