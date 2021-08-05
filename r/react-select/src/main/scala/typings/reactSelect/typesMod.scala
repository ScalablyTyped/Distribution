package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.reactSelect.selectMod.Props
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ActionMeta[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var action: ActionTypes
    
    var name: js.UndefOr[String] = js.undefined
    
    var option: js.UndefOr[OptionType] = js.undefined
    
    var removedValue: js.UndefOr[OptionType] = js.undefined
  }
  object ActionMeta {
    
    inline def apply[OptionType /* <: OptionTypeBase */](action: ActionTypes): ActionMeta[OptionType] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionMeta[OptionType]]
    }
    
    extension [Self <: ActionMeta[?], OptionType /* <: OptionTypeBase */](x: Self & ActionMeta[OptionType]) {
      
      inline def setAction(value: ActionTypes): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOption(value: OptionType): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setRemovedValue(value: OptionType): Self = StObject.set(x, "removedValue", value.asInstanceOf[js.Any])
      
      inline def setRemovedValueUndefined: Self = StObject.set(x, "removedValue", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.`select-option`
    - typings.reactSelect.reactSelectStrings.`deselect-option`
    - typings.reactSelect.reactSelectStrings.`remove-value`
    - typings.reactSelect.reactSelectStrings.`pop-value`
    - typings.reactSelect.reactSelectStrings.`set-value`
    - typings.reactSelect.reactSelectStrings.clear
    - typings.reactSelect.reactSelectStrings.`create-option`
  */
  trait ActionTypes extends StObject
  object ActionTypes {
    
    inline def clear: typings.reactSelect.reactSelectStrings.clear = "clear".asInstanceOf[typings.reactSelect.reactSelectStrings.clear]
    
    inline def `create-option`: typings.reactSelect.reactSelectStrings.`create-option` = "create-option".asInstanceOf[typings.reactSelect.reactSelectStrings.`create-option`]
    
    inline def `deselect-option`: typings.reactSelect.reactSelectStrings.`deselect-option` = "deselect-option".asInstanceOf[typings.reactSelect.reactSelectStrings.`deselect-option`]
    
    inline def `pop-value`: typings.reactSelect.reactSelectStrings.`pop-value` = "pop-value".asInstanceOf[typings.reactSelect.reactSelectStrings.`pop-value`]
    
    inline def `remove-value`: typings.reactSelect.reactSelectStrings.`remove-value` = "remove-value".asInstanceOf[typings.reactSelect.reactSelectStrings.`remove-value`]
    
    inline def `select-option`: typings.reactSelect.reactSelectStrings.`select-option` = "select-option".asInstanceOf[typings.reactSelect.reactSelectStrings.`select-option`]
    
    inline def `set-value`: typings.reactSelect.reactSelectStrings.`set-value` = "set-value".asInstanceOf[typings.reactSelect.reactSelectStrings.`set-value`]
  }
  
  type ClassNameList = js.Array[String]
  
  type ClassNamesState = js.UndefOr[StringDictionary[Boolean]]
  
  @js.native
  trait CommonProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    def cx(): String = js.native
    def cx(state: Unit, className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    def cx(state: ClassNamesState, className: String): String = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.up
    - typings.reactSelect.reactSelectStrings.down
    - typings.reactSelect.reactSelectStrings.pageup
    - typings.reactSelect.reactSelectStrings.pagedown
    - typings.reactSelect.reactSelectStrings.first
    - typings.reactSelect.reactSelectStrings.last
  */
  trait FocusDirection extends StObject
  object FocusDirection {
    
    inline def down: typings.reactSelect.reactSelectStrings.down = "down".asInstanceOf[typings.reactSelect.reactSelectStrings.down]
    
    inline def first: typings.reactSelect.reactSelectStrings.first = "first".asInstanceOf[typings.reactSelect.reactSelectStrings.first]
    
    inline def last: typings.reactSelect.reactSelectStrings.last = "last".asInstanceOf[typings.reactSelect.reactSelectStrings.last]
    
    inline def pagedown: typings.reactSelect.reactSelectStrings.pagedown = "pagedown".asInstanceOf[typings.reactSelect.reactSelectStrings.pagedown]
    
    inline def pageup: typings.reactSelect.reactSelectStrings.pageup = "pageup".asInstanceOf[typings.reactSelect.reactSelectStrings.pageup]
    
    inline def up: typings.reactSelect.reactSelectStrings.up = "up".asInstanceOf[typings.reactSelect.reactSelectStrings.up]
  }
  
  type FocusEventHandler = js.Function1[/* event */ FocusEvent[HTMLElement], Unit]
  
  trait GroupType[OptionType /* <: OptionTypeBase */]
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var options: OptionsType[OptionType]
  }
  object GroupType {
    
    inline def apply[OptionType /* <: OptionTypeBase */](options: OptionsType[OptionType]): GroupType[OptionType] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupType[OptionType]]
    }
    
    extension [Self <: GroupType[?], OptionType /* <: OptionTypeBase */](x: Self & GroupType[OptionType]) {
      
      inline def setOptions(value: OptionsType[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  type GroupedOptionsType[OptionType /* <: OptionTypeBase */] = js.Array[GroupType[OptionType]]
  
  type InnerRef = Ref[js.Any]
  
  trait InputActionMeta extends StObject {
    
    var action: InputActionTypes
  }
  object InputActionMeta {
    
    inline def apply(action: InputActionTypes): InputActionMeta = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputActionMeta]
    }
    
    extension [Self <: InputActionMeta](x: Self) {
      
      inline def setAction(value: InputActionTypes): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.`set-value`
    - typings.reactSelect.reactSelectStrings.`input-change`
    - typings.reactSelect.reactSelectStrings.`input-blur`
    - typings.reactSelect.reactSelectStrings.`menu-close`
  */
  trait InputActionTypes extends StObject
  object InputActionTypes {
    
    inline def `input-blur`: typings.reactSelect.reactSelectStrings.`input-blur` = "input-blur".asInstanceOf[typings.reactSelect.reactSelectStrings.`input-blur`]
    
    inline def `input-change`: typings.reactSelect.reactSelectStrings.`input-change` = "input-change".asInstanceOf[typings.reactSelect.reactSelectStrings.`input-change`]
    
    inline def `menu-close`: typings.reactSelect.reactSelectStrings.`menu-close` = "menu-close".asInstanceOf[typings.reactSelect.reactSelectStrings.`menu-close`]
    
    inline def `set-value`: typings.reactSelect.reactSelectStrings.`set-value` = "set-value".asInstanceOf[typings.reactSelect.reactSelectStrings.`set-value`]
  }
  
  type KeyboardEventHandler = js.Function1[/* event */ KeyboardEvent[HTMLElement], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.auto
    - typings.reactSelect.reactSelectStrings.bottom
    - typings.reactSelect.reactSelectStrings.top
  */
  trait MenuPlacement extends StObject
  object MenuPlacement {
    
    inline def auto: typings.reactSelect.reactSelectStrings.auto = "auto".asInstanceOf[typings.reactSelect.reactSelectStrings.auto]
    
    inline def bottom: typings.reactSelect.reactSelectStrings.bottom = "bottom".asInstanceOf[typings.reactSelect.reactSelectStrings.bottom]
    
    inline def top: typings.reactSelect.reactSelectStrings.top = "top".asInstanceOf[typings.reactSelect.reactSelectStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.absolute
    - typings.reactSelect.reactSelectStrings.fixed
  */
  trait MenuPosition extends StObject
  object MenuPosition {
    
    inline def absolute: typings.reactSelect.reactSelectStrings.absolute = "absolute".asInstanceOf[typings.reactSelect.reactSelectStrings.absolute]
    
    inline def fixed: typings.reactSelect.reactSelectStrings.fixed = "fixed".asInstanceOf[typings.reactSelect.reactSelectStrings.fixed]
  }
  
  type MouseEventHandler = js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  
  trait OptionProps
    extends StObject
       with PropsWithInnerRef {
    
    var data: js.Any
    
    var id: Double
    
    var index: Double
    
    var isDisabled: Boolean
    
    var isFocused: Boolean
    
    var isSelected: Boolean
    
    var label: String
    
    var onClick: MouseEventHandler
    
    var onMouseOver: MouseEventHandler
    
    var value: js.Any
  }
  object OptionProps {
    
    inline def apply(
      data: js.Any,
      id: Double,
      index: Double,
      isDisabled: Boolean,
      isFocused: Boolean,
      isSelected: Boolean,
      label: String,
      onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
      onMouseOver: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
      value: js.Any
    ): OptionProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseOver = js.Any.fromFunction1(onMouseOver), value = value.asInstanceOf[js.Any], innerRef = null)
      __obj.asInstanceOf[OptionProps]
    }
    
    extension [Self <: OptionProps](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnMouseOver(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionTypeBase = StringDictionary[js.Any]
  
  type OptionsType[OptionType /* <: OptionTypeBase */] = js.Array[OptionType]
  
  trait PropsWithInnerRef extends StObject {
    
    /** The inner reference. */
    var innerRef: Ref[js.Any]
  }
  object PropsWithInnerRef {
    
    inline def apply(): PropsWithInnerRef = {
      val __obj = js.Dynamic.literal(innerRef = null)
      __obj.asInstanceOf[PropsWithInnerRef]
    }
    
    extension [Self <: PropsWithInnerRef](x: Self) {
      
      inline def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
  
  trait PropsWithStyles extends StObject {
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object
    
    var theme: Theme
  }
  object PropsWithStyles {
    
    inline def apply(getStyles: (String, js.Any) => js.Object, theme: Theme): PropsWithStyles = {
      val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction2(getStyles), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithStyles]
    }
    
    extension [Self <: PropsWithStyles](x: Self) {
      
      inline def setGetStyles(value: (String, js.Any) => js.Object): Self = StObject.set(x, "getStyles", js.Any.fromFunction2(value))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme extends StObject {
    
    var borderRadius: Double
    
    var colors: StringDictionary[String]
    
    var spacing: ThemeSpacing
  }
  object Theme {
    
    inline def apply(borderRadius: Double, colors: StringDictionary[String], spacing: ThemeSpacing): Theme = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setColors(value: StringDictionary[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: ThemeSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeSpacing extends StObject {
    
    var baseUnit: Double
    
    var controlHeight: Double
    
    var menuGutter: Double
  }
  object ThemeSpacing {
    
    inline def apply(baseUnit: Double, controlHeight: Double, menuGutter: Double): ThemeSpacing = {
      val __obj = js.Dynamic.literal(baseUnit = baseUnit.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], menuGutter = menuGutter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeSpacing]
    }
    
    extension [Self <: ThemeSpacing](x: Self) {
      
      inline def setBaseUnit(value: Double): Self = StObject.set(x, "baseUnit", value.asInstanceOf[js.Any])
      
      inline def setControlHeight(value: Double): Self = StObject.set(x, "controlHeight", value.asInstanceOf[js.Any])
      
      inline def setMenuGutter(value: Double): Self = StObject.set(x, "menuGutter", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueType[OptionType /* <: OptionTypeBase */] = js.UndefOr[OptionType | OptionsType[OptionType] | Null]
}
