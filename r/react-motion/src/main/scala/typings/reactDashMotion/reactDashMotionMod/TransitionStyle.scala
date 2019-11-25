package typings.reactDashMotion.reactDashMotionMod

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
  var key: String
  /**
    * Actual starting style configuration
    */
  var style: Style
}

object TransitionStyle {
  @scala.inline
  def apply(key: String, style: Style, data: js.Any = null): TransitionStyle = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionStyle]
  }
}

