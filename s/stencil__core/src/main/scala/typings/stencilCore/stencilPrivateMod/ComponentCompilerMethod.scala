package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerMethod
  extends StObject
     with ComponentCompilerStaticMethod {
  
  var internal: Boolean
  
  var name: String
}
object ComponentCompilerMethod {
  
  inline def apply(
    complexType: ComponentCompilerMethodComplexType,
    docs: CompilerJsDoc,
    internal: Boolean,
    name: String
  ): ComponentCompilerMethod = {
    val __obj = js.Dynamic.literal(complexType = complexType.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerMethod]
  }
  
  extension [Self <: ComponentCompilerMethod](x: Self) {
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
