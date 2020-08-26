package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * Console polyfill
    * @see https://facebook.github.io/react-native/docs/javascript-environment.html#polyfills
    */
  @js.native
  trait Console_ extends js.Object {
    /**
      * @deprecated Use LogBox.ignoreAllLogs(disable) instead
      */
    var disableYellowBox: Boolean = js.native
    /**
      * @deprecated Use LogBox.ignoreLogs(patterns) instead
      */
    var ignoredYellowBox: js.Array[String] = js.native
    def debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def group(): Unit = js.native
    def group(label: String): Unit = js.native
    def groupCollapsed(): Unit = js.native
    def groupCollapsed(label: String): Unit = js.native
    def groupEnd(): Unit = js.native
    def info(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def table(data: js.Any*): Unit = js.native
    def trace(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
  
  val ErrorUtils: typings.reactNative.mod.ErrorUtils = js.native
  val HermesInternal: Null | js.Object = js.native
  val __BUNDLE_START_TIME__ : Double = js.native
  /**
    * This variable is set to true when react-native is running in Dev mode
    * Typical usage:
    * <code> if (__DEV__) console.log('Running in dev mode')</code>
    */
  val __DEV__ : Boolean = js.native
  var console: Console_ = js.native
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

