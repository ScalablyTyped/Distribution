package typings.slate.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var construct: js.UndefOr[Boolean] = js.undefined
  var controller: js.UndefOr[Controller] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply(
    construct: js.UndefOr[Boolean] = js.undefined,
    controller: Controller = null,
    normalize: js.UndefOr[Boolean] = js.undefined
  ): EditorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(construct)) __obj.updateDynamic("construct")(construct)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    __obj.asInstanceOf[EditorOptions]
  }
}

