package typings
package reactDashToolboxLib.libSliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderTheme extends js.Object {
  /**
    * Used as an inner container of the root component.
    */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root of in case the Slider is editable.
    */
  var editable: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to style the inner element of the knob.
    */
  var innerknob: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provided to the ProgressBar component.
    */
  var innerprogress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provided to the Input element in case it's editable.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to style the outer layer of the knob.
    */
  var knob: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root in case the Slider is pinned.
    */
  var pinned: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root in case the state is pressed.
    */
  var pressed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as an outer wrapper for the ProgressBar.
    */
  var progress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used in the root when the knob should be a ring.
    */
  var ring: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class used for the root element.
    */
  var slider: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for every individual snap element.
    */
  var snap: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as a wrapper for the group of snaps when it's snapped.
    */
  var snaps: js.UndefOr[java.lang.String] = js.undefined
}

object SliderTheme {
  @scala.inline
  def apply(
    container: java.lang.String = null,
    editable: java.lang.String = null,
    innerknob: java.lang.String = null,
    innerprogress: java.lang.String = null,
    input: java.lang.String = null,
    knob: java.lang.String = null,
    pinned: java.lang.String = null,
    pressed: java.lang.String = null,
    progress: java.lang.String = null,
    ring: java.lang.String = null,
    slider: java.lang.String = null,
    snap: java.lang.String = null,
    snaps: java.lang.String = null
  ): SliderTheme = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (editable != null) __obj.updateDynamic("editable")(editable)
    if (innerknob != null) __obj.updateDynamic("innerknob")(innerknob)
    if (innerprogress != null) __obj.updateDynamic("innerprogress")(innerprogress)
    if (input != null) __obj.updateDynamic("input")(input)
    if (knob != null) __obj.updateDynamic("knob")(knob)
    if (pinned != null) __obj.updateDynamic("pinned")(pinned)
    if (pressed != null) __obj.updateDynamic("pressed")(pressed)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (ring != null) __obj.updateDynamic("ring")(ring)
    if (slider != null) __obj.updateDynamic("slider")(slider)
    if (snap != null) __obj.updateDynamic("snap")(snap)
    if (snaps != null) __obj.updateDynamic("snaps")(snaps)
    __obj.asInstanceOf[SliderTheme]
  }
}

