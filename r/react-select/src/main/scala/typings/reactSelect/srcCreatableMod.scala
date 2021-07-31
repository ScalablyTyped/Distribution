package typings.reactSelect

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactSelect.reactSelectStrings.first
import typings.reactSelect.reactSelectStrings.last
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.GroupedOptionsType
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCreatableMod {
  
  @JSImport("react-select/src/Creatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/Creatable", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected () extends Creatable[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/src/Creatable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Creatable", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Creatable", "Creatable")
  @js.native
  class Creatable[OptionType /* <: OptionTypeBase */] protected ()
    extends Component[Props[OptionType], State[OptionType], js.Any] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta[OptionType]): Unit = js.native
    
    var select: Ref[js.Any] = js.native
  }
  /* static members */
  object Creatable {
    
    @JSImport("react-select/src/Creatable", "Creatable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Creatable", "Creatable.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Creatable", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  @scala.inline
  def makeCreatableSelect(SelectComponent: ComponentType[js.Any]): Creatable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCreatableSelect")(SelectComponent.asInstanceOf[js.Any]).asInstanceOf[Creatable[js.Any]]
  
  trait CreatableProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /* Allow options to be created while the `isLoading` prop is true. Useful to
      prevent the "create new ..." option being displayed while async results are
      still being loaded. */
    var allowCreateWhileLoading: js.UndefOr[Boolean] = js.undefined
    
    /* Sets the position of the createOption element in your options list. Defaults to 'last' */
    var createOptionPosition: js.UndefOr[first | last] = js.undefined
    
    /* Gets the label for the "create new ..." option in the menu. Is given the
      current input value. */
    var formatCreateLabel: js.UndefOr[js.Function1[/* inputValue */ String, ReactNode]] = js.undefined
    
    /* Returns the data for the new option when it is created. Used to display the
      value, and is passed to `onChange`. */
    var getNewOptionData: js.UndefOr[js.Function2[/* inputValue */ String, /* optionLabel */ ReactNode, OptionType]] = js.undefined
    
    /* Determines whether the "create new ..." option should be displayed based on
      the current input value, select value and options array. */
    var isValidNewOption: js.UndefOr[
        js.Function3[
          /* inputValue */ String, 
          /* value */ ValueType[OptionType], 
          /* options */ OptionsType[OptionType] | GroupedOptionsType[OptionType], 
          Boolean
        ]
      ] = js.undefined
    
    /* If provided, this will be called with the input value when a new option is
      created, and `onChange` will **not** be called. Use this when you need more
      control over what happens when new options are created. */
    var onCreateOption: js.UndefOr[js.Function1[/* inputValue */ String, Unit]] = js.undefined
  }
  object CreatableProps {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](): CreatableProps[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatableProps[OptionType]]
    }
    
    @scala.inline
    implicit class CreatablePropsMutableBuilder[Self <: CreatableProps[?], OptionType /* <: OptionTypeBase */] (val x: Self & CreatableProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def setAllowCreateWhileLoading(value: Boolean): Self = StObject.set(x, "allowCreateWhileLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCreateWhileLoadingUndefined: Self = StObject.set(x, "allowCreateWhileLoading", js.undefined)
      
      @scala.inline
      def setCreateOptionPosition(value: first | last): Self = StObject.set(x, "createOptionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateOptionPositionUndefined: Self = StObject.set(x, "createOptionPosition", js.undefined)
      
      @scala.inline
      def setFormatCreateLabel(value: /* inputValue */ String => ReactNode): Self = StObject.set(x, "formatCreateLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatCreateLabelUndefined: Self = StObject.set(x, "formatCreateLabel", js.undefined)
      
      @scala.inline
      def setGetNewOptionData(value: (/* inputValue */ String, /* optionLabel */ ReactNode) => OptionType): Self = StObject.set(x, "getNewOptionData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetNewOptionDataUndefined: Self = StObject.set(x, "getNewOptionData", js.undefined)
      
      @scala.inline
      def setIsValidNewOption(
        value: (/* inputValue */ String, /* value */ ValueType[OptionType], /* options */ OptionsType[OptionType] | GroupedOptionsType[OptionType]) => Boolean
      ): Self = StObject.set(x, "isValidNewOption", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsValidNewOptionUndefined: Self = StObject.set(x, "isValidNewOption", js.undefined)
      
      @scala.inline
      def setOnCreateOption(value: /* inputValue */ String => Unit): Self = StObject.set(x, "onCreateOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreateOptionUndefined: Self = StObject.set(x, "onCreateOption", js.undefined)
    }
  }
  
  trait Props[OptionType /* <: OptionTypeBase */]
    extends StObject
       with typings.reactSelect.selectMod.Props[OptionType]
       with CreatableProps[OptionType]
  object Props {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](): Props[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[OptionType]]
    }
  }
  
  trait State[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var newOption: js.UndefOr[OptionType] = js.undefined
    
    var options: OptionsType[OptionType]
  }
  object State {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](options: OptionsType[OptionType]): State[OptionType] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[OptionType]]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State[?], OptionType /* <: OptionTypeBase */] (val x: Self & State[OptionType]) extends AnyVal {
      
      @scala.inline
      def setNewOption(value: OptionType): Self = StObject.set(x, "newOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewOptionUndefined: Self = StObject.set(x, "newOption", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionsType[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
}
