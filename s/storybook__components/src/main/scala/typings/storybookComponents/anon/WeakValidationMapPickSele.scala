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
import typings.storybookComponents.storybookComponentsStrings.`additions removals`
import typings.storybookComponents.storybookComponentsStrings.`additions text`
import typings.storybookComponents.storybookComponentsStrings.`inline`
import typings.storybookComponents.storybookComponentsStrings.`removals additions`
import typings.storybookComponents.storybookComponentsStrings.`removals text`
import typings.storybookComponents.storybookComponentsStrings.`text additions`
import typings.storybookComponents.storybookComponentsStrings.`text removals`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'multiple' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any> & @emotion/styled-base.@emotion/styled-base/types/helper.Omit<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'multiple' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps, 'theme'> & @emotion/styled-base.anon.0<@storybook/theming.@storybook/theming.Theme>> */
@js.native
trait WeakValidationMapPickSele extends StObject {
  
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
    Validator[
      js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
      ]
    ]
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
  
  var height: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
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
  implicit class WeakValidationMapPickSeleMutableBuilder[Self <: WeakValidationMapPickSele] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setAlign(value: Validator[js.UndefOr[Alignments | Null]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list | both | Null]]): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: Validator[
          js.UndefOr[
            additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
          ]
        ]
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other | Null]]): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setAutoSave(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Validator[js.UndefOr[inherit | Booleanish | Null]]): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setCss(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Validator[js.UndefOr[Html | Null]]): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDir(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setForm(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInlist(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setItemID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    @scala.inline
    def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLang(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnAbort(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAbortCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationIterationCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAuxClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onAuxClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeInputCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayThroughCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[ChangeEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionUpdateCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenuCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCopyCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onCopyCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onCutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoubleClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEnterCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragExitCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDragExitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragLeaveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDropCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDurationChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEmptiedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEncryptedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onEncryptedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnGotPointerCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onGotPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGotPointerCaptureCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    @scala.inline
    def setOnInput(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalidCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onInvalidCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyPressCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedDataCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedMetadataCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnLostPointerCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onLostPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLostPointerCaptureCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPasteCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPasteCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPauseCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerCancelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerEnterCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerLeaveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgressCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRateChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResetCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStalledCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmitCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuspendCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTimeUpdateCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransitionEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVolumeChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWaitingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: Validator[js.UndefOr[Null | WheelEventHandler[HTMLSelectElement]]]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWheelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | Ref[_]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRequired(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setResource(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResults(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSecurity(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSize(value: Validator[js.UndefOr[Null | Sizes]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSlot(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTheme(value: Validator[js.UndefOr[Null | typings.storybookTheming.typesMod.Theme]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTranslate(value: Validator[js.UndefOr[yes | no | Null]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setTypeof(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: Validator[js.UndefOr[on | off | Null]]): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    @scala.inline
    def setValid(value: Validator[js.UndefOr[Null | ValidationStates]]): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVocab(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
