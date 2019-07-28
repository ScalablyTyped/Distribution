package typings.requestDashIp.requestDashIpMod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHeaders extends IncomingHttpHeaders {
  var `forwarded-for`: js.UndefOr[String] = js.undefined
  var `x-client-ip`: js.UndefOr[String] = js.undefined
  var `x-cluster-client-ip`: js.UndefOr[String] = js.undefined
  var `x-forwarded`: js.UndefOr[String] = js.undefined
  var `x-forwarded-for`: js.UndefOr[String] = js.undefined
  var `x-real-ip`: js.UndefOr[String] = js.undefined
}

object RequestHeaders {
  @scala.inline
  def apply(
    accept: String = null,
    `accept-language`: String = null,
    `accept-patch`: String = null,
    `accept-ranges`: String = null,
    `access-control-allow-credentials`: String = null,
    `access-control-allow-headers`: String = null,
    `access-control-allow-methods`: String = null,
    `access-control-allow-origin`: String = null,
    `access-control-expose-headers`: String = null,
    `access-control-max-age`: String = null,
    age: String = null,
    allow: String = null,
    `alt-svc`: String = null,
    authorization: String = null,
    `cache-control`: String = null,
    connection: String = null,
    `content-disposition`: String = null,
    `content-encoding`: String = null,
    `content-language`: String = null,
    `content-length`: String = null,
    `content-location`: String = null,
    `content-range`: String = null,
    `content-type`: String = null,
    cookie: String = null,
    date: String = null,
    expect: String = null,
    expires: String = null,
    forwarded: String = null,
    `forwarded-for`: String = null,
    from: String = null,
    host: String = null,
    `if-match`: String = null,
    `if-modified-since`: String = null,
    `if-none-match`: String = null,
    `if-unmodified-since`: String = null,
    `last-modified`: String = null,
    location: String = null,
    pragma: String = null,
    `proxy-authenticate`: String = null,
    `proxy-authorization`: String = null,
    `public-key-pins`: String = null,
    range: String = null,
    referer: String = null,
    `retry-after`: String = null,
    `set-cookie`: js.Array[String] = null,
    `strict-transport-security`: String = null,
    tk: String = null,
    trailer: String = null,
    `transfer-encoding`: String = null,
    upgrade: String = null,
    `user-agent`: String = null,
    vary: String = null,
    via: String = null,
    warning: String = null,
    `www-authenticate`: String = null,
    `x-client-ip`: String = null,
    `x-cluster-client-ip`: String = null,
    `x-forwarded`: String = null,
    `x-forwarded-for`: String = null,
    `x-real-ip`: String = null
  ): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (`accept-language` != null) __obj.updateDynamic("accept-language")(`accept-language`)
    if (`accept-patch` != null) __obj.updateDynamic("accept-patch")(`accept-patch`)
    if (`accept-ranges` != null) __obj.updateDynamic("accept-ranges")(`accept-ranges`)
    if (`access-control-allow-credentials` != null) __obj.updateDynamic("access-control-allow-credentials")(`access-control-allow-credentials`)
    if (`access-control-allow-headers` != null) __obj.updateDynamic("access-control-allow-headers")(`access-control-allow-headers`)
    if (`access-control-allow-methods` != null) __obj.updateDynamic("access-control-allow-methods")(`access-control-allow-methods`)
    if (`access-control-allow-origin` != null) __obj.updateDynamic("access-control-allow-origin")(`access-control-allow-origin`)
    if (`access-control-expose-headers` != null) __obj.updateDynamic("access-control-expose-headers")(`access-control-expose-headers`)
    if (`access-control-max-age` != null) __obj.updateDynamic("access-control-max-age")(`access-control-max-age`)
    if (age != null) __obj.updateDynamic("age")(age)
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (`alt-svc` != null) __obj.updateDynamic("alt-svc")(`alt-svc`)
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (`cache-control` != null) __obj.updateDynamic("cache-control")(`cache-control`)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (`content-disposition` != null) __obj.updateDynamic("content-disposition")(`content-disposition`)
    if (`content-encoding` != null) __obj.updateDynamic("content-encoding")(`content-encoding`)
    if (`content-language` != null) __obj.updateDynamic("content-language")(`content-language`)
    if (`content-length` != null) __obj.updateDynamic("content-length")(`content-length`)
    if (`content-location` != null) __obj.updateDynamic("content-location")(`content-location`)
    if (`content-range` != null) __obj.updateDynamic("content-range")(`content-range`)
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (date != null) __obj.updateDynamic("date")(date)
    if (expect != null) __obj.updateDynamic("expect")(expect)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (forwarded != null) __obj.updateDynamic("forwarded")(forwarded)
    if (`forwarded-for` != null) __obj.updateDynamic("forwarded-for")(`forwarded-for`)
    if (from != null) __obj.updateDynamic("from")(from)
    if (host != null) __obj.updateDynamic("host")(host)
    if (`if-match` != null) __obj.updateDynamic("if-match")(`if-match`)
    if (`if-modified-since` != null) __obj.updateDynamic("if-modified-since")(`if-modified-since`)
    if (`if-none-match` != null) __obj.updateDynamic("if-none-match")(`if-none-match`)
    if (`if-unmodified-since` != null) __obj.updateDynamic("if-unmodified-since")(`if-unmodified-since`)
    if (`last-modified` != null) __obj.updateDynamic("last-modified")(`last-modified`)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pragma != null) __obj.updateDynamic("pragma")(pragma)
    if (`proxy-authenticate` != null) __obj.updateDynamic("proxy-authenticate")(`proxy-authenticate`)
    if (`proxy-authorization` != null) __obj.updateDynamic("proxy-authorization")(`proxy-authorization`)
    if (`public-key-pins` != null) __obj.updateDynamic("public-key-pins")(`public-key-pins`)
    if (range != null) __obj.updateDynamic("range")(range)
    if (referer != null) __obj.updateDynamic("referer")(referer)
    if (`retry-after` != null) __obj.updateDynamic("retry-after")(`retry-after`)
    if (`set-cookie` != null) __obj.updateDynamic("set-cookie")(`set-cookie`)
    if (`strict-transport-security` != null) __obj.updateDynamic("strict-transport-security")(`strict-transport-security`)
    if (tk != null) __obj.updateDynamic("tk")(tk)
    if (trailer != null) __obj.updateDynamic("trailer")(trailer)
    if (`transfer-encoding` != null) __obj.updateDynamic("transfer-encoding")(`transfer-encoding`)
    if (upgrade != null) __obj.updateDynamic("upgrade")(upgrade)
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`)
    if (vary != null) __obj.updateDynamic("vary")(vary)
    if (via != null) __obj.updateDynamic("via")(via)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    if (`www-authenticate` != null) __obj.updateDynamic("www-authenticate")(`www-authenticate`)
    if (`x-client-ip` != null) __obj.updateDynamic("x-client-ip")(`x-client-ip`)
    if (`x-cluster-client-ip` != null) __obj.updateDynamic("x-cluster-client-ip")(`x-cluster-client-ip`)
    if (`x-forwarded` != null) __obj.updateDynamic("x-forwarded")(`x-forwarded`)
    if (`x-forwarded-for` != null) __obj.updateDynamic("x-forwarded-for")(`x-forwarded-for`)
    if (`x-real-ip` != null) __obj.updateDynamic("x-real-ip")(`x-real-ip`)
    __obj.asInstanceOf[RequestHeaders]
  }
}

