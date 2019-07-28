package typings.atPulumiAws.snsGetTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopicArgs extends js.Object {
  /**
    * The friendly name of the topic to match.
    */
  val name: String
}

object GetTopicArgs {
  @scala.inline
  def apply(name: String): GetTopicArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetTopicArgs]
  }
}

