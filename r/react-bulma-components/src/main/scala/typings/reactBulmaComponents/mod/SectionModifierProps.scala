package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Section ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/section/section.js
trait SectionModifierProps extends js.Object {
  var size: js.UndefOr[medium | large] = js.undefined
}

object SectionModifierProps {
  @scala.inline
  def apply(size: medium | large = null): SectionModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionModifierProps]
  }
}

