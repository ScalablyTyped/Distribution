package typings.atPulumiAws.typesOutputMod.glueNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogTableStorageDescriptor extends js.Object {
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var bucketColumns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of the Columns in the table.
    */
  var columns: js.UndefOr[js.Array[CatalogTableStorageDescriptorColumn]] = js.undefined
  /**
    * True if the data in the table is compressed, or False if not.
    */
  var compressed: js.UndefOr[Boolean] = js.undefined
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var inputFormat: js.UndefOr[String] = js.undefined
  /**
    * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var numberOfBuckets: js.UndefOr[Double] = js.undefined
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var outputFormat: js.UndefOr[String] = js.undefined
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Serialization/deserialization (SerDe) information.
    */
  var serDeInfo: js.UndefOr[CatalogTableStorageDescriptorSerDeInfo] = js.undefined
  /**
    * Information about values that appear very frequently in a column (skewed values).
    */
  var skewedInfo: js.UndefOr[CatalogTableStorageDescriptorSkewedInfo] = js.undefined
  /**
    * A list of Order objects specifying the sort order of each bucket in the table.
    */
  var sortColumns: js.UndefOr[js.Array[CatalogTableStorageDescriptorSortColumn]] = js.undefined
  /**
    * True if the table data is stored in subdirectories, or False if not.
    */
  var storedAsSubDirectories: js.UndefOr[Boolean] = js.undefined
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
    if (bucketColumns != null) __obj.updateDynamic("bucketColumns")(bucketColumns)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed)
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat)
    if (location != null) __obj.updateDynamic("location")(location)
    if (numberOfBuckets != null) __obj.updateDynamic("numberOfBuckets")(numberOfBuckets.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (serDeInfo != null) __obj.updateDynamic("serDeInfo")(serDeInfo)
    if (skewedInfo != null) __obj.updateDynamic("skewedInfo")(skewedInfo)
    if (sortColumns != null) __obj.updateDynamic("sortColumns")(sortColumns)
    if (!js.isUndefined(storedAsSubDirectories)) __obj.updateDynamic("storedAsSubDirectories")(storedAsSubDirectories)
    __obj.asInstanceOf[CatalogTableStorageDescriptor]
  }
}

