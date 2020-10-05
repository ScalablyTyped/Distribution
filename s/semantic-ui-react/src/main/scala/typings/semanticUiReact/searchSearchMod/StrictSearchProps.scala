package typings.semanticUiReact.searchSearchMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.inputInputMod.InputProps
import typings.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typings.semanticUiReact.searchResultMod.SearchResultProps
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictSearchProps extends js.Object {
  // ------------------------------------
  // Style
  // ------------------------------------
  /** A search can have its results aligned to its left or right container edge. */
  var aligned: js.UndefOr[String] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A search can display results from remote content ordered by categories. */
  var category: js.UndefOr[Boolean] = js.native
  // ------------------------------------
  // Rendering
  // ------------------------------------
  /**
    * Renders the SearchCategory layout.
    *
    * @param {object} categoryContent - The Renderable SearchCategory contents.
    * @param {object} resultsContent - The Renderable SearchResult contents.
    * @returns {*} - Renderable SearchCategory layout.
    */
  var categoryLayoutRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.native
  /**
    * Renders the SearchCategory contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable SearchCategory contents.
    */
  var categoryRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  // ------------------------------------
  // Behavior
  // ------------------------------------
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  /** Initial value. */
  var defaultValue: js.UndefOr[String] = js.native
  /** A search can have its results take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.native
  /** Shorthand for input element. */
  var input: js.UndefOr[SemanticShorthandItem[InputProps]] = js.native
  /** A search can show a loading indicator. */
  var loading: js.UndefOr[Boolean] = js.native
  /** Minimum characters to query for results. */
  var minCharacters: js.UndefOr[Double] = js.native
  /** Additional text for "No Results" message with less emphasis. */
  var noResultsDescription: js.UndefOr[ReactNode] = js.native
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[ReactNode] = js.native
  // ------------------------------------
  // Callbacks
  // ------------------------------------
  /**
    * Called on blur.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called on focus.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called on mousedown.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called when a result is selected.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onResultSelect: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ SearchResultData, 
      Unit
    ]
  ] = js.native
  /**
    * Called on search input change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props, includes current value of search input.
    */
  var onSearchChange: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called when the active selection index is changed.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onSelectionChange: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* data */ SearchResultData, 
      Unit
    ]
  ] = js.native
  /** Controls whether or not the results menu is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * Renders the SearchResult contents.
    *
    * @param {object} props - The SearchResult props object.
    * @returns {*} - Renderable SearchResult contents.
    */
  var resultRenderer: js.UndefOr[js.Function1[/* props */ SearchResultProps, ReactElement]] = js.native
  /**
    * One of:
    * - array of Search.Result props e.g. `{ title: '', description: '' }` or
    * - object of categories e.g. `{ name: '', results: [{ title: '', description: '' }]`
    */
  var results: js.UndefOr[js.Array[_] | (Record[String, _])] = js.native
  /** Whether the search should automatically select the first result after searching. */
  var selectFirstResult: js.UndefOr[Boolean] = js.native
  /** Whether a "no results" message should be shown if no results are found. */
  var showNoResults: js.UndefOr[Boolean] = js.native
  /** A search can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
  /** Current value of the search input. Creates a controlled component. */
  var value: js.UndefOr[String] = js.native
}

object StrictSearchProps {
  @scala.inline
  def apply(): StrictSearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictSearchProps]
  }
  @scala.inline
  implicit class StrictSearchPropsOps[Self <: StrictSearchProps] (val x: Self) extends AnyVal {
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
    def setAligned(value: String): Self = this.set("aligned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAligned: Self = this.set("aligned", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCategory(value: Boolean): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setCategoryLayoutRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = this.set("categoryLayoutRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCategoryLayoutRenderer: Self = this.set("categoryLayoutRenderer", js.undefined)
    @scala.inline
    def setCategoryRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = this.set("categoryRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCategoryRenderer: Self = this.set("categoryRenderer", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInputFunction3(
      value: (/* component */ ReactType[InputProps], InputProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("input", js.Any.fromFunction3(value))
    @scala.inline
    def setInput(value: SemanticShorthandItem[InputProps]): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMinCharacters(value: Double): Self = this.set("minCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCharacters: Self = this.set("minCharacters", js.undefined)
    @scala.inline
    def setNoResultsDescription(value: ReactNode): Self = this.set("noResultsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResultsDescription: Self = this.set("noResultsDescription", js.undefined)
    @scala.inline
    def setNoResultsMessage(value: ReactNode): Self = this.set("noResultsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResultsMessage: Self = this.set("noResultsMessage", js.undefined)
    @scala.inline
    def setOnBlur(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = this.set("onBlur", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnFocus(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = this.set("onFocus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnMouseDown(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = this.set("onMouseDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnResultSelect(
      value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ SearchResultData) => Unit
    ): Self = this.set("onResultSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnResultSelect: Self = this.set("onResultSelect", js.undefined)
    @scala.inline
    def setOnSearchChange(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = this.set("onSearchChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearchChange: Self = this.set("onSearchChange", js.undefined)
    @scala.inline
    def setOnSelectionChange(
      value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchResultData) => Unit
    ): Self = this.set("onSelectionChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setResultRenderer(value: /* props */ SearchResultProps => ReactElement): Self = this.set("resultRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResultRenderer: Self = this.set("resultRenderer", js.undefined)
    @scala.inline
    def setResultsVarargs(value: js.Any*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[_] | (Record[String, _])): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setSelectFirstResult(value: Boolean): Self = this.set("selectFirstResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectFirstResult: Self = this.set("selectFirstResult", js.undefined)
    @scala.inline
    def setShowNoResults(value: Boolean): Self = this.set("showNoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNoResults: Self = this.set("showNoResults", js.undefined)
    @scala.inline
    def setSize(value: mini | tiny | small | large | big | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

