package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends js.Object {
  
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
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersOps[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters] (val x: Self) extends AnyVal {
    
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
    def setComment(value: Input[String]): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDocumentHash(value: Input[String]): Self = this.set("documentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentHash: Self = this.set("documentHash", js.undefined)
    
    @scala.inline
    def setDocumentHashType(value: Input[String]): Self = this.set("documentHashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentHashType: Self = this.set("documentHashType", js.undefined)
    
    @scala.inline
    def setNotificationConfig(
      value: Input[
          MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
        ]
    ): Self = this.set("notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfig: Self = this.set("notificationConfig", js.undefined)
    
    @scala.inline
    def setOutputS3Bucket(value: Input[String]): Self = this.set("outputS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputS3Bucket: Self = this.set("outputS3Bucket", js.undefined)
    
    @scala.inline
    def setOutputS3KeyPrefix(value: Input[String]): Self = this.set("outputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputS3KeyPrefix: Self = this.set("outputS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(
      value: Input[
          js.Array[
            Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
          ]
        ]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: Input[String]): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("serviceRoleArn", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Input[Double]): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
}
