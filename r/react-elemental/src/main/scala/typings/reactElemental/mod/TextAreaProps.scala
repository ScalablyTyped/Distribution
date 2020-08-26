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
import typings.reactElemental.reactElementalStrings.`additions text`
import typings.reactElemental.reactElementalStrings.`inline`
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
import typings.reactElemental.reactElementalStrings.email
import typings.reactElemental.reactElementalStrings.execute
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
import typings.reactElemental.reactElementalStrings.no
import typings.reactElemental.reactElementalStrings.none
import typings.reactElemental.reactElementalStrings.numeric
import typings.reactElemental.reactElementalStrings.off
import typings.reactElemental.reactElementalStrings.on
import typings.reactElemental.reactElementalStrings.other
import typings.reactElemental.reactElementalStrings.page
import typings.reactElemental.reactElementalStrings.polite
import typings.reactElemental.reactElementalStrings.popup
import typings.reactElemental.reactElementalStrings.removals
import typings.reactElemental.reactElementalStrings.search
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-elemental.react-elemental.TextFieldProps & { readonly error :string | undefined,  readonly secondary :boolean | undefined,  readonly style :react.react.CSSProperties | undefined} */
@js.native
trait TextAreaProps extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  var accept: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
  var alt: js.UndefOr[String] = js.native
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.native
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.native
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.native
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.native
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.native
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.native
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.native
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.native
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.native
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.native
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.native
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.native
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.native
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var capture: js.UndefOr[Boolean | String] = js.native
   // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
  var checked: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var cols: js.UndefOr[Double] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var dirName: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  val error: js.UndefOr[String] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var list: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] with js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] with js.UndefOr[UIEventHandler[HTMLInputElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] with js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] with js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
  val secondary: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var src: js.UndefOr[String] = js.native
  var step: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  val textarea: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var vocab: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var wrap: js.UndefOr[String] = js.native
}

object TextAreaProps {
  @scala.inline
  def apply(
    onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] with js.UndefOr[ChangeEventHandler[HTMLInputElement]],
    onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] with js.UndefOr[UIEventHandler[HTMLInputElement]],
    onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] with js.UndefOr[TransitionEventHandler[HTMLInputElement]],
    onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] with js.UndefOr[WheelEventHandler[HTMLInputElement]]
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal(onAbort = onAbort.asInstanceOf[js.Any], onAnimationEnd = onAnimationEnd.asInstanceOf[js.Any], onAnimationIteration = onAnimationIteration.asInstanceOf[js.Any], onAnimationStart = onAnimationStart.asInstanceOf[js.Any], onAuxClick = onAuxClick.asInstanceOf[js.Any], onBeforeInput = onBeforeInput.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onCanPlay = onCanPlay.asInstanceOf[js.Any], onCanPlayThrough = onCanPlayThrough.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCompositionEnd = onCompositionEnd.asInstanceOf[js.Any], onCompositionStart = onCompositionStart.asInstanceOf[js.Any], onCompositionUpdate = onCompositionUpdate.asInstanceOf[js.Any], onContextMenu = onContextMenu.asInstanceOf[js.Any], onCopy = onCopy.asInstanceOf[js.Any], onCut = onCut.asInstanceOf[js.Any], onDoubleClick = onDoubleClick.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any], onDragEnd = onDragEnd.asInstanceOf[js.Any], onDragEnter = onDragEnter.asInstanceOf[js.Any], onDragExit = onDragExit.asInstanceOf[js.Any], onDragLeave = onDragLeave.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], onDragStart = onDragStart.asInstanceOf[js.Any], onDrop = onDrop.asInstanceOf[js.Any], onDurationChange = onDurationChange.asInstanceOf[js.Any], onEmptied = onEmptied.asInstanceOf[js.Any], onEncrypted = onEncrypted.asInstanceOf[js.Any], onEnded = onEnded.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onInput = onInput.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyPress = onKeyPress.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLoadStart = onLoadStart.asInstanceOf[js.Any], onLoadedData = onLoadedData.asInstanceOf[js.Any], onLoadedMetadata = onLoadedMetadata.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onMouseOut = onMouseOut.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], onMouseUp = onMouseUp.asInstanceOf[js.Any], onPaste = onPaste.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onPlaying = onPlaying.asInstanceOf[js.Any], onPointerCancel = onPointerCancel.asInstanceOf[js.Any], onPointerDown = onPointerDown.asInstanceOf[js.Any], onPointerEnter = onPointerEnter.asInstanceOf[js.Any], onPointerLeave = onPointerLeave.asInstanceOf[js.Any], onPointerMove = onPointerMove.asInstanceOf[js.Any], onPointerOut = onPointerOut.asInstanceOf[js.Any], onPointerOver = onPointerOver.asInstanceOf[js.Any], onPointerUp = onPointerUp.asInstanceOf[js.Any], onProgress = onProgress.asInstanceOf[js.Any], onRateChange = onRateChange.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], onSeeked = onSeeked.asInstanceOf[js.Any], onSeeking = onSeeking.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onStalled = onStalled.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onSuspend = onSuspend.asInstanceOf[js.Any], onTimeUpdate = onTimeUpdate.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransitionEnd = onTransitionEnd.asInstanceOf[js.Any], onVolumeChange = onVolumeChange.asInstanceOf[js.Any], onWaiting = onWaiting.asInstanceOf[js.Any], onWheel = onWheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps]
  }
  @scala.inline
  implicit class TextAreaPropsOps[Self <: TextAreaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnAbort(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAnimationEnd(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = this.set("onAnimationEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAnimationIteration(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = this.set("onAnimationIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAnimationStart(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = this.set("onAnimationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAuxClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onAuxClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBeforeInput(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = this.set("onBeforeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(
      value: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]]
    ): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCanPlay(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onCanPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCanPlayThrough(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onCanPlayThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(
      value: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] with js.UndefOr[ChangeEventHandler[HTMLInputElement]]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCompositionEnd(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = this.set("onCompositionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCompositionStart(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = this.set("onCompositionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCompositionUpdate(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = this.set("onCompositionUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnContextMenu(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCopy(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = this.set("onCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCut(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = this.set("onCut", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDoubleClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDrag(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragEnd(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragEnter(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragExit(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDragExit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragLeave(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragOver(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragStart(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDrop(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDurationChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onDurationChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEmptied(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onEmptied", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEncrypted(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEnded(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFocus(
      value: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]]
    ): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInput(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = this.set("onInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInvalid(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyDown(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyPress(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyUp(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLoad(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLoadStart(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLoadedData(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onLoadedData", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLoadedMetadata(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onLoadedMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseDown(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseEnter(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseLeave(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseMove(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseOut(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseOver(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseUp(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPaste(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPause(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onPause", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPlay(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPlaying(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerCancel(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerDown(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerEnter(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerLeave(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerMove(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerOut(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerOver(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPointerUp(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = this.set("onPointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnProgress(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRateChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onRateChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReset(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = this.set("onReset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnScroll(
      value: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] with js.UndefOr[UIEventHandler[HTMLInputElement]]
    ): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSeeked(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onSeeked", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSeeking(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onSeeking", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSelect(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnStalled(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onStalled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSubmit(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSuspend(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onSuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTimeUpdate(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onTimeUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchCancel(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchEnd(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchMove(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchStart(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTransitionEnd(
      value: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] with js.UndefOr[TransitionEventHandler[HTMLInputElement]]
    ): Self = this.set("onTransitionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnVolumeChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onVolumeChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnWaiting(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = this.set("onWaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnWheel(
      value: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] with js.UndefOr[WheelEventHandler[HTMLInputElement]]
    ): Self = this.set("onWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDirName(value: String): Self = this.set("dirName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirName: Self = this.set("dirName", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", js.undefined)
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", js.undefined)
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", js.undefined)
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTextarea(value: Boolean): Self = this.set("textarea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextarea: Self = this.set("textarea", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

