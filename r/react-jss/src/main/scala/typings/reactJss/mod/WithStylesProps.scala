package typings.reactJss.mod

import typings.jss.mod.Classes
import typings.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends js.Object {
  var classes: Classes[/* keyof S */ String]
}

object WithStylesProps {
  @scala.inline
  def apply[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](classes: Classes[/* keyof S */ String]): WithStylesProps[S] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesProps[S]]
  }
}

