package typings.atPulumiAws.apigatewayResourceMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceArgs extends js.Object {
  /**
    * The ID of the parent API resource
    */
  val parentId: Input[String]
  /**
    * The last path segment of this API resource.
    */
  val pathPart: Input[String]
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[RestApi]
}

object ResourceArgs {
  @scala.inline
  def apply(parentId: Input[String], pathPart: Input[String], restApi: Input[RestApi]): ResourceArgs = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceArgs]
  }
}

