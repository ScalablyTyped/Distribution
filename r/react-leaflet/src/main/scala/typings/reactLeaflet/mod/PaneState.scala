package typings.reactLeaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneState extends js.Object {
  var context: js.UndefOr[LeafletContext | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
}

object PaneState {
  @scala.inline
  def apply(
    context: js.UndefOr[Null | LeafletContext] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): PaneState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneState]
  }
}

