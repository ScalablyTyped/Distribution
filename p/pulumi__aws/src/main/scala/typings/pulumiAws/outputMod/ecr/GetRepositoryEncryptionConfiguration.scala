package typings.pulumiAws.outputMod.ecr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryEncryptionConfiguration extends js.Object {
  
  /**
    * The encryption type to use for the repository, either `AES256` or `KMS`.
    */
  var encryptionType: String = js.native
  
  /**
    * If `encryptionType` is `KMS`, the ARN of the KMS key used.
    */
  var kmsKey: String = js.native
}
object GetRepositoryEncryptionConfiguration {
  
  @scala.inline
  def apply(encryptionType: String, kmsKey: String): GetRepositoryEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(encryptionType = encryptionType.asInstanceOf[js.Any], kmsKey = kmsKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class GetRepositoryEncryptionConfigurationOps[Self <: GetRepositoryEncryptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEncryptionType(value: String): Self = this.set("encryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKey(value: String): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
  }
}
