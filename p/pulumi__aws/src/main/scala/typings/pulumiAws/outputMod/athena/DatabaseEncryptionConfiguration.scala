package typings.pulumiAws.outputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseEncryptionConfiguration extends js.Object {
  
  /**
    * The type of key; one of `SSE_S3`, `SSE_KMS`, `CSE_KMS`
    */
  var encryptionOption: String = js.native
  
  /**
    * The KMS key ARN or ID; required for key types `SSE_KMS` and `CSE_KMS`.
    */
  var kmsKey: js.UndefOr[String] = js.native
}
object DatabaseEncryptionConfiguration {
  
  @scala.inline
  def apply(encryptionOption: String): DatabaseEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(encryptionOption = encryptionOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class DatabaseEncryptionConfigurationOps[Self <: DatabaseEncryptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEncryptionOption(value: String): Self = this.set("encryptionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKey(value: String): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKey: Self = this.set("kmsKey", js.undefined)
  }
}
