package typings.pulumiAws.resolverRuleAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ResolverRuleAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleAssociationState]
  }
  
  @scala.inline
  implicit class ResolverRuleAssociationStateOps[Self <: ResolverRuleAssociationState] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResolverRuleId(value: Input[String]): Self = this.set("resolverRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverRuleId: Self = this.set("resolverRuleId", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
