package typings.reduxDashPersist.esTypesMod

import typings.reduxDashPersist.reduxDashPersistStrings.`persist/REHYDRATE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RehydrateAction extends PersistorAction {
  var err: js.UndefOr[RehydrateErrorType | Null] = js.undefined
  var key: String
  var payload: js.UndefOr[js.Object | Null] = js.undefined
  var `type`: `persist/REHYDRATE`
}

object RehydrateAction {
  @scala.inline
  def apply(
    key: String,
    `type`: `persist/REHYDRATE`,
    err: RehydrateErrorType = null,
    payload: js.Object = null
  ): RehydrateAction = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (err != null) __obj.updateDynamic("err")(err)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[RehydrateAction]
  }
}

