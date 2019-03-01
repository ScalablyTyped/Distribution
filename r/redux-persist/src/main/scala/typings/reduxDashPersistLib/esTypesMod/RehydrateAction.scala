package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RehydrateAction[Payload] extends js.Object {
  var err: js.UndefOr[RehydrateErrorType] = js.undefined
  var key: java.lang.String
  var payload: js.UndefOr[Payload] = js.undefined
  var `type`: reduxDashPersistLib.reduxDashPersistLibStrings.`redux-persist/es/REHYDRATE`
}

object RehydrateAction {
  @scala.inline
  def apply[Payload](
    key: java.lang.String,
    `type`: reduxDashPersistLib.reduxDashPersistLibStrings.`redux-persist/es/REHYDRATE`,
    err: RehydrateErrorType = null,
    payload: Payload = null
  ): RehydrateAction[Payload] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("key")(key)
    if (err != null) __obj.updateDynamic("err")(err)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RehydrateAction[Payload]]
  }
}

