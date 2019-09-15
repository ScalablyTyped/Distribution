package typings.atStorybookComponents.distSyntaxhighlighterSyntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProps extends js.Object {
  var padded: js.UndefOr[Boolean] = js.undefined
}

object PreProps {
  @scala.inline
  def apply(padded: js.UndefOr[Boolean] = js.undefined): PreProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded)
    __obj.asInstanceOf[PreProps]
  }
}

