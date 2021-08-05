package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAsyncCreatableMod {
  
  @JSImport("react-select/src/AsyncCreatable", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected () extends AsyncCreatable[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/src/AsyncCreatable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/AsyncCreatable", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
  @js.native
  class AsyncCreatable[OptionType /* <: OptionTypeBase */] protected ()
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
    
    def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta[OptionType]): Unit = js.native
    
    var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
    
    var select: Ref[js.Any] = js.native
  }
  /* static members */
  object AsyncCreatable {
    
    @JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/AsyncCreatable", "AsyncCreatable.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Props[OptionType /* <: OptionTypeBase */] = typings.reactSelect.srcAsyncMod.Props[OptionType] & typings.reactSelect.srcCreatableMod.Props[OptionType]
  
  trait State[OptionType /* <: OptionTypeBase */]
    extends StObject
       with typings.reactSelect.srcAsyncMod.State[OptionType]
       with typings.reactSelect.srcCreatableMod.State[OptionType]
  object State {
    
    inline def apply[OptionType /* <: OptionTypeBase */](
      inputValue: String,
      isLoading: Boolean,
      loadedOptions: OptionsType[OptionType],
      options: OptionsType[OptionType],
      passEmptyOptions: Boolean
    ): State[OptionType] = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], loadedOptions = loadedOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], passEmptyOptions = passEmptyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[OptionType]]
    }
  }
}
