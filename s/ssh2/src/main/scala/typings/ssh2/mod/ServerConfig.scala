package typings.ssh2.mod

import typings.node.Buffer
import typings.ssh2Streams.mod.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.undefined
  /** A message that is sent to clients once, right before authentication begins. */
  var banner: js.UndefOr[String] = js.undefined
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.undefined
  /** A message that is sent to clients immediately upon connection, before handshaking begins. */
  var greeting: js.UndefOr[String] = js.undefined
  /** This is the highWaterMark to use for the parser stream (default: `32 * 1024`). */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  /** An array of host private keys. */
  var hostKeys: js.Array[Buffer | String | EncryptedPrivateKey]
  /** A custom server software name/version identifier. */
  var ident: js.UndefOr[String] = js.undefined
  /** This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations. */
  var maxPacketSize: js.UndefOr[Double] = js.undefined
}

object ServerConfig {
  @scala.inline
  def apply(
    hostKeys: js.Array[Buffer | String | EncryptedPrivateKey],
    algorithms: Algorithms = null,
    banner: String = null,
    debug: /* information */ String => _ = null,
    greeting: String = null,
    highWaterMark: Int | Double = null,
    ident: String = null,
    maxPacketSize: Int | Double = null
  ): ServerConfig = {
    val __obj = js.Dynamic.literal(hostKeys = hostKeys.asInstanceOf[js.Any])
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (greeting != null) __obj.updateDynamic("greeting")(greeting.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (ident != null) __obj.updateDynamic("ident")(ident.asInstanceOf[js.Any])
    if (maxPacketSize != null) __obj.updateDynamic("maxPacketSize")(maxPacketSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
}

