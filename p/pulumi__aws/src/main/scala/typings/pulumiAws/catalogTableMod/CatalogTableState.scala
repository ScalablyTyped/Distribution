package typings.pulumiAws.catalogTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey
import typings.pulumiAws.inputMod.glue.CatalogTableStorageDescriptor
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogTableState extends js.Object {
  
  /**
    * The ARN of the Glue Table.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of the table.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the SerDe.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Owner of the table.
    */
  val owner: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. see Partition Keys below.
    */
  val partitionKeys: js.UndefOr[Input[js.Array[Input[CatalogTablePartitionKey]]]] = js.native
  
  /**
    * Retention time for this table.
    */
  val retention: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
    */
  val storageDescriptor: js.UndefOr[Input[CatalogTableStorageDescriptor]] = js.native
  
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
    */
  val tableType: js.UndefOr[Input[String]] = js.native
  
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  val viewExpandedText: js.UndefOr[Input[String]] = js.native
  
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  val viewOriginalText: js.UndefOr[Input[String]] = js.native
}
object CatalogTableState {
  
  @scala.inline
  def apply(): CatalogTableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableState]
  }
  
  @scala.inline
  implicit class CatalogTableStateOps[Self <: CatalogTableState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: Input[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPartitionKeysVarargs(value: Input[CatalogTablePartitionKey]*): Self = this.set("partitionKeys", js.Array(value :_*))
    
    @scala.inline
    def setPartitionKeys(value: Input[js.Array[Input[CatalogTablePartitionKey]]]): Self = this.set("partitionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKeys: Self = this.set("partitionKeys", js.undefined)
    
    @scala.inline
    def setRetention(value: Input[Double]): Self = this.set("retention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetention: Self = this.set("retention", js.undefined)
    
    @scala.inline
    def setStorageDescriptor(value: Input[CatalogTableStorageDescriptor]): Self = this.set("storageDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageDescriptor: Self = this.set("storageDescriptor", js.undefined)
    
    @scala.inline
    def setTableType(value: Input[String]): Self = this.set("tableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableType: Self = this.set("tableType", js.undefined)
    
    @scala.inline
    def setViewExpandedText(value: Input[String]): Self = this.set("viewExpandedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewExpandedText: Self = this.set("viewExpandedText", js.undefined)
    
    @scala.inline
    def setViewOriginalText(value: Input[String]): Self = this.set("viewOriginalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewOriginalText: Self = this.set("viewOriginalText", js.undefined)
  }
}
