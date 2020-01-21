package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerEncryptionOption extends js.Object {
  var kmsKeyId: String = js.native
  var useAwsOwnedKey: Boolean = js.native
}

object GetBrokerEncryptionOption {
  @scala.inline
  def apply(kmsKeyId: String, useAwsOwnedKey: Boolean): GetBrokerEncryptionOption = {
    val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId.asInstanceOf[js.Any], useAwsOwnedKey = useAwsOwnedKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBrokerEncryptionOption]
  }
}

