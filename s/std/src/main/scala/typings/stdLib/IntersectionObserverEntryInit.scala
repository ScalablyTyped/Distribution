package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserverEntryInit extends js.Object {
  var boundingClientRect: DOMRectInit
  var intersectionRect: DOMRectInit
  var isIntersecting: scala.Boolean
  var rootBounds: DOMRectInit
  var target: Element
  var time: scala.Double
}

object IntersectionObserverEntryInit {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    rootBounds: DOMRectInit,
    target: Element,
    time: scala.Double
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingClientRect")(boundingClientRect)
    __obj.updateDynamic("intersectionRect")(intersectionRect)
    __obj.updateDynamic("isIntersecting")(isIntersecting)
    __obj.updateDynamic("rootBounds")(rootBounds)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
}

