package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockSizeBytes extends js.Object {
  var blockSizeBytes: js.UndefOr[scala.Double] = js.undefined
  var bloomFilterColumns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var bloomFilterFalsePositiveProbability: js.UndefOr[scala.Double] = js.undefined
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var dictionaryKeyThreshold: js.UndefOr[scala.Double] = js.undefined
  var enablePadding: js.UndefOr[scala.Boolean] = js.undefined
  var formatVersion: js.UndefOr[java.lang.String] = js.undefined
  var paddingTolerance: js.UndefOr[scala.Double] = js.undefined
  var rowIndexStride: js.UndefOr[scala.Double] = js.undefined
  var stripeSizeBytes: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BlockSizeBytes {
  @scala.inline
  def apply(
    blockSizeBytes: scala.Int | scala.Double = null,
    bloomFilterColumns: js.Array[java.lang.String] = null,
    bloomFilterFalsePositiveProbability: scala.Int | scala.Double = null,
    compression: java.lang.String = null,
    dictionaryKeyThreshold: scala.Int | scala.Double = null,
    enablePadding: js.UndefOr[scala.Boolean] = js.undefined,
    formatVersion: java.lang.String = null,
    paddingTolerance: scala.Int | scala.Double = null,
    rowIndexStride: scala.Int | scala.Double = null,
    stripeSizeBytes: scala.Int | scala.Double = null
  ): Anon_BlockSizeBytes = {
    val __obj = js.Dynamic.literal()
    if (blockSizeBytes != null) __obj.updateDynamic("blockSizeBytes")(blockSizeBytes.asInstanceOf[js.Any])
    if (bloomFilterColumns != null) __obj.updateDynamic("bloomFilterColumns")(bloomFilterColumns)
    if (bloomFilterFalsePositiveProbability != null) __obj.updateDynamic("bloomFilterFalsePositiveProbability")(bloomFilterFalsePositiveProbability.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (dictionaryKeyThreshold != null) __obj.updateDynamic("dictionaryKeyThreshold")(dictionaryKeyThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePadding)) __obj.updateDynamic("enablePadding")(enablePadding)
    if (formatVersion != null) __obj.updateDynamic("formatVersion")(formatVersion)
    if (paddingTolerance != null) __obj.updateDynamic("paddingTolerance")(paddingTolerance.asInstanceOf[js.Any])
    if (rowIndexStride != null) __obj.updateDynamic("rowIndexStride")(rowIndexStride.asInstanceOf[js.Any])
    if (stripeSizeBytes != null) __obj.updateDynamic("stripeSizeBytes")(stripeSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlockSizeBytes]
  }
}

