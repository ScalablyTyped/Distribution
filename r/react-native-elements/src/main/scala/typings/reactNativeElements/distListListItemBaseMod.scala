package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TouchableHighlightProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PickTouchableHighlightPro
import typings.reactNativeElements.anon.TouchableHighlightPropscoAccessibilityActions
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemBaseMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItemBase", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTouchableHighlightPro] | ForwardRefExoticComponent[TouchableHighlightPropscoAccessibilityActions] = js.native
  
  @JSImport("react-native-elements/dist/list/ListItemBase", "ListItemBase")
  @js.native
  val ListItemBase: RneFunctionComponent[ListItemProps] = js.native
  
  trait ListItemProps
    extends StObject
       with TouchableHighlightProps {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var ViewComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var bottomDivider: js.UndefOr[Boolean] = js.undefined
    
    @JSName("children")
    var children_ListItemProps: js.UndefOr[Any] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var linearGradientProps: js.UndefOr[Any] = js.undefined
    
    var pad: js.UndefOr[Double] = js.undefined
    
    var topDivider: js.UndefOr[Boolean] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      inline def setBottomDivider(value: Boolean): Self = StObject.set(x, "bottomDivider", value.asInstanceOf[js.Any])
      
      inline def setBottomDividerUndefined: Self = StObject.set(x, "bottomDivider", js.undefined)
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      
      inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
      
      inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      inline def setLinearGradientProps(value: Any): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
      
      inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
      
      inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setTopDivider(value: Boolean): Self = StObject.set(x, "topDivider", value.asInstanceOf[js.Any])
      
      inline def setTopDividerUndefined: Self = StObject.set(x, "topDivider", js.undefined)
      
      inline def setViewComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
      
      inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickTouchableHighlightPro] | ForwardRefExoticComponent[TouchableHighlightPropscoAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemBaseMod.foo` */
  override def _to: FunctionComponent[PickTouchableHighlightPro] | ForwardRefExoticComponent[TouchableHighlightPropscoAccessibilityActions] = default
}
