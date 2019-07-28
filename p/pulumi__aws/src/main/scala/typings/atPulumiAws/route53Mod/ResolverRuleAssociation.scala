package typings.atPulumiAws.route53Mod

import typings.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociationArgs
import typings.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53", "ResolverRuleAssociation")
@js.native
class ResolverRuleAssociation protected ()
  extends typings.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation {
  /**
    * Create a ResolverRuleAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverRuleAssociationArgs) = this()
  def this(name: String, args: ResolverRuleAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/route53", "ResolverRuleAssociation")
@js.native
object ResolverRuleAssociation extends js.Object {
  /**
    * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): typings.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
  /**
    * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = js.native
}

