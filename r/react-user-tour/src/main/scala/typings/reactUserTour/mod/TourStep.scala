package typings.reactUserTour.mod

import typings.react.mod.global.JSX.Element
import typings.reactUserTour.reactUserTourStrings.bottom
import typings.reactUserTour.reactUserTourStrings.bottomLeft
import typings.reactUserTour.reactUserTourStrings.left
import typings.reactUserTour.reactUserTourStrings.right
import typings.reactUserTour.reactUserTourStrings.top
import typings.reactUserTour.reactUserTourStrings.topLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TourStep extends js.Object {
  /**
    a react element representing the main body message of the tour step
    */
  var body: String | Element
  /**
    Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
    */
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  /**
    Each step can also take an optional argument, position which will override the position of the tour component in relation to the selector that is determined by the application.
    */
  var position: js.UndefOr[left | right | top | topLeft | bottom | bottomLeft] = js.undefined
  /**
    CSS selector to be passed to document.querySelector()
    */
  var selector: String
  /**
    Index number of the step in the tour
    */
  var step: Double
  /**
    a react element representing the header of the current step
    */
  var title: String | Element
  /**
    Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
    */
  var verticalOffset: js.UndefOr[Double] = js.undefined
}

object TourStep {
  @scala.inline
  def apply(
    body: String | Element,
    selector: String,
    step: Double,
    title: String | Element,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    position: left | right | top | topLeft | bottom | bottomLeft = null,
    verticalOffset: js.UndefOr[Double] = js.undefined
  ): TourStep = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOffset)) __obj.updateDynamic("verticalOffset")(verticalOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourStep]
  }
}

