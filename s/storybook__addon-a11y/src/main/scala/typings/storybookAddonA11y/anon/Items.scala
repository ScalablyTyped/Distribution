package typings.storybookAddonA11y.anon

import typings.axeCore.mod.Result
import typings.react.mod.global.JSX.Element
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  var items: js.Array[Result]
  var label: Element
  var panel: Element
  var `type`: RuleType
}

object Items {
  @scala.inline
  def apply(items: js.Array[Result], label: Element, panel: Element, `type`: RuleType): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

