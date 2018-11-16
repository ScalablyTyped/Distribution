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

