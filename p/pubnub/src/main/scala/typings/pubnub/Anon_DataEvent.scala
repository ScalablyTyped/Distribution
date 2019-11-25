package typings.pubnub

import typings.pubnub.pubnubMod.SpaceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataEvent extends js.Object {
  var data: SpaceData
  var event: String
  var `type`: String
}

object Anon_DataEvent {
  @scala.inline
  def apply(data: SpaceData, event: String, `type`: String): Anon_DataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataEvent]
  }
}

