package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputGroupMod {
  
  @JSImport("react-bootstrap/lib/InputGroup", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[InputGroupProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/InputGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/InputGroup", "Addon")
  @js.native
  open class Addon ()
    extends typings.reactBootstrap.libInputGroupAddonMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/InputGroup", "Addon")
  @js.native
  def Addon: Instantiable0[typings.reactBootstrap.libInputGroupAddonMod.^] = js.native
  inline def Addon_=(x: Instantiable0[typings.reactBootstrap.libInputGroupAddonMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Addon")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/InputGroup", "Button")
  @js.native
  open class Button ()
    extends typings.reactBootstrap.libInputGroupButtonMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/InputGroup", "Button")
  @js.native
  def Button: Instantiable0[typings.reactBootstrap.libInputGroupButtonMod.^] = js.native
  inline def Button_=(x: Instantiable0[typings.reactBootstrap.libInputGroupButtonMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
  
  type InputGroup = Component[InputGroupProps, js.Object, Any]
  
  trait InputGroupProps
    extends StObject
       with HTMLProps[InputGroup] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
  }
  object InputGroupProps {
    
    inline def apply(): InputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputGroupProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    }
  }
}
