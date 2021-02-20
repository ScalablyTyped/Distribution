package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTableName extends StObject {
  
  var schema: String = js.native
  
  var tableName: String = js.native
}
object SchemaTableName {
  
  @scala.inline
  def apply(schema: String, tableName: String): SchemaTableName = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableName]
  }
  
  @scala.inline
  implicit class SchemaTableNameMutableBuilder[Self <: SchemaTableName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
