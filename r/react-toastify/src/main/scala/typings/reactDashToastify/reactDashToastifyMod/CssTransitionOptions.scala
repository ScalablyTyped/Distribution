package typings.reactDashToastify.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssTransitionOptions extends js.Object {
  /**
    * Append or not the position to the class name:
    * yourClassName--top-right, yourClassName--bottom-left...
    * @default false
    */
  var appendPosition: js.UndefOr[Boolean] = js.undefined
  /**
    * The transition duration in ms.
    * @default 750
    */
  var duration: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /** The class name that will be used when the toast enters. */
  var enter: String
  /** The class name that will be used when the toast exits. */
  var exit: String
}

object CssTransitionOptions {
  @scala.inline
  def apply(
    enter: String,
    exit: String,
    appendPosition: js.UndefOr[Boolean] = js.undefined,
    duration: Double | js.Array[Double] = null
  ): CssTransitionOptions = {
    val __obj = js.Dynamic.literal(enter = enter, exit = exit)
    if (!js.isUndefined(appendPosition)) __obj.updateDynamic("appendPosition")(appendPosition)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssTransitionOptions]
  }
}

