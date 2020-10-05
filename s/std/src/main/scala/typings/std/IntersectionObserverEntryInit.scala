package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserverEntryInit extends js.Object {
  var boundingClientRect: DOMRectInit = js.native
  var intersectionRatio: Double = js.native
  var intersectionRect: DOMRectInit = js.native
  var isIntersecting: scala.Boolean = js.native
  var rootBounds: DOMRectInit | Null = js.native
  var target: Element = js.native
  var time: Double = js.native
}

object IntersectionObserverEntryInit {
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: Element,
    time: Double
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
  @scala.inline
  implicit class IntersectionObserverEntryInitOps[Self <: IntersectionObserverEntryInit] (val x: Self) extends AnyVal {
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
    def setBoundingClientRect(value: DOMRectInit): Self = this.set("boundingClientRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRatio(value: Double): Self = this.set("intersectionRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRect(value: DOMRectInit): Self = this.set("intersectionRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIntersecting(value: scala.Boolean): Self = this.set("isIntersecting", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBounds(value: DOMRectInit): Self = this.set("rootBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBoundsNull: Self = this.set("rootBounds", null)
  }
  
}

