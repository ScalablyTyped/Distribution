package typings
package atReduxDashSagaCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextFnCtx_1614896010[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, scala.Unit] */] extends js.Object {
  var context: Ctx
  var fn: Fn
}

object Anon_ContextFnCtx_1614896010 {
  @scala.inline
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, scala.Unit] */](context: Ctx, fn: Fn): Anon_ContextFnCtx_1614896010[Ctx, Fn] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextFnCtx_1614896010[Ctx, Fn]]
  }
}

