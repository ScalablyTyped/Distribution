package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserverEntryInit extends js.Object {
  var boundingClientRect: DOMRectInit
  var intersectionRatio: Double
  var intersectionRect: DOMRectInit
  var isIntersecting: scala.Boolean
  var rootBounds: DOMRectInit | Null
  var target: Element
  var time: Double
}

object IntersectionObserverEntryInit {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: Element,
    time: Double,
    rootBounds: DOMRectInit = null
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], rootBounds = rootBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
}

