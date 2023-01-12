package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInputMod extends Shortcut {
  
  @JSImport("react-widgets/cjs/Input", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InputProps & RefAttributes[HTMLInputElement]] = js.native
  
  trait InputProps
    extends StObject
       with AllHTMLAttributes[HTMLInputElement] {
    
    var component: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[InputProps & RefAttributes[HTMLInputElement]]
  
  /* This means you don't have to write `default`, but can instead just say `cjsInputMod.foo` */
  override def _to: ForwardRefExoticComponent[InputProps & RefAttributes[HTMLInputElement]] = default
}
