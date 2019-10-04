package typings.atPulumiAws.glueCatalogTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.glueNs.CatalogTablePartitionKey
import typings.atPulumiAws.typesOutputMod.glueNs.CatalogTableStorageDescriptor
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/catalogTable", "CatalogTable")
@js.native
class CatalogTable protected () extends CustomResource {
  /**
    * Create a CatalogTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CatalogTableArgs) = this()
  def this(name: String, args: CatalogTableArgs, opts: CustomResourceOptions) = this()
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: Output[String] = js.native
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: Output[String] = js.native
  /**
    * Description of the table.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the SerDe.
    */
  val name: Output[String] = js.native
  /**
    * Owner of the table.
    */
  val owner: Output[js.UndefOr[String]] = js.native
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  val parameters: Output[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
    */
  val partitionKeys: Output[js.UndefOr[js.Array[CatalogTablePartitionKey]]] = js.native
  /**
    * Retention time for this table.
    */
  val retention: Output[js.UndefOr[Double]] = js.native
  /**
    * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
    */
  val storageDescriptor: Output[js.UndefOr[CatalogTableStorageDescriptor]] = js.native
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  val tableType: Output[js.UndefOr[String]] = js.native
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  val viewExpandedText: Output[js.UndefOr[String]] = js.native
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  val viewOriginalText: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/glue/catalogTable", "CatalogTable")
@js.native
object CatalogTable extends js.Object {
  /**
    * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): CatalogTable = js.native
  def get(name: String, id: Input[ID], state: CatalogTableState): CatalogTable = js.native
  def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): CatalogTable = js.native
  /**
    * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = js.native
}

