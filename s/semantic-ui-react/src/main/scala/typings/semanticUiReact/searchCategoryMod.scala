package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.searchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchCategoryMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategory", JSImport.Default)
  @js.native
  val default: StatelessComponent[SearchCategoryProps] = js.native
  
  trait SearchCategoryProps
    extends StObject
       with StrictSearchCategoryProps
       with /* key */ StringDictionary[js.Any]
  object SearchCategoryProps {
    
    inline def apply(): SearchCategoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchCategoryProps]
    }
  }
  
  trait StrictSearchCategoryProps extends StObject {
    
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
    
    inline def apply(): StrictSearchCategoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSearchCategoryProps]
    }
    
    extension [Self <: StrictSearchCategoryProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setLayoutRenderer(value: (/* categoryContent */ ReactElement, /* resultsContent */ ReactElement) => ReactElement): Self = StObject.set(x, "layoutRenderer", js.Any.fromFunction2(value))
      
      inline def setLayoutRendererUndefined: Self = StObject.set(x, "layoutRenderer", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setResults(value: js.Array[ComponentClass[SearchResultProps, ComponentState]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: (ComponentClass[SearchResultProps, ComponentState])*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  type _To = StatelessComponent[SearchCategoryProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchCategoryMod.foo` */
  override def _to: StatelessComponent[SearchCategoryProps] = default
}
