package typings
package atPulumiAwsLib.route53ResolverRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/resolverRule", "ResolverRule")
@js.native
class ResolverRule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ResolverRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ResolverRuleArgs) = this()
  def this(name: java.lang.String, args: ResolverRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
    */
  val domainName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
    * This argument should only be specified for `FORWARD` type rules.
    */
  val resolverEndpointId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
    * This argument should only be specified for `FORWARD` type rules.
    */
  val targetIps: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_IpPort]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ResolverRuleMod.ResolverRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ResolverRuleMod.ResolverRuleState
  ): atPulumiAwsLib.route53ResolverRuleMod.ResolverRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ResolverRuleMod.ResolverRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.route53ResolverRuleMod.ResolverRule = js.native
}

