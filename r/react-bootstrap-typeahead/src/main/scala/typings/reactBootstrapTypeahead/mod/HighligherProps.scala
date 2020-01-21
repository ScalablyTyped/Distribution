package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighligherProps extends js.Object {
  var children: ReactNode
  var search: js.UndefOr[String] = js.undefined
}

object HighligherProps {
  @scala.inline
  def apply(children: ReactNode = null, search: String = null): HighligherProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighligherProps]
  }
}

