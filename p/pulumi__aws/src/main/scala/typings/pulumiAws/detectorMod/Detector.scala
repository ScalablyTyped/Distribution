package typings.pulumiAws.detectorMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/detector", "Detector")
@js.native
class Detector protected () extends CustomResource {
  /**
    * Create a Detector resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DetectorArgs) = this()
  def this(name: String, args: DetectorArgs, opts: CustomResourceOptions) = this()
  /**
    * The AWS account ID of the GuardDuty detector
    */
  val accountId: Output_[String] = js.native
  /**
    * Enable monitoring and feedback reporting. Setting to `false` is equivalent to "suspending" GuardDuty. Defaults to `true`.
    */
  val enable: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies the frequency of notifications sent for subsequent finding occurrences. If the detector is a GuardDuty member account, the value is determined by the GuardDuty master account and cannot be modified, otherwise defaults to `SIX_HOURS`. For standalone and GuardDuty master accounts, it must be configured in this provider to enable drift detection. Valid values for standalone and master accounts: `FIFTEEN_MINUTES`, `ONE_HOUR`, `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
    */
  val findingPublishingFrequency: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/guardduty/detector", "Detector")
@js.native
object Detector extends js.Object {
  /**
    * Get an existing Detector resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Detector = js.native
  def get(name: String, id: Input[ID], state: DetectorState): Detector = js.native
  def get(name: String, id: Input[ID], state: DetectorState, opts: CustomResourceOptions): Detector = js.native
  /**
    * Returns true if the given object is an instance of Detector.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/detector.Detector */ Boolean = js.native
}

