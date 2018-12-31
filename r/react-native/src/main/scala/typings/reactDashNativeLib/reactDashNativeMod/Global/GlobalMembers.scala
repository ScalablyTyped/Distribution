package typings
package reactDashNativeLib.reactDashNativeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object GlobalMembers extends js.Object {
  val ErrorUtils: reactDashNativeLib.reactDashNativeMod.ErrorUtils = js.native
  val `__BUNDLE_START_TIME__`: scala.Double = js.native
  /**
    * This variable is set to true when react-native is running in Dev mode
    * Typical usage:
    * <code> if (__DEV__) console.log('Running in dev mode')</code>
    */
  val `__DEV__`: scala.Boolean = js.native
  val console: Console = js.native
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
  def require(name: java.lang.String): js.Any = js.native
}

