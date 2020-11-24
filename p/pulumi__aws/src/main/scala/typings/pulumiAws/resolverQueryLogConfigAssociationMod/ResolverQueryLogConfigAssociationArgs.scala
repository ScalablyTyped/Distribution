package typings.pulumiAws.resolverQueryLogConfigAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverQueryLogConfigAssociationArgs extends js.Object {
  
  /**
    * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
    */
  val resolverQueryLogConfigId: Input[String] = js.native
  
  /**
    * The ID of a VPC that you want this query logging configuration to log queries for.
    */
  val resourceId: Input[String] = js.native
}
object ResolverQueryLogConfigAssociationArgs {
  
  @scala.inline
  def apply(resolverQueryLogConfigId: Input[String], resourceId: Input[String]): ResolverQueryLogConfigAssociationArgs = {
    val __obj = js.Dynamic.literal(resolverQueryLogConfigId = resolverQueryLogConfigId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverQueryLogConfigAssociationArgs]
  }
  
  @scala.inline
  implicit class ResolverQueryLogConfigAssociationArgsOps[Self <: ResolverQueryLogConfigAssociationArgs] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
  }
}
