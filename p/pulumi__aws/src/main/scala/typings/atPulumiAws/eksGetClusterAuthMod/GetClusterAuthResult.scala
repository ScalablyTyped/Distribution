package typings.atPulumiAws.eksGetClusterAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterAuthResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * The token to use to authenticate with the cluster.
    */
  val token: String
}

object GetClusterAuthResult {
  @scala.inline
  def apply(id: String, name: String, token: String): GetClusterAuthResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, token = token)
  
    __obj.asInstanceOf[GetClusterAuthResult]
  }
}

