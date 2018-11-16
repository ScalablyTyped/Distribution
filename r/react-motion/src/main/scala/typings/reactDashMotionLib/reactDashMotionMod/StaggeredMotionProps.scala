package typings
package reactDashMotionLib.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaggeredMotionProps extends js.Object {
  /**
       * Default styles
       */
  var defaultStyles: js.UndefOr[js.Array[PlainStyle]] = js.native
  /**
       * Styles to interpolate
       * @param previousInterpolatedStyles The previously interpolating (array of) styles (undefined at first render, unless defaultStyles is provided).
       */
  def styles(): js.Array[Style] = js.native
  /**
       * Styles to interpolate
       * @param previousInterpolatedStyles The previously interpolating (array of) styles (undefined at first render, unless defaultStyles is provided).
       */
  def styles(previousInterpolatedStyles: js.Array[PlainStyle]): js.Array[Style] = js.native
}

