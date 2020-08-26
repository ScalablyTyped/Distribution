package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
@js.native
trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: DOMRectReadOnly = js.native
  val intersectionRatio: Double = js.native
  val intersectionRect: DOMRectReadOnly = js.native
  val isIntersecting: scala.Boolean = js.native
  val rootBounds: DOMRectReadOnly | Null = js.native
  val target: Element = js.native
  val time: Double = js.native
}

object IntersectionObserverEntry {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectReadOnly,
    intersectionRatio: Double,
    intersectionRect: DOMRectReadOnly,
    isIntersecting: scala.Boolean,
    target: Element,
    time: Double
  ): IntersectionObserverEntry = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntry]
  }
  @scala.inline
  implicit class IntersectionObserverEntryOps[Self <: IntersectionObserverEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoundingClientRect(value: DOMRectReadOnly): Self = this.set("boundingClientRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRatio(value: Double): Self = this.set("intersectionRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRect(value: DOMRectReadOnly): Self = this.set("intersectionRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIntersecting(value: scala.Boolean): Self = this.set("isIntersecting", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBounds(value: DOMRectReadOnly): Self = this.set("rootBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBoundsNull: Self = this.set("rootBounds", null)
  }
  
}

