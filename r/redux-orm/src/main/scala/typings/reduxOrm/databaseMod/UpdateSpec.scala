package typings.reduxOrm.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSpec[Payload] extends js.Object {
  var action: UpdateType
  var payload: js.UndefOr[Payload] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object UpdateSpec {
  @scala.inline
  def apply[Payload](action: UpdateType, payload: Payload = null, query: Query = null): UpdateSpec[Payload] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSpec[Payload]]
  }
}

