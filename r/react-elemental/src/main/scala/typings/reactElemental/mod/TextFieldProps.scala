package typings.reactElemental.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.TextareaHTMLAttributes
import typings.react.reactStrings.done
import typings.react.reactStrings.enter
import typings.react.reactStrings.go
import typings.react.reactStrings.next
import typings.react.reactStrings.previous
import typings.react.reactStrings.search
import typings.react.reactStrings.send
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.DOMAttributes because Already inherited
- typings.react.mod.AriaAttributes because Already inherited
- typings.react.mod.HTMLAttributes because Already inherited
- typings.react.mod.InputHTMLAttributes because var conflicts: about, accessKey, `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, autoCapitalize, autoComplete, autoCorrect, autoFocus, autoSave, children, className, color, contentEditable, contextMenu, dangerouslySetInnerHTML, datatype, defaultChecked, defaultValue, dir, disabled, draggable, form, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, maxLength, minLength, name, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onAuxClick, onBeforeInput, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, placeholder, prefix, property, radioGroup, readOnly, required, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, translate, typeof, unselectable, value, vocab. Inlined formAction, alt, src, max, multiple, height, enterKeyHint, min, capture, size, formEncType, pattern, accept, step, formMethod, width, formTarget, crossOrigin, `type`, checked, onChange_InputHTMLAttributes, formNoValidate, list */ trait TextFieldProps
  extends StObject
     with TextareaHTMLAttributes[HTMLTextAreaElement] {
  
  var accept: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  var capture: js.UndefOr[Boolean | String] = js.undefined
  
  // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  val error: js.UndefOr[String] = js.undefined
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formEncType: js.UndefOr[String] = js.undefined
  
  var formMethod: js.UndefOr[String] = js.undefined
  
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  
  var formTarget: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var list: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double | String] = js.undefined
  
  var min: js.UndefOr[Double | String] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  @JSName("onChange")
  var onChange_InputHTMLAttributes: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  val secondary: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var step: js.UndefOr[Double | String] = js.undefined
  
  val textarea: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object TextFieldProps {
  
  @scala.inline
  def apply(): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldProps]
  }
  
  @scala.inline
  implicit class TextFieldPropsMutableBuilder[Self <: TextFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    @scala.inline
    def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    @scala.inline
    def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    @scala.inline
    def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTextarea(value: Boolean): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
