package typings
package reactDashNativeLib.reactDashNativeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Console polyfill
  * @see https://facebook.github.io/react-native/docs/javascript-environment.html#polyfills
  */
@js.native
trait Console extends js.Object {
  var disableYellowBox: scala.Boolean = js.native
  var ignoredYellowBox: js.Array[java.lang.String] = js.native
  def debug(): scala.Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def error(): scala.Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def info(): scala.Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def log(): scala.Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def table(data: js.Any*): scala.Unit = js.native
  def trace(): scala.Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def warn(): scala.Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
}

