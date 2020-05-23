package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import typings.std.PerformanceObserverCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PerformanceObserver")
@js.native
class PerformanceObserver protected ()
  extends typings.std.PerformanceObserver {
  def this(callback: PerformanceObserverCallback) = this()
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver
  extends Instantiable1[/* callback */ PerformanceObserverCallback, typings.std.PerformanceObserver] {
  val supportedEntryTypes: js.Array[java.lang.String] = js.native
}

