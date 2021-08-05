package typings.reactSelect

import typings.react.mod.Component
import typings.reactSelect.reactSelectStrings.inputValue
import typings.reactSelect.reactSelectStrings.menuIsOpen
import typings.reactSelect.reactSelectStrings.onChange
import typings.reactSelect.reactSelectStrings.onInputChange
import typings.reactSelect.reactSelectStrings.onMenuClose
import typings.reactSelect.reactSelectStrings.onMenuOpen
import typings.reactSelect.reactSelectStrings.value
import typings.reactSelect.selectMod.default
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateManagerMod {
  
  @JSImport("react-select/src/stateManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: typings.reactSelect.selectMod.default[js.Any] */](SelectComponent: T): StateManager[GetOptionType[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(SelectComponent.asInstanceOf[js.Any]).asInstanceOf[StateManager[GetOptionType[T], T]]
  
  @JSImport("react-select/src/stateManager", "StateManager")
  @js.native
  class StateManager[OptionType /* <: OptionTypeBase */, T /* <: default[OptionType] */] protected ()
    extends Component[
          StateProps[typings.reactSelect.selectMod.Props[OptionType]] & Props[OptionType] & typings.reactSelect.selectMod.Props[OptionType], 
          State[OptionType], 
          js.Any
        ] {
    def this(props: StateProps[typings.reactSelect.selectMod.Props[OptionType]] & Props[OptionType] & typings.reactSelect.selectMod.Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(
      props: StateProps[typings.reactSelect.selectMod.Props[OptionType]] & Props[OptionType] & typings.reactSelect.selectMod.Props[OptionType],
      context: js.Any
    ) = this()
    
    def blur(): Unit = js.native
    
    def callProp(name: String, args: js.Any*): js.Any = js.native
    
    def focus(): Unit = js.native
    
    def getProp(key: String): js.Any = js.native
    
    def onChange(value: ValueType[OptionType], actionMeta: ActionMeta[OptionType]): Unit = js.native
    
    def onInputChange(value: ValueType[OptionType], actionMeta: InputActionMeta): Unit = js.native
    
    def onMenuClose(): Unit = js.native
    
    def onMenuOpen(): Unit = js.native
    
    var select: T = js.native
  }
  /* static members */
  object StateManager {
    
    @JSImport("react-select/src/stateManager", "StateManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/stateManager", "StateManager.defaultProps")
    @js.native
    def defaultProps: DefaultProps[js.Any] = js.native
    inline def defaultProps_=(x: DefaultProps[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def manageState[T /* <: default[js.Any] */](SelectComponent: T): StateManager[GetOptionType[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("manageState")(SelectComponent.asInstanceOf[js.Any]).asInstanceOf[StateManager[GetOptionType[T], T]]
  
  trait DefaultProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var defaultInputValue: String
    
    var defaultMenuIsOpen: Boolean
    
    var defaultValue: ValueType[OptionType]
  }
  object DefaultProps {
    
    inline def apply[OptionType /* <: OptionTypeBase */](defaultInputValue: String, defaultMenuIsOpen: Boolean): DefaultProps[OptionType] = {
      val __obj = js.Dynamic.literal(defaultInputValue = defaultInputValue.asInstanceOf[js.Any], defaultMenuIsOpen = defaultMenuIsOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps[OptionType]]
    }
    
    extension [Self <: DefaultProps[?], OptionType /* <: OptionTypeBase */](x: Self & DefaultProps[OptionType]) {
      
      inline def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultMenuIsOpen(value: Boolean): Self = StObject.set(x, "defaultMenuIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: ValueType[OptionType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: OptionType*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    }
  }
  
  type GetOptionType[T] = js.Any
  
  trait Props[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var defaultInputValue: js.UndefOr[String] = js.undefined
    
    var defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType[OptionType]] = js.undefined
    
    var inputValue: js.UndefOr[String] = js.undefined
    
    var menuIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta[OptionType], Unit]
      ] = js.undefined
    
    var value: js.UndefOr[ValueType[OptionType]] = js.undefined
  }
  object Props {
    
    inline def apply[OptionType /* <: OptionTypeBase */](): Props[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[OptionType]]
    }
    
    extension [Self <: Props[?], OptionType /* <: OptionTypeBase */](x: Self & Props[OptionType]) {
      
      inline def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
      
      inline def setDefaultMenuIsOpen(value: Boolean): Self = StObject.set(x, "defaultMenuIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultMenuIsOpenUndefined: Self = StObject.set(x, "defaultMenuIsOpen", js.undefined)
      
      inline def setDefaultValue(value: ValueType[OptionType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: OptionType*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
      
      inline def setMenuIsOpenUndefined: Self = StObject.set(x, "menuIsOpen", js.undefined)
      
      inline def setOnChange(value: (/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta[OptionType]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: ValueType[OptionType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: OptionType*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait State[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var inputValue: String
    
    var menuIsOpen: Boolean
    
    var value: ValueType[OptionType]
  }
  object State {
    
    inline def apply[OptionType /* <: OptionTypeBase */](inputValue: String, menuIsOpen: Boolean): State[OptionType] = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[OptionType]]
    }
    
    extension [Self <: State[?], OptionType /* <: OptionTypeBase */](x: Self & State[OptionType]) {
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ValueType[OptionType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: OptionType*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type StateProps[T /* <: typings.reactSelect.selectMod.Props[js.Any] */] = Pick[
    T, 
    Exclude[
      /* keyof T */ String, 
      inputValue | value | menuIsOpen | onChange | onInputChange | onMenuClose | onMenuOpen
    ]
  ]
}
