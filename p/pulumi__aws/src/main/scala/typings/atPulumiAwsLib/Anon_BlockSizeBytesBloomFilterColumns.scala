package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockSizeBytesBloomFilterColumns extends js.Object {
  var blockSizeBytes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var bloomFilterColumns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var bloomFilterFalsePositiveProbability: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var compression: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var dictionaryKeyThreshold: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var enablePadding: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var formatVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var paddingTolerance: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var rowIndexStride: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var stripeSizeBytes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_BlockSizeBytesBloomFilterColumns {
  @scala.inline
  def apply(
    blockSizeBytes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    bloomFilterColumns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    bloomFilterFalsePositiveProbability: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    compression: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dictionaryKeyThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    enablePadding: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    formatVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    paddingTolerance: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    rowIndexStride: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    stripeSizeBytes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_BlockSizeBytesBloomFilterColumns = {
    val __obj = js.Dynamic.literal()
    if (blockSizeBytes != null) __obj.updateDynamic("blockSizeBytes")(blockSizeBytes.asInstanceOf[js.Any])
    if (bloomFilterColumns != null) __obj.updateDynamic("bloomFilterColumns")(bloomFilterColumns.asInstanceOf[js.Any])
    if (bloomFilterFalsePositiveProbability != null) __obj.updateDynamic("bloomFilterFalsePositiveProbability")(bloomFilterFalsePositiveProbability.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (dictionaryKeyThreshold != null) __obj.updateDynamic("dictionaryKeyThreshold")(dictionaryKeyThreshold.asInstanceOf[js.Any])
    if (enablePadding != null) __obj.updateDynamic("enablePadding")(enablePadding.asInstanceOf[js.Any])
    if (formatVersion != null) __obj.updateDynamic("formatVersion")(formatVersion.asInstanceOf[js.Any])
    if (paddingTolerance != null) __obj.updateDynamic("paddingTolerance")(paddingTolerance.asInstanceOf[js.Any])
    if (rowIndexStride != null) __obj.updateDynamic("rowIndexStride")(rowIndexStride.asInstanceOf[js.Any])
    if (stripeSizeBytes != null) __obj.updateDynamic("stripeSizeBytes")(stripeSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlockSizeBytesBloomFilterColumns]
  }
}

