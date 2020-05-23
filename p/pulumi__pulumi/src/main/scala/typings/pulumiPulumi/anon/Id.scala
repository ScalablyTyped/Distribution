package typings.pulumiPulumi.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var state: Record[String, _]
}

object Id {
  @scala.inline
  def apply(id: String, state: Record[String, _]): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

