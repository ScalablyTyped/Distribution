package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroHandle extends js.Object {
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  var teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var update: js.UndefOr[js.Function1[/* attributes */ ValueMap, Unit]] = js.undefined
}

object MacroHandle {
  @scala.inline
  def apply(
    invalidate: () => Unit = null,
    render: () => Unit = null,
    teardown: () => Unit = null,
    update: /* attributes */ ValueMap => Unit = null
  ): MacroHandle = {
    val __obj = js.Dynamic.literal()
    if (invalidate != null) __obj.updateDynamic("invalidate")(js.Any.fromFunction0(invalidate))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction0(teardown))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[MacroHandle]
  }
}

