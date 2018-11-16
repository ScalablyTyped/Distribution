package typings
package reactDashMotionLib.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Transition properties
 */

trait TransitionProps extends js.Object {
  var children: js.UndefOr[
    js.Function1[
      /* interpolatedStyles */ js.Array[TransitionPlainStyle], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
       * Default styles on first render
       */
  var defaultStyles: js.UndefOr[js.Array[TransitionPlainStyle]] = js.undefined
  /**
       * Triggers when an element has disappeared
       * @param styleThatLeft
       */
  var didLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, scala.Unit]] = js.undefined
  /**
       * Styles to interpolate. Accepts array of TransitionStyle objects or interpolated function similar as for
       * <StaggeredMotion/>
       */
  var styles: js.Array[TransitionStyle] | reactDashMotionLib.InterpolateFunction
  /**
       * Triggers when a new element will appear
       * @param styleThatEntered
       */
  var willEnter: js.UndefOr[js.Function1[/* styleThatEntered */ TransitionStyle, PlainStyle]] = js.undefined
  /**
       * Triggers when an element will disappear
       * @param styleThatLeft
       */
  var willLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Style | scala.Unit]] = js.undefined
}

