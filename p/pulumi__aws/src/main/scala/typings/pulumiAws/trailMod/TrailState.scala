package typings.pulumiAws.trailMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cloudtrail.TrailEventSelector
import typings.pulumiAws.inputMod.cloudtrail.TrailInsightSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailState extends js.Object {
  
  /**
    * The Amazon Resource Name of the trail.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN),
    * that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
    */
  val cloudWatchLogsGroupArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the role for the CloudWatch Logs
    * endpoint to assume to write to a user’s log group.
    */
  val cloudWatchLogsRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether log file integrity validation is enabled.
    * Defaults to `false`.
    */
  val enableLogFileValidation: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Enables logging for the trail. Defaults to `true`.
    * Setting this to `false` will pause logging.
    */
  val enableLogging: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
    */
  val eventSelectors: js.UndefOr[Input[js.Array[Input[TrailEventSelector]]]] = js.native
  
  /**
    * The region in which the trail was created.
    */
  val homeRegion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the trail is publishing events
    * from global services such as IAM to the log files. Defaults to `true`.
    */
  val includeGlobalServiceEvents: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies an insight selector for identifying unusual operational activity. Fields documented below.
    */
  val insightSelectors: js.UndefOr[Input[js.Array[Input[TrailInsightSelector]]]] = js.native
  
  /**
    * Specifies whether the trail is created in the current
    * region or in all regions. Defaults to `false`.
    */
  val isMultiRegionTrail: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
    */
  val isOrganizationTrail: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the name of the trail.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the name of the S3 bucket designated for publishing log files.
    */
  val s3BucketName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the S3 key prefix that follows
    * the name of the bucket you have designated for log file delivery.
    */
  val s3KeyPrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the name of the Amazon SNS topic
    * defined for notification of log file delivery.
    */
  val snsTopicName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the trail
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object TrailState {
  
  @scala.inline
  def apply(): TrailState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailState]
  }
  
  @scala.inline
  implicit class TrailStateOps[Self <: TrailState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsGroupArn(value: Input[String]): Self = this.set("cloudWatchLogsGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsGroupArn: Self = this.set("cloudWatchLogsGroupArn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: Input[String]): Self = this.set("cloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsRoleArn: Self = this.set("cloudWatchLogsRoleArn", js.undefined)
    
    @scala.inline
    def setEnableLogFileValidation(value: Input[Boolean]): Self = this.set("enableLogFileValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLogFileValidation: Self = this.set("enableLogFileValidation", js.undefined)
    
    @scala.inline
    def setEnableLogging(value: Input[Boolean]): Self = this.set("enableLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLogging: Self = this.set("enableLogging", js.undefined)
    
    @scala.inline
    def setEventSelectorsVarargs(value: Input[TrailEventSelector]*): Self = this.set("eventSelectors", js.Array(value :_*))
    
    @scala.inline
    def setEventSelectors(value: Input[js.Array[Input[TrailEventSelector]]]): Self = this.set("eventSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSelectors: Self = this.set("eventSelectors", js.undefined)
    
    @scala.inline
    def setHomeRegion(value: Input[String]): Self = this.set("homeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRegion: Self = this.set("homeRegion", js.undefined)
    
    @scala.inline
    def setIncludeGlobalServiceEvents(value: Input[Boolean]): Self = this.set("includeGlobalServiceEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGlobalServiceEvents: Self = this.set("includeGlobalServiceEvents", js.undefined)
    
    @scala.inline
    def setInsightSelectorsVarargs(value: Input[TrailInsightSelector]*): Self = this.set("insightSelectors", js.Array(value :_*))
    
    @scala.inline
    def setInsightSelectors(value: Input[js.Array[Input[TrailInsightSelector]]]): Self = this.set("insightSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightSelectors: Self = this.set("insightSelectors", js.undefined)
    
    @scala.inline
    def setIsMultiRegionTrail(value: Input[Boolean]): Self = this.set("isMultiRegionTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultiRegionTrail: Self = this.set("isMultiRegionTrail", js.undefined)
    
    @scala.inline
    def setIsOrganizationTrail(value: Input[Boolean]): Self = this.set("isOrganizationTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOrganizationTrail: Self = this.set("isOrganizationTrail", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: Input[String]): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: Input[String]): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("s3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnsTopicName(value: Input[String]): Self = this.set("snsTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicName: Self = this.set("snsTopicName", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
