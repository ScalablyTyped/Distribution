package typings.reactTypesShared

import typings.react.mod.AriaAttributes
import typings.react.mod.AriaRole
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.SyntheticEvent
import typings.reactTypesShared.reactTypesSharedStrings.decimal
import typings.reactTypesShared.reactTypesSharedStrings.email
import typings.reactTypesShared.reactTypesSharedStrings.none
import typings.reactTypesShared.reactTypesSharedStrings.numeric
import typings.reactTypesShared.reactTypesSharedStrings.password
import typings.reactTypesShared.reactTypesSharedStrings.search
import typings.reactTypesShared.reactTypesSharedStrings.tel
import typings.reactTypesShared.reactTypesSharedStrings.text
import typings.reactTypesShared.reactTypesSharedStrings.url
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import typings.std.HTMLOrSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomMod {
  
  trait AriaLabelingProps extends StObject {
    
    /**
      * Identifies the element (or elements) that describes the object.
      */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element (or elements) that provide a detailed, extended description for the object.
      */
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    /**
      * Defines a string value that labels the current element.
      */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element (or elements) that labels the current element.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
  }
  object AriaLabelingProps {
    
    inline def apply(): AriaLabelingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaLabelingProps]
    }
    
    extension [Self <: AriaLabelingProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    }
  }
  
  trait AriaValidationProps extends StObject {
    
    // https://www.w3.org/TR/wai-aria-1.2/#aria-errormessage
    /**
      * Identifies the element that provides an error message for the object.
      */
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
  }
  object AriaValidationProps {
    
    inline def apply(): AriaValidationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaValidationProps]
    }
    
    extension [Self <: AriaValidationProps](x: Self) {
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    }
  }
  
  trait DOMAttributes[T]
    extends StObject
       with AriaAttributes
       with typings.react.mod.DOMAttributes[T] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object DOMAttributes {
    
    inline def apply[T](): DOMAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMAttributes[T]]
    }
    
    extension [Self <: DOMAttributes[?], T](x: Self & DOMAttributes[T]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  trait DOMProps extends StObject {
    
    /**
      * The element's unique identifier. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id).
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object DOMProps {
    
    inline def apply(): DOMProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMProps]
    }
    
    extension [Self <: DOMProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait FocusableDOMProps
    extends StObject
       with DOMProps {
    
    /**
      * Whether to exclude the element from the sequential tab order. If true,
      * the element will not be focusable via the keyboard by tabbing. This should
      * be avoided except in rare scenarios where an alternative means of accessing
      * the element or its functionality via the keyboard is available.
      */
    var excludeFromTabOrder: js.UndefOr[Boolean] = js.undefined
  }
  object FocusableDOMProps {
    
    inline def apply(): FocusableDOMProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusableDOMProps]
    }
    
    extension [Self <: FocusableDOMProps](x: Self) {
      
      inline def setExcludeFromTabOrder(value: Boolean): Self = StObject.set(x, "excludeFromTabOrder", value.asInstanceOf[js.Any])
      
      inline def setExcludeFromTabOrderUndefined: Self = StObject.set(x, "excludeFromTabOrder", js.undefined)
    }
  }
  
  @js.native
  trait FocusableElement
    extends StObject
       with Element
       with HTMLOrSVGElement
  
  trait TextInputDOMEvents extends StObject {
    
    // Input events
    /**
      * Handler that is called when the input value is about to be modified. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/beforeinput_event).
      */
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Handler that is called when a text composition system completes or cancels the current text composition session. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Element/compositionend_event).
      */
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    // Composition events
    /**
      * Handler that is called when a text composition system starts a new text composition session. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Element/compositionstart_event).
      */
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Handler that is called when a new character is received in the current text composition session. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Element/compositionupdate_event).
      */
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    // Clipboard events
    /**
      * Handler that is called when the user copies text. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/oncopy).
      */
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Handler that is called when the user cuts text. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/oncut).
      */
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Handler that is called when the input value is modified. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/input_event).
      */
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Handler that is called when the user pastes text. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onpaste).
      */
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    // Selection events
    /**
      * Handler that is called when text in the input is selected. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Element/select_event).
      */
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  }
  object TextInputDOMEvents {
    
    inline def apply(): TextInputDOMEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputDOMEvents]
    }
    
    extension [Self <: TextInputDOMEvents](x: Self) {
      
      inline def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
  
  trait TextInputDOMProps
    extends StObject
       with DOMProps
       with TextInputDOMEvents {
    
    /**
      * Describes the type of autocomplete functionality the input should provide if any. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefautocomplete).
      */
    var autoComplete: js.UndefOr[String] = js.undefined
    
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents. See [MDN](https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute).
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * The maximum number of characters supported by the input. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefmaxlength).
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of characters required by the input. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefminlength).
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the input element, used when submitting an HTML form. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefname).
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Regex pattern that the value of the input must match to be valid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefpattern).
      */
    var pattern: js.UndefOr[String] = js.undefined
    
    /**
      * Content that appears in the input when it is empty. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdefplaceholder).
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * The type of input to render. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#htmlattrdeftype).
      */
    var `type`: js.UndefOr[text | search | url | tel | email | password | String] = js.undefined
  }
  object TextInputDOMProps {
    
    inline def apply(): TextInputDOMProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputDOMProps]
    }
    
    extension [Self <: TextInputDOMProps](x: Self) {
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setType(value: text | search | url | tel | email | password | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
