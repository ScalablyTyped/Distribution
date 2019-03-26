package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceObserver extends js.Object {
  def disconnect(): scala.Unit
  def observe(options: PerformanceObserverInit): scala.Unit
  def takeRecords(): PerformanceEntryList
}

@JSGlobal("PerformanceObserver")
@js.native
class PerformanceObserverCls protected () extends PerformanceObserver {
  def this(callback: PerformanceObserverCallback) = this()
  /* CompleteClass */
  override def disconnect(): scala.Unit = js.native
  /* CompleteClass */
  override def observe(options: PerformanceObserverInit): scala.Unit = js.native
  /* CompleteClass */
  override def takeRecords(): PerformanceEntryList = js.native
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver
  extends org.scalablytyped.runtime.Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver]

