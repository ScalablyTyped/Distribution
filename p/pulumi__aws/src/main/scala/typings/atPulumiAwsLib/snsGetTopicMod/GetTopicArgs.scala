package typings
package atPulumiAwsLib.snsGetTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopicArgs extends js.Object {
  /**
    * The friendly name of the topic to match.
    */
  val name: java.lang.String
}

object GetTopicArgs {
  @scala.inline
  def apply(name: java.lang.String): GetTopicArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetTopicArgs]
  }
}

