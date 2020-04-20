package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataEvent extends js.Object {
  var command: String
  var params: String
  var prefix: String
  var string: String
  var trailing: String
}

object DataEvent {
  @scala.inline
  def apply(command: String, params: String, prefix: String, string: String, trailing: String): DataEvent = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEvent]
  }
}

