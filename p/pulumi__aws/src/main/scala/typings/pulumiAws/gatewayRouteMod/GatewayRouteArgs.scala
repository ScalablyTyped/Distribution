package typings.pulumiAws.gatewayRouteMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.appmesh.GatewayRouteSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteArgs extends js.Object {
  
  /**
    * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
    */
  val meshName: Input[String] = js.native
  
  /**
    * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val meshOwner: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name to use for the gateway route. Must be between 1 and 255 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The gateway route specification to apply.
    */
  val spec: Input[GatewayRouteSpec] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The name of the [virtual gateway](https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway.html) to associate the gateway route with. Must be between 1 and 255 characters in length.
    */
  val virtualGatewayName: Input[String] = js.native
}
object GatewayRouteArgs {
  
  @scala.inline
  def apply(meshName: Input[String], spec: Input[GatewayRouteSpec], virtualGatewayName: Input[String]): GatewayRouteArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteArgs]
  }
  
  @scala.inline
  implicit class GatewayRouteArgsOps[Self <: GatewayRouteArgs] (val x: Self) extends AnyVal {
    
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
    def setMeshName(value: Input[String]): Self = this.set("meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: Input[GatewayRouteSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayName(value: Input[String]): Self = this.set("virtualGatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: Input[String]): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
