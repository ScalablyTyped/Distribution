package typings
package atPulumiAwsLib.apigatewayResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceArgs extends js.Object {
  /**
    * The ID of the parent API resource
    */
  val parentId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The last path segment of this API resource.
    */
  val pathPart: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
}

