package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaLeftMod {
  
  @JSImport("react-bootstrap/lib/MediaLeft", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaLeftProps, js.Object, Any]
  
  type MediaLeft = Component[MediaLeftProps, js.Object, Any]
  
  trait MediaLeftProps
    extends StObject
       with HTMLProps[MediaLeft] {
    
    var align: js.UndefOr[String] = js.undefined
  }
  object MediaLeftProps {
    
    inline def apply(): MediaLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaLeftProps]
    }
    
    extension [Self <: MediaLeftProps](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
