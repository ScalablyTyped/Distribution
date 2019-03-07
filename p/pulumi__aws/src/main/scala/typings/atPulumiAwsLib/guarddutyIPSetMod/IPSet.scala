package typings
package atPulumiAwsLib.guarddutyIPSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/iPSet", "IPSet")
@js.native
class IPSet protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a IPSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: IPSetArgs) = this()
  def this(name: java.lang.String, args: IPSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specifies whether GuardDuty is to start using the uploaded IPSet.
    */
  val activate: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The URI of the file that contains the IPSet.
    */
  val location: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The friendly name to identify the IPSet.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/guardduty/iPSet", "IPSet")
@js.native
object IPSet extends js.Object {
  /**
    * Get an existing IPSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyIPSetMod.IPSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyIPSetMod.IPSetState
  ): atPulumiAwsLib.guarddutyIPSetMod.IPSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyIPSetMod.IPSetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.guarddutyIPSetMod.IPSet = js.native
}

