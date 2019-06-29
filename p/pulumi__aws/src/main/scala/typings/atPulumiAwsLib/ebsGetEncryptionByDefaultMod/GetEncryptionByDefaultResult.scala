package typings
package atPulumiAwsLib.ebsGetEncryptionByDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEncryptionByDefaultResult extends js.Object {
  /**
    * Whether or not default EBS encryption is enabled. Returns as `true` or `false`.
    */
  val enabled: scala.Boolean
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetEncryptionByDefaultResult {
  @scala.inline
  def apply(enabled: scala.Boolean, id: java.lang.String): GetEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal(enabled = enabled, id = id)
  
    __obj.asInstanceOf[GetEncryptionByDefaultResult]
  }
}

