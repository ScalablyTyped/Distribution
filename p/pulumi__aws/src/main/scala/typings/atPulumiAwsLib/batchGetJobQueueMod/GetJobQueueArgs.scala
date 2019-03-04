package typings
package atPulumiAwsLib.batchGetJobQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobQueueArgs extends js.Object {
  /**
    * The name of the job queue.
    */
  val name: java.lang.String
}

object GetJobQueueArgs {
  @scala.inline
  def apply(name: java.lang.String): GetJobQueueArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetJobQueueArgs]
  }
}

