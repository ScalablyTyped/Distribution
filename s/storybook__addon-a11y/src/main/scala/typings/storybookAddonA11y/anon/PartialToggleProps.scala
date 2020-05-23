package typings.storybookAddonA11y.anon

import typings.axeCore.mod.NodeResult
import typings.std.HTMLElement
import typings.std.Map
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import typings.storybookAddonA11y.highlightToggleMod.HighlightedElementData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-a11y.@storybook/addon-a11y/dist/components/Report/HighlightToggle.ToggleProps> */
trait PartialToggleProps extends js.Object {
  var addElement: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var elementsToHighlight: js.UndefOr[js.Array[NodeResult]] = js.undefined
  var highlightedElementsMap: js.UndefOr[Map[HTMLElement, HighlightedElementData]] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var isToggledOn: js.UndefOr[Boolean] = js.undefined
  var toggleId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[RuleType] = js.undefined
}

object PartialToggleProps {
  @scala.inline
  def apply(
    addElement: /* data */ js.Any => Unit = null,
    elementsToHighlight: js.Array[NodeResult] = null,
    highlightedElementsMap: Map[HTMLElement, HighlightedElementData] = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    isToggledOn: js.UndefOr[Boolean] = js.undefined,
    toggleId: String = null,
    `type`: RuleType = null
  ): PartialToggleProps = {
    val __obj = js.Dynamic.literal()
    if (addElement != null) __obj.updateDynamic("addElement")(js.Any.fromFunction1(addElement))
    if (elementsToHighlight != null) __obj.updateDynamic("elementsToHighlight")(elementsToHighlight.asInstanceOf[js.Any])
    if (highlightedElementsMap != null) __obj.updateDynamic("highlightedElementsMap")(highlightedElementsMap.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isToggledOn)) __obj.updateDynamic("isToggledOn")(isToggledOn.get.asInstanceOf[js.Any])
    if (toggleId != null) __obj.updateDynamic("toggleId")(toggleId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialToggleProps]
  }
}

