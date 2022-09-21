package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.Animated.Value
import typings.reactNativeElements.anon.ContainerStyle
import typings.reactNativeElements.anon.PartialTextInputProps
import typings.reactNativeElements.anon.PartialThemePropsInputPro
import typings.reactNativeElements.anon.PickTextInputPropsRefAttr
import typings.reactNativeElements.anon.TextInputPropsRefAttribut
import typings.reactNativeElements.anon.TypeofTextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/input/Input", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTextInputPropsRefAttr] | ForwardRefExoticComponent[TextInputPropsRefAttribut] = js.native
  
  @JSImport("react-native-elements/dist/input/Input", "Input")
  @js.native
  open class Input protected ()
    extends Component[InputProps & PartialThemePropsInputPro, js.Object, Any] {
    def this(props: InputProps & PartialThemePropsInputPro) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputProps & PartialThemePropsInputPro, context: Any) = this()
    
    def blur(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var input: Any = js.native
    
    def isFocused(): Boolean = js.native
    
    def setNativeProps(nativeProps: PartialTextInputProps): Unit = js.native
    
    def shake(): Unit = js.native
    
    var shakeAnimationValue: Value = js.native
  }
  
  type InputProps = ComponentPropsWithRef[TypeofTextInput] & ContainerStyle
  
  type _To = FunctionComponent[PickTextInputPropsRefAttr] | ForwardRefExoticComponent[TextInputPropsRefAttribut]
  
  /* This means you don't have to write `default`, but can instead just say `inputMod.foo` */
  override def _to: FunctionComponent[PickTextInputPropsRefAttr] | ForwardRefExoticComponent[TextInputPropsRefAttribut] = default
}
