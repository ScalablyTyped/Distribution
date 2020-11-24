package typings.pulumiAws.resolverQueryLogConfigAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverQueryLogConfigAssociationState extends js.Object {
  
  /**
    * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
    */
  val resolverQueryLogConfigId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of a VPC that you want this query logging configuration to log queries for.
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
}
object ResolverQueryLogConfigAssociationState {
  
  @scala.inline
  def apply(): ResolverQueryLogConfigAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverQueryLogConfigAssociationState]
  }
  
  @scala.inline
  implicit class ResolverQueryLogConfigAssociationStateOps[Self <: ResolverQueryLogConfigAssociationState] (val x: Self) extends AnyVal {
    
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
    def setResolverQueryLogConfigId(value: Input[String]): Self = this.set("resolverQueryLogConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverQueryLogConfigId: Self = this.set("resolverQueryLogConfigId", js.undefined)
    
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
}
