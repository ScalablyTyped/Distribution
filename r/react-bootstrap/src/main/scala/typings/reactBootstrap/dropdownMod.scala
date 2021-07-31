package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaAttributes
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.Component
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
import typings.react.mod.ReactType
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.react.reactStrings.decimal
import typings.react.reactStrings.email
import typings.react.reactStrings.inherit
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.search
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.url
import typings.react.reactStrings.yes
import typings.reactBootstrap.anon.Source
import typings.reactBootstrap.mod.SelectCallback
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("react-bootstrap/lib/Dropdown", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DropdownProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Dropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Dropdown", "Menu")
  @js.native
  class Menu ()
    extends typings.reactBootstrap.dropdownMenuMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Dropdown", "Menu")
  @js.native
  def Menu: Instantiable0[typings.reactBootstrap.dropdownMenuMod.^] = js.native
  @scala.inline
  def Menu_=(x: Instantiable0[typings.reactBootstrap.dropdownMenuMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Dropdown", "Toggle")
  @js.native
  class Toggle ()
    extends typings.reactBootstrap.dropdownToggleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Dropdown", "Toggle")
  @js.native
  def Toggle: Instantiable0[typings.reactBootstrap.dropdownToggleMod.^] = js.native
  @scala.inline
  def Toggle_=(x: Instantiable0[typings.reactBootstrap.dropdownToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Dropdown
    extends Component[DropdownProps, js.Object, js.Any]
  
  trait DropdownBaseProps extends StObject {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropup: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var onSelect: js.UndefOr[SelectCallback] = js.undefined
    
    var onToggle: js.UndefOr[
        js.Function3[
          /* isOpen */ Boolean, 
          /* event */ SyntheticEvent[Element, Event], 
          /* metadata */ Source, 
          Unit
        ]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object DropdownBaseProps {
    
    @scala.inline
    def apply(id: String): DropdownBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownBaseProps]
    }
    
    @scala.inline
    implicit class DropdownBasePropsMutableBuilder[Self <: DropdownBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnToggle(
        value: (/* isOpen */ Boolean, /* event */ SyntheticEvent[Element, Event], /* metadata */ Source) => Unit
      ): Self = StObject.set(x, "onToggle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.DOMAttributes because var conflicts: onSelect. Inlined onKeyDown, onPlaying, onMouseOver, onMouseMove, onPointerCancel, onDragStart, onMouseEnter, onDragEnter, onPointerOver, onDragLeave, onMouseOut, onVolumeChange, onAnimationStart, onLoadedData, onTouchStart, onInput, onCompositionStart, onScroll, onDragEnd, onLoadStart, dangerouslySetInnerHTML, onFocus, onContextMenu, onError, onTouchMove, onTouchEnd, onDrag, onEnded, onAnimationIteration, onWaiting, onCompositionEnd, onDoubleClick, onEmptied, onStalled, onKeyPress, onMouseUp, onPointerLeave, onAuxClick, onWheel, onPointerUp, onProgress, onBlur, onPointerMove, onPause, onDrop, onReset, onPointerDown, onDragOver, onTimeUpdate, onMouseDown, onDurationChange, onSubmit, onSuspend, onTransitionEnd, onCanPlay, onDragExit, onEncrypted, onPlay, onPointerOut, onCopy, onAbort, onInvalid, onCompositionUpdate, onTouchCancel, children, onCanPlayThrough, onClick, onLoad, onLoadedMetadata, onSeeked, onChange, onPointerEnter, onBeforeInput, onAnimationEnd, onCut, onSeeking, onPaste, onMouseLeave, onRateChange, onKeyUp
  - typings.react.mod.HTMLAttributes because var conflicts: id, onSelect, role. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, className, unselectable, datatype, itemProp, title, autoCorrect, results
  - typings.react.mod.AllHTMLAttributes because var conflicts: disabled, id, onSelect, open, role. Inlined formAction, srcDoc, alt, coords, src, max, marginWidth, keyParams, required, selected, kind, charSet, srcLang, sizes, dateTime, multiple, height, rowSpan, as, method, content, nonce, start, httpEquiv, default, optimum, target, scope, sandbox, seamless, classID, noValidate, autoPlay, min, cols, capture, encType, wmode, wrap, keyType, frameBorder, media, preload, useMap, size, scoped, rel, maxLength, manifest, colSpan, data, formEncType, pattern, form, accept, step, defer, shape, value, cite, minLength, cellSpacing, label, readOnly, challenge, poster, name, formMethod, playsInline, marginHeight, htmlFor, allowTransparency, headers, width, summary, formTarget, rows, href, action, scrolling, low, acceptCharset, reversed, autoFocus, controls, loop, mediaGroup, download, crossOrigin, muted, async, integrity, high, `type`, checked, srcSet, formNoValidate, allowFullScreen, list, cellPadding, autoComplete, hrefLang, span
  - typings.react.mod.HTMLProps because var conflicts: disabled, id, onSelect, open, role. Inlined  */ trait DropdownProps
    extends StObject
       with DropdownBaseProps
       with ClassAttributes[Dropdown]
       with AriaAttributes {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accept: js.UndefOr[String] = js.undefined
    
    var acceptCharset: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    var action: js.UndefOr[String] = js.undefined
    
    var allowFullScreen: js.UndefOr[Boolean] = js.undefined
    
    var allowTransparency: js.UndefOr[Boolean] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    var as: js.UndefOr[String] = js.undefined
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var capture: js.UndefOr[Boolean | String] = js.undefined
    
    var cellPadding: js.UndefOr[Double | String] = js.undefined
    
    var cellSpacing: js.UndefOr[Double | String] = js.undefined
    
    var challenge: js.UndefOr[String] = js.undefined
    
    var charSet: js.UndefOr[String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var cite: js.UndefOr[String] = js.undefined
    
    var classID: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var coords: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var dateTime: js.UndefOr[String] = js.undefined
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var download: js.UndefOr[js.Any] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var encType: js.UndefOr[String] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    var frameBorder: js.UndefOr[Double | String] = js.undefined
    
    var headers: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var hrefLang: js.UndefOr[String] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var httpEquiv: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var keyParams: js.UndefOr[String] = js.undefined
    
    var keyType: js.UndefOr[String] = js.undefined
    
    var kind: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var low: js.UndefOr[Double] = js.undefined
    
    var manifest: js.UndefOr[String] = js.undefined
    
    var marginHeight: js.UndefOr[Double] = js.undefined
    
    var marginWidth: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var mediaGroup: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noValidate: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    // Media Events
    var onAbort: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[Dropdown]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[Dropdown]] = js.undefined
    
    // Animation Events
    var onAnimationStart: js.UndefOr[AnimationEventHandler[Dropdown]] = js.undefined
    
    // MouseEvents
    var onAuxClick: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[Dropdown]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[Dropdown]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    // Form Events
    var onChange: js.UndefOr[FormEventHandler[Dropdown]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    // Composition Events
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[Dropdown]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[Dropdown]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[Dropdown]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    // Clipboard Events
    var onCopy: js.UndefOr[ClipboardEventHandler[Dropdown]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[Dropdown]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[Dropdown]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    // Focus Events
    var onFocus: js.UndefOr[FocusEventHandler[Dropdown]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[Dropdown]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[Dropdown]] = js.undefined
    
    // also a Media Event
    // Keyboard Events
    var onKeyDown: js.UndefOr[KeyboardEventHandler[Dropdown]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[Dropdown]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[Dropdown]] = js.undefined
    
    // Image Events
    var onLoad: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[Dropdown]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[Dropdown]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    // Pointer Events
    var onPointerDown: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[Dropdown]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[Dropdown]] = js.undefined
    
    // UI Events
    var onScroll: js.UndefOr[UIEventHandler[Dropdown]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[Dropdown]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    // Touch Events
    var onTouchCancel: js.UndefOr[TouchEventHandler[Dropdown]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[Dropdown]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[Dropdown]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[Dropdown]] = js.undefined
    
    // Transition Events
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[Dropdown]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[Dropdown]] = js.undefined
    
    // Wheel Events
    var onWheel: js.UndefOr[WheelEventHandler[Dropdown]] = js.undefined
    
    var optimum: js.UndefOr[Double] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var playsInline: js.UndefOr[Boolean] = js.undefined
    
    var poster: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var preload: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var sandbox: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var scoped: js.UndefOr[Boolean] = js.undefined
    
    var scrolling: js.UndefOr[String] = js.undefined
    
    var seamless: js.UndefOr[Boolean] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var span: js.UndefOr[Double] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var srcDoc: js.UndefOr[String] = js.undefined
    
    var srcLang: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var useMap: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var wmode: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[String] = js.undefined
  }
  object DropdownProps {
    
    @scala.inline
    def apply(id: String): DropdownProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      @scala.inline
      def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      @scala.inline
      def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
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
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      @scala.inline
      def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      @scala.inline
      def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: AnimationEvent[Dropdown] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: AnimationEvent[Dropdown] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: AnimationEvent[Dropdown] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: FormEvent[Dropdown] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[Dropdown] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[Dropdown] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: CompositionEvent[Dropdown] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: CompositionEvent[Dropdown] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: CompositionEvent[Dropdown] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: ClipboardEvent[Dropdown] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: ClipboardEvent[Dropdown] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[Dropdown] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[Dropdown] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: FormEvent[Dropdown] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: FormEvent[Dropdown] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[Dropdown] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[Dropdown] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[Dropdown] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: MouseEvent[Dropdown, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ClipboardEvent[Dropdown] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: PointerEvent[Dropdown] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: FormEvent[Dropdown] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: UIEvent[Dropdown, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: FormEvent[Dropdown] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: TouchEvent[Dropdown] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[Dropdown] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: TouchEvent[Dropdown] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[Dropdown] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: TransitionEvent[Dropdown] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Dropdown, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: WheelEvent[Dropdown] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      @scala.inline
      def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
