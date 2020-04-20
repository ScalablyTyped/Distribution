package typings.storybookAddonKnobs

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: Validator[Boolean]
  var api: Validator[PickAPIonoffemitgetQueryP]
  var onReset: Validator[js.UndefOr[js.Object]]
}

object AnonActive {
  @scala.inline
  def apply(
    active: Validator[Boolean],
    api: Validator[PickAPIonoffemitgetQueryP],
    onReset: Validator[js.UndefOr[js.Object]]
  ): AnonActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

