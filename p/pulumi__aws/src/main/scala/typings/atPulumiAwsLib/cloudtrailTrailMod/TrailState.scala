package typings
package atPulumiAwsLib.cloudtrailTrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrailState extends js.Object {
  /**
    * The Amazon Resource Name of the trail.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN),
    * that represents the log group to which CloudTrail logs will be delivered.
    */
  val cloudWatchLogsGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the role for the CloudWatch Logs
    * endpoint to assume to write to a user’s log group.
    */
  val cloudWatchLogsRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether log file integrity validation is enabled.
    * Defaults to `false`.
    */
  val enableLogFileValidation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Enables logging for the trail. Defaults to `true`.
    * Setting this to `false` will pause logging.
    */
  val enableLogging: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
    */
  val eventSelectors: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DataResourcesIncludeManagementEvents]
      ]
    ]
  ] = js.undefined
  /**
    * The region in which the trail was created.
    */
  val homeRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether the trail is publishing events
    * from global services such as IAM to the log files. Defaults to `true`.
    */
  val includeGlobalServiceEvents: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether the trail is created in the current
    * region or in all regions. Defaults to `false`.
    */
  val isMultiRegionTrail: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
    */
  val isOrganizationTrail: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the trail.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the S3 bucket designated for publishing log files.
    */
  val s3BucketName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the S3 key prefix that precedes
    * the name of the bucket you have designated for log file delivery.
    */
  val s3KeyPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the Amazon SNS topic
    * defined for notification of log file delivery.
    */
  val snsTopicName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the trail
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

