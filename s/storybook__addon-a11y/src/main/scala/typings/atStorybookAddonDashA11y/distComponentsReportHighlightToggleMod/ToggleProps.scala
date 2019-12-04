package typings.atStorybookAddonDashA11y.distComponentsReportHighlightToggleMod

import typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod.RuleType
import typings.axeDashCore.axeDashCoreMod.NodeResult
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends js.Object {
  var addElement: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var elementsToHighlight: js.Array[NodeResult]
  var highlightedElementsMap: js.UndefOr[Map[HTMLElement, HighlightedElementData]] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var isToggledOn: js.UndefOr[Boolean] = js.undefined
  var toggleId: js.UndefOr[String] = js.undefined
  var `type`: RuleType
}

object ToggleProps {
  @scala.inline
  def apply(
    elementsToHighlight: js.Array[NodeResult],
    `type`: RuleType,
    addElement: /* data */ js.Any => Unit = null,
    highlightedElementsMap: Map[HTMLElement, HighlightedElementData] = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    isToggledOn: js.UndefOr[Boolean] = js.undefined,
    toggleId: String = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (addElement != null) __obj.updateDynamic("addElement")(js.Any.fromFunction1(addElement))
    if (highlightedElementsMap != null) __obj.updateDynamic("highlightedElementsMap")(highlightedElementsMap.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (!js.isUndefined(isToggledOn)) __obj.updateDynamic("isToggledOn")(isToggledOn.asInstanceOf[js.Any])
    if (toggleId != null) __obj.updateDynamic("toggleId")(toggleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}

