package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighligherProps extends js.Object {
  var children: ReactNode
  var search: js.UndefOr[String] = js.undefined
}

object HighligherProps {
  @scala.inline
  def apply(children: ReactNode, search: String = null): HighligherProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[HighligherProps]
  }
}

