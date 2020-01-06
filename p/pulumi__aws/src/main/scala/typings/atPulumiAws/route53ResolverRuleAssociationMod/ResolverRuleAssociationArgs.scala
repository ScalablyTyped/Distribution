package typings.atPulumiAws.route53ResolverRuleAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleAssociationArgs extends js.Object {
  /**
    * A name for the association that you're creating between a resolver rule and a VPC.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the resolver rule that you want to associate with the VPC.
    */
  val resolverRuleId: Input[String] = js.native
  /**
    * The ID of the VPC that you want to associate the resolver rule with.
    */
  val vpcId: Input[String] = js.native
}

object ResolverRuleAssociationArgs {
  @scala.inline
  def apply(resolverRuleId: Input[String], vpcId: Input[String], name: Input[String] = null): ResolverRuleAssociationArgs = {
    val __obj = js.Dynamic.literal(resolverRuleId = resolverRuleId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleAssociationArgs]
  }
}

