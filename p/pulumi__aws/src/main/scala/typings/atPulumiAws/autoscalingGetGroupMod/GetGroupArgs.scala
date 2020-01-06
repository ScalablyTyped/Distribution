package typings.atPulumiAws.autoscalingGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupArgs extends js.Object {
  /**
    * Specify the exact name of the desired autoscaling group.
    */
  val name: String = js.native
}

object GetGroupArgs {
  @scala.inline
  def apply(name: String): GetGroupArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupArgs]
  }
}

