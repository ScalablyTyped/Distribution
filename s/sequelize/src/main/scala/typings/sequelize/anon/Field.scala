package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  var field: String
  
  var table: String
}
object Field {
  
  @scala.inline
  def apply(field: String, table: String): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
