package typings.pulumiAws.outputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkgroupConfigurationResultConfigurationEncryptionConfiguration extends js.Object {
  
  /**
    * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (`SSE_S3`), server-side encryption with KMS-managed keys (`SSE_KMS`), or client-side encryption with KMS-managed keys (`CSE_KMS`) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
    */
  var encryptionOption: js.UndefOr[String] = js.native
  
  /**
    * For `SSE_KMS` and `CSE_KMS`, this is the KMS key Amazon Resource Name (ARN).
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
}
object WorkgroupConfigurationResultConfigurationEncryptionConfiguration {
  
  @scala.inline
  def apply(): WorkgroupConfigurationResultConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class WorkgroupConfigurationResultConfigurationEncryptionConfigurationOps[Self <: WorkgroupConfigurationResultConfigurationEncryptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def deleteEncryptionOption: Self = this.set("encryptionOption", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
  }
}
