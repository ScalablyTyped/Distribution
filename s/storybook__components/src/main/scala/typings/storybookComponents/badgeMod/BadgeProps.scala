package typings.storybookComponents.badgeMod

import typings.storybookComponents.storybookComponentsStrings.critical
import typings.storybookComponents.storybookComponentsStrings.negative
import typings.storybookComponents.storybookComponentsStrings.neutral
import typings.storybookComponents.storybookComponentsStrings.positive
import typings.storybookComponents.storybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeProps extends js.Object {
  var status: positive | negative | neutral | warning | critical = js.native
}

object BadgeProps {
  @scala.inline
  def apply(status: positive | negative | neutral | warning | critical): BadgeProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadgeProps]
  }
}

