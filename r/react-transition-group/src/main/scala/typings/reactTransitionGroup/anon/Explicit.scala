package typings.reactTransitionGroup.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explicit[ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, Unit] */] extends js.Object {
  var explicit: ExplicitRefHandler
  var `implicit`: ImplicitRefHandler
}

object Explicit {
  @scala.inline
  def apply[/* <: js.Function2[/ * node * / typings.std.HTMLElement, / * repeated * / js.Any, scala.Unit] */ ImplicitRefHandler, /* <: js.Function1[/ * repeated * / js.Any, scala.Unit] */ ExplicitRefHandler](explicit: ExplicitRefHandler, `implicit`: ImplicitRefHandler): Explicit[ImplicitRefHandler, ExplicitRefHandler] = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explicit[ImplicitRefHandler, ExplicitRefHandler]]
  }
}

