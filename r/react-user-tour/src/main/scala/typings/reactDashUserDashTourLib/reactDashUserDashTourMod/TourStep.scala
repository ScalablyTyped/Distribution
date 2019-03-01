package typings
package reactDashUserDashTourLib.reactDashUserDashTourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TourStep extends js.Object {
  /**
    a react element representing the main body message of the tour step
    */
  var body: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  /**
    Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
    */
  var horizontalOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    Each step can also take an optional argument, position which will override the position of the tour component in relation to the selector that is determined by the application.
    */
  var position: js.UndefOr[
    reactDashUserDashTourLib.reactDashUserDashTourLibStrings.left | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.right | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.top | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.topLeft | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.bottom | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.bottomLeft
  ] = js.undefined
  /**
    CSS selector to be passed to document.querySelector()
    */
  var selector: java.lang.String
  /**
    Index number of the step in the tour
    */
  var step: scala.Double
  /**
    a react element representing the header of the current step
    */
  var title: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  /**
    Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
    */
  var verticalOffset: js.UndefOr[scala.Double] = js.undefined
}

object TourStep {
  @scala.inline
  def apply(
    body: java.lang.String | reactLib.reactMod.Global.JSXNs.Element,
    selector: java.lang.String,
    step: scala.Double,
    title: java.lang.String | reactLib.reactMod.Global.JSXNs.Element,
    horizontalOffset: scala.Int | scala.Double = null,
    position: reactDashUserDashTourLib.reactDashUserDashTourLibStrings.left | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.right | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.top | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.topLeft | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.bottom | reactDashUserDashTourLib.reactDashUserDashTourLibStrings.bottomLeft = null,
    verticalOffset: scala.Int | scala.Double = null
  ): TourStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.updateDynamic("selector")(selector)
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourStep]
  }
}

