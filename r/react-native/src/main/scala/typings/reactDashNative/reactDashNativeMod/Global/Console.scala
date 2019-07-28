package typings.reactDashNative.reactDashNativeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Console polyfill
  * @see https://facebook.github.io/react-native/docs/javascript-environment.html#polyfills
  */
@js.native
trait Console extends js.Object {
  var disableYellowBox: Boolean = js.native
  var ignoredYellowBox: js.Array[String] = js.native
  def debug(): Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def info(): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def table(data: js.Any*): Unit = js.native
  def trace(): Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

