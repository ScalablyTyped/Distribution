package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectPageDropdownAccessibilityLabel extends StObject {
  
  /**
    * AccessibilityLabel for `label`.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Label text to display which indicates current pagination.
    */
  var label: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * AccessibilityLabel for `selectPageDropdownLabel`.
    */
  var selectPageDropdownAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Label text for select page dropdown to display.
    */
  var selectPageDropdownLabel: js.UndefOr[ReactNode] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
}
object SelectPageDropdownAccessibilityLabel {
  
  inline def apply(theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): SelectPageDropdownAccessibilityLabel = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPageDropdownAccessibilityLabel]
  }
  
  extension [Self <: SelectPageDropdownAccessibilityLabel](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectPageDropdownAccessibilityLabel(value: String): Self = StObject.set(x, "selectPageDropdownAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setSelectPageDropdownAccessibilityLabelUndefined: Self = StObject.set(x, "selectPageDropdownAccessibilityLabel", js.undefined)
    
    inline def setSelectPageDropdownLabel(value: ReactNode): Self = StObject.set(x, "selectPageDropdownLabel", value.asInstanceOf[js.Any])
    
    inline def setSelectPageDropdownLabelUndefined: Self = StObject.set(x, "selectPageDropdownLabel", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
