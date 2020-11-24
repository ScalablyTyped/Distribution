package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLTransformInputRecordTable extends js.Object {
  
  /**
    * A unique identifier for the AWS Glue Data Catalog.
    */
  var catalogId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the connection to the AWS Glue Data Catalog.
    */
  var connectionName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A database name in the AWS Glue Data Catalog.
    */
  var databaseName: Input[String] = js.native
  
  /**
    * A table name in the AWS Glue Data Catalog.
    */
  var tableName: Input[String] = js.native
}
object MLTransformInputRecordTable {
  
  @scala.inline
  def apply(databaseName: Input[String], tableName: Input[String]): MLTransformInputRecordTable = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformInputRecordTable]
  }
  
  @scala.inline
  implicit class MLTransformInputRecordTableOps[Self <: MLTransformInputRecordTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: Input[String]): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    
    @scala.inline
    def setConnectionName(value: Input[String]): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionName: Self = this.set("connectionName", js.undefined)
  }
}
