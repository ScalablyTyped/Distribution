package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTypescriptVersion extends StObject {
  
  var name: String
  
  var typescriptVersion: String
  
  var version: String
}
object NameTypescriptVersion {
  
  inline def apply(name: String, typescriptVersion: String, version: String): NameTypescriptVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTypescriptVersion]
  }
  
  extension [Self <: NameTypescriptVersion](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTypescriptVersion(value: String): Self = StObject.set(x, "typescriptVersion", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
