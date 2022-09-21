package typings.std

import typings.std.stdStrings.resourcetimingbufferfull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API. */
@js.native
trait Performance
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def clearMarks(): Unit = js.native
  def clearMarks(markName: java.lang.String): Unit = js.native
  
  /* standard dom */
  def clearMeasures(): Unit = js.native
  def clearMeasures(measureName: java.lang.String): Unit = js.native
  
  /* standard dom */
  def clearResourceTimings(): Unit = js.native
  
  /* standard dom */
  val eventCounts: EventCounts = js.native
  
  /* standard dom */
  def getEntries(): PerformanceEntryList = js.native
  
  /* standard dom */
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  
  /* standard dom */
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
  
  /* standard dom */
  def mark(markName: java.lang.String): PerformanceMark = js.native
  def mark(markName: java.lang.String, markOptions: PerformanceMarkOptions): PerformanceMark = js.native
  
  /* standard dom */
  def measure(measureName: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: java.lang.String, endMark: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: Unit, endMark: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: PerformanceMeasureOptions): PerformanceMeasure = js.native
  def measure(
    measureName: java.lang.String,
    startOrMeasureOptions: PerformanceMeasureOptions,
    endMark: java.lang.String
  ): PerformanceMeasure = js.native
  
  /** @deprecated */
  /* standard dom */
  val navigation: PerformanceNavigation = js.native
  
  /* standard dom */
  def now(): DOMHighResTimeStamp = js.native
  
  /* standard dom */
  var onresourcetimingbufferfull: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def setResourceTimingBufferSize(maxSize: Double): Unit = js.native
  
  /* standard dom */
  val timeOrigin: DOMHighResTimeStamp = js.native
  
  /** @deprecated */
  /* standard dom */
  val timing: PerformanceTiming = js.native
  
  /* standard dom */
  def toJSON(): Any = js.native
}
