package typings.reactDashJss.reactDashJssMod

import typings.jss.jssMod.Classes
import typings.jss.jssMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStyles[S /* <: Styles[String] | ThemedStyles[_] */] extends js.Object {
  var classes: Classes[String]
}

object WithStyles {
  @scala.inline
  def apply[S /* <: Styles[String] | ThemedStyles[_] */](classes: Classes[String]): WithStyles[S] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithStyles[S]]
  }
}

