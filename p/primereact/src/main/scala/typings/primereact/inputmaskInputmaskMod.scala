package typings.primereact

import typings.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputmaskInputmaskMod {
  
  @JSImport("primereact/inputmask/inputmask", "InputMask")
  @js.native
  open class InputMask protected () extends Component[InputMaskProps, Any, Any] {
    def this(props: InputMaskProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputMaskProps, context: Any) = this()
    
    def getElement(): Any = js.native
  }
  
  trait InputMaskChangeParams extends StObject {
    
    var originalEvent: SyntheticEvent[Element, Event]
    
    def preventDefault(): Unit
    
    def stopPropagation(): Unit
    
    var target: InputMaskChangeTargetOptions
    
    var value: String
  }
  object InputMaskChangeParams {
    
    inline def apply(
      originalEvent: SyntheticEvent[Element, Event],
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: InputMaskChangeTargetOptions,
      value: String
    ): InputMaskChangeParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMaskChangeParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputMaskChangeParams] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: InputMaskChangeTargetOptions): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputMaskChangeTargetOptions extends StObject {
    
    var id: String
    
    var name: String
    
    var value: String
  }
  object InputMaskChangeTargetOptions {
    
    inline def apply(id: String, name: String, value: String): InputMaskChangeTargetOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMaskChangeTargetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputMaskChangeTargetOptions] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputMaskCompleteParams extends StObject {
    
    var originalEvent: SyntheticEvent[Element, Event]
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object InputMaskCompleteParams {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event]): InputMaskCompleteParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMaskCompleteParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputMaskCompleteParams] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputTextProps * / any, 'onChange'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputTextProps * / any[P]} */ trait InputMaskProps extends StObject {
    
    var autoClear: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ InputMaskChangeParams, Unit]] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* e */ InputMaskCompleteParams, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var slotChar: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var unmask: js.UndefOr[Boolean] = js.undefined
  }
  object InputMaskProps {
    
    inline def apply(): InputMaskProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputMaskProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputMaskProps] (val x: Self) extends AnyVal {
      
      inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
      
      inline def setAutoClearUndefined: Self = StObject.set(x, "autoClear", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnBlur(value: /* event */ FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ InputMaskChangeParams => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnComplete(value: /* e */ InputMaskCompleteParams => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSlotChar(value: String): Self = StObject.set(x, "slotChar", value.asInstanceOf[js.Any])
      
      inline def setSlotCharUndefined: Self = StObject.set(x, "slotChar", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUnmask(value: Boolean): Self = StObject.set(x, "unmask", value.asInstanceOf[js.Any])
      
      inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
    }
  }
}
