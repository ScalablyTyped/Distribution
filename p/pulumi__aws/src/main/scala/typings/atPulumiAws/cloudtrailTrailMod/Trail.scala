package typings.atPulumiAws.cloudtrailTrailMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.cloudtrailNs.TrailEventSelector
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudtrail/trail", "Trail")
@js.native
class Trail protected () extends CustomResource {
  /**
    * Create a Trail resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TrailArgs) = this()
  def this(name: String, args: TrailArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name of the trail.
    */
  val arn: Output[String] = js.native
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN),
    * that represents the log group to which CloudTrail logs will be delivered.
    */
  val cloudWatchLogsGroupArn: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies the role for the CloudWatch Logs
    * endpoint to assume to write to a user’s log group.
    */
  val cloudWatchLogsRoleArn: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies whether log file integrity validation is enabled.
    * Defaults to `false`.
    */
  val enableLogFileValidation: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Enables logging for the trail. Defaults to `true`.
    * Setting this to `false` will pause logging.
    */
  val enableLogging: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
    */
  val eventSelectors: Output[js.UndefOr[js.Array[TrailEventSelector]]] = js.native
  /**
    * The region in which the trail was created.
    */
  val homeRegion: Output[String] = js.native
  /**
    * Specifies whether the trail is publishing events
    * from global services such as IAM to the log files. Defaults to `true`.
    */
  val includeGlobalServiceEvents: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies whether the trail is created in the current
    * region or in all regions. Defaults to `false`.
    */
  val isMultiRegionTrail: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
    */
  val isOrganizationTrail: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
    */
  val kmsKeyId: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies the name of the trail.
    */
  val name: Output[String] = js.native
  /**
    * Specifies the name of the S3 bucket designated for publishing log files.
    */
  val s3BucketName: Output[String] = js.native
  /**
    * Specifies the S3 key prefix that follows
    * the name of the bucket you have designated for log file delivery.
    */
  val s3KeyPrefix: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies the name of the Amazon SNS topic
    * defined for notification of log file delivery.
    */
  val snsTopicName: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the trail
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudtrail/trail", "Trail")
@js.native
object Trail extends js.Object {
  /**
    * Get an existing Trail resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Trail = js.native
  def get(name: String, id: Input[ID], state: TrailState): Trail = js.native
  def get(name: String, id: Input[ID], state: TrailState, opts: CustomResourceOptions): Trail = js.native
  /**
    * Returns true if the given object is an instance of Trail.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudtrail/trail.Trail */ Boolean = js.native
}

