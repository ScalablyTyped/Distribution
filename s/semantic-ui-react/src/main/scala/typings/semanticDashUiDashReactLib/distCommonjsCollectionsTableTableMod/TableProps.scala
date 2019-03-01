package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps
  extends StrictTableProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object TableProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom = null,
    basic: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    celled: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.internally = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    collapsing: js.UndefOr[scala.Boolean] = js.undefined,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    columns: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    compact: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    definition: js.UndefOr[scala.Boolean] = js.undefined,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    footerRow: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod.TableRowProps] = null,
    headerRow: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod.TableRowProps] = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    padded: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    renderBodyRow: js.Function2[/* data */ js.Any, /* index */ scala.Double, _] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    singleLine: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    stackable: js.UndefOr[scala.Boolean] = js.undefined,
    striped: js.UndefOr[scala.Boolean] = js.undefined,
    structured: js.UndefOr[scala.Boolean] = js.undefined,
    tableData: js.Array[_] = null,
    textAlign: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.center | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    unstackable: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (celled != null) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(collapsing)) __obj.updateDynamic("collapsing")(collapsing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(definition)) __obj.updateDynamic("definition")(definition)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (footerRow != null) __obj.updateDynamic("footerRow")(footerRow.asInstanceOf[js.Any])
    if (headerRow != null) __obj.updateDynamic("headerRow")(headerRow.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (renderBodyRow != null) __obj.updateDynamic("renderBodyRow")(renderBodyRow)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (!js.isUndefined(structured)) __obj.updateDynamic("structured")(structured)
    if (tableData != null) __obj.updateDynamic("tableData")(tableData)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[TableProps]
  }
}

