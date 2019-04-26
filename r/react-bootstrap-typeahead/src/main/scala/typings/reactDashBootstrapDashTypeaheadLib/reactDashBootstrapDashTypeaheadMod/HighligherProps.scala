package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighligherProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var search: js.UndefOr[java.lang.String] = js.undefined
}

object HighligherProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, search: java.lang.String = null): HighligherProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[HighligherProps]
  }
}

