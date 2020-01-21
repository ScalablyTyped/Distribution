package typings.pulumiAws.resolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleState extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified using `targetIp`.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `targetIp`.
    * This argument should only be specified for `FORWARD` type rules.
    */
  val resolverEndpointId: js.UndefOr[Input[String]] = js.native
  /**
    * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
    * This argument should only be specified for `FORWARD` type rules.
    */
  val targetIps: js.UndefOr[Input[js.Array[Input[ResolverRuleTargetIp]]]] = js.native
}

object ResolverRuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    domainName: Input[String] = null,
    name: Input[String] = null,
    ownerId: Input[String] = null,
    resolverEndpointId: Input[String] = null,
    ruleType: Input[String] = null,
    shareStatus: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    targetIps: Input[js.Array[Input[ResolverRuleTargetIp]]] = null
  ): ResolverRuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (resolverEndpointId != null) __obj.updateDynamic("resolverEndpointId")(resolverEndpointId.asInstanceOf[js.Any])
    if (ruleType != null) __obj.updateDynamic("ruleType")(ruleType.asInstanceOf[js.Any])
    if (shareStatus != null) __obj.updateDynamic("shareStatus")(shareStatus.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetIps != null) __obj.updateDynamic("targetIps")(targetIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleState]
  }
}

