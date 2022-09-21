package typings.reactNativeElements.anon

import typings.reactNative.mod.ActivityIndicatorProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-elements.react-native-elements/dist/dialog/DialogLoading.DialogLoadingProps, 'loadingStyle' | 'loadingProps'> */
trait PickDialogLoadingPropsloa extends StObject {
  
  var loadingProps: js.UndefOr[ActivityIndicatorProps] = js.undefined
  
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PickDialogLoadingPropsloa {
  
  inline def apply(): PickDialogLoadingPropsloa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDialogLoadingPropsloa]
  }
  
  extension [Self <: PickDialogLoadingPropsloa](x: Self) {
    
    inline def setLoadingProps(value: ActivityIndicatorProps): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    inline def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
    
    inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
  }
}
