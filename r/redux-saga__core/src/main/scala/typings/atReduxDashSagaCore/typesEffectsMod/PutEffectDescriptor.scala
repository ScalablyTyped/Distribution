package typings.atReduxDashSagaCore.typesEffectsMod

import typings.redux.reduxMod.Action
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
  def apply[A /* <: Action[_] */](action: A, channel: Null, resolve: js.UndefOr[Boolean] = js.undefined): PutEffectDescriptor[A] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    if (!js.isUndefined(resolve)) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEffectDescriptor[A]]
  }
}

