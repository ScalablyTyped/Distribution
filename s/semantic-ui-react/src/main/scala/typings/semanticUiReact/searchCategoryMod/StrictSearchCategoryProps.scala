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

@js.native
trait StrictSearchCategoryProps extends js.Object {
  /** The item currently selected by keyboard shortcut. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /**
    * Renders the SearchCategory layout.
    *
    * @param {object} categoryContent - The Renderable SearchCategory contents.
    * @param {object} resultsContent - The Renderable SearchResult contents.
    * @returns {*} - Renderable SearchCategory layout.
    */
  var layoutRenderer: js.UndefOr[
    js.Function2[/* categoryContent */ ReactElement, /* resultsContent */ ReactElement, ReactElement]
  ] = js.native
  /** Display name. */
  var name: js.UndefOr[String] = js.native
  /**
    * Renders the category contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable category contents.
    */
  var renderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.native
  /** Array of Search.Result props. */
  var results: js.UndefOr[js.Array[ComponentClass[SearchResultProps, ComponentState]]] = js.native
}

object StrictSearchCategoryProps {
  @scala.inline
  def apply(): StrictSearchCategoryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictSearchCategoryProps]
  }
  @scala.inline
  implicit class StrictSearchCategoryPropsOps[Self <: StrictSearchCategoryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setLayoutRenderer(value: (/* categoryContent */ ReactElement, /* resultsContent */ ReactElement) => ReactElement): Self = this.set("layoutRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLayoutRenderer: Self = this.set("layoutRenderer", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = this.set("renderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setResultsVarargs(value: (ComponentClass[SearchResultProps, ComponentState])*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[ComponentClass[SearchResultProps, ComponentState]]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

