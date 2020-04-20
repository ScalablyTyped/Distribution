package typings.screeps

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignDefinition extends js.Object {
  var datetime: Date
  var text: String
  var time: Double
  var username: String
}

object SignDefinition {
  @scala.inline
  def apply(datetime: Date, text: String, time: Double, username: String): SignDefinition = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignDefinition]
  }
}

