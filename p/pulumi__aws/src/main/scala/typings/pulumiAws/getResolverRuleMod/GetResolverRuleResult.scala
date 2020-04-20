package typings.pulumiAws.getResolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleResult extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: String = js.native
  val domainName: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: String = js.native
  val resolverEndpointId: String = js.native
  val resolverRuleId: String = js.native
  val ruleType: String = js.native
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: String = js.native
  /**
    * A mapping of tags assigned to the resolver rule.
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetResolverRuleResult {
  @scala.inline
  def apply(
    arn: String,
    domainName: String,
    id: String,
    name: String,
    ownerId: String,
    resolverEndpointId: String,
    resolverRuleId: String,
    ruleType: String,
    shareStatus: String,
    tags: StringDictionary[js.Any]
  ): GetResolverRuleResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], resolverEndpointId = resolverEndpointId.asInstanceOf[js.Any], resolverRuleId = resolverRuleId.asInstanceOf[js.Any], ruleType = ruleType.asInstanceOf[js.Any], shareStatus = shareStatus.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleResult]
  }
}

