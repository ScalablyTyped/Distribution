package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLabelMod {
  
  @JSImport("react-bootstrap/lib/Label", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[LabelProps, js.Object, Any]
  
  type Label = Component[LabelProps, js.Object, Any]
  
  trait LabelProps
    extends StObject
       with HTMLProps[Label] {
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
  }
  object LabelProps {
    
    inline def apply(): LabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelProps]
    }
    
    extension [Self <: LabelProps](x: Self) {
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
    }
  }
}
