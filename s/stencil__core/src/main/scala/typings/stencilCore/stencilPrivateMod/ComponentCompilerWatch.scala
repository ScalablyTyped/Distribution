package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerWatch extends StObject {
  
  var methodName: String
  
  var propName: String
}
object ComponentCompilerWatch {
  
  inline def apply(methodName: String, propName: String): ComponentCompilerWatch = {
    val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerWatch]
  }
  
  extension [Self <: ComponentCompilerWatch](x: Self) {
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
  }
}
