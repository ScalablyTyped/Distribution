package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var Accept: java.lang.String
  var `Accept-Encoding`: js.UndefOr[java.lang.String] = js.undefined
  var Authorization: js.UndefOr[java.lang.String] = js.undefined
  var Host: java.lang.String
  var `Proxy-Authorization`: js.UndefOr[java.lang.String] = js.undefined
  var Referer: js.UndefOr[java.lang.String] = js.undefined
  var `User-Agent`: java.lang.String
  var cookie: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Accept {
  @scala.inline
  def apply(
    Accept: java.lang.String,
    Host: java.lang.String,
    `User-Agent`: java.lang.String,
    `Accept-Encoding`: java.lang.String = null,
    Authorization: java.lang.String = null,
    `Proxy-Authorization`: java.lang.String = null,
    Referer: java.lang.String = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cookie: java.lang.String = null
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept, Host = Host)
    __obj.updateDynamic("User-Agent")(`User-Agent`)
    if (`Accept-Encoding` != null) __obj.updateDynamic("Accept-Encoding")(`Accept-Encoding`)
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization)
    if (`Proxy-Authorization` != null) __obj.updateDynamic("Proxy-Authorization")(`Proxy-Authorization`)
    if (Referer != null) __obj.updateDynamic("Referer")(Referer)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    __obj.asInstanceOf[Anon_Accept]
  }
}

