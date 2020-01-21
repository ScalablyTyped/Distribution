package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSH2StreamConfig extends js.Object {
  /**
    * This option allows you to explicitly override the default transport layer algorithms used for the connection. Each value must be an array of valid algorithms for that category. The order of the algorithms in the arrays are important, with the most favorable being first.
    */
  var algorithms: js.UndefOr[Algorithms] = js.undefined
  /**
    * A message that is sent to clients immediately upon connection, before handshaking begins.
    */
  var banner: js.UndefOr[String] = js.undefined
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.undefined
  /**
    * This is the highWaterMark to use for the parser stream.
    * @default 32 * 1024
    */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  /**
    * If in server mode, an object keyed on host key format.
    */
  var hostKeys: js.UndefOr[HostKeys] = js.undefined
  /**
    * A custom server software name/version identifier.
    * @default 'ssh2js' + moduleVersion + 'srv'
    */
  var ident: js.UndefOr[String] = js.undefined
  /**
    * This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations.
    * @default 35000
    */
  var maxPacketSize: js.UndefOr[Double] = js.undefined
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[Boolean] = js.undefined
}

object SSH2StreamConfig {
  @scala.inline
  def apply(
    algorithms: Algorithms = null,
    banner: String = null,
    debug: /* information */ String => _ = null,
    highWaterMark: Int | Double = null,
    hostKeys: HostKeys = null,
    ident: String = null,
    maxPacketSize: Int | Double = null,
    server: js.UndefOr[Boolean] = js.undefined
  ): SSH2StreamConfig = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (hostKeys != null) __obj.updateDynamic("hostKeys")(hostKeys.asInstanceOf[js.Any])
    if (ident != null) __obj.updateDynamic("ident")(ident.asInstanceOf[js.Any])
    if (maxPacketSize != null) __obj.updateDynamic("maxPacketSize")(maxPacketSize.asInstanceOf[js.Any])
    if (!js.isUndefined(server)) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSH2StreamConfig]
  }
}

