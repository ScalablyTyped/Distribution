package typings.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var padded: js.UndefOr[Boolean] = js.native
}

object WrapperProps {
  @scala.inline
  def apply(bordered: js.UndefOr[Boolean] = js.undefined, padded: js.UndefOr[Boolean] = js.undefined): WrapperProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps]
  }
}

