package typings.sourcemapCodec

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sourcemap-codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(mappings: String): SourceMapMappings = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(mappings.asInstanceOf[js.Any]).asInstanceOf[SourceMapMappings]
  
  inline def encode(decoded: SourceMapMappings): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(decoded.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SourceMapLine = js.Array[SourceMapSegment]
  
  type SourceMapMappings = js.Array[SourceMapLine]
  
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
}
