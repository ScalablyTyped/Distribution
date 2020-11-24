package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentBucket extends js.Object {
  
  var blockPublicAccess: js.UndefOr[Boolean] = js.native
  
  var maxPreviousDeploymentArtifacts: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var serverSideEncryption: js.UndefOr[String] = js.native
  
  var sseCustomerAlgorithim: js.UndefOr[String] = js.native
  
  var sseCustomerKey: js.UndefOr[String] = js.native
  
  var sseCustomerKeyMD5: js.UndefOr[String] = js.native
  
  var sseKMSKeyId: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[Tags] = js.native
}
object DeploymentBucket {
  
  @scala.inline
  def apply(): DeploymentBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentBucket]
  }
  
  @scala.inline
  implicit class DeploymentBucketOps[Self <: DeploymentBucket] (val x: Self) extends AnyVal {
    
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
    def setBlockPublicAccess(value: Boolean): Self = this.set("blockPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicAccess: Self = this.set("blockPublicAccess", js.undefined)
    
    @scala.inline
    def setMaxPreviousDeploymentArtifacts(value: Double | String): Self = this.set("maxPreviousDeploymentArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPreviousDeploymentArtifacts: Self = this.set("maxPreviousDeploymentArtifacts", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: String): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
    
    @scala.inline
    def setSseCustomerAlgorithim(value: String): Self = this.set("sseCustomerAlgorithim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseCustomerAlgorithim: Self = this.set("sseCustomerAlgorithim", js.undefined)
    
    @scala.inline
    def setSseCustomerKey(value: String): Self = this.set("sseCustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseCustomerKey: Self = this.set("sseCustomerKey", js.undefined)
    
    @scala.inline
    def setSseCustomerKeyMD5(value: String): Self = this.set("sseCustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseCustomerKeyMD5: Self = this.set("sseCustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setSseKMSKeyId(value: String): Self = this.set("sseKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseKMSKeyId: Self = this.set("sseKMSKeyId", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
