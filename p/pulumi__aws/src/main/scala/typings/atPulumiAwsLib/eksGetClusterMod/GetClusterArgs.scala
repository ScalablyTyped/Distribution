package typings
package atPulumiAwsLib.eksGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * The name of the cluster
    */
  val name: java.lang.String
}

object GetClusterArgs {
  @scala.inline
  def apply(name: java.lang.String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetClusterArgs]
  }
}

