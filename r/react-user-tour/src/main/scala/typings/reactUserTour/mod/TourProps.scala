package typings.reactUserTour.mod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TourProps
  extends HTMLAttributes[js.Any] {
  /**
    A boolean value representing whether or not the tour should currently be displayed
    */
  var active: Boolean = js.native
  /**
    We provide an arrow that points to the selector, but you may optionally pass in your own React element in the place of the arrow provided.
    */
  var arrow: js.UndefOr[js.Any] = js.native
  /**
    If you choose to use the provided arrow, you can set the color here by passing in a hex value.
    */
  var arrowColor: js.UndefOr[String] = js.native
  /**
    If you choose to use the provided arrow, you can set the pixel size here with an integer value.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  /**
    Text that will appear on the button that moves the tour backwards.
    Defaults to Back
    */
  var backButtonText: js.UndefOr[String] = js.native
  /**
    Optional style object for the container div around the buttons.
    */
  var buttonContainerStyle: js.UndefOr[js.Any] = js.native
  /**
    Optional style object for buttons displayed on component.
    */
  var buttonStyle: js.UndefOr[js.Any] = js.native
  /**
    Text that will appear on the button that closes the tour.
    Defaults to Close
    */
  var closeButtonText: js.UndefOr[String] = js.native
  /**
    Text that will appear on the button that finishes the tour.
    Defaults to Done
    */
  var doneButtonText: js.UndefOr[String] = js.native
  /**
    Boolean to disable the showing of next/back/done buttons.
    Set this to true if you want to insert your own buttons in the body.
    */
  var hideButtons: js.UndefOr[Boolean] = js.native
  /**
    Boolean to disable the showing of the close text in the upper left of
    the component. Set this to true if you want to insert your own close
    functionality or if you would like to disable the ability for the user
    to prematurely exit the tour.
    */
  var hideClose: js.UndefOr[Boolean] = js.native
  /**
    Text that will appear on the button that moves the tour forward.
    Defaults to Next
    */
  var nextButtonText: js.UndefOr[String] = js.native
  /**
    function that fires when user clicks the Back button.
    Receives the previous step integer as a callback.
    For example, if current step is 2 and user clicks the Back button, onBack(1) will be called.
    */
  var onBack: js.Function = js.native
  /**
    function that fires when user clicks the X button or the Done Button.
    */
  var onCancel: js.Function = js.native
  /**
    function that fires when user clicks the Next button.
    Receives the next step integer as a callback.
    For example, if current step is 1 and user clicks the Next button, onNext(2) will be called.
    */
  var onNext: js.Function = js.native
  /**
    An integer representing the current active step of the tour
    */
  var step: Double = js.native
  /**
    An array of TourStep.
    */
  var steps: js.Array[TourStep] = js.native
  /**
    Optional style object.
    */
  @JSName("style")
  var style_TourProps: js.UndefOr[js.Any] = js.native
}

object TourProps {
  @scala.inline
  def apply(
    active: Boolean,
    onBack: js.Function,
    onCancel: js.Function,
    onNext: js.Function,
    step: Double,
    steps: js.Array[TourStep]
  ): TourProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onBack = onBack.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onNext = onNext.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourProps]
  }
  @scala.inline
  implicit class TourPropsOps[Self <: TourProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBack(value: js.Function): Self = this.set("onBack", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCancel(value: js.Function): Self = this.set("onCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnNext(value: js.Function): Self = this.set("onNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: TourStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[TourStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrow(value: js.Any): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    @scala.inline
    def setArrowColor(value: String): Self = this.set("arrowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowColor: Self = this.set("arrowColor", js.undefined)
    @scala.inline
    def setArrowSize(value: Double): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
    @scala.inline
    def setBackButtonText(value: String): Self = this.set("backButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButtonText: Self = this.set("backButtonText", js.undefined)
    @scala.inline
    def setButtonContainerStyle(value: js.Any): Self = this.set("buttonContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonContainerStyle: Self = this.set("buttonContainerStyle", js.undefined)
    @scala.inline
    def setButtonStyle(value: js.Any): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    @scala.inline
    def setCloseButtonText(value: String): Self = this.set("closeButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonText: Self = this.set("closeButtonText", js.undefined)
    @scala.inline
    def setDoneButtonText(value: String): Self = this.set("doneButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoneButtonText: Self = this.set("doneButtonText", js.undefined)
    @scala.inline
    def setHideButtons(value: Boolean): Self = this.set("hideButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideButtons: Self = this.set("hideButtons", js.undefined)
    @scala.inline
    def setHideClose(value: Boolean): Self = this.set("hideClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideClose: Self = this.set("hideClose", js.undefined)
    @scala.inline
    def setNextButtonText(value: String): Self = this.set("nextButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButtonText: Self = this.set("nextButtonText", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

