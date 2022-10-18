package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReplacements extends StObject {
  
  var replace: String
  
  var `with`: String
}
object FileReplacements {
  
  inline def apply(replace: String, `with`: String): FileReplacements = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReplacements]
  }
  
  extension [Self <: FileReplacements](x: Self) {
    
    inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setWith(value: String): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
  }
}
