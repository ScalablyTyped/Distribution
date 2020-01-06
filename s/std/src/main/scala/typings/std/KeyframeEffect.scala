package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframeEffect extends AnimationEffect {
  var composite: CompositeOperation = js.native
  var iterationComposite: IterationCompositeOperation = js.native
  var target: Element | Null = js.native
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  def setKeyframes(): Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
}

@JSGlobal("KeyframeEffect")
@js.native
object KeyframeEffect
  extends Instantiable0[KeyframeEffect]
     with Instantiable1[(/* target */ Element) | (/* source */ KeyframeEffect), KeyframeEffect]
     with Instantiable2[
      (/* target */ Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes), 
      KeyframeEffect
    ]
     with Instantiable3[
      (/* target */ Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ Null) | (/* keyframes */ PropertyIndexedKeyframes), 
      (/* options */ Double) | (/* options */ KeyframeEffectOptions), 
      KeyframeEffect
    ]

