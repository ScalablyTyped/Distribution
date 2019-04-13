package typings
package reactDashUserDashTourLib.reactDashUserDashTourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TourProps
  extends reactLib.reactMod.HTMLAttributes[js.Any] {
  /**
    A boolean value representing whether or not the tour should currently be displayed
    */
  var active: scala.Boolean
  /**
    We provide an arrow that points to the selector, but you may optionally pass in your own React element in the place of the arrow provided.
    */
  var arrow: js.UndefOr[js.Any] = js.undefined
  /**
    If you choose to use the provided arrow, you can set the color here by passing in a hex value.
    */
  var arrowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    If you choose to use the provided arrow, you can set the pixel size here with an integer value.
    */
  var arrowSize: js.UndefOr[scala.Double] = js.undefined
  /**
    Text that will appear on the button that moves the tour backwards.
    Defaults to Back
    */
  var backButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    Optional style object for the container div around the buttons.
    */
  var buttonContainerStyle: js.UndefOr[js.Any] = js.undefined
  /**
    Optional style object for buttons displayed on component.
    */
  var buttonStyle: js.UndefOr[js.Any] = js.undefined
  /**
    Text that will appear on the button that closes the tour.
    Defaults to Close
    */
  var closeButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    Text that will appear on the button that finishes the tour.
    Defaults to Done
    */
  var doneButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    Boolean to disable the showing of next/back/done buttons.
    Set this to true if you want to insert your own buttons in the body.
    */
  var hideButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    Boolean to disable the showing of the close text in the upper left of
    the component. Set this to true if you want to insert your own close
    functionality or if you would like to disable the ability for the user
    to prematurely exit the tour.
    */
  var hideClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    Text that will appear on the button that moves the tour forward.
    Defaults to Next
    */
  var nextButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    function that fires when user clicks the Back button.
    Receives the previous step integer as a callback.
    For example, if current step is 2 and user clicks the Back button, onBack(1) will be called.
    */
  var onBack: js.Function
  /**
    function that fires when user clicks the X button or the Done Button.
    */
  var onCancel: js.Function
  /**
    function that fires when user clicks the Next button.
    Receives the next step integer as a callback.
    For example, if current step is 1 and user clicks the Next button, onNext(2) will be called.
    */
  var onNext: js.Function
  /**
    An integer representing the current active step of the tour
    */
  var step: scala.Double
  /**
    An array of TourStep.
    */
  var steps: js.Array[TourStep]
  /**
    Optional style object.
    */
  @JSName("style")
  var style_TourProps: js.UndefOr[js.Any] = js.undefined
}

object TourProps {
  @scala.inline
  def apply(
    active: scala.Boolean,
    onBack: js.Function,
    onCancel: js.Function,
    onNext: js.Function,
    step: scala.Double,
    steps: js.Array[TourStep],
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[js.Any] = null,
    arrow: js.Any = null,
    arrowColor: java.lang.String = null,
    arrowSize: scala.Int | scala.Double = null,
    backButtonText: java.lang.String = null,
    buttonContainerStyle: js.Any = null,
    buttonStyle: js.Any = null,
    closeButtonText: java.lang.String = null,
    doneButtonText: java.lang.String = null,
    hideButtons: js.UndefOr[scala.Boolean] = js.undefined,
    hideClose: js.UndefOr[scala.Boolean] = js.undefined,
    nextButtonText: java.lang.String = null,
    style: js.Any = null
  ): TourProps = {
    val __obj = js.Dynamic.literal(active = active, onBack = onBack, onCancel = onCancel, onNext = onNext, step = step, steps = steps)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (arrow != null) __obj.updateDynamic("arrow")(arrow)
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor)
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (backButtonText != null) __obj.updateDynamic("backButtonText")(backButtonText)
    if (buttonContainerStyle != null) __obj.updateDynamic("buttonContainerStyle")(buttonContainerStyle)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText)
    if (doneButtonText != null) __obj.updateDynamic("doneButtonText")(doneButtonText)
    if (!js.isUndefined(hideButtons)) __obj.updateDynamic("hideButtons")(hideButtons)
    if (!js.isUndefined(hideClose)) __obj.updateDynamic("hideClose")(hideClose)
    if (nextButtonText != null) __obj.updateDynamic("nextButtonText")(nextButtonText)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TourProps]
  }
}

