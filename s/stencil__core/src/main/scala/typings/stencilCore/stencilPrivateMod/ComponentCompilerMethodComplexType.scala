package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerMethodComplexType extends StObject {
  
  var parameters: js.Array[CompilerJsDoc]
  
  var references: ComponentCompilerTypeReferences
  
  var `return`: String
  
  var signature: String
}
object ComponentCompilerMethodComplexType {
  
  inline def apply(
    parameters: js.Array[CompilerJsDoc],
    references: ComponentCompilerTypeReferences,
    `return`: String,
    signature: String
  ): ComponentCompilerMethodComplexType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerMethodComplexType]
  }
  
  extension [Self <: ComponentCompilerMethodComplexType](x: Self) {
    
    inline def setParameters(value: js.Array[CompilerJsDoc]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: CompilerJsDoc*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReferences(value: ComponentCompilerTypeReferences): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReturn(value: String): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
