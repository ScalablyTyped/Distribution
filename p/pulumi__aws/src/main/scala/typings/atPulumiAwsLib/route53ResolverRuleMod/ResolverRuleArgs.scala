package typings
package atPulumiAwsLib.route53ResolverRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverRuleArgs extends js.Object {
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
    */
  val domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
    * This argument should only be specified for `FORWARD` type rules.
    */
  val resolverEndpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
    * This argument should only be specified for `FORWARD` type rules.
    */
  val targetIps: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IpPortInput]]]
  ] = js.undefined
}

object ResolverRuleArgs {
  @scala.inline
  def apply(
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ruleType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resolverEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    targetIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IpPortInput]]] = null
  ): ResolverRuleArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], ruleType = ruleType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolverEndpointId != null) __obj.updateDynamic("resolverEndpointId")(resolverEndpointId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetIps != null) __obj.updateDynamic("targetIps")(targetIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleArgs]
  }
}

