package typings
package atPulumiAwsLib.sqsGetQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueArgs extends js.Object {
  /**
    * The name of the queue to match.
    */
  val name: java.lang.String
}

object GetQueueArgs {
  @scala.inline
  def apply(name: java.lang.String): GetQueueArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetQueueArgs]
  }
}

