package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframeEffect
  extends StObject
     with AnimationEffect {
  
  /* standard dom */
  var composite: CompositeOperation = js.native
  
  /* standard dom */
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  
  /* standard dom */
  var iterationComposite: IterationCompositeOperation = js.native
  
  /* standard dom */
  var pseudoElement: java.lang.String | Null = js.native
  
  /* standard dom */
  def setKeyframes(): Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
  
  /* standard dom */
  var target: Element | Null = js.native
}
