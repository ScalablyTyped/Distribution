package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps
  extends StrictTableRowProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object TableRowProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    cellAs: js.Any = null,
    cells: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsCollectionsTableTableCellMod.TableCellProps
    ] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    negative: js.UndefOr[scala.Boolean] = js.undefined,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.center | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null,
    warning: js.UndefOr[scala.Boolean] = js.undefined
  ): TableRowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (cellAs != null) __obj.updateDynamic("cellAs")(cellAs)
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[TableRowProps]
  }
}

