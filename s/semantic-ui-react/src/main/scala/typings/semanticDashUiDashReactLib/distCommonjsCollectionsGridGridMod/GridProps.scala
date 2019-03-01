package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsGridGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends StrictGridProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object GridProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    celled: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.internally = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    columns: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal = null,
    container: js.UndefOr[scala.Boolean] = js.undefined,
    divided: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically = null,
    doubling: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    padded: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.horizontally | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically = null,
    relaxed: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    reversed: GridReversedProp = null,
    stackable: js.UndefOr[scala.Boolean] = js.undefined,
    stretched: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (celled != null) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container)
    if (divided != null) __obj.updateDynamic("divided")(divided.asInstanceOf[js.Any])
    if (!js.isUndefined(doubling)) __obj.updateDynamic("doubling")(doubling)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (reversed != null) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable)
    if (!js.isUndefined(stretched)) __obj.updateDynamic("stretched")(stretched)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[GridProps]
  }
}

