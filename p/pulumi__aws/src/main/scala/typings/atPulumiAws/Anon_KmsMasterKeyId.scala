package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KmsMasterKeyId extends js.Object {
  var kmsMasterKeyId: js.UndefOr[String] = js.undefined
  var sseAlgorithm: String
}

object Anon_KmsMasterKeyId {
  @scala.inline
  def apply(sseAlgorithm: String, kmsMasterKeyId: String = null): Anon_KmsMasterKeyId = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm)
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId)
    __obj.asInstanceOf[Anon_KmsMasterKeyId]
  }
}

