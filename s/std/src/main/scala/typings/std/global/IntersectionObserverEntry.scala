package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import typings.std.IntersectionObserverEntryInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserverEntry")
@js.native
class IntersectionObserverEntry protected ()
  extends typings.std.IntersectionObserverEntry {
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  /* CompleteClass */
  override val boundingClientRect: typings.std.DOMRectReadOnly = js.native
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  /* CompleteClass */
  override val intersectionRect: typings.std.DOMRectReadOnly = js.native
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  /* CompleteClass */
  override val rootBounds: typings.std.DOMRectReadOnly | Null = js.native
  /* CompleteClass */
  override val target: typings.std.Element = js.native
  /* CompleteClass */
  override val time: Double = js.native
}

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry
  extends Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      typings.std.IntersectionObserverEntry
    ]

