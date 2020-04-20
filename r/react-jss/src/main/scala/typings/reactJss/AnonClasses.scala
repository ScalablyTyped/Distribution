package typings.reactJss

import typings.jss.mod.Classes
import typings.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClasses[S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  var classes: Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]
}

object AnonClasses {
  @scala.inline
  def apply[S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */](classes: Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): AnonClasses[S, ClassNames] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses[S, ClassNames]]
  }
}

