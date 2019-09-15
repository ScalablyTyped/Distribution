package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps
import typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionPanelMod.AccordionPanelProps
import typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionPanelMod.default
import typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AccordionPanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionPanelMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandItem[AccordionContentProps] = null,
    index: Double | String = null,
    onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit = null,
    title: SemanticShorthandItem[AccordionTitleProps] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AccordionPanelProps
}

