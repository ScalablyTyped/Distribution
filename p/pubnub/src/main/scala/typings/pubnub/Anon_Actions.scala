package typings.pubnub

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: StringDictionary[StringDictionary[js.Array[Anon_ActionTimetoken]]]
  var message: js.Any
  var meta: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var timetoken: String | Double
}

object Anon_Actions {
  @scala.inline
  def apply(
    actions: StringDictionary[StringDictionary[js.Array[Anon_ActionTimetoken]]],
    message: js.Any,
    timetoken: String | Double,
    meta: StringDictionary[js.Any] = null
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal(actions = actions, message = message, timetoken = timetoken.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[Anon_Actions]
  }
}

