package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSDocTagInfo extends StObject {
  
  var name: java.lang.String
  
  var text: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
}
object JSDocTagInfo {
  
  inline def apply(name: java.lang.String): JSDocTagInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTagInfo]
  }
  
  extension [Self <: JSDocTagInfo](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setText(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
