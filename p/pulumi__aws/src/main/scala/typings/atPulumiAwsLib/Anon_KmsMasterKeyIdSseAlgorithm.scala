package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KmsMasterKeyIdSseAlgorithm extends js.Object {
  var kmsMasterKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sseAlgorithm: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_KmsMasterKeyIdSseAlgorithm {
  @scala.inline
  def apply(
    sseAlgorithm: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    kmsMasterKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_KmsMasterKeyIdSseAlgorithm = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm.asInstanceOf[js.Any])
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KmsMasterKeyIdSseAlgorithm]
  }
}

