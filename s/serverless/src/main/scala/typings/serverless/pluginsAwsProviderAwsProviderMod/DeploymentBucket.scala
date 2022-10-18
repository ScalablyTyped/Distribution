package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentBucket extends StObject {
  
  var blockPublicAccess: js.UndefOr[Boolean] = js.undefined
  
  var maxPreviousDeploymentArtifacts: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var serverSideEncryption: js.UndefOr[String] = js.undefined
  
  var skipPolicySetup: js.UndefOr[Boolean] = js.undefined
  
  var sseCustomerAlgorithim: js.UndefOr[String] = js.undefined
  
  var sseCustomerKey: js.UndefOr[String] = js.undefined
  
  var sseCustomerKeyMD5: js.UndefOr[String] = js.undefined
  
  var sseKMSKeyId: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[Tags] = js.undefined
}
object DeploymentBucket {
  
  inline def apply(): DeploymentBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentBucket]
  }
  
  extension [Self <: DeploymentBucket](x: Self) {
    
    inline def setBlockPublicAccess(value: Boolean): Self = StObject.set(x, "blockPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAccessUndefined: Self = StObject.set(x, "blockPublicAccess", js.undefined)
    
    inline def setMaxPreviousDeploymentArtifacts(value: Double | String): Self = StObject.set(x, "maxPreviousDeploymentArtifacts", value.asInstanceOf[js.Any])
    
    inline def setMaxPreviousDeploymentArtifactsUndefined: Self = StObject.set(x, "maxPreviousDeploymentArtifacts", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServerSideEncryption(value: String): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
    
    inline def setSkipPolicySetup(value: Boolean): Self = StObject.set(x, "skipPolicySetup", value.asInstanceOf[js.Any])
    
    inline def setSkipPolicySetupUndefined: Self = StObject.set(x, "skipPolicySetup", js.undefined)
    
    inline def setSseCustomerAlgorithim(value: String): Self = StObject.set(x, "sseCustomerAlgorithim", value.asInstanceOf[js.Any])
    
    inline def setSseCustomerAlgorithimUndefined: Self = StObject.set(x, "sseCustomerAlgorithim", js.undefined)
    
    inline def setSseCustomerKey(value: String): Self = StObject.set(x, "sseCustomerKey", value.asInstanceOf[js.Any])
    
    inline def setSseCustomerKeyMD5(value: String): Self = StObject.set(x, "sseCustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSseCustomerKeyMD5Undefined: Self = StObject.set(x, "sseCustomerKeyMD5", js.undefined)
    
    inline def setSseCustomerKeyUndefined: Self = StObject.set(x, "sseCustomerKey", js.undefined)
    
    inline def setSseKMSKeyId(value: String): Self = StObject.set(x, "sseKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSseKMSKeyIdUndefined: Self = StObject.set(x, "sseKMSKeyId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
