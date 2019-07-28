package typings.atPulumiAws.batchGetJobQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobQueueArgs extends js.Object {
  /**
    * The name of the job queue.
    */
  val name: String
}

object GetJobQueueArgs {
  @scala.inline
  def apply(name: String): GetJobQueueArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetJobQueueArgs]
  }
}

