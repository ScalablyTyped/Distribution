package typings
package atPulumiAwsLib.autoscalingGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupArgs extends js.Object {
  /**
    * Specify the exact name of the desired autoscaling group.
    */
  val name: java.lang.String
}

object GetGroupArgs {
  @scala.inline
  def apply(name: java.lang.String): GetGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetGroupArgs]
  }
}

