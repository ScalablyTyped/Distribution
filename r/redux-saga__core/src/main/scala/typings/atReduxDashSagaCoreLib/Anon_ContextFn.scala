package typings
package atReduxDashSagaCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */] extends js.Object {
  var context: Ctx
  var fn: Fn
}

object Anon_ContextFn {
  @scala.inline
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](context: Ctx, fn: Fn): Anon_ContextFn[Ctx, Fn] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextFn[Ctx, Fn]]
  }
}

