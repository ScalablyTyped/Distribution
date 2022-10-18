package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNativeElements.anon.PickViewPropscolorstringu
import typings.reactNativeElements.anon.ViewPropscolorstringundefAccessibilityActions
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.reactNativeElementsStrings.horizontal
import typings.reactNativeElements.reactNativeElementsStrings.left
import typings.reactNativeElements.reactNativeElementsStrings.middle
import typings.reactNativeElements.reactNativeElementsStrings.right
import typings.reactNativeElements.reactNativeElementsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDividerDividerMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/divider/Divider", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickViewPropscolorstringu] | ForwardRefExoticComponent[ViewPropscolorstringundefAccessibilityActions] = js.native
  
  @JSImport("react-native-elements/dist/divider/Divider", "Divider")
  @js.native
  val Divider: RneFunctionComponent[DividerProps] = js.native
  
  trait DividerProps
    extends StObject
       with ViewProps {
    
    var color: js.UndefOr[String] = js.undefined
    
    var inset: js.UndefOr[Boolean] = js.undefined
    
    var insetType: js.UndefOr[left | right | middle] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var subHeader: js.UndefOr[String] = js.undefined
    
    var subHeaderStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    extension [Self <: DividerProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetType(value: left | right | middle): Self = StObject.set(x, "insetType", value.asInstanceOf[js.Any])
      
      inline def setInsetTypeUndefined: Self = StObject.set(x, "insetType", js.undefined)
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setSubHeader(value: String): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
      inline def setSubHeaderStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subHeaderStyle", value.asInstanceOf[js.Any])
      
      inline def setSubHeaderStyleNull: Self = StObject.set(x, "subHeaderStyle", null)
      
      inline def setSubHeaderStyleUndefined: Self = StObject.set(x, "subHeaderStyle", js.undefined)
      
      inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickViewPropscolorstringu] | ForwardRefExoticComponent[ViewPropscolorstringundefAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `distDividerDividerMod.foo` */
  override def _to: FunctionComponent[PickViewPropscolorstringu] | ForwardRefExoticComponent[ViewPropscolorstringundefAccessibilityActions] = default
}
