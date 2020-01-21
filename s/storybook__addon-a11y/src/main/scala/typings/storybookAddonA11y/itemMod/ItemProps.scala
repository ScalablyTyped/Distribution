package typings.storybookAddonA11y.itemMod

import typings.axeCore.mod.Result
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps extends js.Object {
  var item: Result
  var `type`: RuleType
}

object ItemProps {
  @scala.inline
  def apply(item: Result, `type`: RuleType): ItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
}

