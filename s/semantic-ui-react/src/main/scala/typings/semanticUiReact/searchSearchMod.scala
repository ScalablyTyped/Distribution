package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.inputInputMod.InputProps
import typings.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typings.semanticUiReact.searchResultMod.SearchResultProps
import typings.semanticUiReact.searchResultsMod.SearchResultsProps
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchSearchMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SearchProps, ComponentState, js.Any] {
    def this(props: SearchProps) = this()
    def this(props: SearchProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", JSImport.Default)
    @js.native
    val ^ : SearchComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", "default.Result")
    @js.native
    class Result protected ()
      extends Component[SearchResultProps, ComponentState, js.Any] {
      def this(props: SearchResultProps) = this()
      def this(props: SearchResultProps, context: js.Any) = this()
    }
    
    type _To = SearchComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: SearchComponent = ^
  }
  
  @js.native
  trait SearchComponent extends ComponentClass[SearchProps, ComponentState] {
    
    var Category: StatelessComponent[SearchCategoryProps] = js.native
    
    var Result: ComponentClass[SearchResultProps, ComponentState] = js.native
    
    var Results: StatelessComponent[SearchResultsProps] = js.native
  }
  
  @js.native
  trait SearchProps
    extends StrictSearchProps
       with /* key */ StringDictionary[js.Any]
  object SearchProps {
    
    @scala.inline
    def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
  }
  
  @js.native
  trait SearchResultData extends SearchProps {
    
    var result: js.Any = js.native
  }
  object SearchResultData {
    
    @scala.inline
    def apply(result: js.Any): SearchResultData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultData]
    }
    
    @scala.inline
    implicit class SearchResultDataMutableBuilder[Self <: SearchResultData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrictSearchProps extends StObject {
    
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
    implicit class StrictSearchPropsMutableBuilder[Self <: StrictSearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAligned(value: String): Self = StObject.set(x, "aligned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignedUndefined: Self = StObject.set(x, "aligned", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCategory(value: Boolean): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryLayoutRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = StObject.set(x, "categoryLayoutRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCategoryLayoutRendererUndefined: Self = StObject.set(x, "categoryLayoutRenderer", js.undefined)
      
      @scala.inline
      def setCategoryRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = StObject.set(x, "categoryRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCategoryRendererUndefined: Self = StObject.set(x, "categoryRenderer", js.undefined)
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInput(value: SemanticShorthandItem[InputProps]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFunction3(
        value: (/* component */ ElementType[InputProps], InputProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "input", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
      
      @scala.inline
      def setNoResultsDescription(value: ReactNode): Self = StObject.set(x, "noResultsDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultsDescriptionUndefined: Self = StObject.set(x, "noResultsDescription", js.undefined)
      
      @scala.inline
      def setNoResultsMessage(value: ReactNode): Self = StObject.set(x, "noResultsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultsMessageUndefined: Self = StObject.set(x, "noResultsMessage", js.undefined)
      
      @scala.inline
      def setOnBlur(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnResultSelect(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ SearchResultData) => Unit
      ): Self = StObject.set(x, "onResultSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResultSelectUndefined: Self = StObject.set(x, "onResultSelect", js.undefined)
      
      @scala.inline
      def setOnSearchChange(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(
        value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchResultData) => Unit
      ): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setResultRenderer(value: /* props */ SearchResultProps => ReactElement): Self = StObject.set(x, "resultRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResultRendererUndefined: Self = StObject.set(x, "resultRenderer", js.undefined)
      
      @scala.inline
      def setResults(value: js.Array[_] | (Record[String, _])): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setResultsVarargs(value: js.Any*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectFirstResultUndefined: Self = StObject.set(x, "selectFirstResult", js.undefined)
      
      @scala.inline
      def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNoResultsUndefined: Self = StObject.set(x, "showNoResults", js.undefined)
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
