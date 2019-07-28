package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledKmsKeyId extends js.Object {
  var enabled: Boolean
  var kmsKeyId: String
}

object Anon_EnabledKmsKeyId {
  @scala.inline
  def apply(enabled: Boolean, kmsKeyId: String): Anon_EnabledKmsKeyId = {
    val __obj = js.Dynamic.literal(enabled = enabled, kmsKeyId = kmsKeyId)
  
    __obj.asInstanceOf[Anon_EnabledKmsKeyId]
  }
}

