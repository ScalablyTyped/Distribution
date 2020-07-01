package typings.reduxSagaCore.effectsMod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEffectDescriptor[A /* <: Action[_] */] extends js.Object {
  var action: A
  var channel: Null
  var resolve: js.UndefOr[Boolean] = js.undefined
}

object PutEffectDescriptor {
  @scala.inline
  def apply[/* <: typings.redux.mod.Action[_] */ A](action: A, channel: Null, resolve: js.UndefOr[Boolean] = js.undefined): PutEffectDescriptor[A] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    if (!js.isUndefined(resolve)) __obj.updateDynamic("resolve")(resolve.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEffectDescriptor[A]]
  }
}

