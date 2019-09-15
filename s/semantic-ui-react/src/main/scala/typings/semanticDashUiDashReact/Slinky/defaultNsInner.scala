package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerInnerMod.DimmerInnerProps
import typings.semanticDashUiDashReact.distCommonjsModulesDimmerMod.defaultNs.Inner
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className, disabled */
object defaultNsInner
  extends ExternalComponentWithAttributesWithRefType[tag.type, Inner] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsModulesDimmerMod.defaultNs.Inner].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ DimmerInnerProps) => Unit = null,
    onClickOutside: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ DimmerInnerProps) => Unit = null,
    page: js.UndefOr[Boolean] = js.undefined,
    simple: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: bottom | top = null
  ): BuildingComponent[tag.type, Inner] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction2(onClickOutside))
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DimmerInnerProps
}

