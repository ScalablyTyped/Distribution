package typings.atPulumiAws.route53GetResolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRuleArgs extends js.Object {
  /**
    * The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolverRuleId`.
    */
  val domainName: js.UndefOr[String] = js.undefined
  /**
    * The friendly name of the desired resolver rule. Conflicts with `resolverRuleId`.
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolverRuleId`.
    */
  val resolverEndpointId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the desired resolver rule. Conflicts with `domainName`, `name`, `resolverEndpointId` and `ruleType`.
    */
  val resolverRuleId: js.UndefOr[String] = js.undefined
  /**
    * The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolverRuleId`.
    */
  val ruleType: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetResolverRuleArgs {
  @scala.inline
  def apply(
    domainName: String = null,
    name: String = null,
    resolverEndpointId: String = null,
    resolverRuleId: String = null,
    ruleType: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetResolverRuleArgs = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resolverEndpointId != null) __obj.updateDynamic("resolverEndpointId")(resolverEndpointId)
    if (resolverRuleId != null) __obj.updateDynamic("resolverRuleId")(resolverRuleId)
    if (ruleType != null) __obj.updateDynamic("ruleType")(ruleType)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetResolverRuleArgs]
  }
}

