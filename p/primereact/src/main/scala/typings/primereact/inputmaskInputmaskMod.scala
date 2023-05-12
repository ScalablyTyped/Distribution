package typings.primereact

import typings.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typings.primereact.tsHelpersMod.FormEvent
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
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: InputMaskProps, context: Any) = this()
    
    /**
      * Used to focus the component.
      */
    def focus(): Unit = js.native
    
    /**
      * Used to get container element.
      * @return {InputText} Container element
      */
    def getElement(): Any = js.native
  }
  
  /**
    * Custom change event.
    * @see {@link InputMaskProps.onChange}
    * @extends {FormEvent}
    * @event
    */
  type InputMaskChangeEvent = FormEvent[String, SyntheticEvent[Element, Event]]
  
  /**
    * Custom complete event
    * @see {@link InputMaskProps.onComplete}
    * @event
    */
  trait InputMaskCompleteEvent extends StObject {
    
    /**
      * Browser event
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * New value of the component
      */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object InputMaskCompleteEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event]): InputMaskCompleteEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMaskCompleteEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputMaskCompleteEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputTextProps * / any, 'onChange'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputTextProps * / any[P]} */ trait InputMaskProps extends StObject {
    
    /**
      * Clears the incomplete value on blur.
      * @defaultValue true
      */
    var autoClear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * When present, it specifies that the element value cannot be altered.
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mask pattern.
      */
    var mask: js.UndefOr[String] = js.undefined
    
    /**
      * Callback to invoke when input loses focus.
      * @param {React.FocusEvent<HTMLInputElement>} event - Browser event
      */
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.undefined
    
    /**
      * Callback to invoke on value change.
      * @param {InputMaskChangeEvent} event - Custom change event
      */
    var onChange: js.UndefOr[js.Function1[/* event */ InputMaskChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke on when user completes the mask pattern.
      * @param {InputMaskCompleteEvent} event - Custom complete event
      */
    var onComplete: js.UndefOr[js.Function1[/* event */ InputMaskCompleteEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when input receives focus.
      * @param {React.FocusEvent<HTMLInputElement>} event - Browser event
      */
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.undefined
    
    /**
      * When present, it specifies that an input field is read-only.
      * @defaultValue false
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When present, it specifies that the element must be filled out before submitting the form.
      * @defaultValue false
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Placeholder character in mask.
      * @defaultValue _
      */
    var slotChar: js.UndefOr[String] = js.undefined
    
    /**
      * Content of the tooltip.
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration of the tooltip, refer to the tooltip documentation for more information.
      * @type {TooltipOptions}
      */
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    /**
      * Defines if model sets the raw unmasked value to bound value or the formatted mask value.
      * @defaultValue false
      */
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
      
      inline def setOnChange(value: /* event */ InputMaskChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnComplete(value: /* event */ InputMaskCompleteEvent => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
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
