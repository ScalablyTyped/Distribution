package typings.rcPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.react.mod.Context
import typings.react.mod.KeyboardEvent
import typings.react.mod.MutableRefObject
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelContextMod extends Shortcut {
  
  @JSImport("rc-picker/es/PanelContext", JSImport.Default)
  @js.native
  val default: Context[PanelContextProps] = js.native
  
  @js.native
  trait ContextOperationRefProps extends StObject {
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Boolean]] = js.native
  }
  object ContextOperationRefProps {
    
    @scala.inline
    def apply(): ContextOperationRefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOperationRefProps]
    }
    
    @scala.inline
    implicit class ContextOperationRefPropsMutableBuilder[Self <: ContextOperationRefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  @js.native
  trait PanelContextProps extends StObject {
    
    /** Only used for TimePicker and this is a deprecated prop */
    var defaultOpenValue: js.UndefOr[js.Any] = js.native
    
    /** Only work with time panel */
    var hideHeader: js.UndefOr[Boolean] = js.native
    
    var hideNextBtn: js.UndefOr[Boolean] = js.native
    
    var hidePrevBtn: js.UndefOr[Boolean] = js.native
    
    var hideRanges: js.UndefOr[Boolean] = js.native
    
    var onDateMouseEnter: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
    
    var onDateMouseLeave: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
    
    var onSelect: js.UndefOr[OnSelect[_]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var operationRef: js.UndefOr[MutableRefObject[ContextOperationRefProps | Null]] = js.native
    
    var panelRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
  }
  object PanelContextProps {
    
    @scala.inline
    def apply(): PanelContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelContextProps]
    }
    
    @scala.inline
    implicit class PanelContextPropsMutableBuilder[Self <: PanelContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOpenValue(value: js.Any): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
      
      @scala.inline
      def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      @scala.inline
      def setHideNextBtn(value: Boolean): Self = StObject.set(x, "hideNextBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNextBtnUndefined: Self = StObject.set(x, "hideNextBtn", js.undefined)
      
      @scala.inline
      def setHidePrevBtn(value: Boolean): Self = StObject.set(x, "hidePrevBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePrevBtnUndefined: Self = StObject.set(x, "hidePrevBtn", js.undefined)
      
      @scala.inline
      def setHideRanges(value: Boolean): Self = StObject.set(x, "hideRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideRangesUndefined: Self = StObject.set(x, "hideRanges", js.undefined)
      
      @scala.inline
      def setOnDateMouseEnter(value: /* date */ js.Any => Unit): Self = StObject.set(x, "onDateMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDateMouseEnterUndefined: Self = StObject.set(x, "onDateMouseEnter", js.undefined)
      
      @scala.inline
      def setOnDateMouseLeave(value: /* date */ js.Any => Unit): Self = StObject.set(x, "onDateMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDateMouseLeaveUndefined: Self = StObject.set(x, "onDateMouseLeave", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (_, /* type */ key | mouse | submit) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOperationRef(value: MutableRefObject[ContextOperationRefProps | Null]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationRefUndefined: Self = StObject.set(x, "operationRef", js.undefined)
      
      @scala.inline
      def setPanelRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "panelRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "panelRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRefNull: Self = StObject.set(x, "panelRef", null)
      
      @scala.inline
      def setPanelRefUndefined: Self = StObject.set(x, "panelRef", js.undefined)
    }
  }
  
  type _To = Context[PanelContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `panelContextMod.foo` */
  override def _to: Context[PanelContextProps] = default
}
