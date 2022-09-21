package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileExtensionInfo extends StObject {
  
  var `extension`: java.lang.String
  
  var isMixedContent: Boolean
  
  var scriptKind: js.UndefOr[ScriptKind] = js.undefined
}
object FileExtensionInfo {
  
  inline def apply(`extension`: java.lang.String, isMixedContent: Boolean): FileExtensionInfo = {
    val __obj = js.Dynamic.literal(isMixedContent = isMixedContent.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExtensionInfo]
  }
  
  extension [Self <: FileExtensionInfo](x: Self) {
    
    inline def setExtension(value: java.lang.String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setIsMixedContent(value: Boolean): Self = StObject.set(x, "isMixedContent", value.asInstanceOf[js.Any])
    
    inline def setScriptKind(value: ScriptKind): Self = StObject.set(x, "scriptKind", value.asInstanceOf[js.Any])
    
    inline def setScriptKindUndefined: Self = StObject.set(x, "scriptKind", js.undefined)
  }
}
