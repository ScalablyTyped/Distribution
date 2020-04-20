package typings.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Array[_]
  var effectId: Double
  var saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any
}

object AnonArgs {
  @scala.inline
  def apply(
    args: js.Array[_],
    effectId: Double,
    saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any
  ): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], saga = saga.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

