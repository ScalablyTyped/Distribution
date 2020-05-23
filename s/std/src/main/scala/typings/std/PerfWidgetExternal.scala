package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfWidgetExternal extends js.Object {
  val activeNetworkRequestCount: Double = js.native
  val averageFrameTime: Double = js.native
  val averagePaintTime: Double = js.native
  val extraInformationEnabled: scala.Boolean = js.native
  val independentRenderingEnabled: scala.Boolean = js.native
  val irDisablingContentString: java.lang.String = js.native
  val irStatusAvailable: scala.Boolean = js.native
  val maxCpuSpeed: Double = js.native
  val paintRequestsPerSecond: Double = js.native
  val performanceCounter: Double = js.native
  val performanceCounterFrequency: Double = js.native
  def addEventListener(eventType: java.lang.String, callback: js.Function): Unit = js.native
  def getMemoryUsage(): Double = js.native
  def getProcessCpuUsage(): Double = js.native
  def getRecentCpuUsage(): js.Any = js.native
  def getRecentCpuUsage(last: Double): js.Any = js.native
  def getRecentFrames(): js.Any = js.native
  def getRecentFrames(last: Double): js.Any = js.native
  def getRecentMemoryUsage(): js.Any = js.native
  def getRecentMemoryUsage(last: Double): js.Any = js.native
  def getRecentPaintRequests(): js.Any = js.native
  def getRecentPaintRequests(last: Double): js.Any = js.native
  def removeEventListener(eventType: java.lang.String, callback: js.Function): Unit = js.native
  def repositionWindow(x: Double, y: Double): Unit = js.native
  def resizeWindow(width: Double, height: Double): Unit = js.native
}

