package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.distConfigThemeMod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.Component
import typings.reactNativeElements.reactNativeElementsStrings.error
import typings.reactNativeElements.reactNativeElementsStrings.primary
import typings.reactNativeElements.reactNativeElementsStrings.success
import typings.reactNativeElements.reactNativeElementsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/badge/Badge.BadgeProps>> */
trait RecursivePartialPartialBaBadgeStyle extends StObject {
  
  var Component: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[
            typings.reactNativeElements.reactNativeElementsStrings.Component, 
            js.Object, 
            js.Object
          ]
        ])
      ]
    ]
  ] = js.undefined
  
  var badgeStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* repeated */ Any, Any]]]] = js.undefined
  
  var status: js.UndefOr[RecursivePartial[js.UndefOr[primary | success | warning | error]]] = js.undefined
  
  var textProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.undefined
  
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var value: js.UndefOr[RecursivePartial[js.UndefOr[ReactNode]]] = js.undefined
}
object RecursivePartialPartialBaBadgeStyle {
  
  inline def apply(): RecursivePartialPartialBaBadgeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBaBadgeStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecursivePartialPartialBaBadgeStyle] (val x: Self) extends AnyVal {
    
    inline def setBadgeStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    inline def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
    inline def setComponent(
      value: RecursivePartial[
          js.UndefOr[
            TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              typings.react.mod.Component[Component, js.Object, js.Object]
            ])
          ]
        ]
    ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setOnPress(value: RecursivePartial[js.UndefOr[js.Function1[/* repeated */ Any, Any]]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStatus(value: RecursivePartial[js.UndefOr[primary | success | warning | error]]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTextProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = StObject.set(x, "textProps", value.asInstanceOf[js.Any])
    
    inline def setTextPropsUndefined: Self = StObject.set(x, "textProps", js.undefined)
    
    inline def setTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setValue(value: RecursivePartial[js.UndefOr[ReactNode]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
