package typings.pulumiAws.getClusterAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterAuthArgs extends js.Object {
  /**
    * The name of the cluster
    */
  val name: String = js.native
}

object GetClusterAuthArgs {
  @scala.inline
  def apply(name: String): GetClusterAuthArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterAuthArgs]
  }
}

