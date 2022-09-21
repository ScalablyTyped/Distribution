package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerStaticMethod extends StObject {
  
  var complexType: ComponentCompilerMethodComplexType
  
  var docs: CompilerJsDoc
}
object ComponentCompilerStaticMethod {
  
  inline def apply(complexType: ComponentCompilerMethodComplexType, docs: CompilerJsDoc): ComponentCompilerStaticMethod = {
    val __obj = js.Dynamic.literal(complexType = complexType.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerStaticMethod]
  }
  
  extension [Self <: ComponentCompilerStaticMethod](x: Self) {
    
    inline def setComplexType(value: ComponentCompilerMethodComplexType): Self = StObject.set(x, "complexType", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: CompilerJsDoc): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
  }
}
