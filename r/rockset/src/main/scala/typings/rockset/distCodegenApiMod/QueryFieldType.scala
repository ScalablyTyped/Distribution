package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFieldType extends StObject {
  
  /**
    * name of the field
    * @type {string}
    * @memberof QueryFieldType
    */
  var name: String
  
  /**
    * data type of the field
    * @type {string}
    * @memberof QueryFieldType
    */
  var `type`: String
}
object QueryFieldType {
  
  inline def apply(name: String, `type`: String): QueryFieldType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFieldType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryFieldType] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
