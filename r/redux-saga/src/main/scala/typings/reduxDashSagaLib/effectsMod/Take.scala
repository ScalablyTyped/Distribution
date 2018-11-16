package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Take extends js.Object {
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](): TakeEffect = js.native
  def apply[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T]): ChannelTakeEffect[T] = js.native
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](pattern: Pattern): TakeEffect = js.native
  def maybe[A /* <: reduxLib.reduxMod.Action[_] */](): TakeEffect = js.native
  def maybe[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T]): ChannelTakeEffect[T] = js.native
  def maybe[A /* <: reduxLib.reduxMod.Action[_] */](pattern: Pattern): TakeEffect = js.native
}

