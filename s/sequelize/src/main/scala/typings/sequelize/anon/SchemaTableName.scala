package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableName extends StObject {
  
  var schema: String
  
  var tableName: String
}
object SchemaTableName {
  
  inline def apply(schema: String, tableName: String): SchemaTableName = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableName]
  }
  
  extension [Self <: SchemaTableName](x: Self) {
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
