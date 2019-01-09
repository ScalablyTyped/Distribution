package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Channel extends js.Object {
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](): reduxDashSagaLib.effectsMod.TakeEffect = js.native
  def apply[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T]): reduxDashSagaLib.effectsMod.ChannelTakeEffect[T] = js.native
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](pattern: reduxDashSagaLib.effectsMod.Pattern): reduxDashSagaLib.effectsMod.TakeEffect = js.native
}

