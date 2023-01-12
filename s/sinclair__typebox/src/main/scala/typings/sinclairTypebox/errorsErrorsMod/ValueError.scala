package typings.sinclairTypebox.errorsErrorsMod

import typings.sinclairTypebox.mod.TSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueError extends StObject {
  
  var message: String
  
  var path: String
  
  var schema: TSchema
  
  var `type`: ValueErrorType
  
  var value: Any
}
object ValueError {
  
  inline def apply(message: String, path: String, schema: TSchema, `type`: ValueErrorType, value: Any): ValueError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: TSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setType(value: ValueErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
