package typings.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreProps extends js.Object {
  var padded: js.UndefOr[Boolean] = js.native
}

object PreProps {
  @scala.inline
  def apply(padded: js.UndefOr[Boolean] = js.undefined): PreProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProps]
  }
}

