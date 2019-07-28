package typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsMod

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.`object`
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.boolean
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.color
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.date
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.number
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.radios
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.select
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobOption[T] extends js.Object {
  var `type`: text | boolean | number | color | `object` | select | date | radios
  var value: T
}

object KnobOption {
  @scala.inline
  def apply[T](`type`: text | boolean | number | color | `object` | select | date | radios, value: T): KnobOption[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobOption[T]]
  }
}

