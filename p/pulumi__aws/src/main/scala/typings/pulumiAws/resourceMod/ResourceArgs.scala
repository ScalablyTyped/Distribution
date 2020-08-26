package typings.pulumiAws.resourceMod

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceArgs extends js.Object {
  /**
    * The ID of the parent API resource
    */
  val parentId: Input[String] = js.native
  /**
    * The last path segment of this API resource.
    */
  val pathPart: Input[String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
}

object ResourceArgs {
  @scala.inline
  def apply(parentId: Input[String], pathPart: Input[String], restApi: Input[String | RestApi]): ResourceArgs = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceArgs]
  }
  @scala.inline
  implicit class ResourceArgsOps[Self <: ResourceArgs] (val x: Self) extends AnyVal {
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
    def setPathPart(value: Input[String]): Self = this.set("pathPart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
  }
  
}

