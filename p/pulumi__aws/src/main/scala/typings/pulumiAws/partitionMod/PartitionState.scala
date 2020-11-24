package typings.pulumiAws.partitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.glue.PartitionStorageDescriptor
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionState extends js.Object {
  
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The time at which the partition was created.
    */
  val creationTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The last time at which the partition was accessed.
    */
  val lastAccessedTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * The last time at which column statistics were computed for this partition.
    */
  val lastAnalyzedTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The values that define the partition.
    */
  val partitionValues: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
    */
  val storageDescriptor: js.UndefOr[Input[PartitionStorageDescriptor]] = js.native
  
  val tableName: js.UndefOr[Input[String]] = js.native
}
object PartitionState {
  
  @scala.inline
  def apply(): PartitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionState]
  }
  
  @scala.inline
  implicit class PartitionStateOps[Self <: PartitionState] (val x: Self) extends AnyVal {
    
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
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Input[String]): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    
    @scala.inline
    def setLastAccessedTime(value: Input[String]): Self = this.set("lastAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessedTime: Self = this.set("lastAccessedTime", js.undefined)
    
    @scala.inline
    def setLastAnalyzedTime(value: Input[String]): Self = this.set("lastAnalyzedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAnalyzedTime: Self = this.set("lastAnalyzedTime", js.undefined)
    
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPartitionValuesVarargs(value: Input[String]*): Self = this.set("partitionValues", js.Array(value :_*))
    
    @scala.inline
    def setPartitionValues(value: Input[js.Array[Input[String]]]): Self = this.set("partitionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionValues: Self = this.set("partitionValues", js.undefined)
    
    @scala.inline
    def setStorageDescriptor(value: Input[PartitionStorageDescriptor]): Self = this.set("storageDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageDescriptor: Self = this.set("storageDescriptor", js.undefined)
    
    @scala.inline
    def setTableName(value: Input[String]): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
}
