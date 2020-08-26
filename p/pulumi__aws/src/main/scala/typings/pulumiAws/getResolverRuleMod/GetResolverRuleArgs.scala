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
    * A map of tags assigned to the resolver rule.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetResolverRuleArgs {
  @scala.inline
  def apply(): GetResolverRuleArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleArgs]
  }
  @scala.inline
  implicit class GetResolverRuleArgsOps[Self <: GetResolverRuleArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResolverEndpointId(value: String): Self = this.set("resolverEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverEndpointId: Self = this.set("resolverEndpointId", js.undefined)
    @scala.inline
    def setResolverRuleId(value: String): Self = this.set("resolverRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverRuleId: Self = this.set("resolverRuleId", js.undefined)
    @scala.inline
    def setRuleType(value: String): Self = this.set("ruleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleType: Self = this.set("ruleType", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

