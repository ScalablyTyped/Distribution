package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketColumnsColumns extends js.Object {
  var bucketColumns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var columns: js.UndefOr[Input[js.Array[Input[Anon_CommentName]]]] = js.undefined
  var compressed: js.UndefOr[Input[Boolean]] = js.undefined
  var inputFormat: js.UndefOr[Input[String]] = js.undefined
  var location: js.UndefOr[Input[String]] = js.undefined
  var numberOfBuckets: js.UndefOr[Input[Double]] = js.undefined
  var outputFormat: js.UndefOr[Input[String]] = js.undefined
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var serDeInfo: js.UndefOr[Input[Anon_KeyNameParameters]] = js.undefined
  var skewedInfo: js.UndefOr[Input[Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps]] = js.undefined
  var sortColumns: js.UndefOr[Input[js.Array[Input[Anon_ColumnSortOrder]]]] = js.undefined
  var storedAsSubDirectories: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_BucketColumnsColumns {
  @scala.inline
  def apply(
    bucketColumns: Input[js.Array[Input[String]]] = null,
    columns: Input[js.Array[Input[Anon_CommentName]]] = null,
    compressed: Input[Boolean] = null,
    inputFormat: Input[String] = null,
    location: Input[String] = null,
    numberOfBuckets: Input[Double] = null,
    outputFormat: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    serDeInfo: Input[Anon_KeyNameParameters] = null,
    skewedInfo: Input[Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps] = null,
    sortColumns: Input[js.Array[Input[Anon_ColumnSortOrder]]] = null,
    storedAsSubDirectories: Input[Boolean] = null
  ): Anon_BucketColumnsColumns = {
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
    __obj.asInstanceOf[Anon_BucketColumnsColumns]
  }
}

