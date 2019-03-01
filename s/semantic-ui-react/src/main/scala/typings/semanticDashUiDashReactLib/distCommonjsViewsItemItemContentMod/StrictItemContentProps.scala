package typings
package semanticDashUiDashReactLib.distCommonjsViewsItemItemContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictItemContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Shorthand for ItemDescription component. */
  var description: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
    ]
  ] = js.undefined
  /** Shorthand for ItemExtra component. */
  var extra: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsItemItemExtraMod.ItemExtraProps]
  ] = js.undefined
  /** Shorthand for ItemHeader component. */
  var header: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps]
  ] = js.undefined
  /** Shorthand for ItemMeta component. */
  var meta: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsItemItemMetaMod.ItemMetaProps]
  ] = js.undefined
  /** Content can specify its vertical alignment. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictItemContentProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    description: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
    ] = null,
    extra: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsItemItemExtraMod.ItemExtraProps] = null,
    header: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps] = null,
    meta: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsItemItemMetaMod.ItemMetaProps] = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
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

