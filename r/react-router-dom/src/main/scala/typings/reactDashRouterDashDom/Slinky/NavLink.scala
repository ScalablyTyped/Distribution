package typings.reactDashRouterDashDom.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.history.historyMod.Location
import typings.history.historyMod.LocationDescriptor
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Ref
import typings.reactDashRouter.reactDashRouterMod.`match`
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: aria-valuetext, aria-errormessage, aria-haspopup, aria-rowcount, aria-autocomplete, aria-labelledby, aria-describedby, aria-activedescendant, aria-level, aria-live, aria-dropeffect, aria-expanded, aria-rowspan, aria-checked, aria-disabled, aria-multiselectable, aria-pressed, aria-relevant, aria-hidden, aria-colcount, aria-sort, aria-colindex, aria-keyshortcuts, aria-setsize, aria-rowindex, aria-valuemin, aria-modal, aria-colspan, aria-owns, aria-roledescription, aria-multiline, aria-grabbed, aria-valuenow, aria-selected, aria-placeholder, aria-busy, aria-orientation, aria-details, aria-required, aria-label, aria-posinset, aria-valuemax, aria-atomic, aria-controls, aria-current, aria-readonly, aria-invalid, aria-flowto, onDurationChangeCapture, onDoubleClickCapture, onProgressCapture, onAuxClickCapture, onEndedCapture, onChangeCapture, onPointerEnter, onBlur, children, onDragStart, onCanPlayThrough, onPointerEnterCapture, onInput, onTouchEndCapture, onCompositionUpdate, onMouseLeave, onRateChangeCapture, onDrag, onAnimationStartCapture, onAnimationIterationCapture, onTouchStart, onPointerOver, onCopyCapture, onCompositionStartCapture, onClick, onVolumeChangeCapture, onContextMenu, onLoadedMetadataCapture, onKeyUpCapture, onInvalid, onSuspendCapture, onWaiting, onKeyPressCapture, onKeyDown, onPause, onTouchStartCapture, onPointerOverCapture, onSeeked, onPointerLeave, onContextMenuCapture, onEmptied, onChange, onDragCapture, onKeyDownCapture, onMouseUpCapture, onWheel, onDragLeaveCapture, onDragLeave, onReset, onLoadStartCapture, onResetCapture, onDrop, onDragStartCapture, onDragExit, onDragOver, onCut, onLoadedData, onMouseOverCapture, onPlayingCapture, onStalled, onPointerOutCapture, onGotPointerCaptureCapture, onDragEnd, onScroll, onSubmit, onSelectCapture, onRateChange, onAbortCapture, onPointerDownCapture, onAnimationEnd, onEmptiedCapture, onWaitingCapture, onCanPlayThroughCapture, onMouseUp, onTouchEnd, onKeyUp, onMouseOutCapture, onDurationChange, onMouseMove, onStalledCapture, onAnimationEndCapture, onMouseOver, onPointerDown, onPlay, onSeekedCapture, onLostPointerCaptureCapture, dangerouslySetInnerHTML, onError, onPointerLeaveCapture, onBlurCapture, onFocusCapture, onPointerUpCapture, onLoadedMetadata, onSeeking, onMouseMoveCapture, onTouchCancel, onCompositionEndCapture, onMouseDownCapture, onLostPointerCapture, onPointerOut, onSeekingCapture, onDragExitCapture, onCompositionStart, onAnimationStart, onCopy, onInputCapture, onVolumeChange, onSubmitCapture, onDragEnterCapture, onMouseOut, onCompositionUpdateCapture, onEncrypted, onPointerCancelCapture, onScrollCapture, onTransitionEnd, onFocus, onLoadStart, onEncryptedCapture, onPointerMoveCapture, onSuspend, onDragEnter, onPaste, onBeforeInput, onTouchMove, onSelect, onPointerUp, onGotPointerCapture, onDragOverCapture, onKeyPress, onEnded, onTouchCancelCapture, onErrorCapture, onAnimationIteration, onPauseCapture, onPlaying, onAbort, onTransitionEndCapture, onWheelCapture, onLoad, onPointerMove, onLoadedDataCapture, onMouseEnter, onClickCapture, onPlayCapture, onCanPlayCapture, onLoadCapture, onDropCapture, onAuxClick, onInvalidCapture, onPointerCancel, onCompositionEnd, onTimeUpdate, onDragEndCapture, onProgress, onCanPlay, onMouseDown, onDoubleClick, onCutCapture, onTouchMoveCapture, onTimeUpdateCapture, onBeforeInputCapture, onPasteCapture, autoSave, itemRef, tabIndex, is, contentEditable, security, role, style, unselectable, prefix, hidden, itemID, itemProp, radioGroup, color, placeholder, suppressHydrationWarning, inputMode, inlist, autoCorrect, autoCapitalize, itemScope, vocab, dir, id, results, draggable, resource, suppressContentEditableWarning, itemType, accessKey, className, typeof, datatype, property, spellCheck, defaultChecked, title, lang, defaultValue, about, slot, contextMenu, hrefLang, rel, media, target, type, href, download */
object NavLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLink[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLink[js.Any]].asInstanceOf[String | js.Object]
  def apply[S](
    to: LocationDescriptor[S],
    activeClassName: String = null,
    activeStyle: CSSProperties = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[HTMLAnchorElement] = null,
    isActive: (/* match */ `match`[_], /* location */ Location[S]) => Boolean = null,
    location: Location[S] = null,
    ping: String = null,
    referrerPolicy: String = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLink[js.Any]] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (isActive != null) __obj.updateDynamic("isActive")(js.Any.fromFunction2(isActive))
    if (location != null) __obj.updateDynamic("location")(location)
    if (ping != null) __obj.updateDynamic("ping")(ping)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLink[js.Any]]]
  }
  type Props = NavLinkProps[js.Any]
}

