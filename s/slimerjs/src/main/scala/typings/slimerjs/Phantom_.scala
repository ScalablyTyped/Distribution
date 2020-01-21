package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phantom_ extends js.Object {
  // Properties
  var args: js.Array[String] = js.native
    // DEPRECATED
  var cookies: js.Array[Cookie] = js.native
  var cookiesEnabled: Boolean = js.native
  var libraryPath: String = js.native
  var scriptName: String = js.native
    // DEPRECATED
  var version: AnonMajor = js.native
  // Functions
  def addCookie(cookie: Cookie): Boolean = js.native
  def clearCookies(): Unit = js.native
  def deleteCookie(cookieName: String): Boolean = js.native
  def exit(): Boolean = js.native
  def exit(returnValue: js.Any): Boolean = js.native
  def injectJs(filename: String): Boolean = js.native
  // Callbacks
  def onError(msg: String, trace: js.Array[String]): js.Any = js.native
}

