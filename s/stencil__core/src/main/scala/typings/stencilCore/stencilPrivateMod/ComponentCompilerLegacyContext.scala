package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerLegacyContext extends StObject {
  
  var context: String
  
  var name: String
}
object ComponentCompilerLegacyContext {
  
  inline def apply(context: String, name: String): ComponentCompilerLegacyContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerLegacyContext]
  }
  
  extension [Self <: ComponentCompilerLegacyContext](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
