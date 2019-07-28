package typings.resizeDashObserverDashLite.resizeDashObserverDashLiteMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resize-observer-lite", JSImport.Default)
@js.native
class default protected () extends ResizeObserverLite {
  def this(handler: ResizeObserverLiteEntriesHandler) = this()
  /* CompleteClass */
  override var handler: js.Any = js.native
  /* CompleteClass */
  override var hasResizeObserver: js.Any = js.native
  /* CompleteClass */
  override var listenedElement: js.Any = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(element: Element): Unit = js.native
}

