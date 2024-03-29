package typings.reactFloater

import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactFloater.libTypesMod.Styles
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloaterArrowMod {
  
  @JSImport("react-floater/lib/components/Floater/Arrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var arrowRef: Ref[HTMLSpanElement]
    
    var placement: String
    
    var styles: Styles
  }
  object Props {
    
    inline def apply(placement: String, styles: Styles): Props = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], arrowRef = null)
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setArrowRef(value: Ref[HTMLSpanElement]): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      inline def setArrowRefFunction1(value: /* instance */ HTMLSpanElement | Null => Unit): Self = StObject.set(x, "arrowRef", js.Any.fromFunction1(value))
      
      inline def setArrowRefNull: Self = StObject.set(x, "arrowRef", null)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
