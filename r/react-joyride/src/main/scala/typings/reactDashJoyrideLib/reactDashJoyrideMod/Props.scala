package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props extends OverridableProps {
  /**
       * It will be called when Joyride's state changes. It returns a single parameter with the state.
       */
  var callback: js.UndefOr[js.Function1[/* data */ State, _]] = js.undefined
  /**
       * The tour is played sequentially with the Next button. Defaults to false.
       */
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Log Joyride's actions to the console. Defaults to false.
       */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Run/stop the tour. Defaults to true.
       */
  var run: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The scroll distance from the element scrollTop value. Defaults to 20.
       */
  var scrollOffset: js.UndefOr[scala.Double] = js.undefined
  /**
       * Scroll the page for the first step. Defaults to false
       */
  var scrollToFirstStep: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Setting a number here will turn Joyride into controlled mode.
       * You will receive the state events in the callback and you'll have to update this prop by yourself.
       */
  var stepIndex: js.UndefOr[scala.Double] = js.undefined
  /**
       * The tour's steps. Defaults to []
       */
  var steps: js.Array[Step]
}

