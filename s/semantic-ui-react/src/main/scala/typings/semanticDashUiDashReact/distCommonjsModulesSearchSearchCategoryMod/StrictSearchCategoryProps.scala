package typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchCategoryMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
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
    name: String = null,
    renderer: /* props */ SearchCategoryProps => ReactElement = null,
    results: js.Array[ComponentClass[SearchResultProps, ComponentState]] = null
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

