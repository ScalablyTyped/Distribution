package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KmsMasterKeyId extends js.Object {
  var kmsMasterKeyId: js.UndefOr[java.lang.String] = js.undefined
  var sseAlgorithm: java.lang.String
}

object Anon_KmsMasterKeyId {
  @scala.inline
  def apply(sseAlgorithm: java.lang.String, kmsMasterKeyId: java.lang.String = null): Anon_KmsMasterKeyId = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm)
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId)
    __obj.asInstanceOf[Anon_KmsMasterKeyId]
  }
}

