package typings.storybookChannels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEvent extends js.Object {
  var args: js.Array[_]
  var from: String
  var `type`: String
}

object ChannelEvent {
  @scala.inline
  def apply(args: js.Array[_], from: String, `type`: String): ChannelEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEvent]
  }
}

