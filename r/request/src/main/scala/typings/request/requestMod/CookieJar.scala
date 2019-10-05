package typings.request.requestMod

import typings.node.urlMod.Url
import typings.toughDashCookie.toughDashCookieMod.CookieJar.SetCookieOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieJar extends js.Object {
  def getCookieString(uri: String): String = js.native
  def getCookieString(uri: Url): String = js.native
  def getCookies(uri: String): js.Array[Cookie] = js.native
  def getCookies(uri: Url): js.Array[Cookie] = js.native
  def setCookie(cookieOrStr: String, uri: String): Unit = js.native
  def setCookie(cookieOrStr: String, uri: String, options: SetCookieOptions): Unit = js.native
  def setCookie(cookieOrStr: String, uri: Url): Unit = js.native
  def setCookie(cookieOrStr: String, uri: Url, options: SetCookieOptions): Unit = js.native
  def setCookie(cookieOrStr: Cookie, uri: String): Unit = js.native
  def setCookie(cookieOrStr: Cookie, uri: String, options: SetCookieOptions): Unit = js.native
  def setCookie(cookieOrStr: Cookie, uri: Url): Unit = js.native
  def setCookie(cookieOrStr: Cookie, uri: Url, options: SetCookieOptions): Unit = js.native
}

