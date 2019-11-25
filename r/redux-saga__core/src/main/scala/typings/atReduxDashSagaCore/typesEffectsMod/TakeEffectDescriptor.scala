package typings.atReduxDashSagaCore.typesEffectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeEffectDescriptor extends js.Object {
  var maybe: js.UndefOr[Boolean] = js.undefined
  var pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
}

object TakeEffectDescriptor {
  @scala.inline
  def apply(
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any,
    maybe: js.UndefOr[Boolean] = js.undefined
  ): TakeEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(maybe)) __obj.updateDynamic("maybe")(maybe.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeEffectDescriptor]
  }
}

