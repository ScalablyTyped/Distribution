package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Cancel extends js.Object {
  def actionChannel(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.ActionChannelEffectDescriptor]
  def all(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.AllEffectDescriptor]
  def call(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.CallEffectDescriptor]
  def cancel(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.CancelEffectDescriptor]
  def cancelled(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.CancelledEffectDescriptor]
  def cps(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.CallEffectDescriptor]
  def flush(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.FlushEffectDescriptor[_]]
  def fork(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.ForkEffectDescriptor]
  def getContext(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.GetContextEffectDescriptor]
  def join(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.JoinEffectDescriptor]
  def put(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[
    reduxDashSagaLib.effectsMod.PutEffectDescriptor[_] | reduxDashSagaLib.effectsMod.ChannelPutEffectDescriptor[_]
  ]
  def race(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.RaceEffectDescriptor]
  def select(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.SelectEffectDescriptor]
  def setContext(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[reduxDashSagaLib.effectsMod.SetContextEffectDescriptor[_]]
  def take(effect: reduxDashSagaLib.effectsMod.Effect): js.UndefOr[
    reduxDashSagaLib.effectsMod.TakeEffectDescriptor | reduxDashSagaLib.effectsMod.ChannelTakeEffectDescriptor[_]
  ]
}

