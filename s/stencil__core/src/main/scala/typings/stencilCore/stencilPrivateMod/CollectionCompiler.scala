package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionCompiler extends StObject {
  
  var name: String
  
  var typescriptVersion: js.UndefOr[String] = js.undefined
  
  var version: String
}
object CollectionCompiler {
  
  inline def apply(name: String, version: String): CollectionCompiler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionCompiler]
  }
  
  extension [Self <: CollectionCompiler](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTypescriptVersion(value: String): Self = StObject.set(x, "typescriptVersion", value.asInstanceOf[js.Any])
    
    inline def setTypescriptVersionUndefined: Self = StObject.set(x, "typescriptVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
