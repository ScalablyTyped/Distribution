package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.ActivityIndicatorProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PickDialogLoadingPropsloa
import typings.reactNativeElements.anon.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogDialogLoadingMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/dialog/DialogLoading", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickDialogLoadingPropsloa] | ForwardRefExoticComponent[DialogLoadingProps] = js.native
  
  trait DialogLoadingProps extends StObject {
    
    var loadingProps: js.UndefOr[ActivityIndicatorProps] = js.undefined
    
    var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object DialogLoadingProps {
    
    inline def apply(): DialogLoadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogLoadingProps]
    }
    
    extension [Self <: DialogLoadingProps](x: Self) {
      
      inline def setLoadingProps(value: ActivityIndicatorProps): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
      
      inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
      
      inline def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
      
      inline def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
      
      inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickDialogLoadingPropsloa] | ForwardRefExoticComponent[DialogLoadingProps]
  
  /* This means you don't have to write `default`, but can instead just say `distDialogDialogLoadingMod.foo` */
  override def _to: FunctionComponent[PickDialogLoadingPropsloa] | ForwardRefExoticComponent[DialogLoadingProps] = default
}
