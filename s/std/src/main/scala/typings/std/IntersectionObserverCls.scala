package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserverCls protected () extends IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  /* CompleteClass */
  override val root: Element | Null = js.native
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(target: Element): Unit = js.native
  /* CompleteClass */
  override def takeRecords(): js.Array[IntersectionObserverEntry] = js.native
  /* CompleteClass */
  override def unobserve(target: Element): Unit = js.native
}

