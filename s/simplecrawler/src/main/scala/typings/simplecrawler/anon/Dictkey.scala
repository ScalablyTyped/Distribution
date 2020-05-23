package typings.simplecrawler.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var Accept: String
  var `Accept-Encoding`: js.UndefOr[String] = js.undefined
  var Authorization: js.UndefOr[String] = js.undefined
  var Host: String
  var `Proxy-Authorization`: js.UndefOr[String] = js.undefined
  var Referer: js.UndefOr[String] = js.undefined
  var `User-Agent`: String
  var cookie: js.UndefOr[String] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    Accept: String,
    Host: String,
    `User-Agent`: String,
    `Accept-Encoding`: String = null,
    Authorization: String = null,
    `Proxy-Authorization`: String = null,
    Referer: String = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    cookie: String = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    if (`Accept-Encoding` != null) __obj.updateDynamic("Accept-Encoding")(`Accept-Encoding`.asInstanceOf[js.Any])
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    if (`Proxy-Authorization` != null) __obj.updateDynamic("Proxy-Authorization")(`Proxy-Authorization`.asInstanceOf[js.Any])
    if (Referer != null) __obj.updateDynamic("Referer")(Referer.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

