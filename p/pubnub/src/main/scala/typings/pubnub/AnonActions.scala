package typings.pubnub

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var actions: StringDictionary[StringDictionary[js.Array[AnonActionTimetoken]]]
  var message: js.Any
  var meta: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var timetoken: String | Double
}

object AnonActions {
  @scala.inline
  def apply(
    actions: StringDictionary[StringDictionary[js.Array[AnonActionTimetoken]]],
    message: js.Any,
    timetoken: String | Double,
    meta: StringDictionary[js.Any] = null
  ): AnonActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
}

