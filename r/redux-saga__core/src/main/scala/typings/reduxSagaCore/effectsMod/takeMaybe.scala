package typings.reduxSagaCore.effectsMod

import typings.reduxSagaCore.typesMod.TakeableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "takeMaybe")
@js.native
object takeMaybe extends js.Object {
  def apply(): TakeEffect = js.native
  def apply(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = js.native
  def apply[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def apply[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = js.native
}

