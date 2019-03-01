package typings
package reactDashFrontloadLib.reactDashFrontloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrontloadProps extends js.Object {
  var noServerRender: js.UndefOr[scala.Boolean] = js.undefined
}

object FrontloadProps {
  @scala.inline
  def apply(noServerRender: js.UndefOr[scala.Boolean] = js.undefined): FrontloadProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noServerRender)) __obj.updateDynamic("noServerRender")(noServerRender)
    __obj.asInstanceOf[FrontloadProps]
  }
}

