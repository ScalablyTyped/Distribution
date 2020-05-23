package typings.storybookComponents.anon

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
import typings.react.mod.Validator
import typings.react.mod.WheelEventHandler
import typings.std.HTMLSelectElement
import typings.storybookComponents.inputMod.Alignments
import typings.storybookComponents.inputMod.Sizes
import typings.storybookComponents.inputMod.ValidationStates
import typings.storybookComponents.storybookComponentsStrings.`additions text`
import typings.storybookComponents.storybookComponentsStrings.`inline`
import typings.storybookComponents.storybookComponentsStrings.additions
import typings.storybookComponents.storybookComponentsStrings.all
import typings.storybookComponents.storybookComponentsStrings.ascending
import typings.storybookComponents.storybookComponentsStrings.assertive
import typings.storybookComponents.storybookComponentsStrings.both
import typings.storybookComponents.storybookComponentsStrings.copy
import typings.storybookComponents.storybookComponentsStrings.date
import typings.storybookComponents.storybookComponentsStrings.decimal
import typings.storybookComponents.storybookComponentsStrings.descending
import typings.storybookComponents.storybookComponentsStrings.dialog
import typings.storybookComponents.storybookComponentsStrings.email
import typings.storybookComponents.storybookComponentsStrings.execute
import typings.storybookComponents.storybookComponentsStrings.grammar
import typings.storybookComponents.storybookComponentsStrings.grid
import typings.storybookComponents.storybookComponentsStrings.horizontal
import typings.storybookComponents.storybookComponentsStrings.inherit
import typings.storybookComponents.storybookComponentsStrings.link
import typings.storybookComponents.storybookComponentsStrings.list
import typings.storybookComponents.storybookComponentsStrings.listbox
import typings.storybookComponents.storybookComponentsStrings.location
import typings.storybookComponents.storybookComponentsStrings.menu
import typings.storybookComponents.storybookComponentsStrings.mixed
import typings.storybookComponents.storybookComponentsStrings.move
import typings.storybookComponents.storybookComponentsStrings.no
import typings.storybookComponents.storybookComponentsStrings.none
import typings.storybookComponents.storybookComponentsStrings.numeric
import typings.storybookComponents.storybookComponentsStrings.off
import typings.storybookComponents.storybookComponentsStrings.on
import typings.storybookComponents.storybookComponentsStrings.other
import typings.storybookComponents.storybookComponentsStrings.page
import typings.storybookComponents.storybookComponentsStrings.polite
import typings.storybookComponents.storybookComponentsStrings.popup
import typings.storybookComponents.storybookComponentsStrings.removals
import typings.storybookComponents.storybookComponentsStrings.search
import typings.storybookComponents.storybookComponentsStrings.spelling
import typings.storybookComponents.storybookComponentsStrings.step
import typings.storybookComponents.storybookComponentsStrings.tel
import typings.storybookComponents.storybookComponentsStrings.text
import typings.storybookComponents.storybookComponentsStrings.time
import typings.storybookComponents.storybookComponentsStrings.tree
import typings.storybookComponents.storybookComponentsStrings.url
import typings.storybookComponents.storybookComponentsStrings.vertical
import typings.storybookComponents.storybookComponentsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any> & std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & @emotion/styled-base.anon.ThemeTheme<@storybook/theming.@storybook/theming.Theme>> */
@js.native
trait WeakValidationMapPickSele extends js.Object {
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var align: js.UndefOr[Validator[js.UndefOr[Alignments | Null]]] = js.native
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.native
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.native
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.native
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.native
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.native
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.native
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.native
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-relevant`: js.UndefOr[
    Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]
  ] = js.native
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.native
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoComplete: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.native
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var css: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Html | Null]]] = js.native
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var form: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var inputMode: js.UndefOr[
    Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
  ] = js.native
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onAbortCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAnimationEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAnimationIterationCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAnimationStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAuxClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onBeforeInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onBlurCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onCanPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onChange: js.UndefOr[Validator[js.UndefOr[ChangeEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCompositionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCompositionStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onContextMenuCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCopyCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDoubleClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragExitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDropCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onDurationChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onEmptiedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onEncryptedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onEndedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onErrorCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onFocusCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onInvalidCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onKeyDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onKeyPressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onKeyUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadedDataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onPasteCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onPauseCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onPlayingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onProgressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onRateChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onResetCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLSelectElement]]]] = js.native
  var onScrollCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSeekedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSeekingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSelectCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onStalledCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onSubmitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSuspendCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onTimeUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLSelectElement]]]] = js.native
  var onTransitionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onVolumeChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onWaitingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLSelectElement]]]] = js.native
  var onWheelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.native
  var required: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var size: js.UndefOr[Validator[js.UndefOr[Null | Sizes]]] = js.native
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[Null | typings.storybookTheming.typesMod.Theme]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.native
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.native
  var valid: js.UndefOr[Validator[js.UndefOr[Null | ValidationStates]]] = js.native
  var value: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}

object WeakValidationMapPickSele {
  @scala.inline
  def apply(
    about: Validator[js.UndefOr[Null | String]] = null,
    accessKey: Validator[js.UndefOr[Null | String]] = null,
    align: Validator[js.UndefOr[Alignments | Null]] = null,
    `aria-activedescendant`: Validator[js.UndefOr[Null | String]] = null,
    `aria-atomic`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-autocomplete`: Validator[js.UndefOr[none | `inline` | list | both | Null]] = null,
    `aria-busy`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-checked`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-colcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-controls`: Validator[js.UndefOr[Null | String]] = null,
    `aria-current`: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]] = null,
    `aria-describedby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-details`: Validator[js.UndefOr[Null | String]] = null,
    `aria-disabled`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-dropeffect`: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]] = null,
    `aria-errormessage`: Validator[js.UndefOr[Null | String]] = null,
    `aria-expanded`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-flowto`: Validator[js.UndefOr[Null | String]] = null,
    `aria-grabbed`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-haspopup`: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]] = null,
    `aria-hidden`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-invalid`: Validator[js.UndefOr[grammar | spelling | Boolean | Null]] = null,
    `aria-keyshortcuts`: Validator[js.UndefOr[Null | String]] = null,
    `aria-label`: Validator[js.UndefOr[Null | String]] = null,
    `aria-labelledby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-level`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-live`: Validator[js.UndefOr[off | assertive | polite | Null]] = null,
    `aria-modal`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiline`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiselectable`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-orientation`: Validator[js.UndefOr[horizontal | vertical | Null]] = null,
    `aria-owns`: Validator[js.UndefOr[Null | String]] = null,
    `aria-placeholder`: Validator[js.UndefOr[Null | String]] = null,
    `aria-posinset`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-pressed`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-readonly`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-relevant`: Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]] = null,
    `aria-required`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-roledescription`: Validator[js.UndefOr[Null | String]] = null,
    `aria-rowcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-selected`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-setsize`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-sort`: Validator[js.UndefOr[none | ascending | descending | other | Null]] = null,
    `aria-valuemax`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuemin`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuenow`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuetext`: Validator[js.UndefOr[Null | String]] = null,
    autoCapitalize: Validator[js.UndefOr[Null | String]] = null,
    autoComplete: Validator[js.UndefOr[Null | String]] = null,
    autoCorrect: Validator[js.UndefOr[Null | String]] = null,
    autoFocus: Validator[js.UndefOr[Boolean | Null]] = null,
    autoSave: Validator[js.UndefOr[Null | String]] = null,
    children: Validator[js.UndefOr[Null | ReactNode]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    color: Validator[js.UndefOr[Null | String]] = null,
    contentEditable: Validator[js.UndefOr[inherit | Booleanish | Null]] = null,
    contextMenu: Validator[js.UndefOr[Null | String]] = null,
    css: Validator[js.UndefOr[_ | Null]] = null,
    dangerouslySetInnerHTML: Validator[js.UndefOr[Html | Null]] = null,
    datatype: Validator[js.UndefOr[Null | String]] = null,
    defaultChecked: Validator[js.UndefOr[Boolean | Null]] = null,
    defaultValue: Validator[js.UndefOr[js.Array[String] | Double | Null | String]] = null,
    dir: Validator[js.UndefOr[Null | String]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    draggable: Validator[js.UndefOr[Booleanish | Null]] = null,
    form: Validator[js.UndefOr[Null | String]] = null,
    hidden: Validator[js.UndefOr[Boolean | Null]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    inlist: Validator[js.UndefOr[_ | Null]] = null,
    inputMode: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]] = null,
    is: Validator[js.UndefOr[Null | String]] = null,
    itemID: Validator[js.UndefOr[Null | String]] = null,
    itemProp: Validator[js.UndefOr[Null | String]] = null,
    itemRef: Validator[js.UndefOr[Null | String]] = null,
    itemScope: Validator[js.UndefOr[Boolean | Null]] = null,
    itemType: Validator[js.UndefOr[Null | String]] = null,
    key: Validator[js.UndefOr[Key | Null]] = null,
    lang: Validator[js.UndefOr[Null | String]] = null,
    multiple: Validator[js.UndefOr[Boolean | Null]] = null,
    name: Validator[js.UndefOr[Null | String]] = null,
    onAbort: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onAbortCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAnimationEnd: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]] = null,
    onAnimationEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAnimationIteration: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]] = null,
    onAnimationIterationCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAnimationStart: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]] = null,
    onAnimationStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAuxClick: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onAuxClickCapture: Validator[js.UndefOr[_ | Null]] = null,
    onBeforeInput: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]] = null,
    onBeforeInputCapture: Validator[js.UndefOr[_ | Null]] = null,
    onBlur: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]] = null,
    onBlurCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCanPlay: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onCanPlayCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCanPlayThrough: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onCanPlayThroughCapture: Validator[js.UndefOr[_ | Null]] = null,
    onChange: Validator[js.UndefOr[ChangeEventHandler[HTMLSelectElement] | Null]] = null,
    onChangeCapture: Validator[js.UndefOr[_ | Null]] = null,
    onClick: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onClickCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCompositionEnd: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]] = null,
    onCompositionEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCompositionStart: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]] = null,
    onCompositionStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCompositionUpdate: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]] = null,
    onCompositionUpdateCapture: Validator[js.UndefOr[_ | Null]] = null,
    onContextMenu: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onContextMenuCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCopy: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]] = null,
    onCopyCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCut: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]] = null,
    onCutCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDoubleClick: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onDoubleClickCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDrag: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDragCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragEnd: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDragEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragEnter: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDragEnterCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragExit: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDragExitCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragLeave: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDragLeaveCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragOver: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDragOverCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragStart: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDragStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDrop: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]] = null,
    onDropCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDurationChange: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onDurationChangeCapture: Validator[js.UndefOr[_ | Null]] = null,
    onEmptied: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onEmptiedCapture: Validator[js.UndefOr[_ | Null]] = null,
    onEncrypted: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onEncryptedCapture: Validator[js.UndefOr[_ | Null]] = null,
    onEnded: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onEndedCapture: Validator[js.UndefOr[_ | Null]] = null,
    onError: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onErrorCapture: Validator[js.UndefOr[_ | Null]] = null,
    onFocus: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]] = null,
    onFocusCapture: Validator[js.UndefOr[_ | Null]] = null,
    onGotPointerCapture: Validator[js.UndefOr[_ | Null]] = null,
    onGotPointerCaptureCapture: Validator[js.UndefOr[_ | Null]] = null,
    onInput: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]] = null,
    onInputCapture: Validator[js.UndefOr[_ | Null]] = null,
    onInvalid: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]] = null,
    onInvalidCapture: Validator[js.UndefOr[_ | Null]] = null,
    onKeyDown: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]] = null,
    onKeyDownCapture: Validator[js.UndefOr[_ | Null]] = null,
    onKeyPress: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]] = null,
    onKeyPressCapture: Validator[js.UndefOr[_ | Null]] = null,
    onKeyUp: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]] = null,
    onKeyUpCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoad: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onLoadCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoadStart: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onLoadStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoadedData: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onLoadedDataCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoadedMetadata: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onLoadedMetadataCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLostPointerCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLostPointerCaptureCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseDown: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onMouseDownCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseEnter: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onMouseLeave: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onMouseMove: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onMouseMoveCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseOut: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onMouseOutCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseOver: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onMouseOverCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseUp: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]] = null,
    onMouseUpCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPaste: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]] = null,
    onPasteCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPause: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onPauseCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPlay: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onPlayCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPlaying: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onPlayingCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerCancel: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerCancelCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerDown: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerDownCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerEnter: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerEnterCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerLeave: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerLeaveCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerMove: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerMoveCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerOut: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerOutCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerOver: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerOverCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPointerUp: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]] = null,
    onPointerUpCapture: Validator[js.UndefOr[_ | Null]] = null,
    onProgress: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onProgressCapture: Validator[js.UndefOr[_ | Null]] = null,
    onRateChange: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onRateChangeCapture: Validator[js.UndefOr[_ | Null]] = null,
    onReset: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]] = null,
    onResetCapture: Validator[js.UndefOr[_ | Null]] = null,
    onScroll: Validator[js.UndefOr[Null | UIEventHandler[HTMLSelectElement]]] = null,
    onScrollCapture: Validator[js.UndefOr[_ | Null]] = null,
    onSeeked: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onSeekedCapture: Validator[js.UndefOr[_ | Null]] = null,
    onSeeking: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onSeekingCapture: Validator[js.UndefOr[_ | Null]] = null,
    onSelect: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onSelectCapture: Validator[js.UndefOr[_ | Null]] = null,
    onStalled: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onStalledCapture: Validator[js.UndefOr[_ | Null]] = null,
    onSubmit: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]] = null,
    onSubmitCapture: Validator[js.UndefOr[_ | Null]] = null,
    onSuspend: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onSuspendCapture: Validator[js.UndefOr[_ | Null]] = null,
    onTimeUpdate: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onTimeUpdateCapture: Validator[js.UndefOr[_ | Null]] = null,
    onTouchCancel: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]] = null,
    onTouchCancelCapture: Validator[js.UndefOr[_ | Null]] = null,
    onTouchEnd: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]] = null,
    onTouchEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onTouchMove: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]] = null,
    onTouchMoveCapture: Validator[js.UndefOr[_ | Null]] = null,
    onTouchStart: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]] = null,
    onTouchStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onTransitionEnd: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLSelectElement]]] = null,
    onTransitionEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onVolumeChange: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onVolumeChangeCapture: Validator[js.UndefOr[_ | Null]] = null,
    onWaiting: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]] = null,
    onWaitingCapture: Validator[js.UndefOr[_ | Null]] = null,
    onWheel: Validator[js.UndefOr[Null | WheelEventHandler[HTMLSelectElement]]] = null,
    onWheelCapture: Validator[js.UndefOr[_ | Null]] = null,
    placeholder: Validator[js.UndefOr[Null | String]] = null,
    prefix: Validator[js.UndefOr[Null | String]] = null,
    property: Validator[js.UndefOr[Null | String]] = null,
    radioGroup: Validator[js.UndefOr[Null | String]] = null,
    ref: Validator[js.UndefOr[Null | Ref[_]]] = null,
    required: Validator[js.UndefOr[Boolean | Null]] = null,
    resource: Validator[js.UndefOr[Null | String]] = null,
    results: Validator[js.UndefOr[Double | Null]] = null,
    role: Validator[js.UndefOr[Null | String]] = null,
    security: Validator[js.UndefOr[Null | String]] = null
  ): WeakValidationMapPickSele = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (`aria-atomic` != null) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (`aria-busy` != null) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (`aria-disabled` != null) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (`aria-expanded` != null) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (`aria-grabbed` != null) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (`aria-modal` != null) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (`aria-multiline` != null) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (`aria-multiselectable` != null) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (`aria-readonly` != null) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (`aria-required` != null) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (`aria-selected` != null) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoFocus != null) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (defaultChecked != null) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (itemScope != null) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort.asInstanceOf[js.Any])
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(onAbortCapture.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd.asInstanceOf[js.Any])
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(onAnimationEndCapture.asInstanceOf[js.Any])
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration.asInstanceOf[js.Any])
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(onAnimationIterationCapture.asInstanceOf[js.Any])
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart.asInstanceOf[js.Any])
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(onAnimationStartCapture.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick.asInstanceOf[js.Any])
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(onAuxClickCapture.asInstanceOf[js.Any])
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput.asInstanceOf[js.Any])
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(onBeforeInputCapture.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(onBlurCapture.asInstanceOf[js.Any])
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay.asInstanceOf[js.Any])
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(onCanPlayCapture.asInstanceOf[js.Any])
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough.asInstanceOf[js.Any])
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(onCanPlayThroughCapture.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(onChangeCapture.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(onClickCapture.asInstanceOf[js.Any])
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd.asInstanceOf[js.Any])
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(onCompositionEndCapture.asInstanceOf[js.Any])
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart.asInstanceOf[js.Any])
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(onCompositionStartCapture.asInstanceOf[js.Any])
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate.asInstanceOf[js.Any])
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(onCompositionUpdateCapture.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(onContextMenuCapture.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy.asInstanceOf[js.Any])
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(onCopyCapture.asInstanceOf[js.Any])
    if (onCut != null) __obj.updateDynamic("onCut")(onCut.asInstanceOf[js.Any])
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(onCutCapture.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(onDoubleClickCapture.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(onDragCapture.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(onDragEndCapture.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(onDragEnterCapture.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(onDragExitCapture.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(onDragLeaveCapture.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(onDragOverCapture.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(onDragStartCapture.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(onDropCapture.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange.asInstanceOf[js.Any])
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(onDurationChangeCapture.asInstanceOf[js.Any])
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied.asInstanceOf[js.Any])
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(onEmptiedCapture.asInstanceOf[js.Any])
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted.asInstanceOf[js.Any])
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(onEncryptedCapture.asInstanceOf[js.Any])
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded.asInstanceOf[js.Any])
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(onEndedCapture.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(onFocusCapture.asInstanceOf[js.Any])
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(onGotPointerCapture.asInstanceOf[js.Any])
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(onGotPointerCaptureCapture.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(onInput.asInstanceOf[js.Any])
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(onInputCapture.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid.asInstanceOf[js.Any])
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(onInvalidCapture.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(onKeyDownCapture.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(onKeyPressCapture.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp.asInstanceOf[js.Any])
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(onKeyUpCapture.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(onLoadCapture.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart.asInstanceOf[js.Any])
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(onLoadStartCapture.asInstanceOf[js.Any])
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData.asInstanceOf[js.Any])
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(onLoadedDataCapture.asInstanceOf[js.Any])
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata.asInstanceOf[js.Any])
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(onLoadedMetadataCapture.asInstanceOf[js.Any])
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(onLostPointerCapture.asInstanceOf[js.Any])
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(onLostPointerCaptureCapture.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(onMouseDownCapture.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(onMouseMoveCapture.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(onMouseOutCapture.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(onMouseOverCapture.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(onMouseUpCapture.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste.asInstanceOf[js.Any])
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(onPasteCapture.asInstanceOf[js.Any])
    if (onPause != null) __obj.updateDynamic("onPause")(onPause.asInstanceOf[js.Any])
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(onPauseCapture.asInstanceOf[js.Any])
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay.asInstanceOf[js.Any])
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(onPlayCapture.asInstanceOf[js.Any])
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying.asInstanceOf[js.Any])
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(onPlayingCapture.asInstanceOf[js.Any])
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel.asInstanceOf[js.Any])
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(onPointerCancelCapture.asInstanceOf[js.Any])
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown.asInstanceOf[js.Any])
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(onPointerDownCapture.asInstanceOf[js.Any])
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter.asInstanceOf[js.Any])
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(onPointerEnterCapture.asInstanceOf[js.Any])
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave.asInstanceOf[js.Any])
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(onPointerLeaveCapture.asInstanceOf[js.Any])
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove.asInstanceOf[js.Any])
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(onPointerMoveCapture.asInstanceOf[js.Any])
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut.asInstanceOf[js.Any])
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(onPointerOutCapture.asInstanceOf[js.Any])
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver.asInstanceOf[js.Any])
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(onPointerOverCapture.asInstanceOf[js.Any])
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp.asInstanceOf[js.Any])
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(onPointerUpCapture.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress.asInstanceOf[js.Any])
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(onProgressCapture.asInstanceOf[js.Any])
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange.asInstanceOf[js.Any])
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(onRateChangeCapture.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(onResetCapture.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(onScrollCapture.asInstanceOf[js.Any])
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked.asInstanceOf[js.Any])
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(onSeekedCapture.asInstanceOf[js.Any])
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking.asInstanceOf[js.Any])
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(onSeekingCapture.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(onSelectCapture.asInstanceOf[js.Any])
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled.asInstanceOf[js.Any])
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(onStalledCapture.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit.asInstanceOf[js.Any])
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(onSubmitCapture.asInstanceOf[js.Any])
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend.asInstanceOf[js.Any])
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(onSuspendCapture.asInstanceOf[js.Any])
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate.asInstanceOf[js.Any])
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(onTimeUpdateCapture.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(onTouchCancelCapture.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(onTouchMoveCapture.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(onTouchStartCapture.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd.asInstanceOf[js.Any])
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(onTransitionEndCapture.asInstanceOf[js.Any])
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange.asInstanceOf[js.Any])
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(onVolumeChangeCapture.asInstanceOf[js.Any])
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting.asInstanceOf[js.Any])
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(onWaitingCapture.asInstanceOf[js.Any])
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel.asInstanceOf[js.Any])
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(onWheelCapture.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapPickSele]
  }
}

