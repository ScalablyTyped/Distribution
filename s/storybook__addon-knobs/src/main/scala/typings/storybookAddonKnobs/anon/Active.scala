package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: Validator[Boolean]
  var api: Validator[PickAPIonoffemitgetQueryP]
  var onReset: Validator[js.UndefOr[js.Object]]
}

object Active {
  @scala.inline
  def apply(
    active: Validator[Boolean],
    api: Validator[PickAPIonoffemitgetQueryP],
    onReset: Validator[js.UndefOr[js.Object]]
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

