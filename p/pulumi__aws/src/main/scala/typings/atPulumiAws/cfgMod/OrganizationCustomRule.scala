package typings.atPulumiAws.cfgMod

import typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRuleArgs
import typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", "OrganizationCustomRule")
@js.native
class OrganizationCustomRule protected ()
  extends typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRule {
  /**
    * Create a OrganizationCustomRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OrganizationCustomRuleArgs) = this()
  def this(name: String, args: OrganizationCustomRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cfg", "OrganizationCustomRule")
@js.native
object OrganizationCustomRule extends js.Object {
  /**
    * Get an existing OrganizationCustomRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRule = js.native
  /**
    * Returns true if the given object is an instance of OrganizationCustomRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean = js.native
}

