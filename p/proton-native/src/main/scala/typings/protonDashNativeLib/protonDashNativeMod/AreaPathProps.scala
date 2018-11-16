package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AreaPathProps extends AreaBaseProps {
  /**
       * A string describing the path (uses SVG's path syntax, explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths).
       *
       * A warning is displayed whan an unimplemented shaped are used (Quadratic Beziers and Arcs).
       */
  var d: java.lang.String
  /**
       * Sets the methods how to determine wheter to fill a path. Explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill-rule.
       */
  var fillMode: protonDashNativeLib.protonDashNativeLibStrings.nonzero | protonDashNativeLib.protonDashNativeLibStrings.evenodd
}

