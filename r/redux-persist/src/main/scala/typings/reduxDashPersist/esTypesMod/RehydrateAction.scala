package typings.reduxDashPersist.esTypesMod

import typings.reduxDashPersist.reduxDashPersistStrings.`redux-persist/es/REHYDRATE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RehydrateAction[Payload] extends js.Object {
  var err: js.UndefOr[RehydrateErrorType] = js.undefined
  var key: String
  var payload: js.UndefOr[Payload] = js.undefined
  var `type`: `redux-persist/es/REHYDRATE`
}

object RehydrateAction {
  @scala.inline
  def apply[Payload](
    key: String,
    `type`: `redux-persist/es/REHYDRATE`,
    err: RehydrateErrorType = null,
    payload: Payload = null
  ): RehydrateAction[Payload] = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (err != null) __obj.updateDynamic("err")(err)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RehydrateAction[Payload]]
  }
}

