package typings.reactDashNative.reactDashNativeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
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
  val navigator: Navigator = js.native
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
}

