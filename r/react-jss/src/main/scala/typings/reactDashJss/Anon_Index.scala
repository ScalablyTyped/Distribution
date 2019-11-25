package typings.reactDashJss

import typings.theming.themingMod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T] extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var theming: js.UndefOr[Theming[T]] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply[T](index: Int | Double = null, name: String = null, theming: Theming[T] = null): Anon_Index[T] = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (theming != null) __obj.updateDynamic("theming")(theming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index[T]]
  }
}

