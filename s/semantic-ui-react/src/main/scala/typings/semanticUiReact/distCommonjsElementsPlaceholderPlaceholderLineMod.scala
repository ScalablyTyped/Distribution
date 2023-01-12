package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.semanticUiReact.semanticUiReactStrings.`very long`
import typings.semanticUiReact.semanticUiReactStrings.`very short`
import typings.semanticUiReact.semanticUiReactStrings.full
import typings.semanticUiReact.semanticUiReactStrings.long
import typings.semanticUiReact.semanticUiReactStrings.medium
import typings.semanticUiReact.semanticUiReactStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsPlaceholderPlaceholderLineMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderLine", JSImport.Default)
  @js.native
  val default: PlaceholderLineComponent = js.native
  
  type PlaceholderLineComponent = FC[PlaceholderLineProps]
  
  trait PlaceholderLineProps
    extends StObject
       with StrictPlaceholderLineProps
       with /* key */ StringDictionary[Any]
  object PlaceholderLineProps {
    
    inline def apply(): PlaceholderLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderLineProps]
    }
  }
  
  trait StrictPlaceholderLineProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A line can specify how long its contents should appear. */
    var length: js.UndefOr[full | (`very long`) | long | medium | short | (`very short`)] = js.undefined
  }
  object StrictPlaceholderLineProps {
    
    inline def apply(): StrictPlaceholderLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderLineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictPlaceholderLineProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLength(value: full | (`very long`) | long | medium | short | (`very short`)): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  type _To = PlaceholderLineComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsPlaceholderPlaceholderLineMod.foo` */
  override def _to: PlaceholderLineComponent = default
}
