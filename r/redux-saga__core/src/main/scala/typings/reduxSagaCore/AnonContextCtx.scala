package typings.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextCtx[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */] extends js.Object {
  var context: Ctx
  var fn: Fn
}

object AnonContextCtx {
  @scala.inline
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](context: Ctx, fn: Fn): AnonContextCtx[Ctx, Fn] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextCtx[Ctx, Fn]]
  }
}

