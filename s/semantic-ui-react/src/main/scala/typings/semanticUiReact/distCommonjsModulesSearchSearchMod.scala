package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.anon.PickSearchCategoryLayoutP
import typings.semanticUiReact.distCommonjsElementsInputInputMod.InputProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
import typings.semanticUiReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import typings.semanticUiReact.distCommonjsModulesSearchSearchResultsMod.SearchResultsProps
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesSearchSearchMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", JSImport.Default)
  @js.native
  open class default protected () extends Component[SearchProps, ComponentState, Any] {
    def this(props: SearchProps) = this()
    def this(props: SearchProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", JSImport.Default)
    @js.native
    val ^ : SearchComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", "default.Result")
    @js.native
    open class Result protected () extends Component[SearchResultProps, ComponentState, Any] {
      def this(props: SearchResultProps) = this()
      def this(props: SearchResultProps, context: Any) = this()
    }
    
    type _To = SearchComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: SearchComponent = ^
  }
  
  @js.native
  trait SearchComponent
    extends StObject
       with ComponentClass[SearchProps, ComponentState] {
    
    var Category: FC[SearchCategoryProps] = js.native
    
    var Result: ComponentClass[SearchResultProps, ComponentState] = js.native
    
    var Results: FC[SearchResultsProps] = js.native
  }
  
  trait SearchProps
    extends StObject
       with StrictSearchProps
       with /* key */ StringDictionary[Any]
  object SearchProps {
    
    inline def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
  }
  
  trait SearchResultData
    extends StObject
       with SearchProps {
    
    var result: Any
  }
  object SearchResultData {
    
    inline def apply(result: Any): SearchResultData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultData]
    }
    
    extension [Self <: SearchResultData](x: Self) {
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrictSearchProps extends StObject {
    
    // ------------------------------------
    // Style
    // ------------------------------------
    /** A search can have its results aligned to its left or right container edge. */
    var aligned: js.UndefOr[String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A search can display results from remote content ordered by categories. */
    var category: js.UndefOr[Boolean] = js.undefined
    
    // ------------------------------------
    // Rendering
    // ------------------------------------
    /**
      * Renders the SearchCategory layout.
      *
      * @param {object} props - The SearchCategoryLayout props object.
      * @returns {*} - Renderable SearchCategory layout.
      */
    var categoryLayoutRenderer: js.UndefOr[js.Function1[/* props */ PickSearchCategoryLayoutP, ReactElement]] = js.undefined
    
    /**
      * Renders the SearchCategory contents.
      *
      * @param {object} props - The SearchCategory props object.
      * @returns {*} - Renderable SearchCategory contents.
      */
    var categoryRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    // ------------------------------------
    // Behavior
    // ------------------------------------
    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Initial value. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** A search can have its results take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[Any] = js.undefined
    
    /** Shorthand for input element. */
    var input: js.UndefOr[SemanticShorthandItem[InputProps]] = js.undefined
    
    /** A search can show a loading indicator. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** Minimum characters to query for results. */
    var minCharacters: js.UndefOr[Double] = js.undefined
    
    /** Additional text for "No Results" message with less emphasis. */
    var noResultsDescription: js.UndefOr[ReactNode] = js.undefined
    
    /** Message to display when there are no results. */
    var noResultsMessage: js.UndefOr[ReactNode] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Called on focus.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onFocus: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps, Unit]
      ] = js.undefined
    
    /**
      * Called on mousedown.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onMouseDown: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps, Unit]
      ] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Called on search input change.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props, includes current value of search input.
      */
    var onSearchChange: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps, Unit]
      ] = js.undefined
    
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
      ] = js.undefined
    
    /** Controls whether or not the results menu is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** A search can show placeholder text when empty. */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Renders the SearchResult contents.
      *
      * @param {object} props - The SearchResult props object.
      * @returns {*} - Renderable SearchResult contents.
      */
    var resultRenderer: js.UndefOr[js.Function1[/* props */ SearchResultProps, ReactElement]] = js.undefined
    
    /**
      * One of:
      * - array of Search.Result props e.g. `{ title: '', description: '' }` or
      * - object of categories e.g. `{ name: '', results: [{ title: '', description: '' }]`
      */
    var results: js.UndefOr[js.Array[Any] | (Record[String, Any])] = js.undefined
    
    /** Whether the search should automatically select the first result after searching. */
    var selectFirstResult: js.UndefOr[Boolean] = js.undefined
    
    /** Whether a "no results" message should be shown if no results are found. */
    var showNoResults: js.UndefOr[Boolean] = js.undefined
    
    /** A search can have different sizes. */
    var size: js.UndefOr["mini" | "tiny" | "small" | "large" | "big" | "huge" | "massive"] = js.undefined
    
    /** Current value of the search input. Creates a controlled component. */
    var value: js.UndefOr[String] = js.undefined
  }
  object StrictSearchProps {
    
    inline def apply(): StrictSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSearchProps]
    }
    
    extension [Self <: StrictSearchProps](x: Self) {
      
      inline def setAligned(value: String): Self = StObject.set(x, "aligned", value.asInstanceOf[js.Any])
      
      inline def setAlignedUndefined: Self = StObject.set(x, "aligned", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCategory(value: Boolean): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryLayoutRenderer(value: /* props */ PickSearchCategoryLayoutP => ReactElement): Self = StObject.set(x, "categoryLayoutRenderer", js.Any.fromFunction1(value))
      
      inline def setCategoryLayoutRendererUndefined: Self = StObject.set(x, "categoryLayoutRenderer", js.undefined)
      
      inline def setCategoryRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = StObject.set(x, "categoryRenderer", js.Any.fromFunction1(value))
      
      inline def setCategoryRendererUndefined: Self = StObject.set(x, "categoryRenderer", js.undefined)
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInput(value: SemanticShorthandItem[InputProps]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputFunction3(
        value: (/* component */ ElementType[InputProps], InputProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "input", js.Any.fromFunction3(value))
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      inline def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
      
      inline def setNoResultsDescription(value: ReactNode): Self = StObject.set(x, "noResultsDescription", value.asInstanceOf[js.Any])
      
      inline def setNoResultsDescriptionUndefined: Self = StObject.set(x, "noResultsDescription", js.undefined)
      
      inline def setNoResultsMessage(value: ReactNode): Self = StObject.set(x, "noResultsMessage", value.asInstanceOf[js.Any])
      
      inline def setNoResultsMessageUndefined: Self = StObject.set(x, "noResultsMessage", js.undefined)
      
      inline def setOnBlur(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseDown(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnResultSelect(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ SearchResultData) => Unit
      ): Self = StObject.set(x, "onResultSelect", js.Any.fromFunction2(value))
      
      inline def setOnResultSelectUndefined: Self = StObject.set(x, "onResultSelect", js.undefined)
      
      inline def setOnSearchChange(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchProps) => Unit): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction2(value))
      
      inline def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
      
      inline def setOnSelectionChange(
        value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SearchResultData) => Unit
      ): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setResultRenderer(value: /* props */ SearchResultProps => ReactElement): Self = StObject.set(x, "resultRenderer", js.Any.fromFunction1(value))
      
      inline def setResultRendererUndefined: Self = StObject.set(x, "resultRenderer", js.undefined)
      
      inline def setResults(value: js.Array[Any] | (Record[String, Any])): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
      
      inline def setSelectFirstResultUndefined: Self = StObject.set(x, "selectFirstResult", js.undefined)
      
      inline def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
      
      inline def setShowNoResultsUndefined: Self = StObject.set(x, "showNoResults", js.undefined)
      
      inline def setSize(value: "mini" | "tiny" | "small" | "large" | "big" | "huge" | "massive"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
