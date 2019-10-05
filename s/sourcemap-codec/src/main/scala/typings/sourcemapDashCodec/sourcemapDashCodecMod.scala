package typings.sourcemapDashCodec

import typings.sourcemapDashCodec.sourcemapDashCodecMod.SourceMapLine
import typings.sourcemapDashCodec.sourcemapDashCodecMod.SourceMapMappings
import typings.sourcemapDashCodec.sourcemapDashCodecMod.SourceMapSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sourcemap-codec", JSImport.Namespace)
@js.native
object sourcemapDashCodecMod extends js.Object {
  def decode(mappings: String): SourceMapMappings = js.native
  def encode(decoded: SourceMapMappings): String = js.native
  type SourceMapLine = js.Array[SourceMapSegment]
  type SourceMapMappings = js.Array[SourceMapLine]
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
}

