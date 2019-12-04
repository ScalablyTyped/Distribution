package typings.atStorybookAddonDashA11y

import typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod.RuleType
import typings.axeDashCore.axeDashCoreMod.Result
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.Array[Result]
  var label: Element
  var panel: Element
  var `type`: RuleType
}

object Anon_Items {
  @scala.inline
  def apply(items: js.Array[Result], label: Element, panel: Element, `type`: RuleType): Anon_Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items]
  }
}

