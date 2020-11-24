package typings.reactNative.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogBoxStatic extends js.Object {
  
  /**
    * Toggle error and warning notifications
    * Note: this only disables notifications, uncaught errors will still open a full screen LogBox.
    * @param ignore whether to ignore logs or not
    */
  def ignoreAllLogs(): Unit = js.native
  def ignoreAllLogs(ignore: Boolean): Unit = js.native
  
  /**
    * Silence any logs that match the given strings or regexes.
    */
  def ignoreLogs(patterns: js.Array[String | RegExp]): Unit = js.native
  
  def install(): Unit = js.native
  
  def uninstall(): Unit = js.native
}
