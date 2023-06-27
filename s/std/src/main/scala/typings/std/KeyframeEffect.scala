package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect) */
@js.native
trait KeyframeEffect
  extends StObject
     with AnimationEffect {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite) */
  /* standard dom */
  var composite: CompositeOperation = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/getKeyframes) */
  /* standard dom */
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/iterationComposite) */
  /* standard dom */
  var iterationComposite: IterationCompositeOperation = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/pseudoElement) */
  /* standard dom */
  var pseudoElement: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/setKeyframes) */
  /* standard dom */
  def setKeyframes(): Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/target) */
  /* standard dom */
  var target: Element | Null = js.native
}
