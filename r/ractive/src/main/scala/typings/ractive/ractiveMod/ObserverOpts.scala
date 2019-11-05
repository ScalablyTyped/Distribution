package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverOpts extends ObserverBaseOpts {
  /**
  	 * Whether or not to follow any links when observing.
  	 */
  var links: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The function called to get an old value for the observer. This can be used to do things like freeze the initial value as the old value for all future callbacks.
  	 */
  var old: js.UndefOr[ObserverCallback[Ractive[Ractive[_]]]] = js.undefined
  /**
  	 * Whether or not to use strict equality when checking to see if a value has changed. Defaults to false.
  	 */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ObserverOpts {
  @scala.inline
  def apply(
    context: js.Any = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    init: js.UndefOr[Boolean] = js.undefined,
    links: js.UndefOr[Boolean] = js.undefined,
    old: ObserverCallback[Ractive[Ractive[_]]] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ObserverOpts = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    if (!js.isUndefined(links)) __obj.updateDynamic("links")(links)
    if (old != null) __obj.updateDynamic("old")(old)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[ObserverOpts]
  }
}

