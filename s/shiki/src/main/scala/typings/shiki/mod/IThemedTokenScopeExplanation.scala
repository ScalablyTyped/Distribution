package typings.shiki.mod

import typings.vscodeTextmate.mod.IRawThemeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThemedTokenScopeExplanation extends StObject {
  
  var scopeName: String
  
  var themeMatches: js.Array[IRawThemeSetting]
}
object IThemedTokenScopeExplanation {
  
  inline def apply(scopeName: String, themeMatches: js.Array[IRawThemeSetting]): IThemedTokenScopeExplanation = {
    val __obj = js.Dynamic.literal(scopeName = scopeName.asInstanceOf[js.Any], themeMatches = themeMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemedTokenScopeExplanation]
  }
  
  extension [Self <: IThemedTokenScopeExplanation](x: Self) {
    
    inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    inline def setThemeMatches(value: js.Array[IRawThemeSetting]): Self = StObject.set(x, "themeMatches", value.asInstanceOf[js.Any])
    
    inline def setThemeMatchesVarargs(value: IRawThemeSetting*): Self = StObject.set(x, "themeMatches", js.Array(value*))
  }
}
