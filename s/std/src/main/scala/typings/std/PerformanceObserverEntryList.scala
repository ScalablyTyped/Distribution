package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceObserverEntryList extends js.Object {
  def getEntries(): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
}

