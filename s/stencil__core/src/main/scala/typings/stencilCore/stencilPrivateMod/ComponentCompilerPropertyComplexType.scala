package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerPropertyComplexType extends StObject {
  
  var original: String
  
  var references: ComponentCompilerTypeReferences
  
  var resolved: String
}
object ComponentCompilerPropertyComplexType {
  
  inline def apply(original: String, references: ComponentCompilerTypeReferences, resolved: String): ComponentCompilerPropertyComplexType = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerPropertyComplexType]
  }
  
  extension [Self <: ComponentCompilerPropertyComplexType](x: Self) {
    
    inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: ComponentCompilerTypeReferences): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
  }
}
