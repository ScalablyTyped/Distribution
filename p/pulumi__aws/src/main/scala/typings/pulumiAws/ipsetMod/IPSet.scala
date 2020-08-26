package typings.pulumiAws.ipsetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/ipset", "IPSet")
@js.native
class IPSet protected () extends CustomResource {
  /**
    * Create a IPSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IPSetArgs) = this()
  def this(name: String, args: IPSetArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies whether GuardDuty is to start using the uploaded IPSet.
    */
  val activate: Output_[Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of the GuardDuty IPSet.
    */
  val arn: Output_[String] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: Output_[String] = js.native
  /**
    * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: Output_[String] = js.native
  /**
    * The URI of the file that contains the IPSet.
    */
  val location: Output_[String] = js.native
  /**
    * The friendly name to identify the IPSet.
    */
  val name: Output_[String] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/guardduty/ipset", "IPSet")
@js.native
object IPSet extends js.Object {
  /**
    * Get an existing IPSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IPSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IPSet = js.native
  def get(name: String, id: Input[ID], state: IPSetState): IPSet = js.native
  def get(name: String, id: Input[ID], state: IPSetState, opts: CustomResourceOptions): IPSet = js.native
  /**
    * Returns true if the given object is an instance of IPSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/ipset.IPSet */ Boolean = js.native
}

