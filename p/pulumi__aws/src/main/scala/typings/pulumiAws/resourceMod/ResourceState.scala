package typings.pulumiAws.resourceMod

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceState extends js.Object {
  
  /**
    * The ID of the parent API resource
    */
  val parentId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The complete path for this API resource, including all parent paths.
    */
  val path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The last path segment of this API resource.
    */
  val pathPart: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
}
object ResourceState {
  
  @scala.inline
  def apply(): ResourceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceState]
  }
  
  @scala.inline
  implicit class ResourceStateOps[Self <: ResourceState] (val x: Self) extends AnyVal {
    
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
    def setParentId(value: Input[String]): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathPart(value: Input[String]): Self = this.set("pathPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathPart: Self = this.set("pathPart", js.undefined)
    
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
  }
}
