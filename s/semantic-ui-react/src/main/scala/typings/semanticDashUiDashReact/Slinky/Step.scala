package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepMod.default
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepDescriptionMod.StepDescriptionProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepMod.StepProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepTitleMod.StepTitleProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className, disabled, href */
object Step
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsElementsStepMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    completed: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[StepDescriptionProps] = null,
    icon: SemanticShorthandItem[IconProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ StepProps) => Unit = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    title: SemanticShorthandItem[StepTitleProps] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepProps
}

