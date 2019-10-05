package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceObserver extends js.Object {
  def disconnect(): Unit = js.native
  def observe(): Unit = js.native
  def observe(options: PerformanceObserverInit): Unit = js.native
  def takeRecords(): PerformanceEntryList = js.native
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver extends Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver] {
  val supportedEntryTypes: js.Array[java.lang.String] = js.native
}

