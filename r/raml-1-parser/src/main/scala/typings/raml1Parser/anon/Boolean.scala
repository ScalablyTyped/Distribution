package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boolean extends StObject {
  
  var boolean: java.lang.String
  
  var number: java.lang.String
  
  var string: java.lang.String
}
object Boolean {
  
  inline def apply(boolean: java.lang.String, number: java.lang.String, string: java.lang.String): Boolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  
  extension [Self <: Boolean](x: Self) {
    
    inline def setBoolean(value: java.lang.String): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: java.lang.String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
