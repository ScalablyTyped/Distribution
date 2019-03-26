package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframeEffect extends AnimationEffect {
  var composite: CompositeOperation = js.native
  var iterationComposite: IterationCompositeOperation = js.native
  var target: Element | scala.Null = js.native
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  def setKeyframes(): scala.Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): scala.Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): scala.Unit = js.native
}

@JSGlobal("KeyframeEffect")
@js.native
class KeyframeEffectCls () extends KeyframeEffect {
  def this(source: KeyframeEffect) = this()
  def this(target: Element) = this()
  def this(target: scala.Null, keyframes: js.Array[Keyframe]) = this()
  def this(target: scala.Null, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: Element, keyframes: js.Array[Keyframe]) = this()
  def this(target: Element, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: scala.Null, keyframes: js.Array[Keyframe], options: scala.Double) = this()
  def this(target: scala.Null, keyframes: js.Array[Keyframe], options: KeyframeEffectOptions) = this()
  def this(target: scala.Null, keyframes: scala.Null, options: scala.Double) = this()
  def this(target: scala.Null, keyframes: scala.Null, options: KeyframeEffectOptions) = this()
  def this(target: scala.Null, keyframes: PropertyIndexedKeyframes, options: scala.Double) = this()
  def this(target: scala.Null, keyframes: PropertyIndexedKeyframes, options: KeyframeEffectOptions) = this()
  def this(target: Element, keyframes: js.Array[Keyframe], options: scala.Double) = this()
  def this(target: Element, keyframes: js.Array[Keyframe], options: KeyframeEffectOptions) = this()
  def this(target: Element, keyframes: scala.Null, options: scala.Double) = this()
  def this(target: Element, keyframes: scala.Null, options: KeyframeEffectOptions) = this()
  def this(target: Element, keyframes: PropertyIndexedKeyframes, options: scala.Double) = this()
  def this(target: Element, keyframes: PropertyIndexedKeyframes, options: KeyframeEffectOptions) = this()
}

@JSGlobal("KeyframeEffect")
@js.native
object KeyframeEffect
  extends org.scalablytyped.runtime.Instantiable0[KeyframeEffect]
     with org.scalablytyped.runtime.Instantiable2[
      (/* target */ Element) | (/* target */ scala.Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes), 
      KeyframeEffect
    ]
     with org.scalablytyped.runtime.Instantiable1[(/* target */ Element) | (/* source */ KeyframeEffect), KeyframeEffect]
     with org.scalablytyped.runtime.Instantiable3[
      (/* target */ Element) | (/* target */ scala.Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ scala.Null) | (/* keyframes */ PropertyIndexedKeyframes), 
      (/* options */ scala.Double) | (/* options */ KeyframeEffectOptions), 
      KeyframeEffect
    ]

