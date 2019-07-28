package typings.atReduxDashSagaCore.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForkEffectDescriptor extends CallEffectDescriptor {
  var detached: js.UndefOr[Boolean] = js.undefined
}

object ForkEffectDescriptor {
  @scala.inline
  def apply(args: js.Array[_], context: js.Any, fn: js.Function, detached: js.UndefOr[Boolean] = js.undefined): ForkEffectDescriptor = {
    val __obj = js.Dynamic.literal(args = args, context = context, fn = fn)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[ForkEffectDescriptor]
  }
}

