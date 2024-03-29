package typings.reactToggled

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  open class default protected () extends Component[ReactToggledProps, ComponentState, Any] {
    def this(props: ReactToggledProps) = this()
    def this(props: ReactToggledProps, context: Any) = this()
  }
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  val default: ReactToggledInterface = js.native
  
  type ChildrenFunction = js.Function1[/* options */ TogglerStateAndHelpers, ReactNode]
  
  type GetButtonPropsOptions = HTMLProps[HTMLButtonElement]
  
  type GetElementPropsOptions = HTMLProps[HTMLElement]
  
  type GetInputPropsOptions = HTMLProps[HTMLInputElement]
  
  type ReactToggledInterface = ComponentClass[ReactToggledProps, ComponentState]
  
  trait ReactToggledProps extends StObject {
    
    val children: ChildrenFunction
    
    val defaultOn: js.UndefOr[Boolean] = js.undefined
    
    val on: js.UndefOr[Boolean] = js.undefined
    
    val onToggle: js.UndefOr[js.Function2[/* on */ Boolean, /* object */ TogglerStateAndHelpers, Unit]] = js.undefined
  }
  object ReactToggledProps {
    
    inline def apply(children: /* options */ TogglerStateAndHelpers => ReactNode): ReactToggledProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReactToggledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactToggledProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: /* options */ TogglerStateAndHelpers => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDefaultOn(value: Boolean): Self = StObject.set(x, "defaultOn", value.asInstanceOf[js.Any])
      
      inline def setDefaultOnUndefined: Self = StObject.set(x, "defaultOn", js.undefined)
      
      inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnToggle(value: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    }
  }
  
  @js.native
  trait TogglerStateAndHelpers extends StObject {
    
    def getElementTogglerProps(): Any = js.native
    def getElementTogglerProps(options: GetElementPropsOptions): Any = js.native
    
    def getInputTogglerProps(): Any = js.native
    def getInputTogglerProps(options: GetButtonPropsOptions): Any = js.native
    
    def getTogglerProps(): Any = js.native
    def getTogglerProps(options: GetButtonPropsOptions): Any = js.native
    
    val on: Boolean = js.native
    
    def setOff(): Unit = js.native
    
    def setOn(): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  
  type _To = ReactToggledInterface
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactToggledInterface = default
}
