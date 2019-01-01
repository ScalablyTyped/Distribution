package typings
package sourcemapDashCodecLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourcemapDashCodecMod {
  type SourceMapLine = js.Array[SourceMapSegment]
  type SourceMapMappings = js.Array[SourceMapLine]
  type SourceMapSegment = js.Array[scala.Double] | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
}
