package typings.storybookAddonA11y

import typings.axeCore.mod.Result
import typings.react.mod._Global_.JSX.Element
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.Array[Result]
  var label: Element
  var panel: Element
  var `type`: RuleType
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[Result], label: Element, panel: Element, `type`: RuleType): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

