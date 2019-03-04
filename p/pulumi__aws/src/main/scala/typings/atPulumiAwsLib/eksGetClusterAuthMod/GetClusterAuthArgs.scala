package typings
package atPulumiAwsLib.eksGetClusterAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterAuthArgs extends js.Object {
  /**
    * The name of the cluster
    */
  val name: java.lang.String
}

object GetClusterAuthArgs {
  @scala.inline
  def apply(name: java.lang.String): GetClusterAuthArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetClusterAuthArgs]
  }
}

