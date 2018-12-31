package typings
package atPulumiAwsLib.apigatewayGetResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Set to the ID of the parent Resource.
    */
  val parentId: java.lang.String
  /**
    * Set to the path relative to the parent Resource.
    */
  val pathPart: java.lang.String
}

