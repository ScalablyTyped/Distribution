package typings.atPulumiAws.guarddutyMod

import typings.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSetArgs
import typings.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSetState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty", "ThreatIntelSet")
@js.native
class ThreatIntelSet protected ()
  extends typings.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet {
  /**
    * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ThreatIntelSetArgs) = this()
  def this(name: String, args: ThreatIntelSetArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
  def get(name: String, id: Input[ID], state: ThreatIntelSetState): typings.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
  def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): typings.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
  /**
    * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
}

