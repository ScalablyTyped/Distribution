package typings.reactDashToolbox.libProgressUnderscoreBarProgressBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarTheme extends js.Object {
  /**
    * Used to style the buffer element in the linear progress.
    */
  var buffer: js.UndefOr[String] = js.undefined
  /**
    * Used for the circle element in the circular progress.
    */
  var circle: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element when the type is circular.
    */
  var circular: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element if mode is indeterminate.
    */
  var indeterminate: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element when the type is linear.
    */
  var linear: js.UndefOr[String] = js.undefined
  /**
    * Added to the root if the component is multicolor (circular).
    */
  var multicolor: js.UndefOr[String] = js.undefined
  /**
    * Used for the inner path in the circular progress.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Used to style the value element in the linear progress.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ProgressBarTheme {
  @scala.inline
  def apply(
    buffer: String = null,
    circle: String = null,
    circular: String = null,
    indeterminate: String = null,
    linear: String = null,
    multicolor: String = null,
    path: String = null,
    value: String = null
  ): ProgressBarTheme = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (circle != null) __obj.updateDynamic("circle")(circle)
    if (circular != null) __obj.updateDynamic("circular")(circular)
    if (indeterminate != null) __obj.updateDynamic("indeterminate")(indeterminate)
    if (linear != null) __obj.updateDynamic("linear")(linear)
    if (multicolor != null) __obj.updateDynamic("multicolor")(multicolor)
    if (path != null) __obj.updateDynamic("path")(path)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ProgressBarTheme]
  }
}

