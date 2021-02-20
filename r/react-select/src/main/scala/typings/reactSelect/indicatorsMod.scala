package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactSelect.anon.IsFocused
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indicatorsMod {
  
  @JSImport("react-select/src/components/indicators", "ClearIndicator")
  @js.native
  val ClearIndicator: ComponentType[IndicatorProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/indicators", "CrossIcon")
  @js.native
  def CrossIcon(props: js.Any): js.Any = js.native
  
  @JSImport("react-select/src/components/indicators", "DownChevron")
  @js.native
  def DownChevron(props: js.Any): js.Any = js.native
  
  @JSImport("react-select/src/components/indicators", "DropdownIndicator")
  @js.native
  val DropdownIndicator: ComponentType[IndicatorProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/indicators", "IndicatorSeparator")
  @js.native
  val IndicatorSeparator: ComponentType[IndicatorProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/indicators", "LoadingIndicator")
  @js.native
  val LoadingIndicator: ComponentType[LoadingIconProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/indicators", "clearIndicatorCSS")
  @js.native
  val clearIndicatorCSS: baseCSS = js.native
  
  @JSImport("react-select/src/components/indicators", "dropdownIndicatorCSS")
  @js.native
  val dropdownIndicatorCSS: baseCSS = js.native
  
  @JSImport("react-select/src/components/indicators", "indicatorSeparatorCSS")
  @js.native
  def indicatorSeparatorCSS(state: SeparatorState): CSSProperties = js.native
  
  @JSImport("react-select/src/components/indicators", "loadingIndicatorCSS")
  @js.native
  def loadingIndicatorCSS(state: IsFocused): CSSProperties = js.native
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactElement,   innerProps :any,   isFocused :boolean,   isRtl :boolean,   isDisabled :boolean} */
  @js.native
  trait IndicatorProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered inside the indicator. */
    var children: ReactElement = js.native
    
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
    
    /** Props that will be passed on to the children. */
    var innerProps: js.Any = js.native
    
    /** Whether the component is disabled */
    var isDisabled: Boolean = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    /** Whether the text is right to left */
    var isRtl: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  /* Inlined {  innerProps :any,   isFocused :boolean,   isRtl :boolean,   size :number} & react-select.react-select/src/types.CommonProps<OptionType> */
  @js.native
  trait LoadingIconProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
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
    
    /** Props that will be passed on to the children. */
    var innerProps: js.Any = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    /** Whether the text is right to left */
    var isRtl: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
    
    /** Set size of the container. */
    var size: Double = js.native
  }
  
  @js.native
  trait SeparatorState extends StObject {
    
    var isDisabled: Boolean = js.native
  }
  object SeparatorState {
    
    @scala.inline
    def apply(isDisabled: Boolean): SeparatorState = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparatorState]
    }
    
    @scala.inline
    implicit class SeparatorStateMutableBuilder[Self <: SeparatorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    }
  }
  
  type baseCSS = js.Function1[/* props */ IndicatorProps[js.Any], CSSProperties]
}
