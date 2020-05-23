package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntersectionObserverCallback
import typings.std.IntersectionObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserver protected ()
  extends typings.std.IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  /* CompleteClass */
  override val root: typings.std.Element | Null = js.native
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(target: typings.std.Element): Unit = js.native
  /* CompleteClass */
  override def takeRecords(): js.Array[typings.std.IntersectionObserverEntry] = js.native
  /* CompleteClass */
  override def unobserve(target: typings.std.Element): Unit = js.native
}

@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends Instantiable1[/* callback */ IntersectionObserverCallback, typings.std.IntersectionObserver]
     with Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      typings.std.IntersectionObserver
    ]

