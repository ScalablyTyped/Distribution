package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighligherProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var search: java.lang.String
}

object HighligherProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode, search: java.lang.String): HighligherProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[HighligherProps]
  }
}

