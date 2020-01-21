package typings.pulumiAws.resolverRuleAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleAssociationState extends js.Object {
  /**
    * A name for the association that you're creating between a resolver rule and a VPC.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the resolver rule that you want to associate with the VPC.
    */
  val resolverRuleId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC that you want to associate the resolver rule with.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object ResolverRuleAssociationState {
  @scala.inline
  def apply(name: Input[String] = null, resolverRuleId: Input[String] = null, vpcId: Input[String] = null): ResolverRuleAssociationState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolverRuleId != null) __obj.updateDynamic("resolverRuleId")(resolverRuleId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleAssociationState]
  }
}

