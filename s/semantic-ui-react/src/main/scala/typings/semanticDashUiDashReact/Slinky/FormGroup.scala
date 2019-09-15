package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormGroupMod.FormGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, widths, className */
object FormGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormGroupMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    unstackable: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormGroupProps
}

