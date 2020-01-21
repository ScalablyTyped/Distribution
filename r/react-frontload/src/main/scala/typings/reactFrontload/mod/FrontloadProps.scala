package typings.reactFrontload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrontloadProps extends js.Object {
  var noServerRender: js.UndefOr[Boolean] = js.undefined
}

object FrontloadProps {
  @scala.inline
  def apply(noServerRender: js.UndefOr[Boolean] = js.undefined): FrontloadProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noServerRender)) __obj.updateDynamic("noServerRender")(noServerRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrontloadProps]
  }
}

