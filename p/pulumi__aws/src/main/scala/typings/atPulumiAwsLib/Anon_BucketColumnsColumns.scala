package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketColumnsColumns extends js.Object {
  var bucketColumns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var columns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_CommentName]]]
  ] = js.undefined
  var compressed: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var inputFormat: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var location: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var numberOfBuckets: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var outputFormat: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var parameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  var serDeInfo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_KeyNameParameters]] = js.undefined
  var skewedInfo: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps]
  ] = js.undefined
  var sortColumns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ColumnSortOrder]]]
  ] = js.undefined
  var storedAsSubDirectories: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_BucketColumnsColumns {
  @scala.inline
  def apply(
    bucketColumns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    columns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_CommentName]]] = null,
    compressed: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    inputFormat: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    location: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    numberOfBuckets: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    outputFormat: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    parameters: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    serDeInfo: atPulumiPulumiLib.outputMod.Input[Anon_KeyNameParameters] = null,
    skewedInfo: atPulumiPulumiLib.outputMod.Input[Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps] = null,
    sortColumns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ColumnSortOrder]]] = null,
    storedAsSubDirectories: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
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

