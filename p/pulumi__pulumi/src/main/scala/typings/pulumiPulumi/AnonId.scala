package typings.pulumiPulumi

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var state: Record[String, _]
}

object AnonId {
  @scala.inline
  def apply(id: String, state: Record[String, _]): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

