package typings.sourcemapCodec

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sourcemap-codec", "decode")
  @js.native
  def decode(mappings: String): SourceMapMappings = js.native
  
  @JSImport("sourcemap-codec", "encode")
  @js.native
  def encode(decoded: SourceMapMappings): String = js.native
  
  type SourceMapLine = js.Array[SourceMapSegment]
  
  type SourceMapMappings = js.Array[SourceMapLine]
  
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
}
