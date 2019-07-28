package typings.atPulumiAws.cloudtrailTrailMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_DataResourcesIncludeManagementEvents
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrailState extends js.Object {
  /**
    * The Amazon Resource Name of the trail.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN),
    * that represents the log group to which CloudTrail logs will be delivered.
    */
  val cloudWatchLogsGroupArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the role for the CloudWatch Logs
    * endpoint to assume to write to a user’s log group.
    */
  val cloudWatchLogsRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether log file integrity validation is enabled.
    * Defaults to `false`.
    */
  val enableLogFileValidation: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Enables logging for the trail. Defaults to `true`.
    * Setting this to `false` will pause logging.
    */
  val enableLogging: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
    */
  val eventSelectors: js.UndefOr[Input[js.Array[Input[Anon_DataResourcesIncludeManagementEvents]]]] = js.undefined
  /**
    * The region in which the trail was created.
    */
  val homeRegion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether the trail is publishing events
    * from global services such as IAM to the log files. Defaults to `true`.
    */
  val includeGlobalServiceEvents: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether the trail is created in the current
    * region or in all regions. Defaults to `false`.
    */
  val isMultiRegionTrail: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
    */
  val isOrganizationTrail: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the name of the trail.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the name of the S3 bucket designated for publishing log files.
    */
  val s3BucketName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the S3 key prefix that follows
    * the name of the bucket you have designated for log file delivery.
    */
  val s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the name of the Amazon SNS topic
    * defined for notification of log file delivery.
    */
  val snsTopicName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the trail
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object TrailState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    cloudWatchLogsGroupArn: Input[String] = null,
    cloudWatchLogsRoleArn: Input[String] = null,
    enableLogFileValidation: Input[Boolean] = null,
    enableLogging: Input[Boolean] = null,
    eventSelectors: Input[js.Array[Input[Anon_DataResourcesIncludeManagementEvents]]] = null,
    homeRegion: Input[String] = null,
    includeGlobalServiceEvents: Input[Boolean] = null,
    isMultiRegionTrail: Input[Boolean] = null,
    isOrganizationTrail: Input[Boolean] = null,
    kmsKeyId: Input[String] = null,
    name: Input[String] = null,
    s3BucketName: Input[String] = null,
    s3KeyPrefix: Input[String] = null,
    snsTopicName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): TrailState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cloudWatchLogsGroupArn != null) __obj.updateDynamic("cloudWatchLogsGroupArn")(cloudWatchLogsGroupArn.asInstanceOf[js.Any])
    if (cloudWatchLogsRoleArn != null) __obj.updateDynamic("cloudWatchLogsRoleArn")(cloudWatchLogsRoleArn.asInstanceOf[js.Any])
    if (enableLogFileValidation != null) __obj.updateDynamic("enableLogFileValidation")(enableLogFileValidation.asInstanceOf[js.Any])
    if (enableLogging != null) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (eventSelectors != null) __obj.updateDynamic("eventSelectors")(eventSelectors.asInstanceOf[js.Any])
    if (homeRegion != null) __obj.updateDynamic("homeRegion")(homeRegion.asInstanceOf[js.Any])
    if (includeGlobalServiceEvents != null) __obj.updateDynamic("includeGlobalServiceEvents")(includeGlobalServiceEvents.asInstanceOf[js.Any])
    if (isMultiRegionTrail != null) __obj.updateDynamic("isMultiRegionTrail")(isMultiRegionTrail.asInstanceOf[js.Any])
    if (isOrganizationTrail != null) __obj.updateDynamic("isOrganizationTrail")(isOrganizationTrail.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    if (snsTopicName != null) __obj.updateDynamic("snsTopicName")(snsTopicName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailState]
  }
}

