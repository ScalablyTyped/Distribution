package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
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
  
  val ErrorUtils: typings.reactDashNative.reactDashNativeMod.ErrorUtils = js.native
  val HermesInternal: Null | js.Object = js.native
  val __BUNDLE_START_TIME__ : Double = js.native
  /**
    * This variable is set to true when react-native is running in Dev mode
    * Typical usage:
    * <code> if (__DEV__) console.log('Running in dev mode')</code>
    */
  val __DEV__ : Boolean = js.native
  var console: Console = js.native
  /**
    * This contains the non-native `XMLHttpRequest` object, which you can use if you want to route network requests
    * through DevTools (to trace them):
    *
    *   global.XMLHttpRequest = global.originalXMLHttpRequest;
    *
    * @see https://github.com/facebook/react-native/issues/934
    */
  val originalXMLHttpRequest: js.Any = js.native
  var require: NodeRequire = js.native
  type NodeRequire = js.Function1[/* id */ String, js.Any]
}

