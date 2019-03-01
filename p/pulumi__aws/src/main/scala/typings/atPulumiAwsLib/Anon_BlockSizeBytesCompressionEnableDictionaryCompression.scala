package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockSizeBytesCompressionEnableDictionaryCompression extends js.Object {
  var blockSizeBytes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var compression: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var enableDictionaryCompression: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var maxPaddingBytes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var pageSizeBytes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var writerVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BlockSizeBytesCompressionEnableDictionaryCompression {
  @scala.inline
  def apply(
    blockSizeBytes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    compression: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enableDictionaryCompression: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    maxPaddingBytes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    pageSizeBytes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    writerVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

