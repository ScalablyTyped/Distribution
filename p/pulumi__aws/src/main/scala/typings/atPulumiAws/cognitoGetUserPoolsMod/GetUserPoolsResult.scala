package typings.atPulumiAws.cognitoGetUserPoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPoolsResult extends js.Object {
  val arns: js.Array[String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The list of cognito user pool ids.
    */
  val ids: js.Array[String]
  val name: String
}

object GetUserPoolsResult {
  @scala.inline
  def apply(arns: js.Array[String], id: String, ids: js.Array[String], name: String): GetUserPoolsResult = {
    val __obj = js.Dynamic.literal(arns = arns, id = id, ids = ids, name = name)
  
    __obj.asInstanceOf[GetUserPoolsResult]
  }
}

