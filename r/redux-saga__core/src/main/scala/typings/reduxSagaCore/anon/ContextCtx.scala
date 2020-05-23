package typings.reduxSagaCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextCtx[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */] extends js.Object {
  var context: Ctx
  var fn: Fn
}

object ContextCtx {
  @scala.inline
  def apply[Ctx, Fn](context: Ctx, fn: Fn): ContextCtx[Ctx, Fn] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextCtx[Ctx, Fn]]
  }
}

