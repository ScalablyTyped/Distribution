package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockSizeBytesBloomFilterColumns extends js.Object {
  var blockSizeBytes: js.UndefOr[Input[Double]] = js.undefined
  var bloomFilterColumns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var bloomFilterFalsePositiveProbability: js.UndefOr[Input[Double]] = js.undefined
  var compression: js.UndefOr[Input[String]] = js.undefined
  var dictionaryKeyThreshold: js.UndefOr[Input[Double]] = js.undefined
  var enablePadding: js.UndefOr[Input[Boolean]] = js.undefined
  var formatVersion: js.UndefOr[Input[String]] = js.undefined
  var paddingTolerance: js.UndefOr[Input[Double]] = js.undefined
  var rowIndexStride: js.UndefOr[Input[Double]] = js.undefined
  var stripeSizeBytes: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_BlockSizeBytesBloomFilterColumns {
  @scala.inline
  def apply(
    blockSizeBytes: Input[Double] = null,
    bloomFilterColumns: Input[js.Array[Input[String]]] = null,
    bloomFilterFalsePositiveProbability: Input[Double] = null,
    compression: Input[String] = null,
    dictionaryKeyThreshold: Input[Double] = null,
    enablePadding: Input[Boolean] = null,
    formatVersion: Input[String] = null,
    paddingTolerance: Input[Double] = null,
    rowIndexStride: Input[Double] = null,
    stripeSizeBytes: Input[Double] = null
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

