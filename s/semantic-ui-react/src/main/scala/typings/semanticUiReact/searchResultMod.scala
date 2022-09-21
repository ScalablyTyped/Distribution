package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchResultMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchResult", JSImport.Default)
  @js.native
  open class default protected () extends Component[SearchResultProps, ComponentState, Any] {
    def this(props: SearchResultProps) = this()
    def this(props: SearchResultProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchResult", JSImport.Default)
  @js.native
  val default: ComponentClass[SearchResultProps, ComponentState] = js.native
  
  trait SearchResultProps
    extends StObject
       with StrictSearchResultProps
       with /* key */ StringDictionary[Any]
  object SearchResultProps {
    
    inline def apply(title: String): SearchResultProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultProps]
    }
  }
  
  trait StrictSearchResultProps extends StObject {
    
    /** The item currently selected by keyboard shortcut. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Additional text with less emphasis. */
    var description: js.UndefOr[String] = js.undefined
    
    /** A unique identifier. */
    var id: js.UndefOr[Double | String] = js.undefined
    
    /** Add an image to the item. */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* data */ SearchResultProps, 
          Unit
        ]
      ] = js.undefined
    
    /** Customized text for price. */
    var price: js.UndefOr[String] = js.undefined
    
    /**
      * Renders the result contents.
      *
      * @param {object} props - The SearchResult props object.
      * @returns {*} - Renderable result contents.
      */
    var renderer: js.UndefOr[js.Function1[/* props */ SearchResultProps, js.Array[ReactElement]]] = js.undefined
    
    /** Display title. */
    var title: String
  }
  object StrictSearchResultProps {
    
    inline def apply(title: String): StrictSearchResultProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictSearchResultProps]
    }
    
    extension [Self <: StrictSearchResultProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setOnClick(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ SearchResultProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setRenderer(value: /* props */ SearchResultProps => js.Array[ReactElement]): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClass[SearchResultProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `searchResultMod.foo` */
  override def _to: ComponentClass[SearchResultProps, ComponentState] = default
}
