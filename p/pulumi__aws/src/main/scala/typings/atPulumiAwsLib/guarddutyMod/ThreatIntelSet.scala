package typings
package atPulumiAwsLib.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty", "ThreatIntelSet")
@js.native
class ThreatIntelSet protected ()
  extends atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSet {
  /**
    * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/guardduty", "ThreatIntelSet")
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
}

