package typings.rbx.sectionSectionMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

