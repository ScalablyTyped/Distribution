package typings.pulumiAws.getEncryptionByDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEncryptionByDefaultResult extends js.Object {
  /**
    * Whether or not default EBS encryption is enabled. Returns as `true` or `false`.
    */
  val enabled: Boolean = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetEncryptionByDefaultResult {
  @scala.inline
  def apply(enabled: Boolean, id: String): GetEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncryptionByDefaultResult]
  }
}

