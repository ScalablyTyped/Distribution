package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchCategoryProps extends js.Object {
  /** The item currently selected by keyboard shortcut. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Renders the category contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable category contents.
    */
  var renderer: js.UndefOr[
    js.Function1[/* props */ SearchCategoryProps, reactLib.reactMod.ReactNs.ReactElement[_]]
  ] = js.undefined
  /** Array of Search.Result props. */
  var results: js.UndefOr[
    js.Array[
      reactLib.reactMod.ReactNs.ComponentClass[
        semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps, 
        reactLib.reactMod.ReactNs.ComponentState
      ]
    ]
  ] = js.undefined
}

object StrictSearchCategoryProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    name: java.lang.String = null,
    renderer: /* props */ SearchCategoryProps => reactLib.reactMod.ReactNs.ReactElement[_] = null,
    results: js.Array[
      reactLib.reactMod.ReactNs.ComponentClass[
        semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps, 
        reactLib.reactMod.ReactNs.ComponentState
      ]
    ] = null
  ): StrictSearchCategoryProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[StrictSearchCategoryProps]
  }
}

