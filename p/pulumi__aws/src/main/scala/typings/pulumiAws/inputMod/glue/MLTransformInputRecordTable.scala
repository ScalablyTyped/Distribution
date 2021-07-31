package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLTransformInputRecordTable extends StObject {
  
  /**
    * A unique identifier for the AWS Glue Data Catalog.
    */
  var catalogId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the connection to the AWS Glue Data Catalog.
    */
  var connectionName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A database name in the AWS Glue Data Catalog.
    */
  var databaseName: Input[String]
  
  /**
    * A table name in the AWS Glue Data Catalog.
    */
  var tableName: Input[String]
}
object MLTransformInputRecordTable {
  
  @scala.inline
  def apply(databaseName: Input[String], tableName: Input[String]): MLTransformInputRecordTable = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformInputRecordTable]
  }
  
  @scala.inline
  implicit class MLTransformInputRecordTableMutableBuilder[Self <: MLTransformInputRecordTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
    
    @scala.inline
    def setConnectionName(value: Input[String]): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
