package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.StepGroupProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepMod.StepProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tablet
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, widths, className */
object StepGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[StepProps] = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    stackable: tablet = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stackable != null) __obj.updateDynamic("stackable")(stackable)
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepGroupProps
}

