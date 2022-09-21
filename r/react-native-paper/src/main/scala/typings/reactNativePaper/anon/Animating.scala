package typings.reactNativePaper.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.reactNativePaperStrings.large
import typings.reactNativePaper.reactNativePaperStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animating extends StObject {
  
  /**
    * Whether to show the indicator or hide it.
    */
  var animating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color of the spinner.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the indicator should hide when not animating.
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Size of the indicator.
    */
  var size: js.UndefOr[small | large | Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
}
object Animating {
  
  inline def apply(theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Animating = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animating]
  }
  
  extension [Self <: Animating](x: Self) {
    
    inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHidesWhenStopped(value: Boolean): Self = StObject.set(x, "hidesWhenStopped", value.asInstanceOf[js.Any])
    
    inline def setHidesWhenStoppedUndefined: Self = StObject.set(x, "hidesWhenStopped", js.undefined)
    
    inline def setSize(value: small | large | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
