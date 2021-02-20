package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableName extends StObject {
  
  var schema: js.UndefOr[String] = js.native
  
  var tableName: js.UndefOr[String] = js.native
}
object TableName {
  
  @scala.inline
  def apply(): TableName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableName]
  }
  
  @scala.inline
  implicit class TableNameMutableBuilder[Self <: TableName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
