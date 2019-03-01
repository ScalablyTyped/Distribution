package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketColumns extends js.Object {
  var bucketColumns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var columns: js.UndefOr[js.Array[Anon_Comment]] = js.undefined
  var compressed: js.UndefOr[scala.Boolean] = js.undefined
  var inputFormat: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var numberOfBuckets: js.UndefOr[scala.Double] = js.undefined
  var outputFormat: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var serDeInfo: js.UndefOr[Anon_KeyName] = js.undefined
  var skewedInfo: js.UndefOr[Anon_KeySkewedColumnNames] = js.undefined
  var sortColumns: js.UndefOr[js.Array[Anon_Column]] = js.undefined
  var storedAsSubDirectories: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BucketColumns {
  @scala.inline
  def apply(
    bucketColumns: js.Array[java.lang.String] = null,
    columns: js.Array[Anon_Comment] = null,
    compressed: js.UndefOr[scala.Boolean] = js.undefined,
    inputFormat: java.lang.String = null,
    location: java.lang.String = null,
    numberOfBuckets: scala.Int | scala.Double = null,
    outputFormat: java.lang.String = null,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    serDeInfo: Anon_KeyName = null,
    skewedInfo: Anon_KeySkewedColumnNames = null,
    sortColumns: js.Array[Anon_Column] = null,
    storedAsSubDirectories: js.UndefOr[scala.Boolean] = js.undefined
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

