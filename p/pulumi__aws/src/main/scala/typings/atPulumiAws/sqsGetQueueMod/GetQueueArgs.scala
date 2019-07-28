package typings.atPulumiAws.sqsGetQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueArgs extends js.Object {
  /**
    * The name of the queue to match.
    */
  val name: String
}

object GetQueueArgs {
  @scala.inline
  def apply(name: String): GetQueueArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetQueueArgs]
  }
}

