package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.Keyframe
import typings.std.KeyframeEffectOptions
import typings.std.PropertyIndexedKeyframes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KeyframeEffect")
@js.native
class KeyframeEffect ()
  extends typings.std.KeyframeEffect {
  def this(source: typings.std.KeyframeEffect) = this()
  def this(target: typings.std.Element) = this()
  def this(target: Null, keyframes: js.Array[Keyframe]) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: typings.std.Element, keyframes: js.Array[Keyframe]) = this()
  def this(target: typings.std.Element, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: Null, keyframes: js.Array[Keyframe], options: Double) = this()
  def this(target: Null, keyframes: js.Array[Keyframe], options: KeyframeEffectOptions) = this()
  def this(target: Null, keyframes: Null, options: Double) = this()
  def this(target: Null, keyframes: Null, options: KeyframeEffectOptions) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes, options: Double) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes, options: KeyframeEffectOptions) = this()
  def this(target: typings.std.Element, keyframes: js.Array[Keyframe], options: Double) = this()
  def this(target: typings.std.Element, keyframes: js.Array[Keyframe], options: KeyframeEffectOptions) = this()
  def this(target: typings.std.Element, keyframes: Null, options: Double) = this()
  def this(target: typings.std.Element, keyframes: Null, options: KeyframeEffectOptions) = this()
  def this(target: typings.std.Element, keyframes: PropertyIndexedKeyframes, options: Double) = this()
  def this(target: typings.std.Element, keyframes: PropertyIndexedKeyframes, options: KeyframeEffectOptions) = this()
}

@JSGlobal("KeyframeEffect")
@js.native
object KeyframeEffect
  extends Instantiable0[typings.std.KeyframeEffect]
     with Instantiable1[
      (/* target */ typings.std.Element) | (/* source */ typings.std.KeyframeEffect), 
      typings.std.KeyframeEffect
    ]
     with Instantiable2[
      (/* target */ typings.std.Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes), 
      typings.std.KeyframeEffect
    ]
     with Instantiable3[
      (/* target */ typings.std.Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ Null) | (/* keyframes */ PropertyIndexedKeyframes), 
      (/* options */ Double) | (/* options */ KeyframeEffectOptions), 
      typings.std.KeyframeEffect
    ]

