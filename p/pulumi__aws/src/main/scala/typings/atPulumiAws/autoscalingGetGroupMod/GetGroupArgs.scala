package typings.atPulumiAws.autoscalingGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupArgs extends js.Object {
  /**
    * Specify the exact name of the desired autoscaling group.
    */
  val name: String
}

object GetGroupArgs {
  @scala.inline
  def apply(name: String): GetGroupArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetGroupArgs]
  }
}

