package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The IntersectionObserverEntry interface of the Intersection Observer API describes the intersection between the target element and its root container at a specific moment of transition. */
trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: ClientRect | DOMRect
  val intersectionRatio: scala.Double
  val intersectionRect: ClientRect | DOMRect
  val isIntersecting: scala.Boolean
  val rootBounds: ClientRect | DOMRect
  val target: Element
  val time: scala.Double
}

@JSGlobal("IntersectionObserverEntry")
@js.native
class IntersectionObserverEntryCls protected () extends IntersectionObserverEntry {
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  /* CompleteClass */
  override val boundingClientRect: ClientRect | DOMRect = js.native
  /* CompleteClass */
  override val intersectionRatio: scala.Double = js.native
  /* CompleteClass */
  override val intersectionRect: ClientRect | DOMRect = js.native
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  /* CompleteClass */
  override val rootBounds: ClientRect | DOMRect = js.native
  /* CompleteClass */
  override val target: Element = js.native
  /* CompleteClass */
  override val time: scala.Double = js.native
}

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry
  extends org.scalablytyped.runtime.Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      IntersectionObserverEntry
    ]

