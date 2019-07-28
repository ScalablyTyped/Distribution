package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockSizeBytesCompressionEnableDictionaryCompression extends js.Object {
  var blockSizeBytes: js.UndefOr[Input[Double]] = js.undefined
  var compression: js.UndefOr[Input[String]] = js.undefined
  var enableDictionaryCompression: js.UndefOr[Input[Boolean]] = js.undefined
  var maxPaddingBytes: js.UndefOr[Input[Double]] = js.undefined
  var pageSizeBytes: js.UndefOr[Input[Double]] = js.undefined
  var writerVersion: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BlockSizeBytesCompressionEnableDictionaryCompression {
  @scala.inline
  def apply(
    blockSizeBytes: Input[Double] = null,
    compression: Input[String] = null,
    enableDictionaryCompression: Input[Boolean] = null,
    maxPaddingBytes: Input[Double] = null,
    pageSizeBytes: Input[Double] = null,
    writerVersion: Input[String] = null
  ): Anon_BlockSizeBytesCompressionEnableDictionaryCompression = {
    val __obj = js.Dynamic.literal()
    if (blockSizeBytes != null) __obj.updateDynamic("blockSizeBytes")(blockSizeBytes.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (enableDictionaryCompression != null) __obj.updateDynamic("enableDictionaryCompression")(enableDictionaryCompression.asInstanceOf[js.Any])
    if (maxPaddingBytes != null) __obj.updateDynamic("maxPaddingBytes")(maxPaddingBytes.asInstanceOf[js.Any])
    if (pageSizeBytes != null) __obj.updateDynamic("pageSizeBytes")(pageSizeBytes.asInstanceOf[js.Any])
    if (writerVersion != null) __obj.updateDynamic("writerVersion")(writerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlockSizeBytesCompressionEnableDictionaryCompression]
  }
}

