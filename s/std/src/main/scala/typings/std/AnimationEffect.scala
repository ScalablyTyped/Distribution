package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEffect extends js.Object {
  def getComputedTiming(): ComputedEffectTiming = js.native
  def getTiming(): EffectTiming = js.native
  def updateTiming(): Unit = js.native
  def updateTiming(timing: OptionalEffectTiming): Unit = js.native
}

@JSGlobal("AnimationEffect")
@js.native
class AnimationEffectCls () extends AnimationEffect

@JSGlobal("AnimationEffect")
@js.native
object AnimationEffect extends Instantiable0[AnimationEffect]

