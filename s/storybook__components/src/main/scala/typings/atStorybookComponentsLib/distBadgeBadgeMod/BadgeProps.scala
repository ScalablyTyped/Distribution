package typings
package atStorybookComponentsLib.distBadgeBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var status: atStorybookComponentsLib.atStorybookComponentsLibStrings.positive | atStorybookComponentsLib.atStorybookComponentsLibStrings.negative | atStorybookComponentsLib.atStorybookComponentsLibStrings.neutral | atStorybookComponentsLib.atStorybookComponentsLibStrings.warning | atStorybookComponentsLib.atStorybookComponentsLibStrings.critical
}

object BadgeProps {
  @scala.inline
  def apply(
    status: atStorybookComponentsLib.atStorybookComponentsLibStrings.positive | atStorybookComponentsLib.atStorybookComponentsLibStrings.negative | atStorybookComponentsLib.atStorybookComponentsLibStrings.neutral | atStorybookComponentsLib.atStorybookComponentsLibStrings.warning | atStorybookComponentsLib.atStorybookComponentsLibStrings.critical
  ): BadgeProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadgeProps]
  }
}

