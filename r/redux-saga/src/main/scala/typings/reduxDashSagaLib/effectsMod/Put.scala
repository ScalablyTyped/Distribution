package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Put extends js.Object {
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](action: A): PutEffect[A] = js.native
  def apply[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T], action: T): ChannelPutEffect[T | reduxDashSagaLib.reduxDashSagaMod.END] = js.native
  def apply[T](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    action: reduxDashSagaLib.reduxDashSagaMod.END
  ): ChannelPutEffect[T | reduxDashSagaLib.reduxDashSagaMod.END] = js.native
  def resolve[A /* <: reduxLib.reduxMod.Action[_] */](action: A): PutEffect[A] = js.native
  def resolve[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T], action: T): ChannelPutEffect[T | reduxDashSagaLib.reduxDashSagaMod.END] = js.native
  def resolve[T](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    action: reduxDashSagaLib.reduxDashSagaMod.END
  ): ChannelPutEffect[T | reduxDashSagaLib.reduxDashSagaMod.END] = js.native
  /**
    * @deprecated
    */
  def sync[A /* <: reduxLib.reduxMod.Action[_] */](action: A): PutEffect[A] = js.native
  /**
    * @deprecated
    */
  def sync[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T], action: T): ChannelPutEffect[T | reduxDashSagaLib.reduxDashSagaMod.END] = js.native
  def sync[T](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    action: reduxDashSagaLib.reduxDashSagaMod.END
  ): ChannelPutEffect[T | reduxDashSagaLib.reduxDashSagaMod.END] = js.native
}

