package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode)
  */
@js.native
trait DelayNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode/delayTime) */
  /* standard dom */
  val delayTime: AudioParam = js.native
}
