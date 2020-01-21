package typings.pulumiAws.catalogTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey
import typings.pulumiAws.inputMod.glue.CatalogTableStorageDescriptor
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableArgs extends js.Object {
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: Input[String] = js.native
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
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
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
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
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

object CatalogTableArgs {
  @scala.inline
  def apply(
    databaseName: Input[String],
    catalogId: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    owner: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    partitionKeys: Input[js.Array[Input[CatalogTablePartitionKey]]] = null,
    retention: Input[Double] = null,
    storageDescriptor: Input[CatalogTableStorageDescriptor] = null,
    tableType: Input[String] = null,
    viewExpandedText: Input[String] = null,
    viewOriginalText: Input[String] = null
  ): CatalogTableArgs = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any])
    if (catalogId != null) __obj.updateDynamic("catalogId")(catalogId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (partitionKeys != null) __obj.updateDynamic("partitionKeys")(partitionKeys.asInstanceOf[js.Any])
    if (retention != null) __obj.updateDynamic("retention")(retention.asInstanceOf[js.Any])
    if (storageDescriptor != null) __obj.updateDynamic("storageDescriptor")(storageDescriptor.asInstanceOf[js.Any])
    if (tableType != null) __obj.updateDynamic("tableType")(tableType.asInstanceOf[js.Any])
    if (viewExpandedText != null) __obj.updateDynamic("viewExpandedText")(viewExpandedText.asInstanceOf[js.Any])
    if (viewOriginalText != null) __obj.updateDynamic("viewOriginalText")(viewOriginalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableArgs]
  }
}

