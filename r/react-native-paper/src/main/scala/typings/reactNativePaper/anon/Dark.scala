package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dark extends StObject {
  
  /**
    * Content of the header.
    */
  var children: ReactNode
  
  /**
    * Whether the background color is a dark color. A dark header will render light text and vice-versa.
    */
  var dark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Extra padding to add at the top of header to account for translucent status bar.
    * This is automatically handled on iOS >= 11 including iPhone X using `SafeAreaView`.
    * If you are using Expo, we assume translucent status bar and set a height for status bar automatically.
    * Pass `0` or a custom value to disable the default behaviour, and customize the height.
    */
  var statusBarHeight: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object Dark {
  
  inline def apply(theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Dark = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
  
  extension [Self <: Dark](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeightUndefined: Self = StObject.set(x, "statusBarHeight", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
