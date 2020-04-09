package typings.pulumiAws.getResolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleArgs extends js.Object {
  /**
    * The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolverRuleId`.
    */
  val domainName: js.UndefOr[String] = js.native
  /**
    * The friendly name of the desired resolver rule. Conflicts with `resolverRuleId`.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolverRuleId`.
    */
  val resolverEndpointId: js.UndefOr[String] = js.native
  /**
    * The ID of the desired resolver rule. Conflicts with `domainName`, `name`, `resolverEndpointId` and `ruleType`.
    */
  val resolverRuleId: js.UndefOr[String] = js.native
  /**
    * The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolverRuleId`.
    */
  val ruleType: js.UndefOr[String] = js.native
  /**
    * A mapping of tags assigned to the resolver rule.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
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
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolverEndpointId != null) __obj.updateDynamic("resolverEndpointId")(resolverEndpointId.asInstanceOf[js.Any])
    if (resolverRuleId != null) __obj.updateDynamic("resolverRuleId")(resolverRuleId.asInstanceOf[js.Any])
    if (ruleType != null) __obj.updateDynamic("ruleType")(ruleType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleArgs]
  }
}

