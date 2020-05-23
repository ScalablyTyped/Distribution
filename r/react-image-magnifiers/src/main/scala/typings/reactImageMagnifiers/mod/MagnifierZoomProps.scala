package typings.reactImageMagnifiers.mod

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MagnifierZoomProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var imageAlt: js.UndefOr[String] = js.undefined
  var imageSrc: String
  var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionSpeed: js.UndefOr[Double] = js.undefined
}

object MagnifierZoomProps {
  @scala.inline
  def apply(
    imageSrc: String,
    className: String = null,
    imageAlt: String = null,
    onImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    style: CSSProperties = null,
    transitionSpeed: js.UndefOr[Double] = js.undefined
  ): MagnifierZoomProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionSpeed)) __obj.updateDynamic("transitionSpeed")(transitionSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierZoomProps]
  }
}

