package typings.rcFieldForm.anon

import typings.rcFieldForm.esInterfaceMod.InternalNamePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.Array[String]
  
  var name: InternalNamePath
}
object Errors {
  
  inline def apply(errors: js.Array[String], name: InternalNamePath): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
