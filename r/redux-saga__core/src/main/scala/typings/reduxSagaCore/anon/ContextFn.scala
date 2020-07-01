package typings.reduxSagaCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */] extends js.Object {
  var context: Ctx
  var fn: Fn
}

object ContextFn {
  @scala.inline
  def apply[Ctx, /* <: js.ThisFunction1[/ * this * / Ctx, / * repeated * / js.Any, _] */ Fn](context: Ctx, fn: Fn): ContextFn[Ctx, Fn] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextFn[Ctx, Fn]]
  }
}

