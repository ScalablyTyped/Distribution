package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerEncryptionOption extends js.Object {
  var kmsKeyId: String
  var useAwsOwnedKey: Boolean
}

object GetBrokerEncryptionOption {
  @scala.inline
  def apply(kmsKeyId: String, useAwsOwnedKey: Boolean): GetBrokerEncryptionOption = {
    val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId, useAwsOwnedKey = useAwsOwnedKey)
  
    __obj.asInstanceOf[GetBrokerEncryptionOption]
  }
}

