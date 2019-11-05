package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverArrayOpts extends ObserverBaseOpts {
  /**
  	 * Create an array observer, which fires array changes objects rather than the usual callback when array modification methods are used.
  	 */
  var array: Boolean
}

object ObserverArrayOpts {
  @scala.inline
  def apply(
    array: Boolean,
    context: js.Any = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    init: js.UndefOr[Boolean] = js.undefined
  ): ObserverArrayOpts = {
    val __obj = js.Dynamic.literal(array = array)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[ObserverArrayOpts]
  }
}

