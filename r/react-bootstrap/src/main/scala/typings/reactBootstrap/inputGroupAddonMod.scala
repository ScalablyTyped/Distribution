package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupAddonMod {
  
  @JSImport("react-bootstrap/lib/InputGroupAddon", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[InputGroupAddonProps, js.Object, js.Any]
  
  @js.native
  trait InputGroupAddon
    extends Component[InputGroupAddonProps, js.Object, js.Any]
  
  trait InputGroupAddonProps
    extends StObject
       with HTMLProps[InputGroupAddon] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object InputGroupAddonProps {
    
    inline def apply(): InputGroupAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupAddonProps]
    }
    
    extension [Self <: InputGroupAddonProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
