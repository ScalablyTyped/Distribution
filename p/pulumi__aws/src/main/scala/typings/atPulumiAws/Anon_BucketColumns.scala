package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketColumns extends js.Object {
  var bucketColumns: js.UndefOr[js.Array[String]] = js.undefined
  var columns: js.UndefOr[js.Array[Anon_Comment]] = js.undefined
  var compressed: js.UndefOr[Boolean] = js.undefined
  var inputFormat: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var numberOfBuckets: js.UndefOr[Double] = js.undefined
  var outputFormat: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var serDeInfo: js.UndefOr[Anon_KeyName] = js.undefined
  var skewedInfo: js.UndefOr[Anon_KeySkewedColumnNames] = js.undefined
  var sortColumns: js.UndefOr[js.Array[Anon_Column]] = js.undefined
  var storedAsSubDirectories: js.UndefOr[Boolean] = js.undefined
}

object Anon_BucketColumns {
  @scala.inline
  def apply(
    bucketColumns: js.Array[String] = null,
    columns: js.Array[Anon_Comment] = null,
    compressed: js.UndefOr[Boolean] = js.undefined,
    inputFormat: String = null,
    location: String = null,
    numberOfBuckets: Int | Double = null,
    outputFormat: String = null,
    parameters: StringDictionary[String] = null,
    serDeInfo: Anon_KeyName = null,
    skewedInfo: Anon_KeySkewedColumnNames = null,
    sortColumns: js.Array[Anon_Column] = null,
    storedAsSubDirectories: js.UndefOr[Boolean] = js.undefined
  ): Anon_BucketColumns = {
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
    __obj.asInstanceOf[Anon_BucketColumns]
  }
}

