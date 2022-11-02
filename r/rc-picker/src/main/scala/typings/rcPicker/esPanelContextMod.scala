package typings.rcPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcPicker.esInterfaceMod.OnSelect
import typings.rcPicker.esInterfaceMod.PanelMode
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.react.mod.Context
import typings.react.mod.KeyboardEvent
import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelContextMod extends Shortcut {
  
  @JSImport("rc-picker/es/PanelContext", JSImport.Default)
  @js.native
  val default: Context[PanelContextProps] = js.native
  
  trait ContextOperationRefProps extends StObject {
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Boolean]] = js.undefined
  }
  object ContextOperationRefProps {
    
    inline def apply(): ContextOperationRefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOperationRefProps]
    }
    
    extension [Self <: ContextOperationRefProps](x: Self) {
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  trait PanelContextProps extends StObject {
    
    /** Only used for TimePicker and this is a deprecated prop */
    var defaultOpenValue: js.UndefOr[Any] = js.undefined
    
    /** Only work with time panel */
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var hideNextBtn: js.UndefOr[Boolean] = js.undefined
    
    var hidePrevBtn: js.UndefOr[Boolean] = js.undefined
    
    var hideRanges: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[PanelMode] = js.undefined
    
    var onDateMouseEnter: js.UndefOr[js.Function1[/* date */ Any, Unit]] = js.undefined
    
    var onDateMouseLeave: js.UndefOr[js.Function1[/* date */ Any, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[OnSelect[Any]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var operationRef: js.UndefOr[MutableRefObject[ContextOperationRefProps | Null]] = js.undefined
  }
  object PanelContextProps {
    
    inline def apply(): PanelContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelContextProps]
    }
    
    extension [Self <: PanelContextProps](x: Self) {
      
      inline def setDefaultOpenValue(value: Any): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
      
      inline def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      inline def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      inline def setHideNextBtn(value: Boolean): Self = StObject.set(x, "hideNextBtn", value.asInstanceOf[js.Any])
      
      inline def setHideNextBtnUndefined: Self = StObject.set(x, "hideNextBtn", js.undefined)
      
      inline def setHidePrevBtn(value: Boolean): Self = StObject.set(x, "hidePrevBtn", value.asInstanceOf[js.Any])
      
      inline def setHidePrevBtnUndefined: Self = StObject.set(x, "hidePrevBtn", js.undefined)
      
      inline def setHideRanges(value: Boolean): Self = StObject.set(x, "hideRanges", value.asInstanceOf[js.Any])
      
      inline def setHideRangesUndefined: Self = StObject.set(x, "hideRanges", js.undefined)
      
      inline def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDateMouseEnter(value: /* date */ Any => Unit): Self = StObject.set(x, "onDateMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnDateMouseEnterUndefined: Self = StObject.set(x, "onDateMouseEnter", js.undefined)
      
      inline def setOnDateMouseLeave(value: /* date */ Any => Unit): Self = StObject.set(x, "onDateMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnDateMouseLeaveUndefined: Self = StObject.set(x, "onDateMouseLeave", js.undefined)
      
      inline def setOnSelect(value: (Any, /* type */ key | mouse | submit) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOperationRef(value: MutableRefObject[ContextOperationRefProps | Null]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      inline def setOperationRefUndefined: Self = StObject.set(x, "operationRef", js.undefined)
    }
  }
  
  type _To = Context[PanelContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esPanelContextMod.foo` */
  override def _to: Context[PanelContextProps] = default
}
