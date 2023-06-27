package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WaveShaperNode always has exactly one input and one output.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode)
  */
@js.native
trait WaveShaperNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/curve) */
  /* standard dom */
  var curve: js.typedarray.Float32Array | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample) */
  /* standard dom */
  var oversample: OverSampleType = js.native
}
