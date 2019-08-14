package typings.reactDashIntl

import typings.react.reactMod.ReactElement
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  var value: js.UndefOr[String | Double | Date] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: /* val */ String => ReactElement | Null = null, value: String | Double | Date = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

