package typings.reactJss.anon

import typings.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes[S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  var classes: typings.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]
}

object Classes {
  @scala.inline
  def apply[S, ClassNames](classes: typings.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): Classes[S, ClassNames] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[S, ClassNames]]
  }
}

