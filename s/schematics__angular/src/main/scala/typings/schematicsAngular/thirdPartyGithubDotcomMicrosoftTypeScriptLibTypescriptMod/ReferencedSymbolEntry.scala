package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencedSymbolEntry
  extends StObject
     with ReferenceEntry {
  
  var isDefinition: js.UndefOr[Boolean] = js.undefined
}
object ReferencedSymbolEntry {
  
  inline def apply(fileName: java.lang.String, isWriteAccess: Boolean, textSpan: TextSpan): ReferencedSymbolEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbolEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferencedSymbolEntry] (val x: Self) extends AnyVal {
    
    inline def setIsDefinition(value: Boolean): Self = StObject.set(x, "isDefinition", value.asInstanceOf[js.Any])
    
    inline def setIsDefinitionUndefined: Self = StObject.set(x, "isDefinition", js.undefined)
  }
}
