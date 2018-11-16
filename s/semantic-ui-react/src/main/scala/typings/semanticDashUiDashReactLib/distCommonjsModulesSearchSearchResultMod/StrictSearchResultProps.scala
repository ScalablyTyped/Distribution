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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
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

