package typings.reactSelect

import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.transitionsMod.fn
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/animated/Input", JSImport.Namespace)
@js.native
object inputMod extends js.Object {
  
  def AnimatedInput(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = js.native
  
  def default(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = js.native
  
  /* Inlined react-select.react-select/src/animated/transitions.BaseTransition & react-select.react-select/src/types.PropsWithInnerRef & react-select.react-select/src/components/Input.InputProps */
  @js.native
  trait AnimatedInputProps extends js.Object {
    
    var className: js.UndefOr[String] = js.native
    
    def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    /** Whether we are in a transition. */
    var in: Boolean = js.native
    
    /** The inner reference. */
    var innerRef: Ref[_] = js.native
    /** Reference to the internal element */
    def innerRef(element: Ref[_]): Unit = js.native
    
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
    
    /** Function to be called once transition finishes. */
    var onExited: fn = js.native
    
    var theme: Theme = js.native
  }
}
