package typings.reactMdMenu.anon

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
import typings.reactMdList.typesListMod.ListElement
import typings.reactMdMenu.reactMdMenuStrings.`additions removals`
import typings.reactMdMenu.reactMdMenuStrings.`additions text`
import typings.reactMdMenu.reactMdMenuStrings.`inline`
import typings.reactMdMenu.reactMdMenuStrings.`removals additions`
import typings.reactMdMenu.reactMdMenuStrings.`removals text`
import typings.reactMdMenu.reactMdMenuStrings.`text additions`
import typings.reactMdMenu.reactMdMenuStrings.`text removals`
import typings.reactMdMenu.reactMdMenuStrings.additions
import typings.reactMdMenu.reactMdMenuStrings.all
import typings.reactMdMenu.reactMdMenuStrings.ascending
import typings.reactMdMenu.reactMdMenuStrings.assertive
import typings.reactMdMenu.reactMdMenuStrings.both
import typings.reactMdMenu.reactMdMenuStrings.copy
import typings.reactMdMenu.reactMdMenuStrings.date
import typings.reactMdMenu.reactMdMenuStrings.decimal
import typings.reactMdMenu.reactMdMenuStrings.descending
import typings.reactMdMenu.reactMdMenuStrings.dialog
import typings.reactMdMenu.reactMdMenuStrings.email
import typings.reactMdMenu.reactMdMenuStrings.execute
import typings.reactMdMenu.reactMdMenuStrings.grammar
import typings.reactMdMenu.reactMdMenuStrings.grid
import typings.reactMdMenu.reactMdMenuStrings.horizontal
import typings.reactMdMenu.reactMdMenuStrings.inherit
import typings.reactMdMenu.reactMdMenuStrings.link
import typings.reactMdMenu.reactMdMenuStrings.list
import typings.reactMdMenu.reactMdMenuStrings.listbox
import typings.reactMdMenu.reactMdMenuStrings.location
import typings.reactMdMenu.reactMdMenuStrings.menu
import typings.reactMdMenu.reactMdMenuStrings.mixed
import typings.reactMdMenu.reactMdMenuStrings.move
import typings.reactMdMenu.reactMdMenuStrings.no
import typings.reactMdMenu.reactMdMenuStrings.none
import typings.reactMdMenu.reactMdMenuStrings.numeric
import typings.reactMdMenu.reactMdMenuStrings.off
import typings.reactMdMenu.reactMdMenuStrings.on
import typings.reactMdMenu.reactMdMenuStrings.other
import typings.reactMdMenu.reactMdMenuStrings.page
import typings.reactMdMenu.reactMdMenuStrings.polite
import typings.reactMdMenu.reactMdMenuStrings.popup
import typings.reactMdMenu.reactMdMenuStrings.removals
import typings.reactMdMenu.reactMdMenuStrings.search
import typings.reactMdMenu.reactMdMenuStrings.spelling
import typings.reactMdMenu.reactMdMenuStrings.step
import typings.reactMdMenu.reactMdMenuStrings.tel
import typings.reactMdMenu.reactMdMenuStrings.text
import typings.reactMdMenu.reactMdMenuStrings.time
import typings.reactMdMenu.reactMdMenuStrings.tree
import typings.reactMdMenu.reactMdMenuStrings.url
import typings.reactMdMenu.reactMdMenuStrings.vertical
import typings.reactMdMenu.reactMdMenuStrings.yes
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@react-md/utils.@react-md/utils.PropsWithRef<std.Omit<@react-md/list.@react-md/list.ListProps, 'horizontal'>, @react-md/list.@react-md/list.ListElement>> */
trait ReadonlyPropsWithRefOmitL extends StObject {
  
  val about: js.UndefOr[String] = js.undefined
  
  val accessKey: js.UndefOr[String] = js.undefined
  
  val `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  val `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  
  val `aria-busy`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  
  val `aria-colcount`: js.UndefOr[Double] = js.undefined
  
  val `aria-colindex`: js.UndefOr[Double] = js.undefined
  
  val `aria-colspan`: js.UndefOr[Double] = js.undefined
  
  val `aria-controls`: js.UndefOr[String] = js.undefined
  
  val `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  
  val `aria-describedby`: js.UndefOr[String] = js.undefined
  
  val `aria-details`: js.UndefOr[String] = js.undefined
  
  val `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  
  val `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  val `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-flowto`: js.UndefOr[String] = js.undefined
  
  val `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  
  val `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  
  val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  val `aria-label`: js.UndefOr[String] = js.undefined
  
  val `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  val `aria-level`: js.UndefOr[Double] = js.undefined
  
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  
  val `aria-modal`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  val `aria-owns`: js.UndefOr[String] = js.undefined
  
  val `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  val `aria-posinset`: js.UndefOr[Double] = js.undefined
  
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  
  val `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.undefined
  
  val `aria-required`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  val `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  val `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  val `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  val `aria-selected`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  val `aria-valuemax`: js.UndefOr[Double] = js.undefined
  
  val `aria-valuemin`: js.UndefOr[Double] = js.undefined
  
  val `aria-valuenow`: js.UndefOr[Double] = js.undefined
  
  val `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  val autoCapitalize: js.UndefOr[String] = js.undefined
  
  val autoCorrect: js.UndefOr[String] = js.undefined
  
  val autoFocus: js.UndefOr[Boolean] = js.undefined
  
  val autoSave: js.UndefOr[String] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val className: js.UndefOr[String] = js.undefined
  
  val color: js.UndefOr[String] = js.undefined
  
  val content: js.UndefOr[String] = js.undefined
  
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  
  val contextMenu: js.UndefOr[String] = js.undefined
  
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  val datatype: js.UndefOr[String] = js.undefined
  
  val defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  val dense: js.UndefOr[Boolean] = js.undefined
  
  val dir: js.UndefOr[String] = js.undefined
  
  val draggable: js.UndefOr[Booleanish] = js.undefined
  
  val hidden: js.UndefOr[Boolean] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val inlist: js.UndefOr[Any] = js.undefined
  
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
  val is: js.UndefOr[String] = js.undefined
  
  val itemID: js.UndefOr[String] = js.undefined
  
  val itemProp: js.UndefOr[String] = js.undefined
  
  val itemRef: js.UndefOr[String] = js.undefined
  
  val itemScope: js.UndefOr[Boolean] = js.undefined
  
  val itemType: js.UndefOr[String] = js.undefined
  
  val lang: js.UndefOr[String] = js.undefined
  
  val nonce: js.UndefOr[String] = js.undefined
  
  val onAbort: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[ListElement]] = js.undefined
  
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[ListElement]] = js.undefined
  
  val onAnimationStart: js.UndefOr[AnimationEventHandler[ListElement]] = js.undefined
  
  val onAuxClick: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onBeforeInput: js.UndefOr[FormEventHandler[ListElement]] = js.undefined
  
  val onBlur: js.UndefOr[FocusEventHandler[ListElement]] = js.undefined
  
  val onCanPlay: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onChange: js.UndefOr[FormEventHandler[ListElement]] = js.undefined
  
  val onClick: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[ListElement]] = js.undefined
  
  val onCompositionStart: js.UndefOr[CompositionEventHandler[ListElement]] = js.undefined
  
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[ListElement]] = js.undefined
  
  val onContextMenu: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onCopy: js.UndefOr[ClipboardEventHandler[ListElement]] = js.undefined
  
  val onCut: js.UndefOr[ClipboardEventHandler[ListElement]] = js.undefined
  
  val onDoubleClick: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onDrag: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDragEnd: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDragEnter: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDragExit: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDragLeave: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDragOver: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDragStart: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDrop: js.UndefOr[DragEventHandler[ListElement]] = js.undefined
  
  val onDurationChange: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onEmptied: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onEncrypted: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onEnded: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onError: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onFocus: js.UndefOr[FocusEventHandler[ListElement]] = js.undefined
  
  val onInput: js.UndefOr[FormEventHandler[ListElement]] = js.undefined
  
  val onInvalid: js.UndefOr[FormEventHandler[ListElement]] = js.undefined
  
  val onKeyDown: js.UndefOr[KeyboardEventHandler[ListElement]] = js.undefined
  
  val onKeyPress: js.UndefOr[KeyboardEventHandler[ListElement]] = js.undefined
  
  val onKeyUp: js.UndefOr[KeyboardEventHandler[ListElement]] = js.undefined
  
  val onLoad: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onLoadStart: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onLoadedData: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onMouseDown: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onMouseEnter: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onMouseLeave: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onMouseMove: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onMouseOut: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onMouseOver: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onMouseUp: js.UndefOr[MouseEventHandler[ListElement]] = js.undefined
  
  val onPaste: js.UndefOr[ClipboardEventHandler[ListElement]] = js.undefined
  
  val onPause: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onPlay: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onPlaying: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onPointerCancel: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onPointerDown: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onPointerEnter: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onPointerLeave: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onPointerMove: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onPointerOut: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onPointerOver: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onPointerUp: js.UndefOr[PointerEventHandler[ListElement]] = js.undefined
  
  val onProgress: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onRateChange: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onReset: js.UndefOr[FormEventHandler[ListElement]] = js.undefined
  
  val onResize: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onScroll: js.UndefOr[UIEventHandler[ListElement]] = js.undefined
  
  val onSeeked: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onSeeking: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onSelect: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onStalled: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onSubmit: js.UndefOr[FormEventHandler[ListElement]] = js.undefined
  
  val onSuspend: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onTimeUpdate: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onTouchCancel: js.UndefOr[TouchEventHandler[ListElement]] = js.undefined
  
  val onTouchEnd: js.UndefOr[TouchEventHandler[ListElement]] = js.undefined
  
  val onTouchMove: js.UndefOr[TouchEventHandler[ListElement]] = js.undefined
  
  val onTouchStart: js.UndefOr[TouchEventHandler[ListElement]] = js.undefined
  
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[ListElement]] = js.undefined
  
  val onVolumeChange: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onWaiting: js.UndefOr[ReactEventHandler[ListElement]] = js.undefined
  
  val onWheel: js.UndefOr[WheelEventHandler[ListElement]] = js.undefined
  
  val ordered: js.UndefOr[Boolean] = js.undefined
  
  val placeholder: js.UndefOr[String] = js.undefined
  
  val prefix: js.UndefOr[String] = js.undefined
  
  val property: js.UndefOr[String] = js.undefined
  
  val radioGroup: js.UndefOr[String] = js.undefined
  
  val ref: js.UndefOr[Ref[ListElement]] = js.undefined
  
  val rel: js.UndefOr[String] = js.undefined
  
  val resource: js.UndefOr[String] = js.undefined
  
  val results: js.UndefOr[Double] = js.undefined
  
  val rev: js.UndefOr[String] = js.undefined
  
  val role: js.UndefOr[AriaRole] = js.undefined
  
  val security: js.UndefOr[String] = js.undefined
  
  val slot: js.UndefOr[String] = js.undefined
  
  val spellCheck: js.UndefOr[Booleanish] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  val tabIndex: js.UndefOr[Double] = js.undefined
  
  val title: js.UndefOr[String] = js.undefined
  
  val translate: js.UndefOr[yes | no] = js.undefined
  
  val typeof: js.UndefOr[String] = js.undefined
  
  val unselectable: js.UndefOr[on | off] = js.undefined
  
  val vocab: js.UndefOr[String] = js.undefined
}
object ReadonlyPropsWithRefOmitL {
  
  inline def apply(): ReadonlyPropsWithRefOmitL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPropsWithRefOmitL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPropsWithRefOmitL] (val x: Self) extends AnyVal {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
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
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
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
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOnAbort(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: AnimationEvent[ListElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: AnimationEvent[ListElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: AnimationEvent[ListElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: FormEvent[ListElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[ListElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThrough(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: FormEvent[ListElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: CompositionEvent[ListElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: CompositionEvent[ListElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: CompositionEvent[ListElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ClipboardEvent[ListElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ClipboardEvent[ListElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragEnd(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: DragEvent[ListElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[ListElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInput(value: FormEvent[ListElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: FormEvent[ListElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[ListElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: KeyboardEvent[ListElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: KeyboardEvent[ListElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadStart(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnMouseDown(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: MouseEvent[ListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ClipboardEvent[ListElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: PointerEvent[ListElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: FormEvent[ListElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnResize(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnScroll(value: UIEvent[ListElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: FormEvent[ListElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: TouchEvent[ListElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: TouchEvent[ListElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: TouchEvent[ListElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: TouchEvent[ListElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: TransitionEvent[ListElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: SyntheticEvent[ListElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: WheelEvent[ListElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setRef(value: Ref[ListElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ ListElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
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
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
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
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
