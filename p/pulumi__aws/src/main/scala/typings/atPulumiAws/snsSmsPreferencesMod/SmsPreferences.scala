package typings.atPulumiAws.snsSmsPreferencesMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences")
@js.native
class SmsPreferences protected () extends CustomResource {
  /**
    * Create a SmsPreferences resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SmsPreferencesArgs) = this()
  def this(name: String, args: SmsPreferencesArgs, opts: CustomResourceOptions) = this()
  /**
    * A string, such as your business brand, that is displayed as the sender on the receiving device.
    */
  val defaultSenderId: Output[js.UndefOr[String]] = js.native
  /**
    * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
    */
  val defaultSmsType: Output[js.UndefOr[String]] = js.native
  /**
    * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
    */
  val deliveryStatusIamRoleArn: Output[js.UndefOr[String]] = js.native
  /**
    * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
    */
  val deliveryStatusSuccessSamplingRate: Output[js.UndefOr[String]] = js.native
  /**
    * The maximum amount in USD that you are willing to spend each month to send SMS messages.
    */
  val monthlySpendLimit: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
    */
  val usageReportS3Bucket: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences")
@js.native
object SmsPreferences extends js.Object {
  /**
    * Get an existing SmsPreferences resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SmsPreferences = js.native
  def get(name: String, id: Input[ID], state: SmsPreferencesState): SmsPreferences = js.native
  def get(name: String, id: Input[ID], state: SmsPreferencesState, opts: CustomResourceOptions): SmsPreferences = js.native
  /**
    * Returns true if the given object is an instance of SmsPreferences.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/smsPreferences.SmsPreferences */ Boolean = js.native
}

