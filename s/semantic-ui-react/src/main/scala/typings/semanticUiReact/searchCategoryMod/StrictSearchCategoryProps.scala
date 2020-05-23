package typings.semanticUiReact.searchCategoryMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.searchResultMod.SearchResultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchCategoryProps extends js.Object {
  /** The item currently selected by keyboard shortcut. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /**
    * Renders the SearchCategory layout.
    *
    * @param {object} categoryContent - The Renderable SearchCategory contents.
    * @param {object} resultsContent - The Renderable SearchResult contents.
    * @returns {*} - Renderable SearchCategory layout.
    */
  var layoutRenderer: js.UndefOr[
    js.Function2[/* categoryContent */ ReactElement, /* resultsContent */ ReactElement, ReactElement]
  ] = js.undefined
  /** Display name. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Renders the category contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable category contents.
    */
  var renderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.undefined
  /** Array of Search.Result props. */
  var results: js.UndefOr[js.Array[ComponentClass[SearchResultProps, ComponentState]]] = js.undefined
}

object StrictSearchCategoryProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    layoutRenderer: (/* categoryContent */ ReactElement, /* resultsContent */ ReactElement) => ReactElement = null,
    name: String = null,
    renderer: /* props */ SearchCategoryProps => ReactElement = null,
    results: js.Array[ComponentClass[SearchResultProps, ComponentState]] = null
  ): StrictSearchCategoryProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (layoutRenderer != null) __obj.updateDynamic("layoutRenderer")(js.Any.fromFunction2(layoutRenderer))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSearchCategoryProps]
  }
}

