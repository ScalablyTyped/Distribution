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
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMultiValueMod {
  
  @JSImport("react-select/src/components/MultiValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    inline def defaultProps_=(x: CropWithEllipsis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
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
    inline def defaultProps_=(x: CropWithEllipsis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
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
    inline def defaultProps_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def multiValueCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("multiValueCSS")().asInstanceOf[CSSProperties]
  
  inline def multiValueLabelCSS(props: MultiValueProps[js.Any]): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("multiValueLabelCSS")(props.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  inline def multiValueRemoveCSS(props: MultiValueProps[js.Any]): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("multiValueRemoveCSS")(props.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var children: ReactNode
    
    var data: OptionType
    
    var innerProps: ClassName
    
    var selectProps: js.Any
  }
  object MultiValueGenericProps {
    
    inline def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: ClassName, selectProps: js.Any): MultiValueGenericProps[OptionType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
    }
    
    extension [Self <: MultiValueGenericProps[?], OptionType /* <: OptionTypeBase */](x: Self & MultiValueGenericProps[OptionType]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(value: OptionType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInnerProps(value: ClassName): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      inline def setSelectProps(value: js.Any): Self = StObject.set(x, "selectProps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiValueProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    var children: ReactNode = js.native
    
    var components: js.Any = js.native
    
    var cropWithEllipsis: Boolean = js.native
    
    var data: OptionType = js.native
    
    var innerProps: js.Any = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var removeProps: OnClick = js.native
  }
  
  @js.native
  trait MultiValueRemoveProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    var children: ReactNode = js.native
    
    var innerProps: OnTouchEnd = js.native
  }
}
