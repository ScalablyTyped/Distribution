package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: ClientRect | DOMRect
  val intersectionRatio: Double
  val intersectionRect: ClientRect | DOMRect
  val isIntersecting: scala.Boolean
  val rootBounds: ClientRect | DOMRect | Null
  val target: Element
  val time: Double
}

@JSGlobal("IntersectionObserverEntry")
@js.native
class IntersectionObserverEntryCls protected () extends IntersectionObserverEntry {
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  /* CompleteClass */
  override val boundingClientRect: ClientRect | DOMRect = js.native
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  /* CompleteClass */
  override val intersectionRect: ClientRect | DOMRect = js.native
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  /* CompleteClass */
  override val rootBounds: ClientRect | DOMRect | Null = js.native
  /* CompleteClass */
  override val target: Element = js.native
  /* CompleteClass */
  override val time: Double = js.native
}

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry extends Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      IntersectionObserverEntry
    ]

