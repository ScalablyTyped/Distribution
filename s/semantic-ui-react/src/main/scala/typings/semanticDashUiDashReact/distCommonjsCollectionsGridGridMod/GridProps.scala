package typings.semanticDashUiDashReact.distCommonjsCollectionsGridGridMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.equal
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.horizontally
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.internally
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.vertically
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends StrictGridProps
     with /* key */ StringDictionary[js.Any]

object GridProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    celled: Boolean | internally = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    columns: SemanticWIDTHS | equal = null,
    container: js.UndefOr[Boolean] = js.undefined,
    divided: Boolean | vertically = null,
    doubling: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    padded: Boolean | horizontally | vertically = null,
    relaxed: Boolean | very = null,
    reversed: GridReversedProp = null,
    stackable: js.UndefOr[Boolean] = js.undefined,
    stretched: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
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

