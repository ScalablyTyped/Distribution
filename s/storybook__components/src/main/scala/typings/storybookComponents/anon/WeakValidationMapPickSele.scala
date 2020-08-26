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

/* Inlined react.react.WeakValidationMap<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any> & @emotion/styled-base.@emotion/styled-base/types/helper.Omit<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps, 'theme'> & @emotion/styled-base.anon.0<@storybook/theming.@storybook/theming.Theme>> */
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
  def apply(): WeakValidationMapPickSele = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickSele]
  }
  @scala.inline
  implicit class WeakValidationMapPickSeleOps[Self <: WeakValidationMapPickSele] (val x: Self) extends AnyVal {
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
    def setAbout(value: Validator[js.UndefOr[Null | String]]): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccessKey(value: Validator[js.UndefOr[Null | String]]): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAlign(value: Validator[js.UndefOr[Alignments | Null]]): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list | both | Null]]): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other | Null]]): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: Validator[js.UndefOr[Null | String]]): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: Validator[js.UndefOr[Null | String]]): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: Validator[js.UndefOr[Null | String]]): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoSave(value: Validator[js.UndefOr[Null | String]]): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: Validator[js.UndefOr[Null | String]]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContentEditable(value: Validator[js.UndefOr[inherit | Booleanish | Null]]): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: Validator[js.UndefOr[Null | String]]): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setCss(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Validator[js.UndefOr[Html | Null]]): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setDatatype(value: Validator[js.UndefOr[Null | String]]): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDefaultChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDir(value: Validator[js.UndefOr[Null | String]]): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDraggable(value: Validator[js.UndefOr[Booleanish | Null]]): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setForm(value: Validator[js.UndefOr[Null | String]]): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setHidden(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInlist(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setIs(value: Validator[js.UndefOr[Null | String]]): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setItemID(value: Validator[js.UndefOr[Null | String]]): Self = this.set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    @scala.inline
    def setItemProp(value: Validator[js.UndefOr[Null | String]]): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    @scala.inline
    def setItemRef(value: Validator[js.UndefOr[Null | String]]): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    @scala.inline
    def setItemScope(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    @scala.inline
    def setItemType(value: Validator[js.UndefOr[Null | String]]): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLang(value: Validator[js.UndefOr[Null | String]]): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnAbort(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAbortCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onAbortCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onAnimationEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationEndCapture: Self = this.set("onAnimationEndCapture", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onAnimationIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationIterationCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationIterationCapture: Self = this.set("onAnimationIterationCapture", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onAnimationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAnimationStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationStartCapture: Self = this.set("onAnimationStartCapture", js.undefined)
    @scala.inline
    def setOnAuxClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onAuxClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    @scala.inline
    def setOnAuxClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onAuxClickCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAuxClickCapture: Self = this.set("onAuxClickCapture", js.undefined)
    @scala.inline
    def setOnBeforeInput(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onBeforeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    @scala.inline
    def setOnBeforeInputCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBeforeInputCapture: Self = this.set("onBeforeInputCapture", js.undefined)
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnBlurCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onBlurCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    @scala.inline
    def setOnCanPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onCanPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onCanPlayCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onCanPlayThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnCanPlayThroughCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[ChangeEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onClickCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onCompositionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionEndCapture: Self = this.set("onCompositionEndCapture", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onCompositionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionStartCapture: Self = this.set("onCompositionStartCapture", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onCompositionUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnCompositionUpdateCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionUpdateCapture: Self = this.set("onCompositionUpdateCapture", js.undefined)
    @scala.inline
    def setOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnContextMenuCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onContextMenuCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    @scala.inline
    def setOnCopy(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCopyCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onCopyCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCopyCapture: Self = this.set("onCopyCapture", js.undefined)
    @scala.inline
    def setOnCut(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onCut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnCutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onCutCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCutCapture: Self = this.set("onCutCapture", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDoubleClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDoubleClickCapture: Self = this.set("onDoubleClickCapture", js.undefined)
    @scala.inline
    def setOnDrag(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDragCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    @scala.inline
    def setOnDragEnd(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDragEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    @scala.inline
    def setOnDragEnter(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragEnterCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDragEnterCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    @scala.inline
    def setOnDragExit(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDragExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragExitCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDragExitCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragExitCapture: Self = this.set("onDragExitCapture", js.undefined)
    @scala.inline
    def setOnDragLeave(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragLeaveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    @scala.inline
    def setOnDragOver(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDragOverCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    @scala.inline
    def setOnDragStart(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDragStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    @scala.inline
    def setOnDrop(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDropCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDropCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    @scala.inline
    def setOnDurationChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onDurationChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnDurationChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    @scala.inline
    def setOnEmptied(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onEmptied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEmptiedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onEmptiedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    @scala.inline
    def setOnEncrypted(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEncryptedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onEncryptedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEncryptedCapture: Self = this.set("onEncryptedCapture", js.undefined)
    @scala.inline
    def setOnEnded(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnEndedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onEndedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    @scala.inline
    def setOnError(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnErrorCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onErrorCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnFocusCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onFocusCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    @scala.inline
    def setOnGotPointerCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onGotPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnGotPointerCapture: Self = this.set("onGotPointerCapture", js.undefined)
    @scala.inline
    def setOnGotPointerCaptureCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnGotPointerCaptureCapture: Self = this.set("onGotPointerCaptureCapture", js.undefined)
    @scala.inline
    def setOnInput(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInputCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onInputCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    @scala.inline
    def setOnInvalid(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnInvalidCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onInvalidCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInvalidCapture: Self = this.set("onInvalidCapture", js.undefined)
    @scala.inline
    def setOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onKeyDownCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    @scala.inline
    def setOnKeyPress(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyPressCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onKeyPressCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    @scala.inline
    def setOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnKeyUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onKeyUpCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    @scala.inline
    def setOnLoad(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onLoadCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    @scala.inline
    def setOnLoadStart(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onLoadStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    @scala.inline
    def setOnLoadedData(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onLoadedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedDataCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onLoadedMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnLoadedMetadataCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    @scala.inline
    def setOnLostPointerCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onLostPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLostPointerCapture: Self = this.set("onLostPointerCapture", js.undefined)
    @scala.inline
    def setOnLostPointerCaptureCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLostPointerCaptureCapture: Self = this.set("onLostPointerCaptureCapture", js.undefined)
    @scala.inline
    def setOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onMouseDownCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    @scala.inline
    def setOnMouseOut(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onMouseOutCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    @scala.inline
    def setOnMouseOver(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onMouseOverCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    @scala.inline
    def setOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnMouseUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onMouseUpCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    @scala.inline
    def setOnPaste(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPasteCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPasteCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPasteCapture: Self = this.set("onPasteCapture", js.undefined)
    @scala.inline
    def setOnPause(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onPause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPauseCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPauseCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    @scala.inline
    def setOnPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlayCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPlayCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    @scala.inline
    def setOnPlaying(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPlayingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPlayingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerCancelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    @scala.inline
    def setOnPointerDown(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerDownCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerEnterCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerLeaveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    @scala.inline
    def setOnPointerMove(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    @scala.inline
    def setOnPointerOut(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerOutCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    @scala.inline
    def setOnPointerOver(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerOverCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    @scala.inline
    def setOnPointerUp(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = this.set("onPointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnPointerUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onPointerUpCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    @scala.inline
    def setOnProgress(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnProgressCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onProgressCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    @scala.inline
    def setOnRateChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onRateChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnRateChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onRateChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    @scala.inline
    def setOnReset(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnResetCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onResetCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    @scala.inline
    def setOnScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLSelectElement]]]): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnScrollCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onScrollCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    @scala.inline
    def setOnSeeked(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onSeeked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeekedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onSeekedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    @scala.inline
    def setOnSeeking(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onSeeking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSeekingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onSeekingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    @scala.inline
    def setOnSelect(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onSelectCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    @scala.inline
    def setOnStalled(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onStalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnStalledCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onStalledCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    @scala.inline
    def setOnSubmit(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSubmitCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onSubmitCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    @scala.inline
    def setOnSuspend(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onSuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnSuspendCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onSuspendCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onTimeUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTimeUpdateCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchCancelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    @scala.inline
    def setOnTouchMove(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    @scala.inline
    def setOnTouchStart(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTouchStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onTouchStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLSelectElement]]]): Self = this.set("onTransitionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTransitionEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTransitionEndCapture: Self = this.set("onTransitionEndCapture", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onVolumeChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnVolumeChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    @scala.inline
    def setOnWaiting(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = this.set("onWaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWaitingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onWaitingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    @scala.inline
    def setOnWheel(value: Validator[js.UndefOr[Null | WheelEventHandler[HTMLSelectElement]]]): Self = this.set("onWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setOnWheelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("onWheelCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrefix(value: Validator[js.UndefOr[Null | String]]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setProperty(value: Validator[js.UndefOr[Null | String]]): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRadioGroup(value: Validator[js.UndefOr[Null | String]]): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | Ref[_]]]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRequired(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setResource(value: Validator[js.UndefOr[Null | String]]): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResults(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSecurity(value: Validator[js.UndefOr[Null | String]]): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setSize(value: Validator[js.UndefOr[Null | Sizes]]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSlot(value: Validator[js.UndefOr[Null | String]]): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpellCheck(value: Validator[js.UndefOr[Booleanish | Null]]): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuppressContentEditableWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    @scala.inline
    def setSuppressHydrationWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    @scala.inline
    def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTheme(value: Validator[js.UndefOr[Null | typings.storybookTheming.typesMod.Theme]]): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTranslate(value: Validator[js.UndefOr[yes | no | Null]]): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setTypeof(value: Validator[js.UndefOr[Null | String]]): Self = this.set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    @scala.inline
    def setUnselectable(value: Validator[js.UndefOr[on | off | Null]]): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setValid(value: Validator[js.UndefOr[Null | ValidationStates]]): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    @scala.inline
    def setValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVocab(value: Validator[js.UndefOr[Null | String]]): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
  }
  
}

