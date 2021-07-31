package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends StObject {
  
  /**
    * Information about the command(s) to execute.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var documentHash: js.UndefOr[String] = js.undefined
  
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
    */
  var documentHashType: js.UndefOr[String] = js.undefined
  
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
    */
  var notificationConfig: js.UndefOr[
    MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
  ] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket.
    */
  var outputS3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 bucket subfolder.
    */
  var outputS3KeyPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    js.Array[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
  ] = js.undefined
  
  /**
    * The IAM service role to assume during task execution.
    */
  var serviceRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * If this time is reached and the command has not already started executing, it doesn't run.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}
object MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setDocumentHash(value: String): Self = StObject.set(x, "documentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentHashType(value: String): Self = StObject.set(x, "documentHashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentHashTypeUndefined: Self = StObject.set(x, "documentHashType", js.undefined)
    
    @scala.inline
    def setDocumentHashUndefined: Self = StObject.set(x, "documentHash", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    @scala.inline
    def setOutputS3Bucket(value: String): Self = StObject.set(x, "outputS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3BucketUndefined: Self = StObject.set(x, "outputS3Bucket", js.undefined)
    
    @scala.inline
    def setOutputS3KeyPrefix(value: String): Self = StObject.set(x, "outputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "outputS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
