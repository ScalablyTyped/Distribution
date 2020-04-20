package typings.reduxSagaCore.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEffectDescriptor extends js.Object {
  var args: js.Array[_]
  def selector(state: js.Any, args: js.Any*): js.Any
}

object SelectEffectDescriptor {
  @scala.inline
  def apply(args: js.Array[_], selector: (js.Any, /* repeated */ js.Any) => js.Any): SelectEffectDescriptor = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selector = js.Any.fromFunction2(selector))
    __obj.asInstanceOf[SelectEffectDescriptor]
  }
}

