package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableCellMod.TableCellProps
import typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableRowMod.TableRowProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className, disabled */
object TableRow
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableRowMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    cellAs: js.Any = null,
    cells: SemanticShorthandCollection[TableCellProps] = null,
    error: js.UndefOr[Boolean] = js.undefined,
    negative: js.UndefOr[Boolean] = js.undefined,
    positive: js.UndefOr[Boolean] = js.undefined,
    textAlign: center | left | right = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    warning: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (cellAs != null) __obj.updateDynamic("cellAs")(cellAs)
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableRowProps
}

