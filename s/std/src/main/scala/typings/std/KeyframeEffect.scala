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
class KeyframeEffectCls () extends KeyframeEffect {
  def this(source: KeyframeEffect) = this()
  def this(target: Element) = this()
  def this(target: Null, keyframes: js.Array[Keyframe]) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: Element, keyframes: js.Array[Keyframe]) = this()
  def this(target: Element, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: Null, keyframes: js.Array[Keyframe], options: Double) = this()
  def this(target: Null, keyframes: js.Array[Keyframe], options: KeyframeEffectOptions) = this()
  def this(target: Null, keyframes: Null, options: Double) = this()
  def this(target: Null, keyframes: Null, options: KeyframeEffectOptions) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes, options: Double) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes, options: KeyframeEffectOptions) = this()
  def this(target: Element, keyframes: js.Array[Keyframe], options: Double) = this()
  def this(target: Element, keyframes: js.Array[Keyframe], options: KeyframeEffectOptions) = this()
  def this(target: Element, keyframes: Null, options: Double) = this()
  def this(target: Element, keyframes: Null, options: KeyframeEffectOptions) = this()
  def this(target: Element, keyframes: PropertyIndexedKeyframes, options: Double) = this()
  def this(target: Element, keyframes: PropertyIndexedKeyframes, options: KeyframeEffectOptions) = this()
}

@JSGlobal("KeyframeEffect")
@js.native
object KeyframeEffect
  extends Instantiable0[KeyframeEffect]
     with Instantiable2[
      (/* target */ Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes), 
      KeyframeEffect
    ]
     with Instantiable1[(/* target */ Element) | (/* source */ KeyframeEffect), KeyframeEffect]
     with Instantiable3[
      (/* target */ Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ Null) | (/* keyframes */ PropertyIndexedKeyframes), 
      (/* options */ Double) | (/* options */ KeyframeEffectOptions), 
      KeyframeEffect
    ]

