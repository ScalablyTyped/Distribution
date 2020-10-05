package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLHyperlinkElementUtils extends js.Object {
  var hash: java.lang.String = js.native
  var host: java.lang.String = js.native
  var hostname: java.lang.String = js.native
  var href: java.lang.String = js.native
  val origin: java.lang.String = js.native
  var password: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var search: java.lang.String = js.native
  var username: java.lang.String = js.native
}

object HTMLHyperlinkElementUtils {
  @scala.inline
  def apply(
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    origin: java.lang.String,
    password: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    search: java.lang.String,
    username: java.lang.String
  ): HTMLHyperlinkElementUtils = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLHyperlinkElementUtils]
  }
  @scala.inline
  implicit class HTMLHyperlinkElementUtilsOps[Self <: HTMLHyperlinkElementUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: java.lang.String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: java.lang.String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: java.lang.String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: java.lang.String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: java.lang.String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: java.lang.String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: java.lang.String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: java.lang.String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: java.lang.String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: java.lang.String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: java.lang.String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

