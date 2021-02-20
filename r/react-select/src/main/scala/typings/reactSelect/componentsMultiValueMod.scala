package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.anon.Children
import typings.reactSelect.anon.ClassName
import typings.reactSelect.anon.CropWithEllipsis
import typings.reactSelect.anon.OnClick
import typings.reactSelect.anon.OnTouchEnd
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

object componentsMultiValueMod {
  
  @JSImport("react-select/src/components/MultiValue", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected () extends MultiValue[OptionType] {
    def this(props: MultiValueProps[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MultiValueProps[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/src/components/MultiValue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components/MultiValue", "default.defaultProps")
    @js.native
    def defaultProps: CropWithEllipsis = js.native
    @scala.inline
    def defaultProps_=(x: CropWithEllipsis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components/MultiValue", "MultiValue")
  @js.native
  class MultiValue[OptionType /* <: OptionTypeBase */] protected ()
    extends Component[MultiValueProps[OptionType], js.Object, js.Any] {
    def this(props: MultiValueProps[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MultiValueProps[OptionType], context: js.Any) = this()
  }
  /* static members */
  object MultiValue {
    
    @JSImport("react-select/src/components/MultiValue", "MultiValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components/MultiValue", "MultiValue.defaultProps")
    @js.native
    def defaultProps: CropWithEllipsis = js.native
    @scala.inline
    def defaultProps_=(x: CropWithEllipsis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components/MultiValue", "MultiValueContainer")
  @js.native
  val MultiValueContainer: ComponentType[MultiValueGenericProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/MultiValue", "MultiValueGeneric")
  @js.native
  val MultiValueGeneric: ComponentType[MultiValueGenericProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/MultiValue", "MultiValueLabel")
  @js.native
  val MultiValueLabel: ComponentType[MultiValueGenericProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/MultiValue", "MultiValueRemove")
  @js.native
  class MultiValueRemove[OptionType /* <: OptionTypeBase */] protected ()
    extends Component[MultiValueRemoveProps[OptionType], js.Object, js.Any] {
    def this(props: MultiValueRemoveProps[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MultiValueRemoveProps[OptionType], context: js.Any) = this()
  }
  /* static members */
  object MultiValueRemove {
    
    @JSImport("react-select/src/components/MultiValue", "MultiValueRemove")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components/MultiValue", "MultiValueRemove.defaultProps")
    @js.native
    def defaultProps: Children = js.native
    @scala.inline
    def defaultProps_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components/MultiValue", "multiValueCSS")
  @js.native
  def multiValueCSS(): CSSProperties = js.native
  
  @JSImport("react-select/src/components/MultiValue", "multiValueLabelCSS")
  @js.native
  def multiValueLabelCSS(props: MultiValueProps[_]): CSSProperties = js.native
  
  @JSImport("react-select/src/components/MultiValue", "multiValueRemoveCSS")
  @js.native
  def multiValueRemoveCSS(props: MultiValueProps[_]): CSSProperties = js.native
  
  @js.native
  trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var children: ReactNode = js.native
    
    var data: OptionType = js.native
    
    var innerProps: ClassName = js.native
    
    var selectProps: js.Any = js.native
  }
  object MultiValueGenericProps {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: ClassName, selectProps: js.Any): MultiValueGenericProps[OptionType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
    }
    
    @scala.inline
    implicit class MultiValueGenericPropsMutableBuilder[Self <: MultiValueGenericProps[_], OptionType /* <: OptionTypeBase */] (val x: Self with MultiValueGenericProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setData(value: OptionType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerProps(value: ClassName): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectProps(value: js.Any): Self = StObject.set(x, "selectProps", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactNode,   components :any,   cropWithEllipsis :boolean,   data :OptionType,   innerProps :any,   isFocused :boolean,   isDisabled :boolean,   removeProps :{onTouchEnd (event : any): void, onClick (event : any): void, onMouseDown (event : any): void}} */
  @js.native
  trait MultiValueProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
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
    
    var innerProps: js.Any = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    var removeProps: OnClick = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactNode,   innerProps :{  className :string, onTouchEnd (event : any): void, onClick (event : any): void, onMouseDown (event : any): void},   selectProps :any} */
  @js.native
  trait MultiValueRemoveProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
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
    
    var innerProps: OnTouchEnd = js.native
    
    var isMulti: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] with js.Any = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
}
