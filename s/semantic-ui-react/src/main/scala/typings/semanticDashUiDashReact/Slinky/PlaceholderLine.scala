package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.PlaceholderLineProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very long`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very short`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.full
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.long
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object PlaceholderLine
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PlaceholderLineProps
}

