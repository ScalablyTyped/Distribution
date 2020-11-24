package typings.pulumiAws.publishingDestinationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishingDestinationArgs extends js.Object {
  
  /**
    * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
    */
  val destinationArn: Input[String] = js.native
  
  /**
    * Currently there is only "S3" available as destination type which is also the default value
    */
  val destinationType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: Input[String] = js.native
  
  /**
    * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
    */
  val kmsKeyArn: Input[String] = js.native
}
object PublishingDestinationArgs {
  
  @scala.inline
  def apply(destinationArn: Input[String], detectorId: Input[String], kmsKeyArn: Input[String]): PublishingDestinationArgs = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishingDestinationArgs]
  }
  
  @scala.inline
  implicit class PublishingDestinationArgsOps[Self <: PublishingDestinationArgs] (val x: Self) extends AnyVal {
    
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
    def setDestinationArn(value: Input[String]): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationType(value: Input[String]): Self = this.set("destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationType: Self = this.set("destinationType", js.undefined)
  }
}
