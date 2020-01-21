package typings.pulumiAws.getClusterAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterAuthResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The token to use to authenticate with the cluster.
    */
  val token: String = js.native
}

object GetClusterAuthResult {
  @scala.inline
  def apply(id: String, name: String, token: String): GetClusterAuthResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterAuthResult]
  }
}

