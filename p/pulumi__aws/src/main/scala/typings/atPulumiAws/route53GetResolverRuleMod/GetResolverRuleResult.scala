package typings.atPulumiAws.route53GetResolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRuleResult extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: String
  val domainName: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: String
  val resolverEndpointId: String
  val resolverRuleId: String
  val ruleType: String
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: String
  /**
    * A mapping of tags assigned to the resolver rule.
    */
  val tags: StringDictionary[js.Any]
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
    val __obj = js.Dynamic.literal(arn = arn, domainName = domainName, id = id, name = name, ownerId = ownerId, resolverEndpointId = resolverEndpointId, resolverRuleId = resolverRuleId, ruleType = ruleType, shareStatus = shareStatus, tags = tags)
  
    __obj.asInstanceOf[GetResolverRuleResult]
  }
}

