package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.reactNativePaperStrings.`box-none`
import typings.reactNativePaper.reactNativePaperStrings.`box-only`
import typings.reactNativePaper.reactNativePaperStrings.auto
import typings.reactNativePaper.reactNativePaperStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenOnPress extends StObject {
  
  /**
    * Content of the `DataTableRow`.
    */
  var children: ReactNode
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * `pointerEvents` passed to the `View` container, which is wrapping children within `TouchableRipple`.
    */
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object ChildrenOnPress {
  
  inline def apply(theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): ChildrenOnPress = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenOnPress]
  }
  
  extension [Self <: ChildrenOnPress](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
