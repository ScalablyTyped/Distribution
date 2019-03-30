package typings
package atPulumiAwsLib.route53ResolverRuleAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverRuleAssociationState extends js.Object {
  /**
    * A name for the association that you're creating between a resolver rule and a VPC.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the resolver rule that you want to associate with the VPC.
    */
  val resolverRuleId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC that you want to associate the resolver rule with.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ResolverRuleAssociationState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resolverRuleId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ResolverRuleAssociationState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolverRuleId != null) __obj.updateDynamic("resolverRuleId")(resolverRuleId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleAssociationState]
  }
}

