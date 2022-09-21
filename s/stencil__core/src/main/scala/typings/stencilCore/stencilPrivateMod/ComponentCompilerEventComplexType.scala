package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerEventComplexType extends StObject {
  
  var original: String
  
  var references: ComponentCompilerTypeReferences
  
  var resolved: String
}
object ComponentCompilerEventComplexType {
  
  inline def apply(original: String, references: ComponentCompilerTypeReferences, resolved: String): ComponentCompilerEventComplexType = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerEventComplexType]
  }
  
  extension [Self <: ComponentCompilerEventComplexType](x: Self) {
    
    inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: ComponentCompilerTypeReferences): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
  }
}
