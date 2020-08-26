package typings.storybookAddonA11y.anon

import typings.axeCore.mod.NodeResult
import typings.std.HTMLElement
import typings.std.Map
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import typings.storybookAddonA11y.highlightToggleMod.HighlightedElementData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-a11y.@storybook/addon-a11y/dist/components/Report/HighlightToggle.ToggleProps> */
@js.native
trait ReadonlyToggleProps extends js.Object {
  val addElement: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  val elementsToHighlight: js.Array[NodeResult] = js.native
  val highlightedElementsMap: js.UndefOr[Map[HTMLElement, HighlightedElementData]] = js.native
  val indeterminate: js.UndefOr[Boolean] = js.native
  val isToggledOn: js.UndefOr[Boolean] = js.native
  val toggleId: js.UndefOr[String] = js.native
  val `type`: RuleType = js.native
}

object ReadonlyToggleProps {
  @scala.inline
  def apply(elementsToHighlight: js.Array[NodeResult], `type`: RuleType): ReadonlyToggleProps = {
    val __obj = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToggleProps]
  }
  @scala.inline
  implicit class ReadonlyTogglePropsOps[Self <: ReadonlyToggleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElementsToHighlightVarargs(value: NodeResult*): Self = this.set("elementsToHighlight", js.Array(value :_*))
    @scala.inline
    def setElementsToHighlight(value: js.Array[NodeResult]): Self = this.set("elementsToHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RuleType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddElement(value: /* data */ js.Any => Unit): Self = this.set("addElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddElement: Self = this.set("addElement", js.undefined)
    @scala.inline
    def setHighlightedElementsMap(value: Map[HTMLElement, HighlightedElementData]): Self = this.set("highlightedElementsMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedElementsMap: Self = this.set("highlightedElementsMap", js.undefined)
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    @scala.inline
    def setIsToggledOn(value: Boolean): Self = this.set("isToggledOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsToggledOn: Self = this.set("isToggledOn", js.undefined)
    @scala.inline
    def setToggleId(value: String): Self = this.set("toggleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleId: Self = this.set("toggleId", js.undefined)
  }
  
}

