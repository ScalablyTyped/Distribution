package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableName extends StObject {
  
  var schema: js.UndefOr[String] = js.undefined
  
  var tableName: js.UndefOr[String] = js.undefined
}
object TableName {
  
  inline def apply(): TableName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableName]
  }
  
  extension [Self <: TableName](x: Self) {
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
