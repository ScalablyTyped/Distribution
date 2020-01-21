package typings.slate.mod

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
    if (!js.isUndefined(construct)) __obj.updateDynamic("construct")(construct.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
}

