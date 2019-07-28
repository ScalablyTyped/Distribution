package typings.atPulumiAws.guarddutyThreatIntelSetMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet")
@js.native
class ThreatIntelSet protected () extends CustomResource {
  /**
    * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ThreatIntelSetArgs) = this()
  def this(name: String, args: ThreatIntelSetArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
    */
  val activate: Output[Boolean] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: Output[String] = js.native
  /**
    * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: Output[String] = js.native
  /**
    * The URI of the file that contains the ThreatIntelSet.
    */
  val location: Output[String] = js.native
  /**
    * The friendly name to identify the ThreatIntelSet.
    */
  val name: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet")
@js.native
object ThreatIntelSet extends js.Object {
  /**
    * Get an existing ThreatIntelSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ThreatIntelSet = js.native
  def get(name: String, id: Input[ID], state: ThreatIntelSetState): ThreatIntelSet = js.native
  def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): ThreatIntelSet = js.native
  /**
    * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
}

