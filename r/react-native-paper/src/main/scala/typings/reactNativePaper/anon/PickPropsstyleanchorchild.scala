package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/Menu/Menu.Props, 'style' | 'anchor' | 'children' | 'visible' | 'contentStyle' | 'statusBarHeight' | 'onDismiss' | 'overlayAccessibilityLabel'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropsstyleanchorchild extends StObject {
  
  var anchor: ReactNode | X
  
  var children: ReactNode
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onDismiss: js.Function0[Unit]
  
  var overlayAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var statusBarHeight: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
  
  var visible: Boolean
}
object PickPropsstyleanchorchild {
  
  inline def apply(onDismiss: () => Unit, visible: Boolean): PickPropsstyleanchorchild = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsstyleanchorchild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPropsstyleanchorchild] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: ReactNode | X): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setOverlayAccessibilityLabel(value: String): Self = StObject.set(x, "overlayAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setOverlayAccessibilityLabelUndefined: Self = StObject.set(x, "overlayAccessibilityLabel", js.undefined)
    
    inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeightUndefined: Self = StObject.set(x, "statusBarHeight", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
