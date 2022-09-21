package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameter extends StObject {
  
  /**
    * name of the field
    * @type {string}
    * @memberof QueryParameter
    */
  var name: String
  
  /**
    * data type of the field
    * @type {string}
    * @memberof QueryParameter
    */
  var `type`: String
  
  /**
    * literal value of the field
    * @type {string}
    * @memberof QueryParameter
    */
  var value: String
}
object QueryParameter {
  
  inline def apply(name: String, `type`: String, value: String): QueryParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameter]
  }
  
  extension [Self <: QueryParameter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
