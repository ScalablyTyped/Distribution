package typings.atPulumiAws.cfgMod

import typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRuleArgs
import typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", "OrganizationManagedRule")
@js.native
class OrganizationManagedRule protected ()
  extends typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRule {
  /**
    * Create a OrganizationManagedRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OrganizationManagedRuleArgs) = this()
  def this(name: String, args: OrganizationManagedRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cfg", "OrganizationManagedRule")
@js.native
object OrganizationManagedRule extends js.Object {
  /**
    * Get an existing OrganizationManagedRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationManagedRuleState): typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRule = js.native
  def get(name: String, id: Input[ID], state: OrganizationManagedRuleState, opts: CustomResourceOptions): typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRule = js.native
  /**
    * Returns true if the given object is an instance of OrganizationManagedRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationManagedRule.OrganizationManagedRule */ Boolean = js.native
}

