package typings.rcMentions

import typings.rcMentions.esMentionsMod.Direction
import typings.rcMentions.esMentionsMod.MentionsProps
import typings.rcMentions.esMentionsMod.MentionsRef
import typings.rcMentions.esMentionsMod.Placement
import typings.rcMentions.esOptionMod.OptionProps
import typings.rcTextarea.anon.Height
import typings.rcTextarea.esResizableTextAreaMod.AutoSizeType
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
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
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<rc-mentions.rc-mentions/es/Mentions.MentionsProps & react.react.RefAttributes<rc-mentions.rc-mentions/es/Mentions.MentionsRef>> */
  trait PartialMentionsPropsRefAt extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr["none" | "inline" | "list" | "both"] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | "page" | "step" | "location" | "date" | "time"] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr["none" | "copy" | "execute" | "link" | "move" | "popup"] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | "grammar" | "spelling"] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr["off" | "assertive" | "polite"] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr["horizontal" | "vertical"] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr["none" | "ascending" | "descending" | "other"] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | "inherit"] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var dirName: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var filterOption: js.UndefOr[false | (js.Function2[/* input */ String, /* param1 */ OptionProps, Boolean])] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr["none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var notFoundContent: js.UndefOr[ReactNode] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function2[/* text */ String, /* prefix */ String, Unit]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* option */ OptionProps, /* prefix */ String, Unit]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[MentionsRef]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var split: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr["yes" | "no"] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr["on" | "off"] = js.undefined
    
    var validateSearch: js.UndefOr[js.Function2[/* text */ String, /* props */ MentionsProps, Boolean]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[String] = js.undefined
  }
  object PartialMentionsPropsRefAt {
    
    inline def apply(): PartialMentionsPropsRefAt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMentionsPropsRefAt]
    }
    
    extension [Self <: PartialMentionsPropsRefAt](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: "none" | "inline" | "list" | "both"): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | "page" | "step" | "location" | "date" | "time"): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: "none" | "copy" | "execute" | "link" | "move" | "popup"): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | "grammar" | "spelling"): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: "off" | "assertive" | "polite"): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: "horizontal" | "vertical"): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
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
      
      inline def `setAria-sort`(value: "none" | "ascending" | "descending" | "other"): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
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
      
      inline def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContentEditable(value: Booleanish | "inherit"): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirName(value: String): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
      
      inline def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setFilterOption(value: false | (js.Function2[/* input */ String, /* param1 */ OptionProps, Boolean])): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      inline def setFilterOptionFunction2(value: (/* input */ String, /* param1 */ OptionProps) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setGetPopupContainer(value: () => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction0(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: /* text */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnPressEnter(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: /* size */ Height => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLTextAreaElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSearch(value: (/* text */ String, /* prefix */ String) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: (/* option */ OptionProps, /* prefix */ String) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefix(value: String | js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value*))
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[MentionsRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ MentionsRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
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
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTranslate(value: "yes" | "no"): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: "on" | "off"): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValidateSearch(value: (/* text */ String, /* props */ MentionsProps) => Boolean): Self = StObject.set(x, "validateSearch", js.Any.fromFunction2(value))
      
      inline def setValidateSearchUndefined: Self = StObject.set(x, "validateSearch", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait SelectionLocation extends StObject {
    
    var selectionLocation: Double
    
    var text: String
  }
  object SelectionLocation {
    
    inline def apply(selectionLocation: Double, text: String): SelectionLocation = {
      val __obj = js.Dynamic.literal(selectionLocation = selectionLocation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionLocation]
    }
    
    extension [Self <: SelectionLocation](x: Self) {
      
      inline def setSelectionLocation(value: Double): Self = StObject.set(x, "selectionLocation", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.WeakValidationMap<rc-mentions.rc-mentions/es/Mentions.MentionsProps & react.react.RefAttributes<rc-mentions.rc-mentions/es/Mentions.MentionsRef>> */
  trait WeakValidationMapMentions extends StObject {
    
    var about: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var accessKey: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-atomic`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | null | undefined> : undefined extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-busy`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-checked`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-colcount`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-colindex`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-colspan`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-controls`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-current`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-describedby`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-details`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-disabled`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | null | undefined> : undefined extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-expanded`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-flowto`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-hidden`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-invalid`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-label`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-level`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-live`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'off' | 'assertive' | 'polite' | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | null | undefined> : undefined extends 'off' | 'assertive' | 'polite' | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | null | undefined> : react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-modal`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-multiline`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-orientation`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'horizontal' | 'vertical' | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | null | undefined> : undefined extends 'horizontal' | 'vertical' | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | null | undefined> : react.react.Validator<'horizontal' | 'vertical' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-owns`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-posinset`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-pressed`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-readonly`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | null | undefined> : undefined extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | null | undefined> : react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-selected`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-setsize`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-sort`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | null | undefined> : undefined extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var autoCapitalize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var autoComplete: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var autoCorrect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var autoFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var autoSave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var autoSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined | null | undefined> : undefined extends boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined | null | undefined> : react.react.Validator<boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ] = js.undefined
    
    var className: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var cols: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var contentEditable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | 'inherit' | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | 'inherit' | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var contextMenu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.anon.Html | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | null | undefined> : undefined extends react.anon.Html | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | null | undefined> : react.react.Validator<react.anon.Html | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var datatype: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var defaultChecked: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var defaultValue: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var dir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var dirName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var direction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined> */ js.Any
      ] = js.undefined
    
    var disabled: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var draggable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var dropdownClassName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var filterOption: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : undefined extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined> */ js.Any
      ] = js.undefined
    
    var form: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var getPopupContainer: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : undefined extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : react.react.Validator<(): std.HTMLElement | undefined> */ js.Any
      ] = js.undefined
    
    var hidden: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var id: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var inlist: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined | undefined ? react.react.Validator<any | undefined | undefined | null | undefined> : undefined extends any | undefined | undefined ? react.react.Validator<any | undefined | undefined | null | undefined> : react.react.Validator<any | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var inputMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | null | undefined> : undefined extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var is: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var itemID: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var itemProp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var itemRef: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var itemScope: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var itemType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var key: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ] = js.undefined
    
    var lang: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var maxLength: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var minLength: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var name: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var nonce: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var notFoundContent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ] = js.undefined
    
    var onAbort: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onAnimationEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onAnimationIteration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onAnimationStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onAuxClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onBeforeInput: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onBlur: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCanPlay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : undefined extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : react.react.Validator<(text : string): void | undefined> */ js.Any
      ] = js.undefined
    
    var onClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onCompositionEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onCompositionStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onContextMenu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onCopy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onCut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDoubleClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDrag: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDragEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDragEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDragExit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDragLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDragOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDragStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDrop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onDurationChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onEmptied: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onEncrypted: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onEnded: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onError: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onInput: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onInvalid: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onLoad: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onLoadStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onLoadedData: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseOut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPaste: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPause: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPlay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPlaying: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerCancel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerOut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onPressEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onProgress: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onRateChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onReset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onResize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : undefined extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onScroll: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onSearch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : undefined extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : react.react.Validator<(text : string, prefix : string): void | undefined> */ js.Any
      ] = js.undefined
    
    var onSeeked: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onSeeking: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : undefined extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined> */ js.Any
      ] = js.undefined
    
    var onStalled: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onSubmit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onSuspend: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onTimeUpdate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchCancel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onTransitionEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onVolumeChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onWaiting: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var onWheel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var open: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var placeholder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined> */ js.Any
      ] = js.undefined
    
    var prefix: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : undefined extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : react.react.Validator<string | std.Array<string> | undefined> */ js.Any
      ] = js.undefined
    
    var prefixCls: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var property: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var radioGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var readOnly: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : undefined extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined> */ js.Any
      ] = js.undefined
    
    var required: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var resource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var results: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var role: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AriaRole | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | null | undefined> : undefined extends react.react.AriaRole | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | null | undefined> : react.react.Validator<react.react.AriaRole | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var rows: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var security: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var slot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var spellCheck: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var split: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : undefined extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : react.react.Validator<react.react.CSSProperties | undefined> */ js.Any
      ] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var tabIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var title: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var transitionName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var translate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'yes' | 'no' | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | null | undefined> : undefined extends 'yes' | 'no' | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | null | undefined> : react.react.Validator<'yes' | 'no' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var typeof: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var unselectable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'on' | 'off' | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | null | undefined> : undefined extends 'on' | 'off' | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | null | undefined> : react.react.Validator<'on' | 'off' | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var validateSearch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined ? react.react.Validator<(text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined | null | undefined> : undefined extends (text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined ? react.react.Validator<(text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined | null | undefined> : react.react.Validator<(text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined> */ js.Any
      ] = js.undefined
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var vocab: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
    
    var wrap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ] = js.undefined
  }
  object WeakValidationMapMentions {
    
    inline def apply(): WeakValidationMapMentions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapMentions]
    }
    
    extension [Self <: WeakValidationMapMentions](x: Self) {
      
      inline def setAbout(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def `setAria-activedescendant`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | null | undefined> : undefined extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | null | undefined> : undefined extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'off' | 'assertive' | 'polite' | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | null | undefined> : undefined extends 'off' | 'assertive' | 'polite' | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | null | undefined> : react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'horizontal' | 'vertical' | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | null | undefined> : undefined extends 'horizontal' | 'vertical' | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | null | undefined> : react.react.Validator<'horizontal' | 'vertical' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | null | undefined> : undefined extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | null | undefined> : react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | null | undefined> : undefined extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setAutoSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined | null | undefined> : undefined extends boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined | null | undefined> : react.react.Validator<boolean | rc-textarea.rc-textarea/es/ResizableTextArea.AutoSizeType | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCols(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContentEditable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | 'inherit' | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | 'inherit' | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.anon.Html | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | null | undefined> : undefined extends react.anon.Html | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | null | undefined> : react.react.Validator<react.anon.Html | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDir(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
      
      inline def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined> */ js.Any
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDropdownClassName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setFilterOption(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : undefined extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      inline def setForm(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setGetPopupContainer(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : undefined extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : react.react.Validator<(): std.HTMLElement | undefined> */ js.Any
      ): Self = StObject.set(x, "getPopupContainer", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setHidden(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined | undefined ? react.react.Validator<any | undefined | undefined | null | undefined> : undefined extends any | undefined | undefined ? react.react.Validator<any | undefined | undefined | null | undefined> : react.react.Validator<any | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | null | undefined> : undefined extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaxLength(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonce(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setNotFoundContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      inline def setOnAbort(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThrough(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : undefined extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : react.react.Validator<(text : string): void | undefined> */ js.Any
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnPressEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPressEnter", value.asInstanceOf[js.Any])
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setOnProgress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : undefined extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSearch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : undefined extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : react.react.Validator<(text : string, prefix : string): void | undefined> */ js.Any
      ): Self = StObject.set(x, "onSearch", value.asInstanceOf[js.Any])
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSeeked(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : undefined extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined> */ js.Any
      ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpen(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlacement(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined> */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefix(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : undefined extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : react.react.Validator<string | std.Array<string> | undefined> */ js.Any
      ): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : undefined extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AriaRole | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | null | undefined> : undefined extends react.react.AriaRole | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | null | undefined> : react.react.Validator<react.react.AriaRole | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSecurity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSplit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : undefined extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : react.react.Validator<react.react.CSSProperties | undefined> */ js.Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined ? react.react.Validator<number | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTranslate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'yes' | 'no' | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | null | undefined> : undefined extends 'yes' | 'no' | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | null | undefined> : react.react.Validator<'yes' | 'no' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'on' | 'off' | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | null | undefined> : undefined extends 'on' | 'off' | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | null | undefined> : react.react.Validator<'on' | 'off' | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValidateSearch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined ? react.react.Validator<(text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined | null | undefined> : undefined extends (text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined ? react.react.Validator<(text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined | null | undefined> : react.react.Validator<(text : string, props : rc-mentions.rc-mentions/es/Mentions.MentionsProps): boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "validateSearch", value.asInstanceOf[js.Any])
      
      inline def setValidateSearchUndefined: Self = StObject.set(x, "validateSearch", js.undefined)
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVocab(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWrap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined ? react.react.Validator<string | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
