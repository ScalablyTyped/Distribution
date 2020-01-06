package typings.atPulumiAws.apigatewayResourceMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val restApi: js.UndefOr[Input[RestApi]] = js.native
}

object ResourceState {
  @scala.inline
  def apply(
    parentId: Input[String] = null,
    path: Input[String] = null,
    pathPart: Input[String] = null,
    restApi: Input[RestApi] = null
  ): ResourceState = {
    val __obj = js.Dynamic.literal()
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathPart != null) __obj.updateDynamic("pathPart")(pathPart.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceState]
  }
}

