package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchResultProps extends js.Object {
  /** The item currently selected by keyboard shortcut. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Additional text with less emphasis. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** A unique identifier. */
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Add an image to the item. */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ SearchResultProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Customized text for price. */
  var price: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Renders the result contents.
    *
    * @param {object} props - The SearchResult props object.
    * @returns {*} - Renderable result contents.
    */
  var renderer: js.UndefOr[
    js.Function1[/* props */ SearchResultProps, js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]]
  ] = js.undefined
  /** Display title. */
  var title: java.lang.String
}

object StrictSearchResultProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    description: java.lang.String = null,
    id: scala.Double | java.lang.String = null,
    image: java.lang.String = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ SearchResultProps, 
      scala.Unit
    ] = null,
    price: java.lang.String = null,
    renderer: js.Function1[/* props */ SearchResultProps, js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]] = null
  ): StrictSearchResultProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (price != null) __obj.updateDynamic("price")(price)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[StrictSearchResultProps]
  }
}

