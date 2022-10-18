package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  /**
    * Content of the `Appbar`.
    */
  var children: ReactNode
  
  /**
    * Whether the background color is a dark color. A dark appbar will render light text and vice-versa.
    */
  var dark: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object Children {
  
  inline def apply(theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Children = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
