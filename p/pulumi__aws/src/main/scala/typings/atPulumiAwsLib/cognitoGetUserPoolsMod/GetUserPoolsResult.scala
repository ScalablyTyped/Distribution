package typings
package atPulumiAwsLib.cognitoGetUserPoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPoolsResult extends js.Object {
  val arns: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The list of cognito user pool ids.
    */
  val ids: js.Array[java.lang.String]
}

