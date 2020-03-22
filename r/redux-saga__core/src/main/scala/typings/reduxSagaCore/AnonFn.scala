package typings.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */] extends js.Object {
  var context: Ctx
  var fn: Fn
}

object AnonFn {
  @scala.inline
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](context: Ctx, fn: Fn): AnonFn[Ctx, Fn] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFn[Ctx, Fn]]
  }
}

