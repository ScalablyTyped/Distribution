package typings.reactDashRouterDashHashDashLink.reactDashRouterDashHashDashLinkMod

import typings.history.historyMod.LocationState
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.DOMAttributes because Already inherited
- typings.react.reactMod.AriaAttributes because Already inherited
- typings.react.reactMod.HTMLAttributes because Already inherited
- typings.react.reactMod.AnchorHTMLAttributes because Already inherited
- typings.reactDashRouterDashDom.reactDashRouterDashDomMod.LinkProps because Already inherited
- typings.reactDashRouterDashHashDashLink.reactDashRouterDashHashDashLinkMod.HashLinkProps because var conflicts: about, accessKey, `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, ariaCurrent, autoCapitalize, autoCorrect, autoSave, children, className, color, component, contentEditable, contextMenu, dangerouslySetInnerHTML, datatype, defaultChecked, defaultValue, dir, download, draggable, hidden, href, hrefLang, id, inlist, innerRef, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, media, onAbort, onAbortCapture, onAnimationEnd, onAnimationEndCapture, onAnimationIteration, onAnimationIterationCapture, onAnimationStart, onAnimationStartCapture, onAuxClick, onAuxClickCapture, onBeforeInput, onBeforeInputCapture, onBlur, onBlurCapture, onCanPlay, onCanPlayCapture, onCanPlayThrough, onCanPlayThroughCapture, onChange, onChangeCapture, onClick, onClickCapture, onCompositionEnd, onCompositionEndCapture, onCompositionStart, onCompositionStartCapture, onCompositionUpdate, onCompositionUpdateCapture, onContextMenu, onContextMenuCapture, onCopy, onCopyCapture, onCut, onCutCapture, onDoubleClick, onDoubleClickCapture, onDrag, onDragCapture, onDragEnd, onDragEndCapture, onDragEnter, onDragEnterCapture, onDragExit, onDragExitCapture, onDragLeave, onDragLeaveCapture, onDragOver, onDragOverCapture, onDragStart, onDragStartCapture, onDrop, onDropCapture, onDurationChange, onDurationChangeCapture, onEmptied, onEmptiedCapture, onEncrypted, onEncryptedCapture, onEnded, onEndedCapture, onError, onErrorCapture, onFocus, onFocusCapture, onGotPointerCapture, onGotPointerCaptureCapture, onInput, onInputCapture, onInvalid, onInvalidCapture, onKeyDown, onKeyDownCapture, onKeyPress, onKeyPressCapture, onKeyUp, onKeyUpCapture, onLoad, onLoadCapture, onLoadStart, onLoadStartCapture, onLoadedData, onLoadedDataCapture, onLoadedMetadata, onLoadedMetadataCapture, onLostPointerCapture, onLostPointerCaptureCapture, onMouseDown, onMouseDownCapture, onMouseEnter, onMouseLeave, onMouseMove, onMouseMoveCapture, onMouseOut, onMouseOutCapture, onMouseOver, onMouseOverCapture, onMouseUp, onMouseUpCapture, onPaste, onPasteCapture, onPause, onPauseCapture, onPlay, onPlayCapture, onPlaying, onPlayingCapture, onPointerCancel, onPointerCancelCapture, onPointerDown, onPointerDownCapture, onPointerEnter, onPointerEnterCapture, onPointerLeave, onPointerLeaveCapture, onPointerMove, onPointerMoveCapture, onPointerOut, onPointerOutCapture, onPointerOver, onPointerOverCapture, onPointerUp, onPointerUpCapture, onProgress, onProgressCapture, onRateChange, onRateChangeCapture, onReset, onResetCapture, onScroll, onScrollCapture, onSeeked, onSeekedCapture, onSeeking, onSeekingCapture, onSelect, onSelectCapture, onStalled, onStalledCapture, onSubmit, onSubmitCapture, onSuspend, onSuspendCapture, onTimeUpdate, onTimeUpdateCapture, onTouchCancel, onTouchCancelCapture, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchMoveCapture, onTouchStart, onTouchStartCapture, onTransitionEnd, onTransitionEndCapture, onVolumeChange, onVolumeChangeCapture, onWaiting, onWaitingCapture, onWheel, onWheelCapture, ping, placeholder, prefix, property, radioGroup, referrerPolicy, rel, replace, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, target, title, to, `type`, typeof, unselectable, vocab. Inlined smooth, scroll */ trait NavHashLinkProps extends NavLinkProps[LocationState] {
  var scroll: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.undefined
  var smooth: js.UndefOr[Boolean] = js.undefined
}

object NavHashLinkProps {
  @scala.inline
  def apply(
    NavLinkProps: NavLinkProps[LocationState] = null,
    scroll: /* element */ HTMLElement => Unit = null,
    smooth: js.UndefOr[Boolean] = js.undefined
  ): NavHashLinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NavLinkProps)
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    __obj.asInstanceOf[NavHashLinkProps]
  }
}

