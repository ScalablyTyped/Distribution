package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactSelect.typesMod.GroupType
import typings.reactSelect.typesMod.GroupedOptionsType
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAsyncMod {
  
  @JSImport("react-select/src/Async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/Async", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected () extends Async[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/src/Async", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Async", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Async", "Async")
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] protected ()
    extends Component[Props[OptionType], State[OptionType], js.Any] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
    
    def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
    
    var mounted: Boolean = js.native
    
    var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
    
    var select: Ref[js.Any] = js.native
  }
  /* static members */
  object Async {
    
    @JSImport("react-select/src/Async", "Async")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Async", "Async.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Async", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  inline def makeAsyncSelect[T /* <: ComponentType[js.Any] */](SelectComponent: T): ComponentClass[AsyncComponentProps[T], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAsyncSelect")(SelectComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[AsyncComponentProps[T], ComponentState]]
  
  type AsyncComponentProps[T /* <: ComponentType[js.Any] */] = SelectComponentProps[T] & AsyncProps[js.Any]
  
  trait AsyncProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /* If cacheOptions is truthy, then the loaded data will be cached. The cache
      will remain until `cacheOptions` changes value.
      Default: false. */
    var cacheOptions: js.UndefOr[js.Any] = js.undefined
    
    /* The default set of options to show before the user starts searching. When
      set to `true`, the results for loadOptions('') will be autoloaded.
      Default: false. */
    var defaultOptions: js.UndefOr[GroupedOptionsType[OptionType] | OptionsType[OptionType] | Boolean] = js.undefined
    
    /* Function that returns a promise, which is the set of options to be used
      once the promise resolves. */
    def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): js.Promise[js.Any] | Unit
  }
  object AsyncProps {
    
    inline def apply[OptionType /* <: OptionTypeBase */](
      loadOptions: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[js.Any] | Unit
    ): AsyncProps[OptionType] = {
      val __obj = js.Dynamic.literal(loadOptions = js.Any.fromFunction2(loadOptions))
      __obj.asInstanceOf[AsyncProps[OptionType]]
    }
    
    extension [Self <: AsyncProps[?], OptionType /* <: OptionTypeBase */](x: Self & AsyncProps[OptionType]) {
      
      inline def setCacheOptions(value: js.Any): Self = StObject.set(x, "cacheOptions", value.asInstanceOf[js.Any])
      
      inline def setCacheOptionsUndefined: Self = StObject.set(x, "cacheOptions", js.undefined)
      
      inline def setDefaultOptions(value: GroupedOptionsType[OptionType] | OptionsType[OptionType] | Boolean): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      inline def setDefaultOptionsVarargs(value: (GroupType[OptionType] | OptionType)*): Self = StObject.set(x, "defaultOptions", js.Array(value :_*))
      
      inline def setLoadOptions(
        value: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[js.Any] | Unit
      ): Self = StObject.set(x, "loadOptions", js.Any.fromFunction2(value))
    }
  }
  
  type ClassProps[T] = js.Any
  
  type FunctionProps[T] = js.Any
  
  trait Props[OptionType /* <: OptionTypeBase */]
    extends StObject
       with typings.reactSelect.selectMod.Props[OptionType]
       with AsyncProps[OptionType]
  object Props {
    
    inline def apply[OptionType /* <: OptionTypeBase */](
      loadOptions: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[js.Any] | Unit
    ): Props[OptionType] = {
      val __obj = js.Dynamic.literal(loadOptions = js.Any.fromFunction2(loadOptions))
      __obj.asInstanceOf[Props[OptionType]]
    }
  }
  
  type SelectComponentProps[T] = ClassProps[T] | FunctionProps[T]
  
  trait State[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var defaultOptions: js.UndefOr[OptionsType[OptionType]] = js.undefined
    
    var inputValue: String
    
    var isLoading: Boolean
    
    var loadedInputValue: js.UndefOr[String] = js.undefined
    
    var loadedOptions: OptionsType[OptionType]
    
    var passEmptyOptions: Boolean
  }
  object State {
    
    inline def apply[OptionType /* <: OptionTypeBase */](
      inputValue: String,
      isLoading: Boolean,
      loadedOptions: OptionsType[OptionType],
      passEmptyOptions: Boolean
    ): State[OptionType] = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], loadedOptions = loadedOptions.asInstanceOf[js.Any], passEmptyOptions = passEmptyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[OptionType]]
    }
    
    extension [Self <: State[?], OptionType /* <: OptionTypeBase */](x: Self & State[OptionType]) {
      
      inline def setDefaultOptions(value: OptionsType[OptionType]): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      inline def setDefaultOptionsVarargs(value: OptionType*): Self = StObject.set(x, "defaultOptions", js.Array(value :_*))
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setLoadedInputValue(value: String): Self = StObject.set(x, "loadedInputValue", value.asInstanceOf[js.Any])
      
      inline def setLoadedInputValueUndefined: Self = StObject.set(x, "loadedInputValue", js.undefined)
      
      inline def setLoadedOptions(value: OptionsType[OptionType]): Self = StObject.set(x, "loadedOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadedOptionsVarargs(value: OptionType*): Self = StObject.set(x, "loadedOptions", js.Array(value :_*))
      
      inline def setPassEmptyOptions(value: Boolean): Self = StObject.set(x, "passEmptyOptions", value.asInstanceOf[js.Any])
    }
  }
}
