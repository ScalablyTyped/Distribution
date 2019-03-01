package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

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
  var banner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ java.lang.String, _]] = js.undefined
  /**
    * This is the highWaterMark to use for the parser stream.
    * @default 32 * 1024
    */
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  /**
    * If in server mode, an object keyed on host key format.
    */
  var hostKeys: js.UndefOr[HostKeys] = js.undefined
  /**
    * A custom server software name/version identifier.
    * @default 'ssh2js' + moduleVersion + 'srv'
    */
  var ident: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations.
    * @default 35000
    */
  var maxPacketSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[scala.Boolean] = js.undefined
}

object SSH2StreamConfig {
  @scala.inline
  def apply(
    algorithms: Algorithms = null,
    banner: java.lang.String = null,
    debug: js.Function1[/* information */ java.lang.String, _] = null,
    highWaterMark: scala.Int | scala.Double = null,
    hostKeys: HostKeys = null,
    ident: java.lang.String = null,
    maxPacketSize: scala.Int | scala.Double = null,
    server: js.UndefOr[scala.Boolean] = js.undefined
  ): SSH2StreamConfig = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (banner != null) __obj.updateDynamic("banner")(banner)
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (hostKeys != null) __obj.updateDynamic("hostKeys")(hostKeys)
    if (ident != null) __obj.updateDynamic("ident")(ident)
    if (maxPacketSize != null) __obj.updateDynamic("maxPacketSize")(maxPacketSize.asInstanceOf[js.Any])
    if (!js.isUndefined(server)) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[SSH2StreamConfig]
  }
}

