package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KmsMasterKeyIdSseAlgorithm extends js.Object {
  var kmsMasterKeyId: js.UndefOr[Input[String]] = js.undefined
  var sseAlgorithm: Input[String]
}

object Anon_KmsMasterKeyIdSseAlgorithm {
  @scala.inline
  def apply(sseAlgorithm: Input[String], kmsMasterKeyId: Input[String] = null): Anon_KmsMasterKeyIdSseAlgorithm = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm.asInstanceOf[js.Any])
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KmsMasterKeyIdSseAlgorithm]
  }
}

