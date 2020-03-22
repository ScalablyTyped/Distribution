package typings.reactElemental.mod

import typings.react.AnonHtml
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

/* Inlined react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement> & react.react.InputHTMLAttributes<std.HTMLInputElement> & { readonly error ? :string,  readonly secondary ? :boolean,  readonly textarea ? :boolean,  readonly style ? :react.react.CSSProperties} */
trait TextFieldProps extends js.Object {
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
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
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
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dirName: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
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
  var onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[
    AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement]
  ] = js.undefined
  var onAnimationIteration: js.UndefOr[
    AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement]
  ] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[
    AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement]
  ] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[
    ChangeEventHandler[HTMLTextAreaElement] with ChangeEventHandler[HTMLInputElement]
  ] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[
    CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement]
  ] = js.undefined
  var onCompositionStart: js.UndefOr[
    CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement]
  ] = js.undefined
  var onCompositionUpdate: js.UndefOr[
    CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement]
  ] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[
    ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement]
  ] = js.undefined
  var onCut: js.UndefOr[
    ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[
    KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement]
  ] = js.undefined
  var onKeyPress: js.UndefOr[
    KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement]
  ] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]] = js.undefined
  var onPaste: js.UndefOr[
    ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement]
  ] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPointerCancel: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  var onPointerEnter: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  var onPointerLeave: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  var onPointerMove: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  var onPointerOut: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  var onPointerOver: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  var onPointerUp: js.UndefOr[
    PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]
  ] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement] with UIEventHandler[HTMLInputElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[
    TransitionEventHandler[HTMLTextAreaElement] with TransitionEventHandler[HTMLInputElement]
  ] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement] with WheelEventHandler[HTMLInputElement]] = js.undefined
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
  var style: js.UndefOr[CSSProperties] = js.undefined
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

object TextFieldProps {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    accessKey: String = null,
    alt: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    cols: Int | Double = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    dirName: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    list: String = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onAbort: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onAnimationEnd: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement] = null,
    onAnimationIteration: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement] = null,
    onAnimationStart: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement] = null,
    onAuxClick: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onBeforeInput: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onBlur: FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement] = null,
    onCanPlay: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onCanPlayThrough: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onChange: ChangeEventHandler[HTMLTextAreaElement] with ChangeEventHandler[HTMLInputElement] = null,
    onClick: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onCompositionEnd: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement] = null,
    onCompositionStart: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement] = null,
    onCompositionUpdate: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement] = null,
    onContextMenu: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onCopy: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement] = null,
    onCut: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement] = null,
    onDoubleClick: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onDrag: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragEnd: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragEnter: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragExit: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragLeave: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragOver: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragStart: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDrop: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDurationChange: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onEmptied: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onEncrypted: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onEnded: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onError: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onFocus: FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement] = null,
    onInput: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onInvalid: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onKeyDown: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement] = null,
    onKeyPress: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement] = null,
    onKeyUp: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement] = null,
    onLoad: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onLoadStart: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onLoadedData: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onLoadedMetadata: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onMouseDown: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseEnter: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseLeave: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseMove: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseOut: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseOver: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseUp: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onPaste: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement] = null,
    onPause: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onPlay: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onPlaying: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onPointerCancel: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerDown: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerEnter: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerLeave: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerMove: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerOut: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerOver: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerUp: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onProgress: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onRateChange: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onReset: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onScroll: UIEventHandler[HTMLTextAreaElement] with UIEventHandler[HTMLInputElement] = null,
    onSeeked: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onSeeking: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onSelect: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onStalled: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onSubmit: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onSuspend: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onTimeUpdate: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onTouchCancel: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTouchEnd: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTouchMove: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTouchStart: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTransitionEnd: TransitionEventHandler[HTMLTextAreaElement] with TransitionEventHandler[HTMLInputElement] = null,
    onVolumeChange: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onWaiting: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onWheel: WheelEventHandler[HTMLTextAreaElement] with WheelEventHandler[HTMLInputElement] = null,
    pattern: String = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rows: Int | Double = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    size: Int | Double = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    step: Double | String = null,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    textarea: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    translate: yes | no = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: String | js.Array[String] | Double = null,
    vocab: String = null,
    width: Double | String = null,
    wrap: String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dirName != null) __obj.updateDynamic("dirName")(dirName.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd.asInstanceOf[js.Any])
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration.asInstanceOf[js.Any])
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick.asInstanceOf[js.Any])
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay.asInstanceOf[js.Any])
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd.asInstanceOf[js.Any])
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart.asInstanceOf[js.Any])
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy.asInstanceOf[js.Any])
    if (onCut != null) __obj.updateDynamic("onCut")(onCut.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange.asInstanceOf[js.Any])
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied.asInstanceOf[js.Any])
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted.asInstanceOf[js.Any])
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(onInput.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart.asInstanceOf[js.Any])
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData.asInstanceOf[js.Any])
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste.asInstanceOf[js.Any])
    if (onPause != null) __obj.updateDynamic("onPause")(onPause.asInstanceOf[js.Any])
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay.asInstanceOf[js.Any])
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying.asInstanceOf[js.Any])
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel.asInstanceOf[js.Any])
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown.asInstanceOf[js.Any])
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter.asInstanceOf[js.Any])
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave.asInstanceOf[js.Any])
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove.asInstanceOf[js.Any])
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut.asInstanceOf[js.Any])
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver.asInstanceOf[js.Any])
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress.asInstanceOf[js.Any])
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked.asInstanceOf[js.Any])
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit.asInstanceOf[js.Any])
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend.asInstanceOf[js.Any])
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd.asInstanceOf[js.Any])
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange.asInstanceOf[js.Any])
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting.asInstanceOf[js.Any])
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(textarea)) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

