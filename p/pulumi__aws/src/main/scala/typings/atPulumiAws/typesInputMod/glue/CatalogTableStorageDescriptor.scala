package typings.atPulumiAws.typesInputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptor extends js.Object {
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var bucketColumns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of the Columns in the table.
    */
  var columns: js.UndefOr[Input[js.Array[Input[CatalogTableStorageDescriptorColumn]]]] = js.native
  /**
    * True if the data in the table is compressed, or False if not.
    */
  var compressed: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var inputFormat: js.UndefOr[Input[String]] = js.native
  /**
    * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var location: js.UndefOr[Input[String]] = js.native
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var numberOfBuckets: js.UndefOr[Input[Double]] = js.native
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var outputFormat: js.UndefOr[Input[String]] = js.native
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Serialization/deserialization (SerDe) information.
    */
  var serDeInfo: js.UndefOr[Input[CatalogTableStorageDescriptorSerDeInfo]] = js.native
  /**
    * Information about values that appear very frequently in a column (skewed values).
    */
  var skewedInfo: js.UndefOr[Input[CatalogTableStorageDescriptorSkewedInfo]] = js.native
  /**
    * A list of Order objects specifying the sort order of each bucket in the table.
    */
  var sortColumns: js.UndefOr[Input[js.Array[Input[CatalogTableStorageDescriptorSortColumn]]]] = js.native
  /**
    * True if the table data is stored in subdirectories, or False if not.
    */
  var storedAsSubDirectories: js.UndefOr[Input[Boolean]] = js.native
}

object CatalogTableStorageDescriptor {
  @scala.inline
  def apply(
    bucketColumns: Input[js.Array[Input[String]]] = null,
    columns: Input[js.Array[Input[CatalogTableStorageDescriptorColumn]]] = null,
    compressed: Input[Boolean] = null,
    inputFormat: Input[String] = null,
    location: Input[String] = null,
    numberOfBuckets: Input[Double] = null,
    outputFormat: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    serDeInfo: Input[CatalogTableStorageDescriptorSerDeInfo] = null,
    skewedInfo: Input[CatalogTableStorageDescriptorSkewedInfo] = null,
    sortColumns: Input[js.Array[Input[CatalogTableStorageDescriptorSortColumn]]] = null,
    storedAsSubDirectories: Input[Boolean] = null
  ): CatalogTableStorageDescriptor = {
    val __obj = js.Dynamic.literal()
    if (bucketColumns != null) __obj.updateDynamic("bucketColumns")(bucketColumns.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (compressed != null) __obj.updateDynamic("compressed")(compressed.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (numberOfBuckets != null) __obj.updateDynamic("numberOfBuckets")(numberOfBuckets.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (serDeInfo != null) __obj.updateDynamic("serDeInfo")(serDeInfo.asInstanceOf[js.Any])
    if (skewedInfo != null) __obj.updateDynamic("skewedInfo")(skewedInfo.asInstanceOf[js.Any])
    if (sortColumns != null) __obj.updateDynamic("sortColumns")(sortColumns.asInstanceOf[js.Any])
    if (storedAsSubDirectories != null) __obj.updateDynamic("storedAsSubDirectories")(storedAsSubDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptor]
  }
}

