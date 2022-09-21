package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypescriptVersion extends StObject {
  
  var name: String
  
  var typescriptVersion: js.UndefOr[String] = js.undefined
  
  var version: String
}
object TypescriptVersion {
  
  inline def apply(name: String, version: String): TypescriptVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypescriptVersion]
  }
  
  extension [Self <: TypescriptVersion](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTypescriptVersion(value: String): Self = StObject.set(x, "typescriptVersion", value.asInstanceOf[js.Any])
    
    inline def setTypescriptVersionUndefined: Self = StObject.set(x, "typescriptVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
