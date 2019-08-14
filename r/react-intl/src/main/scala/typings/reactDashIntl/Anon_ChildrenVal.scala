package typings.reactDashIntl

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenVal extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  var value: Double
}

object Anon_ChildrenVal {
  @scala.inline
  def apply(value: Double, children: /* val */ String => ReactElement | Null = null): Anon_ChildrenVal = {
    val __obj = js.Dynamic.literal(value = value)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[Anon_ChildrenVal]
  }
}

