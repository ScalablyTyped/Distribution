package typings.reactElemental.mod

import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactElemental.reactElementalStrings.`additions removals`
import typings.reactElemental.reactElementalStrings.`additions text`
import typings.reactElemental.reactElementalStrings.`inline`
import typings.reactElemental.reactElementalStrings.`removals additions`
import typings.reactElemental.reactElementalStrings.`removals text`
import typings.reactElemental.reactElementalStrings.`text additions`
import typings.reactElemental.reactElementalStrings.`text removals`
import typings.reactElemental.reactElementalStrings.additions
import typings.reactElemental.reactElementalStrings.all
import typings.reactElemental.reactElementalStrings.ascending
import typings.reactElemental.reactElementalStrings.assertive
import typings.reactElemental.reactElementalStrings.both
import typings.reactElemental.reactElementalStrings.copy
import typings.reactElemental.reactElementalStrings.date
import typings.reactElemental.reactElementalStrings.decimal
import typings.reactElemental.reactElementalStrings.descending
import typings.reactElemental.reactElementalStrings.dialog
import typings.reactElemental.reactElementalStrings.done
import typings.reactElemental.reactElementalStrings.email
import typings.reactElemental.reactElementalStrings.enter
import typings.reactElemental.reactElementalStrings.execute
import typings.reactElemental.reactElementalStrings.go
import typings.reactElemental.reactElementalStrings.grammar
import typings.reactElemental.reactElementalStrings.grid
import typings.reactElemental.reactElementalStrings.horizontal
import typings.reactElemental.reactElementalStrings.inherit
import typings.reactElemental.reactElementalStrings.link
import typings.reactElemental.reactElementalStrings.list
import typings.reactElemental.reactElementalStrings.listbox
import typings.reactElemental.reactElementalStrings.location
import typings.reactElemental.reactElementalStrings.menu
import typings.reactElemental.reactElementalStrings.mixed
import typings.reactElemental.reactElementalStrings.move
import typings.reactElemental.reactElementalStrings.next
import typings.reactElemental.reactElementalStrings.no
import typings.reactElemental.reactElementalStrings.none
import typings.reactElemental.reactElementalStrings.numeric
import typings.reactElemental.reactElementalStrings.off
import typings.reactElemental.reactElementalStrings.on
import typings.reactElemental.reactElementalStrings.other
import typings.reactElemental.reactElementalStrings.page
import typings.reactElemental.reactElementalStrings.polite
import typings.reactElemental.reactElementalStrings.popup
import typings.reactElemental.reactElementalStrings.previous
import typings.reactElemental.reactElementalStrings.removals
import typings.reactElemental.reactElementalStrings.search
import typings.reactElemental.reactElementalStrings.send
import typings.reactElemental.reactElementalStrings.spelling
import typings.reactElemental.reactElementalStrings.step
import typings.reactElemental.reactElementalStrings.tel
import typings.reactElemental.reactElementalStrings.text
import typings.reactElemental.reactElementalStrings.time
import typings.reactElemental.reactElementalStrings.tree
import typings.reactElemental.reactElementalStrings.url
import typings.reactElemental.reactElementalStrings.vertical
import typings.reactElemental.reactElementalStrings.yes
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-elemental.react-elemental.TextFieldProps & { readonly error :string | undefined,  readonly secondary :boolean | undefined,  readonly style :react.react.CSSProperties | undefined} */
trait TextAreaProps extends StObject {
  
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  
  var accept: js.UndefOr[String] = js.undefined
  
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.undefined
  
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.undefined
  
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  
  var autoComplete: js.UndefOr[String] = js.undefined
  
  var autoCorrect: js.UndefOr[String] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var autoSave: js.UndefOr[String] = js.undefined
  
  var capture: js.UndefOr[Boolean | String] = js.undefined
  
  // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var cols: js.UndefOr[Double] = js.undefined
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  
  var contextMenu: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var dirName: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var draggable: js.UndefOr[Booleanish] = js.undefined
  
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  val error: js.UndefOr[String] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formEncType: js.UndefOr[String] = js.undefined
  
  var formMethod: js.UndefOr[String] = js.undefined
  
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  
  var formTarget: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[js.Any] = js.undefined
  
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
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
  
  var lang: js.UndefOr[String] = js.undefined
  
  var list: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double | String] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double | String] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]]
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]]
  
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]]
  
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]]
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] & js.UndefOr[ChangeEventHandler[HTMLInputElement]]
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]]
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]]
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]]
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]]
  
  var onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
  
  // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
  
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
  
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] & js.UndefOr[UIEventHandler[HTMLInputElement]]
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
  
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] & js.UndefOr[TransitionEventHandler[HTMLInputElement]]
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] & js.UndefOr[WheelEventHandler[HTMLInputElement]]
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  // Unknown
  var radioGroup: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  val secondary: js.UndefOr[Boolean] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var step: js.UndefOr[Double | String] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  val textarea: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var translate: js.UndefOr[yes | no] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr[on | off] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  
  var vocab: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var wrap: js.UndefOr[String] = js.undefined
}
object TextAreaProps {
  
  inline def apply(
    onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] & js.UndefOr[ChangeEventHandler[HTMLInputElement]],
    onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] & js.UndefOr[UIEventHandler[HTMLInputElement]],
    onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] & js.UndefOr[TransitionEventHandler[HTMLInputElement]],
    onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] & js.UndefOr[WheelEventHandler[HTMLInputElement]]
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal(onAbort = onAbort.asInstanceOf[js.Any], onAnimationEnd = onAnimationEnd.asInstanceOf[js.Any], onAnimationIteration = onAnimationIteration.asInstanceOf[js.Any], onAnimationStart = onAnimationStart.asInstanceOf[js.Any], onAuxClick = onAuxClick.asInstanceOf[js.Any], onBeforeInput = onBeforeInput.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onCanPlay = onCanPlay.asInstanceOf[js.Any], onCanPlayThrough = onCanPlayThrough.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCompositionEnd = onCompositionEnd.asInstanceOf[js.Any], onCompositionStart = onCompositionStart.asInstanceOf[js.Any], onCompositionUpdate = onCompositionUpdate.asInstanceOf[js.Any], onContextMenu = onContextMenu.asInstanceOf[js.Any], onCopy = onCopy.asInstanceOf[js.Any], onCut = onCut.asInstanceOf[js.Any], onDoubleClick = onDoubleClick.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any], onDragEnd = onDragEnd.asInstanceOf[js.Any], onDragEnter = onDragEnter.asInstanceOf[js.Any], onDragExit = onDragExit.asInstanceOf[js.Any], onDragLeave = onDragLeave.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], onDragStart = onDragStart.asInstanceOf[js.Any], onDrop = onDrop.asInstanceOf[js.Any], onDurationChange = onDurationChange.asInstanceOf[js.Any], onEmptied = onEmptied.asInstanceOf[js.Any], onEncrypted = onEncrypted.asInstanceOf[js.Any], onEnded = onEnded.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onInput = onInput.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyPress = onKeyPress.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLoadStart = onLoadStart.asInstanceOf[js.Any], onLoadedData = onLoadedData.asInstanceOf[js.Any], onLoadedMetadata = onLoadedMetadata.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onMouseOut = onMouseOut.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], onMouseUp = onMouseUp.asInstanceOf[js.Any], onPaste = onPaste.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onPlaying = onPlaying.asInstanceOf[js.Any], onPointerCancel = onPointerCancel.asInstanceOf[js.Any], onPointerDown = onPointerDown.asInstanceOf[js.Any], onPointerEnter = onPointerEnter.asInstanceOf[js.Any], onPointerLeave = onPointerLeave.asInstanceOf[js.Any], onPointerMove = onPointerMove.asInstanceOf[js.Any], onPointerOut = onPointerOut.asInstanceOf[js.Any], onPointerOver = onPointerOver.asInstanceOf[js.Any], onPointerUp = onPointerUp.asInstanceOf[js.Any], onProgress = onProgress.asInstanceOf[js.Any], onRateChange = onRateChange.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], onSeeked = onSeeked.asInstanceOf[js.Any], onSeeking = onSeeking.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onStalled = onStalled.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onSuspend = onSuspend.asInstanceOf[js.Any], onTimeUpdate = onTimeUpdate.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransitionEnd = onTransitionEnd.asInstanceOf[js.Any], onVolumeChange = onVolumeChange.asInstanceOf[js.Any], onWaiting = onWaiting.asInstanceOf[js.Any], onWheel = onWheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps]
  }
  
  extension [Self <: TextAreaProps](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
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
    
    inline def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirName(value: String): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
    
    inline def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
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
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
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
    
    inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnAbort(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationEnd(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationIteration(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationStart(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    inline def setOnAuxClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeInput(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(
      value: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlay(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayThrough(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
    
    inline def setOnChange(
      value: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] & js.UndefOr[ChangeEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionEnd(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionStart(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionUpdate(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnContextMenu(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
    
    inline def setOnCopy(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    inline def setOnCut(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    inline def setOnDoubleClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
    
    inline def setOnDrag(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    inline def setOnDragEnd(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    inline def setOnDragEnter(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
    
    inline def setOnDragExit(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
    
    inline def setOnDragLeave(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
    
    inline def setOnDragOver(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
    
    inline def setOnDragStart(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    inline def setOnDrop(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    inline def setOnDurationChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
    
    inline def setOnEmptied(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    inline def setOnEncrypted(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    inline def setOnEnded(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    inline def setOnError(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(
      value: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnInput(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    inline def setOnInvalid(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPress(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUp(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnLoad(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadStart(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedData(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedMetadata(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDown(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnter(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeave(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMove(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOut(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOver(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUp(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    inline def setOnPaste(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    inline def setOnPause(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPlay(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    inline def setOnPlaying(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancel(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDown(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnter(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeave(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMove(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOut(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOver(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUp(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    inline def setOnProgress(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnRateChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
    
    inline def setOnReset(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    inline def setOnScroll(
      value: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] & js.UndefOr[UIEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnSeeked(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    inline def setOnSeeking(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnStalled(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    inline def setOnSubmit(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    inline def setOnSuspend(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    inline def setOnTimeUpdate(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancel(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEnd(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMove(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStart(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionEnd(
      value: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] & js.UndefOr[TransitionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
    
    inline def setOnVolumeChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
    
    inline def setOnWaiting(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    inline def setOnWheel(
      value: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] & js.UndefOr[WheelEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
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
    
    inline def setTextarea(value: Boolean): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
