package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserverEntryInit extends js.Object {
  var boundingClientRect: DOMRectInit
  var intersectionRatio: scala.Double
  var intersectionRect: DOMRectInit
  var isIntersecting: scala.Boolean
  var rootBounds: DOMRectInit | scala.Null
  var target: Element
  var time: scala.Double
}

object IntersectionObserverEntryInit {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: scala.Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: Element,
    time: scala.Double,
    rootBounds: DOMRectInit = null
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect, intersectionRatio = intersectionRatio, intersectionRect = intersectionRect, isIntersecting = isIntersecting, target = target, time = time)
    if (rootBounds != null) __obj.updateDynamic("rootBounds")(rootBounds)
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
}

