package typings.pulumiAws.getUserPoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserPoolsResult extends js.Object {
  val arns: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The list of cognito user pool ids.
    */
  val ids: js.Array[String] = js.native
  val name: String = js.native
}

object GetUserPoolsResult {
  @scala.inline
  def apply(arns: js.Array[String], id: String, ids: js.Array[String], name: String): GetUserPoolsResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPoolsResult]
  }
}

