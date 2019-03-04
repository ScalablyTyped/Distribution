package typings
package atPulumiAwsLib.eksGetClusterAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterAuthResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The token to use to authenticate with the cluster.
    */
  val token: java.lang.String
}

object GetClusterAuthResult {
  @scala.inline
  def apply(id: java.lang.String, token: java.lang.String): GetClusterAuthResult = {
    val __obj = js.Dynamic.literal(id = id, token = token)
  
    __obj.asInstanceOf[GetClusterAuthResult]
  }
}

