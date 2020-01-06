package typings.atPulumiAws.typesOutputMod.glue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptor extends js.Object {
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var bucketColumns: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of the Columns in the table.
    */
  var columns: js.UndefOr[js.Array[CatalogTableStorageDescriptorColumn]] = js.native
  /**
    * True if the data in the table is compressed, or False if not.
    */
  var compressed: js.UndefOr[Boolean] = js.native
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var inputFormat: js.UndefOr[String] = js.native
  /**
    * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var numberOfBuckets: js.UndefOr[Double] = js.native
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var outputFormat: js.UndefOr[String] = js.native
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Serialization/deserialization (SerDe) information.
    */
  var serDeInfo: js.UndefOr[CatalogTableStorageDescriptorSerDeInfo] = js.native
  /**
    * Information about values that appear very frequently in a column (skewed values).
    */
  var skewedInfo: js.UndefOr[CatalogTableStorageDescriptorSkewedInfo] = js.native
  /**
    * A list of Order objects specifying the sort order of each bucket in the table.
    */
  var sortColumns: js.UndefOr[js.Array[CatalogTableStorageDescriptorSortColumn]] = js.native
  /**
    * True if the table data is stored in subdirectories, or False if not.
    */
  var storedAsSubDirectories: js.UndefOr[Boolean] = js.native
}

object CatalogTableStorageDescriptor {
  @scala.inline
  def apply(
    bucketColumns: js.Array[String] = null,
    columns: js.Array[CatalogTableStorageDescriptorColumn] = null,
    compressed: js.UndefOr[Boolean] = js.undefined,
    inputFormat: String = null,
    location: String = null,
    numberOfBuckets: Int | Double = null,
    outputFormat: String = null,
    parameters: StringDictionary[String] = null,
    serDeInfo: CatalogTableStorageDescriptorSerDeInfo = null,
    skewedInfo: CatalogTableStorageDescriptorSkewedInfo = null,
    sortColumns: js.Array[CatalogTableStorageDescriptorSortColumn] = null,
    storedAsSubDirectories: js.UndefOr[Boolean] = js.undefined
  ): CatalogTableStorageDescriptor = {
    val __obj = js.Dynamic.literal()
    if (bucketColumns != null) __obj.updateDynamic("bucketColumns")(bucketColumns.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (numberOfBuckets != null) __obj.updateDynamic("numberOfBuckets")(numberOfBuckets.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (serDeInfo != null) __obj.updateDynamic("serDeInfo")(serDeInfo.asInstanceOf[js.Any])
    if (skewedInfo != null) __obj.updateDynamic("skewedInfo")(skewedInfo.asInstanceOf[js.Any])
    if (sortColumns != null) __obj.updateDynamic("sortColumns")(sortColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(storedAsSubDirectories)) __obj.updateDynamic("storedAsSubDirectories")(storedAsSubDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptor]
  }
}

