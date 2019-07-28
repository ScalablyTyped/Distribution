package typings.reduxDashForm.libActionsMod

import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormAction
  extends Action[js.Any] {
  var error: js.UndefOr[js.Any] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
}

object FormAction {
  @scala.inline
  def apply(`type`: js.Any, error: js.Any = null, meta: js.Any = null, payload: js.Any = null): FormAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[FormAction]
  }
}

