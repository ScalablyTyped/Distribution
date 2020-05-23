package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoopAnimationConfig extends js.Object {
  var iterations: js.UndefOr[Double] = js.undefined
   // default -1 for infinite
  /**
    * Defaults to `true`
    */
  var resetBeforeIteration: js.UndefOr[Boolean] = js.undefined
}

object LoopAnimationConfig {
  @scala.inline
  def apply(
    iterations: js.UndefOr[Double] = js.undefined,
    resetBeforeIteration: js.UndefOr[Boolean] = js.undefined
  ): LoopAnimationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetBeforeIteration)) __obj.updateDynamic("resetBeforeIteration")(resetBeforeIteration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopAnimationConfig]
  }
}

