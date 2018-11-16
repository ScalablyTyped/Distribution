package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieJar extends js.Object {
  def getCookieString(uri: java.lang.String): java.lang.String = js.native
  def getCookieString(uri: nodeLib.urlMod.Url): java.lang.String = js.native
  def getCookies(uri: java.lang.String): js.Array[Cookie] = js.native
  def getCookies(uri: nodeLib.urlMod.Url): js.Array[Cookie] = js.native
  def setCookie(cookieOrStr: java.lang.String, uri: java.lang.String): scala.Unit = js.native
  def setCookie(
    cookieOrStr: java.lang.String,
    uri: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions
  ): scala.Unit = js.native
  def setCookie(cookieOrStr: java.lang.String, uri: nodeLib.urlMod.Url): scala.Unit = js.native
  def setCookie(
    cookieOrStr: java.lang.String,
    uri: nodeLib.urlMod.Url,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions
  ): scala.Unit = js.native
  def setCookie(cookieOrStr: Cookie, uri: java.lang.String): scala.Unit = js.native
  def setCookie(
    cookieOrStr: Cookie,
    uri: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions
  ): scala.Unit = js.native
  def setCookie(cookieOrStr: Cookie, uri: nodeLib.urlMod.Url): scala.Unit = js.native
  def setCookie(
    cookieOrStr: Cookie,
    uri: nodeLib.urlMod.Url,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions
  ): scala.Unit = js.native
}

