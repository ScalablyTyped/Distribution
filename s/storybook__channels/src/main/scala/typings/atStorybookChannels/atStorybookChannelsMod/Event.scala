package typings.atStorybookChannels.atStorybookChannelsMod

import typings.atStorybookChannels.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var args: js.Any
  var from: String
  var `type`: EventName
}

object Event {
  @scala.inline
  def apply(args: js.Any, from: String, `type`: EventName): Event = {
    val __obj = js.Dynamic.literal(args = args, from = from)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

