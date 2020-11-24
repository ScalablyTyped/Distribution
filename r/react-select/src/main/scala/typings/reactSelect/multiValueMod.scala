package typings.reactSelect

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.anon.OnClick
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
import typings.reactSelect.selectMod.Props
import typings.reactSelect.transitionsMod.fn
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/animated/MultiValue", JSImport.Namespace)
@js.native
object multiValueMod extends js.Object {
  
  def AnimatedMultiValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[MultiValueProps[OptionType]]): ComponentType[AnimatedMultiValueProps[OptionType]] = js.native
  
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[MultiValueProps[OptionType]]): ComponentType[AnimatedMultiValueProps[OptionType]] = js.native
  
  /* Inlined {  in :boolean,   onExited :react-select.react-select/src/animated/transitions.fn} & react-select.react-select/src/components/MultiValue.MultiValueProps<OptionType> */
  @js.native
  trait AnimatedMultiValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    var components: js.Any = js.native
    
    var cropWithEllipsis: Boolean = js.native
    
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    
    var data: OptionType = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    var in: Boolean = js.native
    
    var innerProps: js.Any = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    var onExited: fn = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    var removeProps: OnClick = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
}
