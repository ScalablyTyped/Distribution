package typings.simplecrawler.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var Accept: String = js.native
  var `Accept-Encoding`: js.UndefOr[String] = js.native
  var Authorization: js.UndefOr[String] = js.native
  var Host: String = js.native
  var `Proxy-Authorization`: js.UndefOr[String] = js.native
  var Referer: js.UndefOr[String] = js.native
  var `User-Agent`: String = js.native
  var cookie: js.UndefOr[String] = js.native
}

object Dictkey {
  @scala.inline
  def apply(Accept: String, Host: String, `User-Agent`: String): Dictkey = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccept(value: String): Self = this.set("Accept", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-Agent`(value: String): Self = this.set("User-Agent", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAccept-Encoding`(value: String): Self = this.set("Accept-Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-Encoding`: Self = this.set("Accept-Encoding", js.undefined)
    @scala.inline
    def setAuthorization(value: String): Self = this.set("Authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("Authorization", js.undefined)
    @scala.inline
    def `setProxy-Authorization`(value: String): Self = this.set("Proxy-Authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProxy-Authorization`: Self = this.set("Proxy-Authorization", js.undefined)
    @scala.inline
    def setReferer(value: String): Self = this.set("Referer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferer: Self = this.set("Referer", js.undefined)
    @scala.inline
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
  }
  
}

