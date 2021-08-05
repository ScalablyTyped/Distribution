package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupButtonMod {
  
  @JSImport("react-bootstrap/lib/InputGroupButton", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[InputGroupButtonProps, js.Object, js.Any]
  
  @js.native
  trait InputGroupButton
    extends Component[InputGroupButtonProps, js.Object, js.Any]
  
  trait InputGroupButtonProps
    extends StObject
       with HTMLProps[InputGroupButton] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object InputGroupButtonProps {
    
    inline def apply(): InputGroupButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupButtonProps]
    }
    
    extension [Self <: InputGroupButtonProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
