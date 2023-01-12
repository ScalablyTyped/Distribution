package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorSettings extends StObject {
  
  var baseIndentSize: js.UndefOr[Double] = js.undefined
  
  var convertTabsToSpaces: js.UndefOr[Boolean] = js.undefined
  
  var indentSize: js.UndefOr[Double] = js.undefined
  
  var indentStyle: js.UndefOr[IndentStyle] = js.undefined
  
  var newLineCharacter: js.UndefOr[java.lang.String] = js.undefined
  
  var tabSize: js.UndefOr[Double] = js.undefined
  
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
}
object EditorSettings {
  
  inline def apply(): EditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
    
    inline def setBaseIndentSize(value: Double): Self = StObject.set(x, "baseIndentSize", value.asInstanceOf[js.Any])
    
    inline def setBaseIndentSizeUndefined: Self = StObject.set(x, "baseIndentSize", js.undefined)
    
    inline def setConvertTabsToSpaces(value: Boolean): Self = StObject.set(x, "convertTabsToSpaces", value.asInstanceOf[js.Any])
    
    inline def setConvertTabsToSpacesUndefined: Self = StObject.set(x, "convertTabsToSpaces", js.undefined)
    
    inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
    
    inline def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "indentStyle", value.asInstanceOf[js.Any])
    
    inline def setIndentStyleUndefined: Self = StObject.set(x, "indentStyle", js.undefined)
    
    inline def setNewLineCharacter(value: java.lang.String): Self = StObject.set(x, "newLineCharacter", value.asInstanceOf[js.Any])
    
    inline def setNewLineCharacterUndefined: Self = StObject.set(x, "newLineCharacter", js.undefined)
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    inline def setTrimTrailingWhitespace(value: Boolean): Self = StObject.set(x, "trimTrailingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setTrimTrailingWhitespaceUndefined: Self = StObject.set(x, "trimTrailingWhitespace", js.undefined)
  }
}
