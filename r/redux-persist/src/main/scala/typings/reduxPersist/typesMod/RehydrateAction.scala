package typings.reduxPersist.typesMod

import typings.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RehydrateAction extends PersistorAction {
  var err: js.UndefOr[RehydrateErrorType | Null] = js.undefined
  var key: String
  var payload: js.UndefOr[js.Object | Null] = js.undefined
  var `type`: persistSlashREHYDRATE
}

object RehydrateAction {
  @scala.inline
  def apply(
    key: String,
    `type`: persistSlashREHYDRATE,
    err: js.UndefOr[Null | RehydrateErrorType] = js.undefined,
    payload: js.UndefOr[Null | js.Object] = js.undefined
  ): RehydrateAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(err)) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RehydrateAction]
  }
}

