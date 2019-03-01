package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEffectDescriptor extends js.Object {
  var args: js.Array[_]
  def selector(state: js.Any, args: js.Any*): js.Any
}

object SelectEffectDescriptor {
  @scala.inline
  def apply(args: js.Array[_], selector: js.Function2[js.Any, /* repeated */ js.Any, js.Any]): SelectEffectDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[SelectEffectDescriptor]
  }
}

