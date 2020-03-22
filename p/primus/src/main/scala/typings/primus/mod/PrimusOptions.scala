package typings.primus.mod

import typings.node.httpMod.IncomingMessage
import typings.primus.AnonAuthenticate
import typings.primus.primusStrings.browserchannel
import typings.primus.primusStrings.engineDotio
import typings.primus.primusStrings.faye
import typings.primus.primusStrings.sockjs
import typings.primus.primusStrings.uws
import typings.primus.primusStrings.websockets
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimusOptions extends js.Object {
  var authorization: js.UndefOr[AuthorizationHandler] = js.undefined
  var compression: js.UndefOr[Boolean] = js.undefined
  var credentials: js.UndefOr[Boolean] = js.undefined
  var exposed: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Boolean] = js.undefined
  var idGenerator: js.UndefOr[js.Function0[String]] = js.undefined
  var maxAge: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var methods: js.UndefOr[String] = js.undefined
  // Cors
  var origins: js.UndefOr[String] = js.undefined
  var parser: js.UndefOr[String | Parser] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var pingInterval: js.UndefOr[Double] = js.undefined
  var plugin: js.UndefOr[String | js.Object] = js.undefined
  var transformer: js.UndefOr[websockets | engineDotio | browserchannel | sockjs | faye | uws] = js.undefined
  var transport: js.UndefOr[js.Object] = js.undefined
}

object PrimusOptions {
  @scala.inline
  def apply(
    authorization: (/* req */ IncomingMessage, /* done */ js.Function1[/* err */ js.UndefOr[String | Error | AnonAuthenticate], Unit]) => Unit = null,
    compression: js.UndefOr[Boolean] = js.undefined,
    credentials: js.UndefOr[Boolean] = js.undefined,
    exposed: js.UndefOr[Boolean] = js.undefined,
    global: String = null,
    headers: js.UndefOr[Boolean] = js.undefined,
    idGenerator: () => String = null,
    maxAge: String = null,
    maxLength: Int | Double = null,
    methods: String = null,
    origins: String = null,
    parser: String | Parser = null,
    pathname: String = null,
    pingInterval: Int | Double = null,
    plugin: String | js.Object = null,
    transformer: websockets | engineDotio | browserchannel | sockjs | faye | uws = null,
    transport: js.Object = null
  ): PrimusOptions = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(js.Any.fromFunction2(authorization))
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(exposed)) __obj.updateDynamic("exposed")(exposed.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (idGenerator != null) __obj.updateDynamic("idGenerator")(js.Any.fromFunction0(idGenerator))
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (transformer != null) __obj.updateDynamic("transformer")(transformer.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimusOptions]
  }
}

