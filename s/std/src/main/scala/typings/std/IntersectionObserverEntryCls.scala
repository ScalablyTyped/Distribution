package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

