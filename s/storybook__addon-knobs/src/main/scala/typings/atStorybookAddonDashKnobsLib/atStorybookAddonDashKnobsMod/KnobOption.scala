package typings
package atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobOption[T] extends js.Object {
  var `type`: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.text | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.boolean | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.number | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.color | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`object` | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.select | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.date | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.radios
  var value: T
}

object KnobOption {
  @scala.inline
  def apply[T](
    `type`: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.text | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.boolean | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.number | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.color | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`object` | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.select | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.date | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.radios,
    value: T
  ): KnobOption[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobOption[T]]
  }
}

