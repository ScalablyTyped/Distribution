package typings.reactToolbox.sliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderTheme extends js.Object {
  /**
    * Used as an inner container of the root component.
    */
  var container: js.UndefOr[String] = js.undefined
  /**
    * Added to the root of in case the Slider is editable.
    */
  var editable: js.UndefOr[String] = js.undefined
  /**
    * Used to style the inner element of the knob.
    */
  var innerknob: js.UndefOr[String] = js.undefined
  /**
    * Provided to the ProgressBar component.
    */
  var innerprogress: js.UndefOr[String] = js.undefined
  /**
    * Provided to the Input element in case it's editable.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * Used to style the outer layer of the knob.
    */
  var knob: js.UndefOr[String] = js.undefined
  /**
    * Added to the root in case the Slider is pinned.
    */
  var pinned: js.UndefOr[String] = js.undefined
  /**
    * Added to the root in case the state is pressed.
    */
  var pressed: js.UndefOr[String] = js.undefined
  /**
    * Used as an outer wrapper for the ProgressBar.
    */
  var progress: js.UndefOr[String] = js.undefined
  /**
    * Used in the root when the knob should be a ring.
    */
  var ring: js.UndefOr[String] = js.undefined
  /**
    * Class used for the root element.
    */
  var slider: js.UndefOr[String] = js.undefined
  /**
    * Used for every individual snap element.
    */
  var snap: js.UndefOr[String] = js.undefined
  /**
    * Used as a wrapper for the group of snaps when it's snapped.
    */
  var snaps: js.UndefOr[String] = js.undefined
}

object SliderTheme {
  @scala.inline
  def apply(
    container: String = null,
    editable: String = null,
    innerknob: String = null,
    innerprogress: String = null,
    input: String = null,
    knob: String = null,
    pinned: String = null,
    pressed: String = null,
    progress: String = null,
    ring: String = null,
    slider: String = null,
    snap: String = null,
    snaps: String = null
  ): SliderTheme = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (innerknob != null) __obj.updateDynamic("innerknob")(innerknob.asInstanceOf[js.Any])
    if (innerprogress != null) __obj.updateDynamic("innerprogress")(innerprogress.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (pressed != null) __obj.updateDynamic("pressed")(pressed.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (ring != null) __obj.updateDynamic("ring")(ring.asInstanceOf[js.Any])
    if (slider != null) __obj.updateDynamic("slider")(slider.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snaps != null) __obj.updateDynamic("snaps")(snaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderTheme]
  }
}

