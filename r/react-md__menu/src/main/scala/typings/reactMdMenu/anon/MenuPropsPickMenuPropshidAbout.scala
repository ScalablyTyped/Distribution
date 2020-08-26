package typings.reactMdMenu.anon

import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactMdMenu.menuMod.MenuPositionOptions
import typings.reactMdMenu.reactMdMenuStrings.`additions text`
import typings.reactMdMenu.reactMdMenuStrings.`inline`
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
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.grammar
import typings.reactMdMenu.reactMdMenuStrings.grid
import typings.reactMdMenu.reactMdMenuStrings.horizontal
import typings.reactMdMenu.reactMdMenuStrings.inherit
import typings.reactMdMenu.reactMdMenuStrings.last
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
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @react-md/menu.@react-md/menu/types/Menu.MenuProps & std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, 'hidden' | 'visible' | 'color' | 'style' | 'horizontal' | 'translate' | 'prefix' | 'anchor' | 'slot' | 'title' | 'children' | 'portal' | 'portalInto' | 'portalIntoId' | 'role' | 'className' | 'timeout' | 'in' | 'mountOnEnter' | 'unmountOnExit' | 'onEnter' | 'onEntering' | 'onEntered' | 'onExit' | 'onExiting' | 'onExited' | 'classNames' | 'appear' | 'enter' | 'exit' | 'onScroll' | 'onChange' | 'onKeyDown' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'spellCheck' | 'tabIndex' | 'radioGroup' | 'about' | 'datatype' | 'inlist' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'defaultFocus' | 'onRequestClose' | 'controlId' | 'disableControlClickOkay' | 'positionOptions' | 'closeOnScroll' | 'closeOnResize'> & std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, 'aria-labelledby'>> & react.react.RefAttributes<std.HTMLDivElement> */
@js.native
trait MenuPropsPickMenuPropshidAbout extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
  /**
    * The positioning anchor for the menu relative to the button/control that
    * owns the menu.  This is used for the positioning logic as well as modifying
    * the animationg slightly to originate from a coordinate. When this is
    * omitted, it will default to:
    *
    * ```ts
    * const verticalAnchor = {
    *   x: "inner-right",
    *   y: "top",
    * };
    *
    * const horizontalAnchor = {
    *   x: "center",
    *   y: "center",
    * };
    * ```
    */
  var anchor: js.UndefOr[PositionAnchor] = js.native
  /**
    * Normally a component is not transitioned if it is shown when the
    * `<Transition>` component mounts. If you want to transition on the first
    * mount set  appear to true, and the component will transition in as soon
    * as the `<Transition>` mounts. Note: there are no specific "appear" states.
    * appear only adds an additional enter transition.
    */
  var appear: js.UndefOr[Boolean] = js.native
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
    * The label for the menu. Either this or the `"aria-labelledby"` prop is
    * required for a11y.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * The id of an element that acts as a label for the menu. Either this or the
    * `"aria-label"` prop is required for a11y.
    */
  var `aria-labelledby`: js.UndefOr[String] with String = js.native
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
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var classNames: js.UndefOr[js.Any] = js.native
  /**
    * Boolean if the menu should no longer close when the page is resized.
    * Instead, it'll automatically update its position within the viewport.
    */
  var closeOnResize: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the menu should not be closed when the page is scrolled.
    * Instead, it'll automatically update its position within the viewport. You
    * normally don't want to enable this prop as the menu won't close if the menu
    * control element is no longer in the viewport.
    */
  var closeOnScroll: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  /**
    * The id of the control element that toggles the menu. This is required so
    * that the menu can be positioned to this element and is normally a
    * `<button>`.
    */
  var controlId: String = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  /**
    * The element that should be focused first when opened. This can either be
    * the first or last focusable item in the menu, or a query selector string to
    * find an element.
    */
  var defaultFocus: js.UndefOr[first | last | String] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  /**
    * Boolean if the close on outside click logic should consider the control
    * element within the menu and not call the `onRequestClose` function when it
    * is been clicked. This should be enabled when creating a context menu but
    * normally should remain `false` otherwise since the control element has it's
    * own toggle logic that conflicts with this close click.
    */
  var disableControlClickOkay: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the menu should be rendered horizontally instead of vertically.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * The id for the menu. This is required for a11y.
    */
  var id: String = js.native
  var in: js.UndefOr[js.Any] = js.native
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
  var key: js.UndefOr[Key] = js.native
  var lang: js.UndefOr[String] = js.native
  var mountOnEnter: js.UndefOr[js.Any] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onAbortCapture: js.UndefOr[js.Any] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  var onAnimationEndCapture: js.UndefOr[js.Any] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  var onAnimationIterationCapture: js.UndefOr[js.Any] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  var onAnimationStartCapture: js.UndefOr[js.Any] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onAuxClickCapture: js.UndefOr[js.Any] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onBeforeInputCapture: js.UndefOr[js.Any] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onBlurCapture: js.UndefOr[js.Any] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onCanPlayCapture: js.UndefOr[js.Any] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[js.Any] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onChangeCapture: js.UndefOr[js.Any] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onClickCapture: js.UndefOr[js.Any] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onCompositionEndCapture: js.UndefOr[js.Any] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onCompositionStartCapture: js.UndefOr[js.Any] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[js.Any] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onContextMenuCapture: js.UndefOr[js.Any] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onCopyCapture: js.UndefOr[js.Any] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onCutCapture: js.UndefOr[js.Any] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onDoubleClickCapture: js.UndefOr[js.Any] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragCapture: js.UndefOr[js.Any] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragEndCapture: js.UndefOr[js.Any] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragEnterCapture: js.UndefOr[js.Any] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragExitCapture: js.UndefOr[js.Any] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragLeaveCapture: js.UndefOr[js.Any] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragOverCapture: js.UndefOr[js.Any] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragStartCapture: js.UndefOr[js.Any] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDropCapture: js.UndefOr[js.Any] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onDurationChangeCapture: js.UndefOr[js.Any] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEmptiedCapture: js.UndefOr[js.Any] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEncryptedCapture: js.UndefOr[js.Any] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEndedCapture: js.UndefOr[js.Any] = js.native
  var onEnter: js.UndefOr[js.Any] = js.native
  var onEntered: js.UndefOr[js.Any] = js.native
  var onEntering: js.UndefOr[js.Any] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onErrorCapture: js.UndefOr[js.Any] = js.native
  var onExit: js.UndefOr[js.Any] = js.native
  var onExited: js.UndefOr[js.Any] = js.native
  var onExiting: js.UndefOr[js.Any] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onFocusCapture: js.UndefOr[js.Any] = js.native
  var onGotPointerCapture: js.UndefOr[js.Any] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onInputCapture: js.UndefOr[js.Any] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onInvalidCapture: js.UndefOr[js.Any] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onKeyDownCapture: js.UndefOr[js.Any] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onKeyPressCapture: js.UndefOr[js.Any] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onKeyUpCapture: js.UndefOr[js.Any] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadCapture: js.UndefOr[js.Any] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadStartCapture: js.UndefOr[js.Any] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedDataCapture: js.UndefOr[js.Any] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[js.Any] = js.native
  var onLostPointerCapture: js.UndefOr[js.Any] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseDownCapture: js.UndefOr[js.Any] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseMoveCapture: js.UndefOr[js.Any] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseOutCapture: js.UndefOr[js.Any] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseOverCapture: js.UndefOr[js.Any] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseUpCapture: js.UndefOr[js.Any] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onPasteCapture: js.UndefOr[js.Any] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPauseCapture: js.UndefOr[js.Any] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlayCapture: js.UndefOr[js.Any] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlayingCapture: js.UndefOr[js.Any] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerCancelCapture: js.UndefOr[js.Any] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerDownCapture: js.UndefOr[js.Any] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerEnterCapture: js.UndefOr[js.Any] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerLeaveCapture: js.UndefOr[js.Any] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerMoveCapture: js.UndefOr[js.Any] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerOutCapture: js.UndefOr[js.Any] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerOverCapture: js.UndefOr[js.Any] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerUpCapture: js.UndefOr[js.Any] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onProgressCapture: js.UndefOr[js.Any] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onRateChangeCapture: js.UndefOr[js.Any] = js.native
  @JSName("onRequestClose")
  var onRequestClose_FMenuPropsPickMenuPropshidAbout: js.Function0[Unit] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onResetCapture: js.UndefOr[js.Any] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  var onScrollCapture: js.UndefOr[js.Any] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSeekedCapture: js.UndefOr[js.Any] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSeekingCapture: js.UndefOr[js.Any] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSelectCapture: js.UndefOr[js.Any] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onStalledCapture: js.UndefOr[js.Any] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onSubmitCapture: js.UndefOr[js.Any] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSuspendCapture: js.UndefOr[js.Any] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onTimeUpdateCapture: js.UndefOr[js.Any] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Any] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchStartCapture: js.UndefOr[js.Any] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
  var onTransitionEndCapture: js.UndefOr[js.Any] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onVolumeChangeCapture: js.UndefOr[js.Any] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onWaitingCapture: js.UndefOr[js.Any] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
  var onWheelCapture: js.UndefOr[js.Any] = js.native
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Boolean if the portal should be used.
    */
  var portal: js.UndefOr[Boolean] = js.native
  /**
    * @see {@link Portal#into}
    */
  var portalInto: js.UndefOr[PortalInto] = js.native
  /**
    * @see {@link Portal#intoId}
    */
  var portalIntoId: js.UndefOr[String] = js.native
  /**
    * Optional options to pass down to the `useFixedPositionin` hook styles to
    * change how the menu is fixed to the `MenuButton`.
    */
  var positionOptions: js.UndefOr[MenuPositionOptions] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  /**
    * The role for the menu. This should normally just be `"menu"`, but I might
    * expand on it to implement the `"listbox"` or other menu like widgets.
    */
  var role: js.UndefOr[menu] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  /**
    * The tab index for the menu. This should probably be left at `-1`.
    */
  var tabIndex: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[TransitionTimeout] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unmountOnExit: js.UndefOr[js.Any] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  /**
    * Boolean if the menu is currently visible.
    */
  var visible: Boolean = js.native
  var vocab: js.UndefOr[String] = js.native
  /**
    * A function to call that should set the `visible` prop to false.
    */
  def onRequestClose(): Unit = js.native
}

