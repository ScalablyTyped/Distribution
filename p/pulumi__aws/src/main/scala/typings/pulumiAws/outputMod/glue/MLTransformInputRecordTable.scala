package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLTransformInputRecordTable extends StObject {
  
  /**
    * A unique identifier for the AWS Glue Data Catalog.
    */
  var catalogId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the connection to the AWS Glue Data Catalog.
    */
  var connectionName: js.UndefOr[String] = js.undefined
  
  /**
    * A database name in the AWS Glue Data Catalog.
    */
  var databaseName: String
  
  /**
    * A table name in the AWS Glue Data Catalog.
    */
  var tableName: String
}
object MLTransformInputRecordTable {
  
  @scala.inline
  def apply(databaseName: String, tableName: String): MLTransformInputRecordTable = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformInputRecordTable]
  }
  
  @scala.inline
  implicit class MLTransformInputRecordTableMutableBuilder[Self <: MLTransformInputRecordTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: String): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
    
    @scala.inline
    def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
