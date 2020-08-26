package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
  def apply(): CatalogTableStorageDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptor]
  }
  @scala.inline
  implicit class CatalogTableStorageDescriptorOps[Self <: CatalogTableStorageDescriptor] (val x: Self) extends AnyVal {
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
    def setBucketColumnsVarargs(value: Input[String]*): Self = this.set("bucketColumns", js.Array(value :_*))
    @scala.inline
    def setBucketColumns(value: Input[js.Array[Input[String]]]): Self = this.set("bucketColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketColumns: Self = this.set("bucketColumns", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Input[CatalogTableStorageDescriptorColumn]*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: Input[js.Array[Input[CatalogTableStorageDescriptorColumn]]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCompressed(value: Input[Boolean]): Self = this.set("compressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressed: Self = this.set("compressed", js.undefined)
    @scala.inline
    def setInputFormat(value: Input[String]): Self = this.set("inputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFormat: Self = this.set("inputFormat", js.undefined)
    @scala.inline
    def setLocation(value: Input[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNumberOfBuckets(value: Input[Double]): Self = this.set("numberOfBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfBuckets: Self = this.set("numberOfBuckets", js.undefined)
    @scala.inline
    def setOutputFormat(value: Input[String]): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setSerDeInfo(value: Input[CatalogTableStorageDescriptorSerDeInfo]): Self = this.set("serDeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerDeInfo: Self = this.set("serDeInfo", js.undefined)
    @scala.inline
    def setSkewedInfo(value: Input[CatalogTableStorageDescriptorSkewedInfo]): Self = this.set("skewedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewedInfo: Self = this.set("skewedInfo", js.undefined)
    @scala.inline
    def setSortColumnsVarargs(value: Input[CatalogTableStorageDescriptorSortColumn]*): Self = this.set("sortColumns", js.Array(value :_*))
    @scala.inline
    def setSortColumns(value: Input[js.Array[Input[CatalogTableStorageDescriptorSortColumn]]]): Self = this.set("sortColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumns: Self = this.set("sortColumns", js.undefined)
    @scala.inline
    def setStoredAsSubDirectories(value: Input[Boolean]): Self = this.set("storedAsSubDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoredAsSubDirectories: Self = this.set("storedAsSubDirectories", js.undefined)
  }
  
}

