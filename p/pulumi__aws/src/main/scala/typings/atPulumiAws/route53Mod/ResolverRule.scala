package typings.atPulumiAws.route53Mod

import typings.atPulumiAws.route53ResolverRuleMod.ResolverRuleArgs
import typings.atPulumiAws.route53ResolverRuleMod.ResolverRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53", "ResolverRule")
@js.native
class ResolverRule protected ()
  extends typings.atPulumiAws.route53ResolverRuleMod.ResolverRule {
  /**
    * Create a ResolverRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverRuleArgs) = this()
  def this(name: String, args: ResolverRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/route53", "ResolverRule")
@js.native
object ResolverRule extends js.Object {
  /**
    * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.route53ResolverRuleMod.ResolverRule = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleState): typings.atPulumiAws.route53ResolverRuleMod.ResolverRule = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): typings.atPulumiAws.route53ResolverRuleMod.ResolverRule = js.native
  /**
    * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = js.native
}

