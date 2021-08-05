package typings.rcSelect

import typings.rcSelect.anon.Dictname
import typings.rcSelect.anon.FilterOption
import typings.rcSelect.anon.LabelInValue
import typings.rcSelect.generateMod.RefSelectProps
import typings.rcSelect.generateMod.SelectProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorMod {
  
  @JSImport("rc-select/lib/interface/generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-select/lib/interface/generator", "INTERNAL_PROPS_MARK")
  @js.native
  val INTERNAL_PROPS_MARK: /* "RC_SELECT_INTERNAL_PROPS_MARK" */ String = js.native
  
  inline def RefSelectFunc[OptionsType /* <: js.Array[js.Object] */, ValueType](Component: RefForwardingComponent[RefSelectProps, SelectProps[OptionsType, ValueType]]): ForwardRefExoticComponent[
    (PropsWithoutRef[SelectProps[OptionsType, ValueType]]) & RefAttributes[RefSelectProps]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("RefSelectFunc")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[SelectProps[OptionsType, ValueType]]) & RefAttributes[RefSelectProps]
  ]]
  
  @js.native
  trait CustomTagProps extends StObject {
    
    var closable: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var label: DefaultValueType = js.native
    
    def onClose(): Unit = js.native
    def onClose(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    
    var value: DefaultValueType = js.native
  }
  
  type DefaultValueType = RawValueType | (js.Array[LabelValueType | RawValueType]) | LabelValueType
  
  trait DisplayLabelValueType
    extends StObject
       with LabelValueType {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object DisplayLabelValueType {
    
    inline def apply(): DisplayLabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayLabelValueType]
    }
    
    extension [Self <: DisplayLabelValueType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  type FilterFunc[OptionType] = js.Function2[/* inputValue */ String, /* option */ js.UndefOr[OptionType], Boolean]
  
  type FilterOptions[OptionsType /* <: js.Array[js.Object] */] = js.Function3[
    /* searchValue */ String, 
    /* options */ OptionsType, 
    /* config */ FilterOption[OptionsType], 
    OptionsType
  ]
  
  type FlattenOptionsType[OptionsType /* <: js.Array[js.Object] */] = js.Array[Dictname[OptionsType]]
  
  type GetLabeledValue[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] = js.Function2[/* value */ RawValueType, /* config */ LabelInValue[FOT], LabelValueType]
  
  type Key = String | Double
  
  trait LabelValueType extends StObject {
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[RawValueType] = js.undefined
  }
  object LabelValueType {
    
    inline def apply(): LabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelValueType]
    }
    
    extension [Self <: LabelValueType](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type OnClear = js.Function0[Unit]
  
  type RawValueType = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcSelect.rcSelectStrings.option
    - typings.rcSelect.rcSelectStrings.selection
    - typings.rcSelect.rcSelectStrings.input
  */
  trait SelectSource extends StObject
  object SelectSource {
    
    inline def input: typings.rcSelect.rcSelectStrings.input = "input".asInstanceOf[typings.rcSelect.rcSelectStrings.input]
    
    inline def option: typings.rcSelect.rcSelectStrings.option = "option".asInstanceOf[typings.rcSelect.rcSelectStrings.option]
    
    inline def selection: typings.rcSelect.rcSelectStrings.selection = "selection".asInstanceOf[typings.rcSelect.rcSelectStrings.selection]
  }
  
  type SingleType[MixType] = MixType
}
