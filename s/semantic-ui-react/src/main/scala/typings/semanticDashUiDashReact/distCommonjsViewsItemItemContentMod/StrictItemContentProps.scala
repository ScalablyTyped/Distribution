package typings.semanticDashUiDashReact.distCommonjsViewsItemItemContentMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictItemContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Shorthand for ItemDescription component. */
  var description: js.UndefOr[SemanticShorthandItem[ItemDescriptionProps]] = js.undefined
  /** Shorthand for ItemExtra component. */
  var extra: js.UndefOr[SemanticShorthandItem[ItemExtraProps]] = js.undefined
  /** Shorthand for ItemHeader component. */
  var header: js.UndefOr[SemanticShorthandItem[ItemHeaderProps]] = js.undefined
  /** Shorthand for ItemMeta component. */
  var meta: js.UndefOr[SemanticShorthandItem[ItemMetaProps]] = js.undefined
  /** Content can specify its vertical alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictItemContentProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[ItemDescriptionProps] = null,
    extra: SemanticShorthandItem[ItemExtraProps] = null,
    header: SemanticShorthandItem[ItemHeaderProps] = null,
    meta: SemanticShorthandItem[ItemMetaProps] = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
  ): StrictItemContentProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[StrictItemContentProps]
  }
}

