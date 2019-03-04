package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEffectDescriptor[A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  var action: A
  var channel: scala.Null
  var resolve: js.UndefOr[scala.Boolean] = js.undefined
}

object PutEffectDescriptor {
  @scala.inline
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](action: A, channel: scala.Null, resolve: js.UndefOr[scala.Boolean] = js.undefined): PutEffectDescriptor[A] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel)
    if (!js.isUndefined(resolve)) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[PutEffectDescriptor[A]]
  }
}

