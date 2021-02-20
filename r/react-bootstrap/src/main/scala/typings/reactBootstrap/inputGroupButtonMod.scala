package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupButtonMod {
  
  @JSImport("react-bootstrap/lib/InputGroupButton", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[InputGroupButtonProps, js.Object, js.Any]
  
  @js.native
  trait InputGroupButton
    extends Component[InputGroupButtonProps, js.Object, js.Any]
  
  @js.native
  trait InputGroupButtonProps extends HTMLProps[InputGroupButton] {
    
    var bsClass: js.UndefOr[String] = js.native
  }
  object InputGroupButtonProps {
    
    @scala.inline
    def apply(): InputGroupButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupButtonProps]
    }
    
    @scala.inline
    implicit class InputGroupButtonPropsMutableBuilder[Self <: InputGroupButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
