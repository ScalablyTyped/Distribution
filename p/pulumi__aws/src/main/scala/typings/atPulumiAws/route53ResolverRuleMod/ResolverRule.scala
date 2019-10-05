package typings.atPulumiAws.route53ResolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.route53.ResolverRuleTargetIp
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/resolverRule", "ResolverRule")
@js.native
class ResolverRule protected () extends CustomResource {
  /**
    * Create a ResolverRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverRuleArgs) = this()
  def this(name: String, args: ResolverRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: Output[String] = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified using `targetIp`.
    */
  val domainName: Output[String] = js.native
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  val name: Output[String] = js.native
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: Output[String] = js.native
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `targetIp`.
    * This argument should only be specified for `FORWARD` type rules.
    */
  val resolverEndpointId: Output[js.UndefOr[String]] = js.native
  /**
    * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: Output[String] = js.native
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
    * This argument should only be specified for `FORWARD` type rules.
    */
  val targetIps: Output[js.UndefOr[js.Array[ResolverRuleTargetIp]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/resolverRule", "ResolverRule")
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
  def get(name: String, id: Input[ID]): ResolverRule = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleState): ResolverRule = js.native
  def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): ResolverRule = js.native
  /**
    * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = js.native
}

