package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  var Console: simplecrawlerLib.NodeJSNs.ConsoleConstructor = js.native
  def assert(value: js.Any): scala.Unit = js.native
  def assert(value: js.Any, message: java.lang.String, optionalParams: js.Any*): scala.Unit = js.native
  def dir(obj: js.Any): scala.Unit = js.native
  def dir(obj: js.Any, options: simplecrawlerLib.NodeJSNs.InspectOptions): scala.Unit = js.native
  def error(): scala.Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def info(): scala.Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def log(): scala.Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def time(label: java.lang.String): scala.Unit = js.native
  def timeEnd(label: java.lang.String): scala.Unit = js.native
  def trace(): scala.Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def warn(): scala.Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
}

