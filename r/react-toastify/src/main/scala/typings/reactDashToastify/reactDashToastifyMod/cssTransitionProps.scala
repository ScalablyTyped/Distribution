package typings.reactDashToastify.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssTransitionProps extends js.Object {
  /**
    * Append current toast position to the classname.
    * For instance `myclass--top-center`...
    * `Default: false`
    */
  var appendPosition: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the duration of the transition in ms
    * `Default: 750`
    */
  var duration: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * Css class to apply when toast enter
    */
  var enter: String
  /**
    * Css class to apply when toast leave
    */
  var exit: String
}

object cssTransitionProps {
  @scala.inline
  def apply(
    enter: String,
    exit: String,
    appendPosition: js.UndefOr[Boolean] = js.undefined,
    duration: Double | js.Array[Double] = null
  ): cssTransitionProps = {
    val __obj = js.Dynamic.literal(enter = enter, exit = exit)
    if (!js.isUndefined(appendPosition)) __obj.updateDynamic("appendPosition")(appendPosition)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssTransitionProps]
  }
}

