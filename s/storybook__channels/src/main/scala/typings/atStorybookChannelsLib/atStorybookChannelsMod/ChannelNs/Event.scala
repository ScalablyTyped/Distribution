package typings
package atStorybookChannelsLib.atStorybookChannelsMod.ChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var args: js.Any
  var from: java.lang.String
  var `type`: atStorybookChannelsLib.EventName
}

object Event {
  @scala.inline
  def apply(args: js.Any, from: java.lang.String, `type`: atStorybookChannelsLib.EventName): Event = {
    val __obj = js.Dynamic.literal(args = args, from = from)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

