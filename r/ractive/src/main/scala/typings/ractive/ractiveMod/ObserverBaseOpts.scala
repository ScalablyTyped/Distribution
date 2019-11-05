package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverBaseOpts extends js.Object {
  /**
  	 * The context to be used for the callback.
  	 */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Whether or not to defer calling the callback until after the DOM has been updated.
  	 */
  var defer: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Whether or not to call the callback with the initial value.
  	 */
  var init: js.UndefOr[Boolean] = js.undefined
}

object ObserverBaseOpts {
  @scala.inline
  def apply(
    context: js.Any = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    init: js.UndefOr[Boolean] = js.undefined
  ): ObserverBaseOpts = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[ObserverBaseOpts]
  }
}

