package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactSelect.anon.OnMouseDown
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.Theme
import typings.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod extends Shortcut {
  
  @JSImport("react-select/src/components/Control", JSImport.Default)
  @js.native
  val default: ComponentType[ControlProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Control", "css")
  @js.native
  def css(state: State): CSSProperties = js.native
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & react-select.react-select/src/types.PropsWithStyles & react-select.react-select/src/components/Control.State & {  children :react.react.ReactNode,   innerRef :react.react.Ref<any>,   innerProps :{onMouseDown (event : react.react.MouseEvent<std.HTMLElement, react.react.NativeMouseEvent>): void}} */
  @js.native
  trait ControlProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** Children to render. */
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    /** The mouse down event and the innerRef to pass down to the controller element. */
    var innerProps: OnMouseDown = js.native
    
    var innerRef: Ref[_] = js.native
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the select is focused. */
    var isFocused: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    /** Whether the select is expanded. */
    var menuIsOpen: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
    
    var theme: Theme = js.native
  }
  
  @js.native
  trait State extends StObject {
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the select is focused. */
    var isFocused: Boolean = js.native
    
    /** Whether the select is expanded. */
    var menuIsOpen: Boolean = js.native
  }
  object State {
    
    @scala.inline
    def apply(isDisabled: Boolean, isFocused: Boolean, menuIsOpen: Boolean): State = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[ControlProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `controlMod.foo` */
  override def _to: ComponentType[ControlProps[js.Any]] = default
}
