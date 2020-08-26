package typings.reactMdDialog.anon

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
import typings.reactMdDialog.reactMdDialogStrings.`additions text`
import typings.reactMdDialog.reactMdDialogStrings.`full-page`
import typings.reactMdDialog.reactMdDialogStrings.`inline`
import typings.reactMdDialog.reactMdDialogStrings.additions
import typings.reactMdDialog.reactMdDialogStrings.alertdialog
import typings.reactMdDialog.reactMdDialogStrings.all
import typings.reactMdDialog.reactMdDialogStrings.ascending
import typings.reactMdDialog.reactMdDialogStrings.assertive
import typings.reactMdDialog.reactMdDialogStrings.both
import typings.reactMdDialog.reactMdDialogStrings.centered
import typings.reactMdDialog.reactMdDialogStrings.copy
import typings.reactMdDialog.reactMdDialogStrings.custom
import typings.reactMdDialog.reactMdDialogStrings.date
import typings.reactMdDialog.reactMdDialogStrings.decimal
import typings.reactMdDialog.reactMdDialogStrings.descending
import typings.reactMdDialog.reactMdDialogStrings.dialog
import typings.reactMdDialog.reactMdDialogStrings.div
import typings.reactMdDialog.reactMdDialogStrings.email
import typings.reactMdDialog.reactMdDialogStrings.execute
import typings.reactMdDialog.reactMdDialogStrings.first
import typings.reactMdDialog.reactMdDialogStrings.grammar
import typings.reactMdDialog.reactMdDialogStrings.grid
import typings.reactMdDialog.reactMdDialogStrings.horizontal
import typings.reactMdDialog.reactMdDialogStrings.inherit
import typings.reactMdDialog.reactMdDialogStrings.last
import typings.reactMdDialog.reactMdDialogStrings.link
import typings.reactMdDialog.reactMdDialogStrings.list
import typings.reactMdDialog.reactMdDialogStrings.listbox
import typings.reactMdDialog.reactMdDialogStrings.location
import typings.reactMdDialog.reactMdDialogStrings.menu
import typings.reactMdDialog.reactMdDialogStrings.mixed
import typings.reactMdDialog.reactMdDialogStrings.move
import typings.reactMdDialog.reactMdDialogStrings.nav
import typings.reactMdDialog.reactMdDialogStrings.no
import typings.reactMdDialog.reactMdDialogStrings.none
import typings.reactMdDialog.reactMdDialogStrings.numeric
import typings.reactMdDialog.reactMdDialogStrings.off
import typings.reactMdDialog.reactMdDialogStrings.on
import typings.reactMdDialog.reactMdDialogStrings.other
import typings.reactMdDialog.reactMdDialogStrings.page
import typings.reactMdDialog.reactMdDialogStrings.polite
import typings.reactMdDialog.reactMdDialogStrings.popup
import typings.reactMdDialog.reactMdDialogStrings.removals
import typings.reactMdDialog.reactMdDialogStrings.search
import typings.reactMdDialog.reactMdDialogStrings.spelling
import typings.reactMdDialog.reactMdDialogStrings.step
import typings.reactMdDialog.reactMdDialogStrings.tel
import typings.reactMdDialog.reactMdDialogStrings.text
import typings.reactMdDialog.reactMdDialogStrings.time
import typings.reactMdDialog.reactMdDialogStrings.tree
import typings.reactMdDialog.reactMdDialogStrings.url
import typings.reactMdDialog.reactMdDialogStrings.vertical
import typings.reactMdDialog.reactMdDialogStrings.yes
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactMdUtils.usePreviousFocusMod.FocusFallback
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @react-md/dialog.@react-md/dialog/types/Dialog.DialogProps & std.Pick<@react-md/dialog.@react-md/dialog/types/Dialog.DialogProps, 'hidden' | 'visible' | 'color' | 'overlay' | 'style' | 'translate' | 'prefix' | 'slot' | 'title' | 'children' | 'portal' | 'portalInto' | 'portalIntoId' | 'timeout' | 'in' | 'mountOnEnter' | 'unmountOnExit' | 'onEnter' | 'onEntering' | 'onEntered' | 'onExit' | 'onExiting' | 'onExited' | 'classNames' | 'appear' | 'enter' | 'exit' | 'className' | 'onScroll' | 'onChange' | 'onKeyDown' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'spellCheck' | 'tabIndex' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'component' | 'disableEscapeClose' | 'onRequestClose' | 'overlayStyle' | 'overlayClassName' | 'overlayHidden' | 'containerStyle' | 'containerClassName' | 'forceContainer' | 'modal' | 'type' | 'defaultFocus' | 'disableScrollLock' | 'disableFocusContainer' | 'disableNestedDialogFixes' | 'disableTransition' | 'disableFocusCache' | 'disableFocusOnMount' | 'disableTabFocusWrap' | 'disableFocusOnMountScroll' | 'disableFocusOnUnmount' | 'unmountFocusFallback'> & std.Required<std.Pick<@react-md/dialog.@react-md/dialog/types/Dialog.DialogProps, 'aria-labelledby'>> & react.react.RefAttributes<std.HTMLDivElement> */
@js.native
trait DialogPropsPickDialogPropAbout extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
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
    * A label to apply to the dialog. Either this or the `aria-labelledby` prop
    * are required for accessibility.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * An id pointing to an element that is a label for the dialog. Either this or
    * the `aria-label` prop are required for accessibility.
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
  var color: js.UndefOr[String] = js.native
  /**
    * The component to render the dialog as. This really shouldn't be used
    * outside of the `@react-md/layout` and `@react-md/sheet` packages to
    * conditionally render a navigation panel.
    */
  var component: js.UndefOr[div | nav] = js.native
  /**
    * An optional className to apply to the dialog container when the `type` is
    * set to `"centered"` or when the `forceContainer` prop is enabled. You
    * probably don't want to use this prop in most cases.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to apply to the dialog container when the `type` is set
    * to `"centered"` or when the `forceContainer` prop is enabled. You probably
    * don't want to use this prop in most cases.
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  /**
    * Either the "first" or "last" string to focus the first or last focusable
    * element within the container or a query selector string to find a focusable
    * element within the container.
    */
  var defaultFocus: js.UndefOr[first | last | String] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  /**
    * Boolean if the ability to close the dialog via the escape key should be
    * disabled. You should really not be using this as it breaks accessibility in
    * most cases.
    *
    * Note: When the `modal` prop is enabled, this flag will be considered `true`
    * as well so that the escape keypress no longer closes the dialog.
    */
  var disableEscapeClose: js.UndefOr[Boolean] = js.native
  /**
    * By default, the focus container will try to maintain a cache of the
    * focusable elements that is updated only when this component re-renders. If
    * the children are extremely dynamic and focusable elements can be
    * removed/added without this component updating, you should disable the cache
    * so that the focusable elements are updated each time the tab key is
    * pressed. Disabling the cache will be slightly slower for larger focusable
    * areas, but it might not be too bad.
    *
    * NOTE: The only important elements are the *first* and *last* elements in
    * this list.  So if your children aren't changing the first and last
    * elements, there's no need to disable the cache.
    */
  var disableFocusCache: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the dialog's focus container logic should be disabled. This
    * should normally be kept at the default of `false` unless implementing a
    * custom dialog that does not require consistent user focus.
    */
  var disableFocusContainer: js.UndefOr[Boolean] = js.native
  /**
    * The default behavior for the focus container is to focus an element once it
    * is mounted and the `disabled` prop is not enabled. This behavior can be
    * disabled if this is not wanted for some reason.
    */
  var disableFocusOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the element that gets focused on mount should try to not scroll
    * the focused element into view which is the default behavior. This should
    * normally remain `false`, but it is useful to set to `true` if the
    * `FocusContainer` is within a transition that appears offscreen.
    */
  var disableFocusOnMountScroll: js.UndefOr[Boolean] = js.native
  /**
    * The default behavior for the focus container is to attempt to focus the
    * element that was focused before the focus container was mounted since it is
    * generally used for temporary material. If there are cases where this
    * behavior is not wanted, you can enable this prop.
    */
  var disableFocusOnUnmount: js.UndefOr[Boolean] = js.native
  /**
    * The Dialog component will attempt to automatically fix nested dialogs
    * behind the scenes using the `NestedDialogContextProvider` component. This
    * prop will disable that feature if it does not seem to be working as
    * expected.
    */
  var disableNestedDialogFixes: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the dialog should no longer add scroll locking to the page when
    * visible. You normally want this prop to stay `false`, but it is useful when
    * using custom dialogs that are more for popovers and don't require full user
    * attention.
    */
  var disableScrollLock: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the focus behavior should be disabled. This should really be
    * used if you are using nested focus containers for temporary material (such
    * as dialogs or menus).
    */
  var disableTabFocusWrap: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the `appear`, `enter`, and `exit` transitions should be disabled
    * for the dialog.  This is just a shortcut so all three of those props don't
    * need to be disabled.
    */
  var disableTransition: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the dialog should be "forcefully" wrapped in the
    * `.md-dialog-container` element. You probably don't want to use this in most
    * cases, but the container element will be used when the `type` prop is set
    * to `"centered"`.
    */
  var forceContainer: js.UndefOr[Boolean] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * An id required for a11y for the dialog.
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
  /**
    * Boolean if the dialog should act as a modal. This means that the user will
    * no longer be able to close the dialog by pressing the escape key or by
    * clicking on the overlay. You will be required to update the dialog to have
    * an action that closes the dialog instead.
    */
  var modal: js.UndefOr[Boolean] = js.native
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
  var onRequestClose_FDialogPropsPickDialogPropAbout: js.Function0[Unit] = js.native
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
  /**
    * Boolean if there should be an overlay displayed with the sheet. This is
    * recommended/required on mobile devices.
    */
  var overlay: js.UndefOr[Boolean] = js.native
  /**
    * An optional className to apply to the overlay.
    */
  var overlayClassName: js.UndefOr[String] = js.native
  /**
    * Boolean if the overlay should be "hidden" from the user once it's visible
    * be keeping the opacity set to `0`. This is really only used for custom
    * dialogs like the `FixedDialog`.
    */
  var overlayHidden: js.UndefOr[Boolean] = js.native
  /**
    * An optional style to apply to the overlay.
    */
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
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
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  /**
    * The role for the dialog component. This should normally stay as the default
    * of `"dialog"` **unless** you want the screen reader to interrupt the normal
    * workflow for this message. It is good to set this value to `"alertdialog"`
    * error message confirmations or general confirmation prompts.
    *
    * Note: The `dialog` technically supports being rendered as a `menu`, but
    * this is really only for mobile sheet support and will not provide the menu
    * keyboard functionality automatically.
    */
  var role: js.UndefOr[dialog | alertdialog | menu | none] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  /**
    * The tab index for the sheet. This should normally stay at `-1`.
    */
  var tabIndex: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[TransitionTimeout] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  /**
    * The display type for the modal. If you would like to position the modal in
    * different locations within the page, you should set this prop to `"custom"`
    * and add custom styles to position it instead.
    */
  var `type`: js.UndefOr[`full-page` | centered | custom] = js.native
  var typeof: js.UndefOr[String] = js.native
  /**
    * When the focus container unmounts, it will attempt to re-focus the element
    * that was focused before the focus container was mounted unless the
    * `disableFocusOnUnmount` prop is enabled. There might be cases where
    * unmounting the focus container causes the page to re-render and the
    * previous element no longer exists. When this happens keyboard users _might_
    * have a problem navigating through the page again depending on how the
    * browser implemented the native tab behavior so this prop allows you to
    * ensure that a specific element is focused in these cases.
    *
    * This can either be a query selector string, a specific HTMLElement, or a
    * function that finds a specific HTMLElement to focus.
    */
  var unmountFocusFallback: js.UndefOr[FocusFallback] = js.native
  var unmountOnExit: js.UndefOr[js.Any] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  /**
    * Boolean if the dialog is currently visible.
    */
  var visible: Boolean = js.native
  var vocab: js.UndefOr[String] = js.native
  /**
    * A function used to close the dialog when the overlay is clicked or the
    * escape key is pressed when the `modal` prop is not enabled.
    */
  def onRequestClose(): Unit = js.native
}

