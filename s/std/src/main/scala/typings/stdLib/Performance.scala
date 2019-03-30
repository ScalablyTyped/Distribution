package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Performance interface provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API. */
@js.native
trait Performance extends EventTarget {
  /** @deprecated */
  val navigation: PerformanceNavigation = js.native
  var onresourcetimingbufferfull: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val timeOrigin: scala.Double = js.native
  /** @deprecated */
  val timing: PerformanceTiming = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: stdLib.stdLibStrings.resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: stdLib.stdLibStrings.resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: stdLib.stdLibStrings.resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def clearMarks(): scala.Unit = js.native
  def clearMarks(markName: java.lang.String): scala.Unit = js.native
  def clearMeasures(): scala.Unit = js.native
  def clearMeasures(measureName: java.lang.String): scala.Unit = js.native
  def clearResourceTimings(): scala.Unit = js.native
  def getEntries(): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
  def mark(markName: java.lang.String): scala.Unit = js.native
  def measure(measureName: java.lang.String): scala.Unit = js.native
  def measure(measureName: java.lang.String, startMark: java.lang.String): scala.Unit = js.native
  def measure(measureName: java.lang.String, startMark: java.lang.String, endMark: java.lang.String): scala.Unit = js.native
  def now(): scala.Double = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: stdLib.stdLibStrings.resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: stdLib.stdLibStrings.resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: stdLib.stdLibStrings.resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def setResourceTimingBufferSize(maxSize: scala.Double): scala.Unit = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("Performance")
@js.native
class PerformanceCls () extends Performance

@JSGlobal("Performance")
@js.native
object Performance
  extends org.scalablytyped.runtime.Instantiable0[Performance]

