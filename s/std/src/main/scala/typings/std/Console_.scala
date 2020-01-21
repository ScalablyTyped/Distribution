package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the browser's debugging console (e.g. the Web Console in Firefox). The specifics of how it works varies from browser to browser, but there is a de facto set of features that are typically provided. */
@js.native
trait Console_ extends js.Object {
  var memory: js.Any = js.native
  def assert(): Unit = js.native
  def assert(condition: scala.Boolean): Unit = js.native
  def assert(condition: scala.Boolean, message: java.lang.String, data: js.Any*): Unit = js.native
  def clear(): Unit = js.native
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  def debug(): Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def dir(): Unit = js.native
  def dir(value: js.Any, optionalParams: js.Any*): Unit = js.native
  def dirxml(value: js.Any): Unit = js.native
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def exception(): Unit = js.native
  def exception(message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def group(): Unit = js.native
  def group(groupTitle: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def groupCollapsed(): Unit = js.native
  def groupCollapsed(groupTitle: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def groupEnd(): Unit = js.native
  def info(): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def markTimeline(): Unit = js.native
  def markTimeline(label: java.lang.String): Unit = js.native
  def profile(): Unit = js.native
  def profile(reportName: java.lang.String): Unit = js.native
  def profileEnd(): Unit = js.native
  def profileEnd(reportName: java.lang.String): Unit = js.native
  def table(tabularData: js.Any*): Unit = js.native
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  def timeline(): Unit = js.native
  def timeline(label: java.lang.String): Unit = js.native
  def timelineEnd(): Unit = js.native
  def timelineEnd(label: java.lang.String): Unit = js.native
  def trace(): Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

@JSGlobal("Console")
@js.native
object Console_ extends Instantiable0[Console_]

