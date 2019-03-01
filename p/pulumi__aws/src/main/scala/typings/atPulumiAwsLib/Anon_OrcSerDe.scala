package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OrcSerDe extends js.Object {
  var orcSerDe: js.UndefOr[Anon_BlockSizeBytes] = js.undefined
  var parquetSerDe: js.UndefOr[Anon_BlockSizeBytesCompression] = js.undefined
}

object Anon_OrcSerDe {
  @scala.inline
  def apply(orcSerDe: Anon_BlockSizeBytes = null, parquetSerDe: Anon_BlockSizeBytesCompression = null): Anon_OrcSerDe = {
    val __obj = js.Dynamic.literal()
    if (orcSerDe != null) __obj.updateDynamic("orcSerDe")(orcSerDe)
    if (parquetSerDe != null) __obj.updateDynamic("parquetSerDe")(parquetSerDe)
    __obj.asInstanceOf[Anon_OrcSerDe]
  }
}

