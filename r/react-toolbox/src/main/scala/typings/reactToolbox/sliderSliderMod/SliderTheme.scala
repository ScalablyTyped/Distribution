package typings.reactToolbox.sliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderTheme extends js.Object {
  /**
    * Used as an inner container of the root component.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * Added to the root of in case the Slider is editable.
    */
  var editable: js.UndefOr[String] = js.native
  /**
    * Used to style the inner element of the knob.
    */
  var innerknob: js.UndefOr[String] = js.native
  /**
    * Provided to the ProgressBar component.
    */
  var innerprogress: js.UndefOr[String] = js.native
  /**
    * Provided to the Input element in case it's editable.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used to style the outer layer of the knob.
    */
  var knob: js.UndefOr[String] = js.native
  /**
    * Added to the root in case the Slider is pinned.
    */
  var pinned: js.UndefOr[String] = js.native
  /**
    * Added to the root in case the state is pressed.
    */
  var pressed: js.UndefOr[String] = js.native
  /**
    * Used as an outer wrapper for the ProgressBar.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * Used in the root when the knob should be a ring.
    */
  var ring: js.UndefOr[String] = js.native
  /**
    * Class used for the root element.
    */
  var slider: js.UndefOr[String] = js.native
  /**
    * Used for every individual snap element.
    */
  var snap: js.UndefOr[String] = js.native
  /**
    * Used as a wrapper for the group of snaps when it's snapped.
    */
  var snaps: js.UndefOr[String] = js.native
}

object SliderTheme {
  @scala.inline
  def apply(): SliderTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderTheme]
  }
  @scala.inline
  implicit class SliderThemeOps[Self <: SliderTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setEditable(value: String): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setInnerknob(value: String): Self = this.set("innerknob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerknob: Self = this.set("innerknob", js.undefined)
    @scala.inline
    def setInnerprogress(value: String): Self = this.set("innerprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerprogress: Self = this.set("innerprogress", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setKnob(value: String): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setPinned(value: String): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setPressed(value: String): Self = this.set("pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressed: Self = this.set("pressed", js.undefined)
    @scala.inline
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setRing(value: String): Self = this.set("ring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRing: Self = this.set("ring", js.undefined)
    @scala.inline
    def setSlider(value: String): Self = this.set("slider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    @scala.inline
    def setSnap(value: String): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnaps(value: String): Self = this.set("snaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnaps: Self = this.set("snaps", js.undefined)
  }
  
}

