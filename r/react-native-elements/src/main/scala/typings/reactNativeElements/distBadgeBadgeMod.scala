package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.BadgePropsPartialThemePro
import typings.reactNativeElements.anon.PickBadgePropsPartialThem
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.reactNativeElementsStrings.error
import typings.reactNativeElements.reactNativeElementsStrings.primary
import typings.reactNativeElements.reactNativeElementsStrings.success
import typings.reactNativeElements.reactNativeElementsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBadgeBadgeMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/badge/Badge", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickBadgePropsPartialThem] | ForwardRefExoticComponent[BadgePropsPartialThemePro] = js.native
  
  @JSImport("react-native-elements/dist/badge/Badge", "Badge")
  @js.native
  val Badge: RneFunctionComponent[BadgeProps] = js.native
  
  trait BadgeProps extends StObject {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var status: js.UndefOr[primary | success | warning | error] = js.undefined
    
    var textProps: js.UndefOr[TextProps] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var value: js.UndefOr[ReactNode] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setBadgeStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
      
      inline def setBadgeStyleNull: Self = StObject.set(x, "badgeStyle", null)
      
      inline def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
      
      inline def setComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setOnPress(value: /* repeated */ Any => Any): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStatus(value: primary | success | warning | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTextProps(value: TextProps): Self = StObject.set(x, "textProps", value.asInstanceOf[js.Any])
      
      inline def setTextPropsUndefined: Self = StObject.set(x, "textProps", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickBadgePropsPartialThem] | ForwardRefExoticComponent[BadgePropsPartialThemePro]
  
  /* This means you don't have to write `default`, but can instead just say `distBadgeBadgeMod.foo` */
  override def _to: FunctionComponent[PickBadgePropsPartialThem] | ForwardRefExoticComponent[BadgePropsPartialThemePro] = default
}
