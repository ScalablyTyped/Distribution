package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/tag/components/tag-group.js
trait TagGroupModifierProps extends js.Object {
  var gapless: js.UndefOr[Boolean] = js.undefined
}

object TagGroupModifierProps {
  @scala.inline
  def apply(gapless: js.UndefOr[Boolean] = js.undefined): TagGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gapless)) __obj.updateDynamic("gapless")(gapless.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagGroupModifierProps]
  }
}

