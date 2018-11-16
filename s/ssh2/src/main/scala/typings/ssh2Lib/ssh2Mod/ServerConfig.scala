package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerConfig extends js.Object {
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[ssh2DashStreamsLib.ssh2DashStreamsMod.Algorithms] = js.undefined
  /** A message that is sent to clients immediately upon connection, before handshaking begins. */
  var banner: js.UndefOr[java.lang.String] = js.undefined
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ java.lang.String, _]] = js.undefined
  /** This is the highWaterMark to use for the parser stream (default: `32 * 1024`). */
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  /** An array of host private keys. */
  var hostKeys: js.Array[nodeLib.Buffer | java.lang.String | EncryptedPrivateKey]
  /** A custom server software name/version identifier. */
  var ident: js.UndefOr[java.lang.String] = js.undefined
  /** This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations. */
  var maxPacketSize: js.UndefOr[scala.Double] = js.undefined
}

