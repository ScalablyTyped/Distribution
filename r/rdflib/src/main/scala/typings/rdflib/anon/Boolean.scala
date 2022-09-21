package typings.rdflib.anon

import typings.rdflib.namedNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boolean extends StObject {
  
  var boolean: default
  
  var dateTime: default
  
  var decimal: default
  
  var double: default
  
  var integer: default
  
  var langString: default
  
  var string: default
}
object Boolean {
  
  inline def apply(
    boolean: default,
    dateTime: default,
    decimal: default,
    double: default,
    integer: default,
    langString: default,
    string: default
  ): Boolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], langString = langString.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  
  extension [Self <: Boolean](x: Self) {
    
    inline def setBoolean(value: default): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDateTime(value: default): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDecimal(value: default): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: default): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setInteger(value: default): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setLangString(value: default): Self = StObject.set(x, "langString", value.asInstanceOf[js.Any])
    
    inline def setString(value: default): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
