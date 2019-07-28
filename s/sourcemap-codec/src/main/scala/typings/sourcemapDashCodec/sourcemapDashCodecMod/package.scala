package typings.sourcemapDashCodec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourcemapDashCodecMod {
  type SourceMapLine = js.Array[SourceMapSegment]
  type SourceMapMappings = js.Array[SourceMapLine]
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
}
