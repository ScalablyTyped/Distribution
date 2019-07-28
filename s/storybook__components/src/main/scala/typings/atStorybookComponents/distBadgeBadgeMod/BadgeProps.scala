package typings.atStorybookComponents.distBadgeBadgeMod

import typings.atStorybookComponents.atStorybookComponentsStrings.critical
import typings.atStorybookComponents.atStorybookComponentsStrings.negative
import typings.atStorybookComponents.atStorybookComponentsStrings.neutral
import typings.atStorybookComponents.atStorybookComponentsStrings.positive
import typings.atStorybookComponents.atStorybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var status: positive | negative | neutral | warning | critical
}

object BadgeProps {
  @scala.inline
  def apply(status: positive | negative | neutral | warning | critical): BadgeProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadgeProps]
  }
}

