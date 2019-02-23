package typings
package atPulumiAwsLib.glueCatalogTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogTableArgs extends js.Object {
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Description of the table.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the SerDe.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Owner of the table.
    */
  val owner: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  val parameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
    */
  val partitionKeys: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CommentName]]]
  ] = js.undefined
  /**
    * Retention time for this table.
    */
  val retention: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
    */
  val storageDescriptor: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketColumnsColumns]] = js.undefined
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  val tableType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  val viewExpandedText: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  val viewOriginalText: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

