package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupMod {
  
  @JSImport("react-bootstrap/lib/InputGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[InputGroupProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/InputGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/InputGroup", "Addon")
  @js.native
  class Addon ()
    extends typings.reactBootstrap.inputGroupAddonMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/InputGroup", "Addon")
  @js.native
  def Addon: Instantiable0[typings.reactBootstrap.inputGroupAddonMod.^] = js.native
  @scala.inline
  def Addon_=(x: Instantiable0[typings.reactBootstrap.inputGroupAddonMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Addon")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/InputGroup", "Button")
  @js.native
  class Button ()
    extends typings.reactBootstrap.inputGroupButtonMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/InputGroup", "Button")
  @js.native
  def Button: Instantiable0[typings.reactBootstrap.inputGroupButtonMod.^] = js.native
  @scala.inline
  def Button_=(x: Instantiable0[typings.reactBootstrap.inputGroupButtonMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
  
  @js.native
  trait InputGroup
    extends Component[InputGroupProps, js.Object, js.Any]
  
  @js.native
  trait InputGroupProps extends HTMLProps[InputGroup] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
  }
  object InputGroupProps {
    
    @scala.inline
    def apply(): InputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupProps]
    }
    
    @scala.inline
    implicit class InputGroupPropsMutableBuilder[Self <: InputGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    }
  }
}
