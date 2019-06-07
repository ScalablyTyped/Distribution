package typings
package atPulumiAwsLib.guarddutyThreatIntelSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet")
@js.native
class ThreatIntelSet protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ThreatIntelSetArgs) = this()
  def this(name: java.lang.String, args: ThreatIntelSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
    */
  val activate: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The URI of the file that contains the ThreatIntelSet.
    */
  val location: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The friendly name to identify the ThreatIntelSet.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetState
  ): atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
  /**
    * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ scala.Boolean = js.native
}

