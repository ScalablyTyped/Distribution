package typings.sqlite

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cached extends js.Object {
  var cached: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Anon_Cached {
  @scala.inline
  def apply(
    cached: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    promise: PromiseConstructor = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Anon_Cached = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cached)) __obj.updateDynamic("cached")(cached)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_Cached]
  }
}

