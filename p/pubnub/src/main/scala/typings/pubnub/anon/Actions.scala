package typings.pubnub.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var actions: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]]
  var channel: String
  var message: js.Any
  var meta: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var timetoken: String | Double
}

object Actions {
  @scala.inline
  def apply(
    actions: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]],
    channel: String,
    message: js.Any,
    timetoken: String | Double,
    meta: StringDictionary[js.Any] = null
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

