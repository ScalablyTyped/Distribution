package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockSizeBytesCompression extends js.Object {
  var blockSizeBytes: js.UndefOr[Double] = js.undefined
  var compression: js.UndefOr[String] = js.undefined
  var enableDictionaryCompression: js.UndefOr[Boolean] = js.undefined
  var maxPaddingBytes: js.UndefOr[Double] = js.undefined
  var pageSizeBytes: js.UndefOr[Double] = js.undefined
  var writerVersion: js.UndefOr[String] = js.undefined
}

object Anon_BlockSizeBytesCompression {
  @scala.inline
  def apply(
    blockSizeBytes: Int | Double = null,
    compression: String = null,
    enableDictionaryCompression: js.UndefOr[Boolean] = js.undefined,
    maxPaddingBytes: Int | Double = null,
    pageSizeBytes: Int | Double = null,
    writerVersion: String = null
  ): Anon_BlockSizeBytesCompression = {
    val __obj = js.Dynamic.literal()
    if (blockSizeBytes != null) __obj.updateDynamic("blockSizeBytes")(blockSizeBytes.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(enableDictionaryCompression)) __obj.updateDynamic("enableDictionaryCompression")(enableDictionaryCompression)
    if (maxPaddingBytes != null) __obj.updateDynamic("maxPaddingBytes")(maxPaddingBytes.asInstanceOf[js.Any])
    if (pageSizeBytes != null) __obj.updateDynamic("pageSizeBytes")(pageSizeBytes.asInstanceOf[js.Any])
    if (writerVersion != null) __obj.updateDynamic("writerVersion")(writerVersion)
    __obj.asInstanceOf[Anon_BlockSizeBytesCompression]
  }
}

