package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerLegacyConnect extends StObject {
  
  var connect: String
  
  var name: String
}
object ComponentCompilerLegacyConnect {
  
  inline def apply(connect: String, name: String): ComponentCompilerLegacyConnect = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerLegacyConnect]
  }
  
  extension [Self <: ComponentCompilerLegacyConnect](x: Self) {
    
    inline def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
