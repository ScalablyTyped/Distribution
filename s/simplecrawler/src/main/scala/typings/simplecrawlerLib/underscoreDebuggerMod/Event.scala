package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends Message {
  var body: js.UndefOr[js.Any] = js.undefined
  var event: java.lang.String
}

object Event {
  @scala.inline
  def apply(event: java.lang.String, seq: scala.Double, `type`: java.lang.String, body: js.Any = null): Event = {
    val __obj = js.Dynamic.literal(event = event, seq = seq)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Event]
  }
}

