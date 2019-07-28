package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OrcSerDeParquetSerDe extends js.Object {
  var orcSerDe: js.UndefOr[Input[Anon_BlockSizeBytesBloomFilterColumns]] = js.undefined
  var parquetSerDe: js.UndefOr[Input[Anon_BlockSizeBytesCompressionEnableDictionaryCompression]] = js.undefined
}

object Anon_OrcSerDeParquetSerDe {
  @scala.inline
  def apply(
    orcSerDe: Input[Anon_BlockSizeBytesBloomFilterColumns] = null,
    parquetSerDe: Input[Anon_BlockSizeBytesCompressionEnableDictionaryCompression] = null
  ): Anon_OrcSerDeParquetSerDe = {
    val __obj = js.Dynamic.literal()
    if (orcSerDe != null) __obj.updateDynamic("orcSerDe")(orcSerDe.asInstanceOf[js.Any])
    if (parquetSerDe != null) __obj.updateDynamic("parquetSerDe")(parquetSerDe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OrcSerDeParquetSerDe]
  }
}

