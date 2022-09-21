package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativePaper.reactNativePaperStrings.error
import typings.reactNativePaper.reactNativePaperStrings.info
import typings.reactNativePaper.reactNativePaperStrings.none
import typings.reactNativePaper.reactNativePaperStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * Text content of the HelperText.
    */
  var children: ReactNode
  
  /**
    * Whether to apply padding to the helper text.
    */
  var padding: js.UndefOr[normal | none] = js.undefined
  
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * TestID used for testing purposes
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Type of the helper text.
    */
  var `type`: error | info
  
  /**
    * Whether to display the helper text.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Type {
  
  inline def apply(
    theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme,
    `type`: error | info
  ): Type = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setPadding(value: normal | none): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setType(value: error | info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
