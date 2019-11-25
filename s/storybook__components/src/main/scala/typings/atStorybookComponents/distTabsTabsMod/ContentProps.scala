package typings.atStorybookComponents.distTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
}

object ContentProps {
  @scala.inline
  def apply(absolute: js.UndefOr[Boolean] = js.undefined): ContentProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentProps]
  }
}

