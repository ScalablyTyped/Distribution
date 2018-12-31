package typings
package atPulumiAwsLib.apigatewayDocumentationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationVersionArgs extends js.Object {
  /**
    * The description of the API documentation version.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated Rest API
    */
  val restApiId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

