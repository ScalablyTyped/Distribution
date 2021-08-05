package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderImageMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderImage", JSImport.Default)
  @js.native
  val default: PlaceholderImageComponent = js.native
  
  type PlaceholderImageComponent = StatelessComponent[PlaceholderImageProps]
  
  trait PlaceholderImageProps
    extends StObject
       with StrictPlaceholderImageProps
       with /* key */ StringDictionary[js.Any]
  object PlaceholderImageProps {
    
    inline def apply(): PlaceholderImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderImageProps]
    }
  }
  
  trait StrictPlaceholderImageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** An image can modify size correctly with responsive styles. */
    var rectangular: js.UndefOr[Boolean] = js.undefined
    
    /** An image can modify size correctly with responsive styles. */
    var square: js.UndefOr[Boolean] = js.undefined
  }
  object StrictPlaceholderImageProps {
    
    inline def apply(): StrictPlaceholderImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderImageProps]
    }
    
    extension [Self <: StrictPlaceholderImageProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRectangular(value: Boolean): Self = StObject.set(x, "rectangular", value.asInstanceOf[js.Any])
      
      inline def setRectangularUndefined: Self = StObject.set(x, "rectangular", js.undefined)
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
  
  type _To = PlaceholderImageComponent
  
  /* This means you don't have to write `default`, but can instead just say `placeholderImageMod.foo` */
  override def _to: PlaceholderImageComponent = default
}
