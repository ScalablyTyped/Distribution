package typings.pulumiAws.getTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicArgs extends js.Object {
  /**
    * The friendly name of the topic to match.
    */
  val name: String = js.native
}

object GetTopicArgs {
  @scala.inline
  def apply(name: String): GetTopicArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicArgs]
  }
}

