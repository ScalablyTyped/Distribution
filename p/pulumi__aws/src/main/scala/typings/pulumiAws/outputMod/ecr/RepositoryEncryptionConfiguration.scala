package typings.pulumiAws.outputMod.ecr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryEncryptionConfiguration extends js.Object {
  
  /**
    * The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
    */
  var encryptionType: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the KMS key to use when `encryptionType` is `KMS`. If not specified, uses the default AWS managed key for ECR.
    */
  var kmsKey: String = js.native
}
object RepositoryEncryptionConfiguration {
  
  @scala.inline
  def apply(kmsKey: String): RepositoryEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(kmsKey = kmsKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class RepositoryEncryptionConfigurationOps[Self <: RepositoryEncryptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setKmsKey(value: String): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionType(value: String): Self = this.set("encryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("encryptionType", js.undefined)
  }
}
