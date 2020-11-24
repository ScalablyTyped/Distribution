package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetBrokerEncryptionOptionOps[Self <: GetBrokerEncryptionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAwsOwnedKey(value: Boolean): Self = this.set("useAwsOwnedKey", value.asInstanceOf[js.Any])
  }
}
