package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.anon.OnKeyDown
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

object containersMod {
  
  @JSImport("react-select/src/components/containers", "IndicatorsContainer")
  @js.native
  val IndicatorsContainer: ComponentType[IndicatorContainerProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/containers", "SelectContainer")
  @js.native
  val SelectContainer: ComponentType[ContainerProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/containers", "ValueContainer")
  @js.native
  class ValueContainer protected ()
    extends Component[ValueContainerProps[js.Any], js.Object, js.Any] {
    def this(props: ValueContainerProps[_]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValueContainerProps[_], context: js.Any) = this()
  }
  
  @JSImport("react-select/src/components/containers", "containerCSS")
  @js.native
  def containerCSS(state: ContainerState): CSSProperties = js.native
  
  @JSImport("react-select/src/components/containers", "indicatorsContainerCSS")
  @js.native
  def indicatorsContainerCSS(): CSSProperties = js.native
  
  @JSImport("react-select/src/components/containers", "valueContainerCSS")
  @js.native
  def valueContainerCSS(): CSSProperties = js.native
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & react-select.react-select/src/components/containers.ContainerState & {  children :react.react.ReactNode,   innerProps :{  onKeyDown :react-select.react-select/src/types.KeyboardEventHandler}} */
  @js.native
  trait ContainerProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
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
    
    /** Inner props to be passed down to the container. */
    var innerProps: OnKeyDown = js.native
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    /** Whether the text in the select is indented from right to left. */
    var isRtl: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  @js.native
  trait ContainerState extends StObject {
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the text in the select is indented from right to left. */
    var isRtl: Boolean = js.native
  }
  object ContainerState {
    
    @scala.inline
    def apply(isDisabled: Boolean, isRtl: Boolean): ContainerState = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerState]
    }
    
    @scala.inline
    implicit class ContainerStateMutableBuilder[Self <: ContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & react-select.react-select/src/components/containers.IndicatorsState & {  children :react.react.ReactNode} */
  @js.native
  trait IndicatorContainerProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
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
    
    /** Whether the component is disabled */
    var isDisabled: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    /** Whether the text should be rendered right to left. */
    var isRtl: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  @js.native
  trait IndicatorsState extends StObject {
    
    /** Whether the component is disabled */
    var isDisabled: Boolean = js.native
    
    /** Whether the text should be rendered right to left. */
    var isRtl: Boolean = js.native
  }
  object IndicatorsState {
    
    @scala.inline
    def apply(isDisabled: Boolean, isRtl: Boolean): IndicatorsState = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndicatorsState]
    }
    
    @scala.inline
    implicit class IndicatorsStateMutableBuilder[Self <: IndicatorsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  isMulti :boolean,   hasValue :boolean,   children :react.react.ReactNode} */
  @js.native
  trait ValueContainerProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
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
    
    /** Whether the value container currently holds a value. */
    var hasValue: Boolean = js.native
    
    /** Set when the value container should hold multiple values */
    var isMulti: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
}
