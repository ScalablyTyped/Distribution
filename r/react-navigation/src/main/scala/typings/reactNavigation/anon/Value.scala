package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: NavigationProp[_]
}

object Value {
  @scala.inline
  def apply(value: NavigationProp[_]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

