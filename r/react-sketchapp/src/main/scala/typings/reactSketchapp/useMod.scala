package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Use", JSImport.Default)
  @js.native
  class default ()
    extends Component[UseProps, js.Object, js.Any]
  
  type Use = Component[UseProps, js.Object, js.Any]
  
  trait UseProps
    extends StObject
       with PathProps {
    
    // Just for reusing `Symbol`
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var href: String
    
    var width: js.UndefOr[NumberProp] = js.undefined
  }
  object UseProps {
    
    inline def apply(href: String): UseProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseProps]
    }
    
    extension [Self <: UseProps](x: Self) {
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
