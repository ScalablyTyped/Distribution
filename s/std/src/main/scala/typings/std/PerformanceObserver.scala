package typings.std

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

