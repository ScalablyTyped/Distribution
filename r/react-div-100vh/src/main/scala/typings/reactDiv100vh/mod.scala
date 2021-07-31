package typings.reactDiv100vh

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-div-100vh", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[Div100vhProps, ComponentState, js.Any] {
    def this(props: Div100vhProps) = this()
    def this(props: Div100vhProps, context: js.Any) = this()
  }
  @JSImport("react-div-100vh", JSImport.Default)
  @js.native
  val default: ComponentClass[Div100vhProps, ComponentState] = js.native
  
  trait Div100vhProps
    extends StObject
       with ClassAttributes[HTMLElement]
       with HTMLAttributes[HTMLElement] {
    
    var as: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.undefined
  }
  object Div100vhProps {
    
    @scala.inline
    def apply(): Div100vhProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Div100vhProps]
    }
    
    @scala.inline
    implicit class Div100vhPropsMutableBuilder[Self <: Div100vhProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  type _To = ComponentClass[Div100vhProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[Div100vhProps, ComponentState] = default
}
