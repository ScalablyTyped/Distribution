package typings.std

import org.scalablytyped.runtime.Instantiable1
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

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry extends Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      IntersectionObserverEntry
    ]

