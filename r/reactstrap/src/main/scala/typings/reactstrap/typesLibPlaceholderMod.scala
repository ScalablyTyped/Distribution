package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibPlaceholderMod {
  
  @JSImport("reactstrap/types/lib/Placeholder", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PlaceholderProps, js.Object, Any]
  
  type Placeholder = Component[PlaceholderProps, js.Object, Any]
  
  trait PlaceholderProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var widths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PlaceholderProps {
    
    inline def apply(): PlaceholderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderProps]
    }
    
    extension [Self <: PlaceholderProps](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setWidths(value: js.Array[String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWidthsVarargs(value: String*): Self = StObject.set(x, "widths", js.Array(value*))
    }
  }
}
