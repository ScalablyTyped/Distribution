package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: DOMRectReadOnly
  val intersectionRatio: Double
  val intersectionRect: DOMRectReadOnly
  val isIntersecting: scala.Boolean
  val rootBounds: DOMRectReadOnly | Null
  val target: Element
  val time: Double
}

object IntersectionObserverEntry {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectReadOnly,
    intersectionRatio: Double,
    intersectionRect: DOMRectReadOnly,
    isIntersecting: scala.Boolean,
    target: Element,
    time: Double,
    rootBounds: DOMRectReadOnly = null
  ): IntersectionObserverEntry = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], rootBounds = rootBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntry]
  }
}

