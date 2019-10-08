package typings.atStorybookChannels.atStorybookChannelsMod

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
    val __obj = js.Dynamic.literal(args = args, from = from)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChannelEvent]
  }
}

