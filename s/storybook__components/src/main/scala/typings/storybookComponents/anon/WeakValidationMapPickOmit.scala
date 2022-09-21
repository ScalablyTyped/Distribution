package typings.storybookComponents.anon

import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
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
import typings.react.mod.Validator
import typings.react.mod.WheelEventHandler
import typings.std.HTMLInputElement
import typings.storybookComponents.mod.Alignments
import typings.storybookComponents.mod.Sizes
import typings.storybookComponents.mod.ValidationStates
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
import typings.storybookComponents.storybookComponentsStrings.environment
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
import typings.storybookComponents.storybookComponentsStrings.other_
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
import typings.storybookComponents.storybookComponentsStrings.user
import typings.storybookComponents.storybookComponentsStrings.vertical
import typings.storybookComponents.storybookComponentsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<std.Pick<std.Omit<react.react.HTMLProps<std.HTMLInputElement>, keyof @storybook/components.@storybook/components.InputStyleProps> & @storybook/components.@storybook/components.InputStyleProps, 'max' | 'required' | 'type' | 'data' | 'default' | 'high' | 'low' | 'key' | 'id' | 'media' | 'width' | 'start' | 'open' | 'name' | 'color' | 'content' | 'translate' | 'value' | 'hidden' | 'cite' | 'dir' | 'form' | 'label' | 'slot' | 'span' | 'style' | 'summary' | 'title' | 'pattern' | 'acceptCharset' | 'action' | 'method' | 'noValidate' | 'target' | 'accessKey' | 'draggable' | 'lang' | 'className' | 'prefix' | 'children' | 'contentEditable' | 'inputMode' | 'nonce' | 'tabIndex' | 'async' | 'disabled' | 'multiple' | 'manifest' | 'wrap' | 'accept' | 'allowFullScreen' | 'allowTransparency' | 'alt' | 'as' | 'autoComplete' | 'autoFocus' | 'autoPlay' | 'capture' | 'cellPadding' | 'cellSpacing' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'crossOrigin' | 'dateTime' | 'defer' | 'download' | 'encType' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'frameBorder' | 'headers' | 'href' | 'hrefLang' | 'htmlFor' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'list' | 'loop' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'min' | 'minLength' | 'muted' | 'optimum' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'contextMenu' | 'placeholder' | 'spellCheck' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'rel' | 'reversed' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'sizes' | 'src' | 'srcDoc' | 'srcLang' | 'srcSet' | 'step' | 'useMap' | 'wmode' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | keyof @storybook/components.@storybook/components.InputStyleProps> & react.react.RefAttributes<any> & @storybook/theming.@storybook/theming.DistributiveOmit<@storybook/components.@storybook/components.InputStyleProps, 'theme'> & @storybook/theming.anon.1<@storybook/theming.@storybook/theming.Theme>> */
trait WeakValidationMapPickOmit extends StObject {
  
  var default: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var accept: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var acceptCharset: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var action: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var align: js.UndefOr[Validator[js.UndefOr[Alignments | Null]]] = js.undefined
  
  var allowFullScreen: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var allowTransparency: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var alt: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.undefined
  
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.undefined
  
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.undefined
  
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.undefined
  
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.undefined
  
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.undefined
  
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.undefined
  
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-relevant`: js.UndefOr[
    Validator[
      js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
      ]
    ]
  ] = js.undefined
  
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other_ | Null]]] = js.undefined
  
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var as: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var async: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var autoComplete: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var autoPlay: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var capture: js.UndefOr[Validator[js.UndefOr[user | environment | Boolean | Null]]] = js.undefined
  
  var cellPadding: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.undefined
  
  var cellSpacing: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.undefined
  
  var challenge: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var charSet: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var checked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  
  var cite: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var classID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var colSpan: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var cols: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var content: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.undefined
  
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var controls: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var coords: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var crossOrigin: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Html | Null]]] = js.undefined
  
  var data: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var dateTime: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.undefined
  
  var defer: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var download: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var encType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var form: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var formAction: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var formEncType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var formMethod: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var formNoValidate: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var formTarget: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var frameBorder: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.undefined
  
  var headers: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var height: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var high: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var href: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var hrefLang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var htmlFor: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var httpEquiv: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var inlist: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var inputMode: js.UndefOr[
    Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
  ] = js.undefined
  
  var integrity: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.undefined
  
  var keyParams: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var keyType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var kind: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var label: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var list: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var loop: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var low: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var manifest: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var marginHeight: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var marginWidth: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var max: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.undefined
  
  var maxLength: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var media: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var mediaGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var method: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var min: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.undefined
  
  var minLength: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var muted: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var noValidate: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var nonce: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onAbortCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onAnimationEndCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onAnimationIterationCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onAnimationStartCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onAuxClickCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onBeforeInputCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onBlurCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onCanPlayCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onCanPlayThroughCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onChange: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onChangeCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onClickCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onCompositionEndCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onCompositionStartCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onCompositionUpdateCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onContextMenuCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onCopyCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onCutCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDoubleClickCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDragCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDragEndCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDragEnterCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDragExitCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDragLeaveCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDragOverCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDragStartCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onDropCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onDurationChangeCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onEmptiedCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onEncryptedCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onEndedCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onErrorCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onFocusCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onGotPointerCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onGotPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onInputCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onInvalidCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onKeyDownCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onKeyPressCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onKeyUpCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onLoadCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onLoadStartCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onLoadedDataCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onLoadedMetadataCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onLostPointerCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onLostPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onMouseDownCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onMouseMoveCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onMouseOutCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onMouseOverCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onMouseUpCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onPasteCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPauseCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPlayCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPlayingCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerOutCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerOverCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onProgressCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onRateChangeCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onResetCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onScrollCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onSeekedCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onSeekingCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onSelectCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onStalledCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]] = js.undefined
  
  var onSubmitCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onSuspendCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onTimeUpdateCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onTouchCancelCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onTouchMoveCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onTouchStartCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onTransitionEndCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onVolumeChangeCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onWaitingCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLInputElement]]]] = js.undefined
  
  var onWheelCapture: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var open: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var optimum: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var pattern: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var playsInline: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var poster: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var preload: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[Any]]]] = js.undefined
  
  var rel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var required: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var reversed: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var role: js.UndefOr[Validator[js.UndefOr[AriaRole | Null]]] = js.undefined
  
  var rowSpan: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var rows: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var sandbox: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var scope: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var scoped: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var scrolling: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var seamless: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var shape: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var size: js.UndefOr[Validator[js.UndefOr[Null | Sizes]]] = js.undefined
  
  var sizes: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var span: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  
  var src: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var srcDoc: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var srcLang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var srcSet: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var start: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var step: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.undefined
  
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  
  var summary: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var target: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var theme: js.UndefOr[Validator[js.UndefOr[Null | typings.storybookTheming.mod.Theme]]] = js.undefined
  
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.undefined
  
  var `type`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.undefined
  
  var useMap: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var valid: js.UndefOr[Validator[js.UndefOr[Null | ValidationStates]]] = js.undefined
  
  var value: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.undefined
  
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var width: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.undefined
  
  var wmode: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var wrap: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}
object WeakValidationMapPickOmit {
  
  inline def apply(): WeakValidationMapPickOmit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickOmit]
  }
  
  extension [Self <: WeakValidationMapPickOmit](x: Self) {
    
    inline def setAbout(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccept(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptCharset(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
    
    inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAccessKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAction(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAlign(value: Validator[js.UndefOr[Alignments | Null]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAllowFullScreen(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
    
    inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
    
    inline def setAllowTransparency(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
    
    inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
    
    inline def setAlt(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def `setAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list | both | Null]]): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    inline def `setAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    inline def `setAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    inline def `setAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    inline def `setAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    inline def `setAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-current`(value: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    inline def `setAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    inline def `setAria-disabled`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    inline def `setAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    inline def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    inline def `setAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    inline def `setAria-modal`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    inline def `setAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    inline def `setAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    inline def `setAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    inline def `setAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    inline def `setAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    inline def `setAria-readonly`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(
      value: Validator[
          js.UndefOr[
            additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
          ]
        ]
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other_ | Null]]): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    inline def `setAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    inline def `setAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setAs(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsync(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setAutoCapitalize(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoComplete(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoCorrect(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoPlay(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setAutoSave(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setCapture(value: Validator[js.UndefOr[user | environment | Boolean | Null]]): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setCellPadding(value: Validator[js.UndefOr[Double | Null | String]]): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
    
    inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
    
    inline def setCellSpacing(value: Validator[js.UndefOr[Double | Null | String]]): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
    
    inline def setChallenge(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setCharSet(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCite(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    inline def setClassID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
    
    inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColSpan(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setColor(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCols(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setContent(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentEditable(value: Validator[js.UndefOr[inherit | Booleanish | Null]]): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContextMenu(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setControls(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setCoords(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setCrossOrigin(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Validator[js.UndefOr[Html | Null]]): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setData(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDatatype(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDateTime(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setDefault(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefer(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setDir(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDownload(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setDraggable(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEncType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
    
    inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
    
    inline def setForm(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormEncType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setFormNoValidate(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    inline def setFormTarget(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setFrameBorder(value: Validator[js.UndefOr[Double | Null | String]]): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
    
    inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
    
    inline def setHeaders(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHigh(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setHref(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefLang(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setHtmlFor(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    inline def setHttpEquiv(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
    
    inline def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputMode(value: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setIntegrity(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setIs(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    inline def setItemProp(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    inline def setItemRef(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    inline def setItemScope(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    inline def setItemType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyParams(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
    
    inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
    
    inline def setKeyType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKind(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLang(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setList(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setLoop(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setLow(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setManifest(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setMarginHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
    
    inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
    
    inline def setMarginWidth(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
    
    inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
    
    inline def setMax(value: Validator[js.UndefOr[Double | Null | String]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMedia(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaGroup(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMethod(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMin(value: Validator[js.UndefOr[Double | Null | String]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setMuted(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoValidate(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    inline def setNonce(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOnAbort(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    inline def setOnAbortCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: Validator[js.UndefOr[AnimationEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationEndCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: Validator[js.UndefOr[AnimationEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationIterationCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: Validator[js.UndefOr[AnimationEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationStartCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
    
    inline def setOnAuxClickCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onAuxClickCapture", value.asInstanceOf[js.Any])
    
    inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeInputCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
    
    inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    inline def setOnCanPlayThrough(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayThroughCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
    
    inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: Validator[js.UndefOr[CompositionEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionEndCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: Validator[js.UndefOr[CompositionEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionStartCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: Validator[js.UndefOr[CompositionEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionUpdateCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
    
    inline def setOnContextMenuCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
    
    inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    inline def setOnCopyCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onCopyCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    inline def setOnCutCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onCutCapture", value.asInstanceOf[js.Any])
    
    inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
    
    inline def setOnDoubleClickCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    inline def setOnDragCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    inline def setOnDragEnd(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    inline def setOnDragEndCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
    
    inline def setOnDragEnterCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
    
    inline def setOnDragExitCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDragExitCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
    
    inline def setOnDragLeaveCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
    
    inline def setOnDragOverCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: Validator[js.UndefOr[DragEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    inline def setOnDropCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
    
    inline def setOnDurationChangeCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    inline def setOnEmptiedCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    inline def setOnEncryptedCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onEncryptedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    inline def setOnEndedCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
    
    inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
    
    inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnGotPointerCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onGotPointerCapture", value.asInstanceOf[js.Any])
    
    inline def setOnGotPointerCaptureCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    inline def setOnInput(value: Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    inline def setOnInputCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
    
    inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    inline def setOnInvalidCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onInvalidCapture", value.asInstanceOf[js.Any])
    
    inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDownCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPressCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUpCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    inline def setOnLoadStart(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
    
    inline def setOnLoadStartCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedDataCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedMetadataCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnLostPointerCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onLostPointerCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLostPointerCaptureCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    inline def setOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOutCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOverCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    inline def setOnPasteCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPasteCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    inline def setOnPlayCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    inline def setOnPlayingCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOutCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOverCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnProgressCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
    
    inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
    
    inline def setOnRateChangeCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    inline def setOnResetCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
    
    inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnScrollCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
    
    inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    inline def setOnSeekedCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    inline def setOnSeekingCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    inline def setOnStalledCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
    
    inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: Validator[js.UndefOr[FormEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    inline def setOnSubmitCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    inline def setOnSuspendCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
    
    inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnTimeUpdateCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionEndCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
    
    inline def setOnVolumeChangeCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    inline def setOnWaitingCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
    
    inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: Validator[js.UndefOr[Null | WheelEventHandler[HTMLInputElement]]]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
    
    inline def setOnWheelCapture(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOptimum(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
    
    inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
    
    inline def setPattern(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlaysInline(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    inline def setPoster(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPrefix(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPreload(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setProperty(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setReadOnly(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRef(value: Validator[js.UndefOr[Null | Ref[Any]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRel(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRequired(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setResource(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setReversed(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setRole(value: Validator[js.UndefOr[AriaRole | Null]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRowSpan(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setRows(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSandbox(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setScope(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScoped(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setScrolling(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSeamless(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
    
    inline def setSecurity(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShape(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Validator[js.UndefOr[Null | Sizes]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizes(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSlot(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpan(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setSpellCheck(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setSrc(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcDoc(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
    
    inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
    
    inline def setSrcLang(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    
    inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
    
    inline def setSrcSet(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStart(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: Validator[js.UndefOr[Double | Null | String]]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSummary(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setSuppressContentEditableWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    inline def setSuppressHydrationWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    inline def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTarget(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTheme(value: Validator[js.UndefOr[Null | typings.storybookTheming.mod.Theme]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslate(value: Validator[js.UndefOr[yes | no | Null]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeof(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: Validator[js.UndefOr[on | off | Null]]): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setUseMap(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    
    inline def setValid(value: Validator[js.UndefOr[Null | ValidationStates]]): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVocab(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    
    inline def setWidth(value: Validator[js.UndefOr[Double | Null | String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWmode(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
    
    inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
    
    inline def setWrap(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
