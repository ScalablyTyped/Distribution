package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A WaveShaperNode always has exactly one input and one output. */
@js.native
trait WaveShaperNode
  extends StObject
     with AudioNode {
  
  var curve: Float32Array | Null = js.native
  
  var oversample: OverSampleType = js.native
}
