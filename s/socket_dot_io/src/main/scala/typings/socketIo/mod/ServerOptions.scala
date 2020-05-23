package typings.socketIo.mod

import typings.engineIo.engineIoStrings.uws
import typings.engineIo.engineIoStrings.ws
import typings.engineIo.mod.AttachOptions
import typings.engineIo.mod.Message
import typings.engineIo.mod.Transport
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to our server when creating it
  */
trait ServerOptions
  extends typings.engineIo.mod.ServerOptions
     with AttachOptions {
  /**
    * The adapter to use for handling rooms. NOTE: this should be a class,
    * not an object
    * @default typeof Adapter
    */
  var adapter: js.UndefOr[Adapter] = js.undefined
  /**
    * Accepted origins
    * @default '*:*'
    */
  var origins: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Should we serve the client file?
    * @default true
    */
  var serveClient: js.UndefOr[Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    adapter: Adapter = null,
    allowRequest: (/* req */ IncomingMessage, /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit]) => Unit = null,
    allowUpgrades: js.UndefOr[Boolean] = js.undefined,
    cookie: String | Boolean = null,
    cookieHttpOnly: js.UndefOr[Boolean] = js.undefined,
    cookiePath: String | Boolean = null,
    destroyUpgrade: js.UndefOr[Boolean] = js.undefined,
    destroyUpgradeTimeout: js.UndefOr[Double] = js.undefined,
    handlePreflightRequest: Boolean | (js.Function3[
      /* server */ typings.engineIo.mod.Server, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]) = null,
    httpCompression: js.Any = null,
    initialPacket: Message = null,
    maxHttpBufferSize: js.UndefOr[Double] = js.undefined,
    origins: String | js.Array[String] = null,
    path: String = null,
    perMessageDeflate: js.Any = null,
    pingInterval: js.UndefOr[Double] = js.undefined,
    pingTimeout: js.UndefOr[Double] = js.undefined,
    serveClient: js.UndefOr[Boolean] = js.undefined,
    transports: js.Array[Transport] = null,
    upgradeTimeout: js.UndefOr[Double] = js.undefined,
    wsEngine: ws | uws = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (allowRequest != null) __obj.updateDynamic("allowRequest")(js.Any.fromFunction2(allowRequest))
    if (!js.isUndefined(allowUpgrades)) __obj.updateDynamic("allowUpgrades")(allowUpgrades.get.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieHttpOnly)) __obj.updateDynamic("cookieHttpOnly")(cookieHttpOnly.get.asInstanceOf[js.Any])
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyUpgrade)) __obj.updateDynamic("destroyUpgrade")(destroyUpgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyUpgradeTimeout)) __obj.updateDynamic("destroyUpgradeTimeout")(destroyUpgradeTimeout.get.asInstanceOf[js.Any])
    if (handlePreflightRequest != null) __obj.updateDynamic("handlePreflightRequest")(handlePreflightRequest.asInstanceOf[js.Any])
    if (httpCompression != null) __obj.updateDynamic("httpCompression")(httpCompression.asInstanceOf[js.Any])
    if (initialPacket != null) __obj.updateDynamic("initialPacket")(initialPacket.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHttpBufferSize)) __obj.updateDynamic("maxHttpBufferSize")(maxHttpBufferSize.get.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (!js.isUndefined(pingInterval)) __obj.updateDynamic("pingInterval")(pingInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pingTimeout)) __obj.updateDynamic("pingTimeout")(pingTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serveClient)) __obj.updateDynamic("serveClient")(serveClient.get.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (!js.isUndefined(upgradeTimeout)) __obj.updateDynamic("upgradeTimeout")(upgradeTimeout.get.asInstanceOf[js.Any])
    if (wsEngine != null) __obj.updateDynamic("wsEngine")(wsEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

