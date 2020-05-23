package typings.reactImageMagnifiers.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactImageMagnifiers.anon.ClickMoveLimit
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MagnifierProps extends CommonProps {
  var cursorStyleActive: js.UndefOr[String] = js.undefined
  var dragToMove: js.UndefOr[Boolean] = js.undefined
  var interactionSettings: js.UndefOr[ClickMoveLimit] = js.undefined
  var mouseActivation: js.UndefOr[MouseActivation] = js.undefined
  var touchActivation: js.UndefOr[TouchActivation] = js.undefined
}

object MagnifierProps {
  @scala.inline
  def apply(
    imageSrc: String,
    className: String = null,
    cursorStyle: String = null,
    cursorStyleActive: String = null,
    dragToMove: js.UndefOr[Boolean] = js.undefined,
    imageAlt: String = null,
    interactionSettings: ClickMoveLimit = null,
    largeImageSrc: String = null,
    mouseActivation: MouseActivation = null,
    onImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onLargeImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onZoomEnd: () => Unit = null,
    onZoomStart: () => Unit = null,
    renderOverlay: /* state */ Boolean => ReactNode = null,
    style: CSSProperties = null,
    touchActivation: TouchActivation = null
  ): MagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (cursorStyleActive != null) __obj.updateDynamic("cursorStyleActive")(cursorStyleActive.asInstanceOf[js.Any])
    if (!js.isUndefined(dragToMove)) __obj.updateDynamic("dragToMove")(dragToMove.get.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (interactionSettings != null) __obj.updateDynamic("interactionSettings")(interactionSettings.asInstanceOf[js.Any])
    if (largeImageSrc != null) __obj.updateDynamic("largeImageSrc")(largeImageSrc.asInstanceOf[js.Any])
    if (mouseActivation != null) __obj.updateDynamic("mouseActivation")(mouseActivation.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onLargeImageLoad != null) __obj.updateDynamic("onLargeImageLoad")(js.Any.fromFunction1(onLargeImageLoad))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction0(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction0(onZoomStart))
    if (renderOverlay != null) __obj.updateDynamic("renderOverlay")(js.Any.fromFunction1(renderOverlay))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (touchActivation != null) __obj.updateDynamic("touchActivation")(touchActivation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierProps]
  }
}

