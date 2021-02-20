package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends StObject {
  
  /**
    * Information about the command(s) to execute.
    */
  var comment: js.UndefOr[Input[String]] = js.native
  
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var documentHash: js.UndefOr[Input[String]] = js.native
  
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
    */
  var documentHashType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
    */
  var notificationConfig: js.UndefOr[
    Input[
      MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
    ]
  ] = js.native
  
  /**
    * The name of the Amazon S3 bucket.
    */
  var outputS3Bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon S3 bucket subfolder.
    */
  var outputS3KeyPrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
      ]
    ]
  ] = js.native
  
  /**
    * The IAM service role to assume during task execution.
    */
  var serviceRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * If this time is reached and the command has not already started executing, it doesn't run.
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.native
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
    def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setDocumentHash(value: Input[String]): Self = StObject.set(x, "documentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentHashType(value: Input[String]): Self = StObject.set(x, "documentHashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentHashTypeUndefined: Self = StObject.set(x, "documentHashType", js.undefined)
    
    @scala.inline
    def setDocumentHashUndefined: Self = StObject.set(x, "documentHash", js.undefined)
    
    @scala.inline
    def setNotificationConfig(
      value: Input[
          MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
        ]
    ): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    @scala.inline
    def setOutputS3Bucket(value: Input[String]): Self = StObject.set(x, "outputS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3BucketUndefined: Self = StObject.set(x, "outputS3Bucket", js.undefined)
    
    @scala.inline
    def setOutputS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "outputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "outputS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setParameters(
      value: Input[
          js.Array[
            Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
          ]
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
