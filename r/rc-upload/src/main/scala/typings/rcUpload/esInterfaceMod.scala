package typings.rcUpload

import typings.rcUpload.rcUploadInts.`0`
import typings.rcUpload.rcUploadInts.`1`
import typings.rcUpload.rcUploadInts.`2`
import typings.rcUpload.rcUploadInts.`3`
import typings.rcUpload.rcUploadStrings._empty
import typings.rcUpload.rcUploadStrings.`additions removals`
import typings.rcUpload.rcUploadStrings.`additions text`
import typings.rcUpload.rcUploadStrings.`inline`
import typings.rcUpload.rcUploadStrings.`removals additions`
import typings.rcUpload.rcUploadStrings.`removals text`
import typings.rcUpload.rcUploadStrings.`text additions`
import typings.rcUpload.rcUploadStrings.`text removals`
import typings.rcUpload.rcUploadStrings.`use-credentials`
import typings.rcUpload.rcUploadStrings.additions
import typings.rcUpload.rcUploadStrings.all
import typings.rcUpload.rcUploadStrings.anonymous
import typings.rcUpload.rcUploadStrings.ascending
import typings.rcUpload.rcUploadStrings.assertive
import typings.rcUpload.rcUploadStrings.both
import typings.rcUpload.rcUploadStrings.copy
import typings.rcUpload.rcUploadStrings.date
import typings.rcUpload.rcUploadStrings.decimal
import typings.rcUpload.rcUploadStrings.descending
import typings.rcUpload.rcUploadStrings.dialog
import typings.rcUpload.rcUploadStrings.done
import typings.rcUpload.rcUploadStrings.email
import typings.rcUpload.rcUploadStrings.enter
import typings.rcUpload.rcUploadStrings.environment
import typings.rcUpload.rcUploadStrings.execute
import typings.rcUpload.rcUploadStrings.go
import typings.rcUpload.rcUploadStrings.grammar
import typings.rcUpload.rcUploadStrings.grid
import typings.rcUpload.rcUploadStrings.horizontal
import typings.rcUpload.rcUploadStrings.inherit
import typings.rcUpload.rcUploadStrings.link
import typings.rcUpload.rcUploadStrings.list
import typings.rcUpload.rcUploadStrings.listbox
import typings.rcUpload.rcUploadStrings.location
import typings.rcUpload.rcUploadStrings.menu
import typings.rcUpload.rcUploadStrings.mixed
import typings.rcUpload.rcUploadStrings.move
import typings.rcUpload.rcUploadStrings.next
import typings.rcUpload.rcUploadStrings.no
import typings.rcUpload.rcUploadStrings.none
import typings.rcUpload.rcUploadStrings.numeric
import typings.rcUpload.rcUploadStrings.off
import typings.rcUpload.rcUploadStrings.on
import typings.rcUpload.rcUploadStrings.other
import typings.rcUpload.rcUploadStrings.page
import typings.rcUpload.rcUploadStrings.patch_
import typings.rcUpload.rcUploadStrings.polite
import typings.rcUpload.rcUploadStrings.popup
import typings.rcUpload.rcUploadStrings.post_
import typings.rcUpload.rcUploadStrings.previous
import typings.rcUpload.rcUploadStrings.put_
import typings.rcUpload.rcUploadStrings.removals
import typings.rcUpload.rcUploadStrings.search
import typings.rcUpload.rcUploadStrings.send
import typings.rcUpload.rcUploadStrings.spelling
import typings.rcUpload.rcUploadStrings.step
import typings.rcUpload.rcUploadStrings.tel
import typings.rcUpload.rcUploadStrings.text
import typings.rcUpload.rcUploadStrings.time
import typings.rcUpload.rcUploadStrings.tree
import typings.rcUpload.rcUploadStrings.url
import typings.rcUpload.rcUploadStrings.user
import typings.rcUpload.rcUploadStrings.vertical
import typings.rcUpload.rcUploadStrings.yes
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLInputTypeAttribute
import typings.react.mod.JSXElementConstructor
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Blob
import typings.std.DOMHighResTimeStamp
import typings.std.Element
import typings.std.Error
import typings.std.Event
import typings.std.EventTarget
import typings.std.Exclude
import typings.std.File
import typings.std.FormData
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.ProgressEvent
import typings.std.PromiseLike
import typings.std.Record
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  type Action = String | (js.Function1[/* file */ RcFile, String | PromiseLike[String]])
  
  type BeforeUploadFileType = File | Blob | Boolean | String
  
  @js.native
  trait RcFile
    extends StObject
       with File {
    
    var uid: String = js.native
  }
  
  /* Inlined parent std.Partial<std.ProgressEvent<std.EventTarget>> */
  trait UploadProgressEvent extends StObject {
    
    var AT_TARGET: js.UndefOr[`2`] = js.undefined
    
    var BUBBLING_PHASE: js.UndefOr[`3`] = js.undefined
    
    var CAPTURING_PHASE: js.UndefOr[`1`] = js.undefined
    
    var NONE: js.UndefOr[`0`] = js.undefined
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelBubble: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var composed: js.UndefOr[Boolean] = js.undefined
    
    var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.undefined
    
    var currentTarget: js.UndefOr[EventTarget | Null] = js.undefined
    
    var defaultPrevented: js.UndefOr[Boolean] = js.undefined
    
    var eventPhase: js.UndefOr[Double] = js.undefined
    
    var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
    
    var isTrusted: js.UndefOr[Boolean] = js.undefined
    
    var lengthComputable: js.UndefOr[Boolean] = js.undefined
    
    var loaded: js.UndefOr[Double] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnValue: js.UndefOr[Boolean] = js.undefined
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
    
    var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[EventTarget | Null] = js.undefined
    
    var timeStamp: js.UndefOr[DOMHighResTimeStamp] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object UploadProgressEvent {
    
    inline def apply(): UploadProgressEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadProgressEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadProgressEvent] (val x: Self) extends AnyVal {
      
      inline def setAT_TARGET(value: `2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      inline def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
      
      inline def setBUBBLING_PHASE(value: `3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCAPTURING_PHASE(value: `1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
      
      inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      inline def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      inline def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
      
      inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
      
      inline def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      inline def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
      
      inline def setLengthComputableUndefined: Self = StObject.set(x, "lengthComputable", js.undefined)
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, 'onError' | 'onProgress'> */
  trait UploadProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var action: js.UndefOr[Action] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var beforeUpload: js.UndefOr[
        js.Function2[
          /* file */ RcFile, 
          /* FileList */ js.Array[RcFile], 
          BeforeUploadFileType | (js.Promise[Unit | BeforeUploadFileType])
        ]
      ] = js.undefined
    
    var capture: js.UndefOr[Boolean | user | environment] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[JSXElementConstructor[Any]] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
    
    var customRequest: js.UndefOr[js.Function1[/* option */ UploadRequestOption[Any], Unit]] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var data: js.UndefOr[
        (Record[String, Any]) | (js.Function1[/* file */ RcFile | String | Blob, Record[String, Any]])
      ] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var directory: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String | (js.Function1[/* formData */ FormData, Unit])] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[UploadRequestHeader] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[UploadRequestMethod] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onBatchStart: js.UndefOr[js.Function1[/* fileList */ js.Array[typings.rcUpload.anon.File], Unit]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[
          /* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[
        js.Function3[/* error */ js.Error, /* ret */ Record[String, Any], /* file */ RcFile, Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[js.Function2[/* event */ UploadProgressEvent, /* file */ RcFile, Unit]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* file */ RcFile, Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function3[/* response */ Record[String, Any], /* file */ RcFile, /* xhr */ XMLHttpRequest, Unit]
      ] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    var openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var rev: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object UploadProps {
    
    inline def apply(): UploadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadProps] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* file */ RcFile => String | PromiseLike[String]): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBeforeUpload(
        value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => BeforeUploadFileType | (js.Promise[Unit | BeforeUploadFileType])
      ): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction2(value))
      
      inline def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
      
      inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setComponent(value: JSXElementConstructor[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentFunction1(value: Any => ReactElement | Null): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCustomRequest(value: /* option */ UploadRequestOption[Any] => Unit): Self = StObject.set(x, "customRequest", js.Any.fromFunction1(value))
      
      inline def setCustomRequestUndefined: Self = StObject.set(x, "customRequest", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setData(
        value: (Record[String, Any]) | (js.Function1[/* file */ RcFile | String | Blob, Record[String, Any]])
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataFunction1(value: /* file */ RcFile | String | Blob => Record[String, Any]): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String | (js.Function1[/* formData */ FormData, Unit])): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionFunction1(value: /* formData */ FormData => Unit): Self = StObject.set(x, "formAction", js.Any.fromFunction1(value))
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeaders(value: UploadRequestHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMethod(value: UploadRequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBatchStart(value: /* fileList */ js.Array[typings.rcUpload.anon.File] => Unit): Self = StObject.set(x, "onBatchStart", js.Any.fromFunction1(value))
      
      inline def setOnBatchStartUndefined: Self = StObject.set(x, "onBatchStart", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(
        value: /* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement] => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* ret */ Record[String, Any], /* file */ RcFile) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: (/* event */ UploadProgressEvent, /* file */ RcFile) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnStart(value: /* file */ RcFile => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuccess(value: (/* response */ Record[String, Any], /* file */ RcFile, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpenFileDialogOnClick(value: Boolean): Self = StObject.set(x, "openFileDialogOnClick", value.asInstanceOf[js.Any])
      
      inline def setOpenFileDialogOnClickUndefined: Self = StObject.set(x, "openFileDialogOnClick", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: HTMLInputTypeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait UploadRequestError
    extends StObject
       with Error {
    
    var method: js.UndefOr[UploadRequestMethod] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UploadRequestError {
    
    inline def apply(message: String, name: String): UploadRequestError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRequestError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadRequestError] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: UploadRequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type UploadRequestHeader = Record[String, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcUpload.rcUploadStrings.POST
    - typings.rcUpload.rcUploadStrings.PUT
    - typings.rcUpload.rcUploadStrings.PATCH
    - typings.rcUpload.rcUploadStrings.post_
    - typings.rcUpload.rcUploadStrings.put_
    - typings.rcUpload.rcUploadStrings.patch_
  */
  trait UploadRequestMethod extends StObject
  object UploadRequestMethod {
    
    inline def PATCH: typings.rcUpload.rcUploadStrings.PATCH = "PATCH".asInstanceOf[typings.rcUpload.rcUploadStrings.PATCH]
    
    inline def POST: typings.rcUpload.rcUploadStrings.POST = "POST".asInstanceOf[typings.rcUpload.rcUploadStrings.POST]
    
    inline def PUT: typings.rcUpload.rcUploadStrings.PUT = "PUT".asInstanceOf[typings.rcUpload.rcUploadStrings.PUT]
    
    inline def patch: patch_ = "patch".asInstanceOf[patch_]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def put: put_ = "put".asInstanceOf[put_]
  }
  
  trait UploadRequestOption[T] extends StObject {
    
    var action: String
    
    var data: js.UndefOr[Record[String, Any]] = js.undefined
    
    var file: (Exclude[BeforeUploadFileType, File | Boolean]) | RcFile
    
    var filename: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[UploadRequestHeader] = js.undefined
    
    var method: UploadRequestMethod
    
    var onError: js.UndefOr[
        js.Function2[
          /* event */ UploadRequestError | ProgressEvent[EventTarget], 
          /* body */ js.UndefOr[T], 
          Unit
        ]
      ] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* event */ UploadProgressEvent, Unit]] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function2[/* body */ T, /* xhr */ js.UndefOr[XMLHttpRequest], Unit]] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object UploadRequestOption {
    
    inline def apply[T](
      action: String,
      file: (Exclude[BeforeUploadFileType, File | Boolean]) | RcFile,
      method: UploadRequestMethod
    ): UploadRequestOption[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRequestOption[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadRequestOption[?], T] (val x: Self & UploadRequestOption[T]) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFile(value: (Exclude[BeforeUploadFileType, File | Boolean]) | RcFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeaders(value: UploadRequestHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: UploadRequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOnError(
        value: (/* event */ UploadRequestError | ProgressEvent[EventTarget], /* body */ js.UndefOr[T]) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnProgress(value: /* event */ UploadProgressEvent => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnSuccess(value: (/* body */ T, /* xhr */ js.UndefOr[XMLHttpRequest]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
