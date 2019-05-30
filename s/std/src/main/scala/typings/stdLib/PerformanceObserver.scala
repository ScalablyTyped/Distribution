package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceObserver extends js.Object {
  def disconnect(): scala.Unit = js.native
  def observe(): scala.Unit = js.native
  def observe(options: PerformanceObserverInit): scala.Unit = js.native
  def takeRecords(): PerformanceEntryList = js.native
}

@JSGlobal("PerformanceObserver")
@js.native
class PerformanceObserverCls protected () extends PerformanceObserver {
  def this(callback: PerformanceObserverCallback) = this()
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver
  extends org.scalablytyped.runtime.Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver] {
  val supportedEntryTypes: js.Array[java.lang.String] = js.native
}

