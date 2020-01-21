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
  def apply(iterations: Int | Double = null, resetBeforeIteration: js.UndefOr[Boolean] = js.undefined): LoopAnimationConfig = {
    val __obj = js.Dynamic.literal()
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (!js.isUndefined(resetBeforeIteration)) __obj.updateDynamic("resetBeforeIteration")(resetBeforeIteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopAnimationConfig]
  }
}

