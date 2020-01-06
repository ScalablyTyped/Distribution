package typings.reactDashJss.reactDashJssMod

import typings.jss.jssMod.Classes
import typings.jss.jssMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends js.Object {
  var classes: Classes[String]
}

object WithStylesProps {
  @scala.inline
  def apply[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](classes: Classes[String]): WithStylesProps[S] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithStylesProps[S]]
  }
}

