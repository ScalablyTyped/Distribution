package typings
package reactDashMotionLib.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// === TransitionMotion ===
trait TransitionStyle extends js.Object {
  /**
    * Anything you'd like to carry along. Will be preserved on re-renders until key off
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The ID that TransitionMotion uses to track which configuration is which across renders, even when things are reordered.
    * Typically reused as the component key when you map over the interpolated styles.
    */
  var key: java.lang.String
  /**
    * Actual starting style configuration
    */
  var style: Style
}

object TransitionStyle {
  @scala.inline
  def apply(key: java.lang.String, style: Style, data: js.Any = null): TransitionStyle = {
    val __obj = js.Dynamic.literal(key = key, style = style)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[TransitionStyle]
  }
}

