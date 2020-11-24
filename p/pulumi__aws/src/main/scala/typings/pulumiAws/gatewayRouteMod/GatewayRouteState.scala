package typings.pulumiAws.gatewayRouteMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.appmesh.GatewayRouteSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteState extends js.Object {
  
  /**
    * The ARN of the gateway route.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The creation date of the gateway route.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The last update date of the gateway route.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
    */
  val meshName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val meshOwner: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name to use for the gateway route. Must be between 1 and 255 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The resource owner's AWS account ID.
    */
  val resourceOwner: js.UndefOr[Input[String]] = js.native
  
  /**
    * The gateway route specification to apply.
    */
  val spec: js.UndefOr[Input[GatewayRouteSpec]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The name of the [virtual gateway](https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway.html) to associate the gateway route with. Must be between 1 and 255 characters in length.
    */
  val virtualGatewayName: js.UndefOr[Input[String]] = js.native
}
object GatewayRouteState {
  
  @scala.inline
  def apply(): GatewayRouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayRouteState]
  }
  
  @scala.inline
  implicit class GatewayRouteStateOps[Self <: GatewayRouteState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Input[String]): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMeshName(value: Input[String]): Self = this.set("meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshName: Self = this.set("meshName", js.undefined)
    
    @scala.inline
    def setMeshOwner(value: Input[String]): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceOwner(value: Input[String]): Self = this.set("resourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOwner: Self = this.set("resourceOwner", js.undefined)
    
    @scala.inline
    def setSpec(value: Input[GatewayRouteSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVirtualGatewayName(value: Input[String]): Self = this.set("virtualGatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualGatewayName: Self = this.set("virtualGatewayName", js.undefined)
  }
}
