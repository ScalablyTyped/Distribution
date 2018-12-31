package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectConfig extends js.Object {
  /** Path to ssh-agent's UNIX socket for ssh-agent-based user authentication (or 'pageant' when using Pagent on Windows). */
  var agent: js.UndefOr[java.lang.String] = js.undefined
  /** Set to `true` to use OpenSSH agent forwarding (`auth-agent@openssh.com`) for the life of the connection. */
  var agentForward: js.UndefOr[scala.Boolean] = js.undefined
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[ssh2DashStreamsLib.ssh2DashStreamsMod.Algorithms] = js.undefined
  /** Compression settings: true (prefer), false (never), 'force' (require) */
  var compress: js.UndefOr[scala.Boolean | ssh2Lib.ssh2LibStrings.force] = js.undefined
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ java.lang.String, _]] = js.undefined
  /** Only connect via resolved IPv4 address for `host`. */
  var forceIPv4: js.UndefOr[scala.Boolean] = js.undefined
  /** Only connect via resolved IPv6 address for `host`. */
  var forceIPv6: js.UndefOr[scala.Boolean] = js.undefined
  /** Hostname or IP address of the server. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** The host's key is hashed using this method and passed to `hostVerifier`. */
  var hostHash: js.UndefOr[ssh2Lib.ssh2LibStrings.md5 | ssh2Lib.ssh2LibStrings.sha1] = js.undefined
  /** Verifies a hexadecimal hash of the host's key. */
  var hostVerifier: js.UndefOr[js.Function1[/* keyHash */ java.lang.String, scala.Boolean]] = js.undefined
  /** How many consecutive, unanswered SSH-level keepalive packets that can be sent to the server before disconnection. */
  var keepaliveCountMax: js.UndefOr[scala.Double] = js.undefined
  /** How often (in milliseconds) to send SSH-level keepalive packets to the server. Set to 0 to disable. */
  var keepaliveInterval: js.UndefOr[scala.Double] = js.undefined
  /** Along with `localUsername` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localHostname: js.UndefOr[java.lang.String] = js.undefined
  /** Along with `localHostname` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localUsername: js.UndefOr[java.lang.String] = js.undefined
  /** For an encrypted private key, this is the passphrase used to decrypt it. */
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  /** Password for password-based user authentication. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Port number of the server. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Buffer or string that contains a private key for either key-based or hostbased user authentication (OpenSSH format). */
  var privateKey: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /** * How long (in milliseconds) to wait for the SSH handshake to complete. */
  var readyTimeout: js.UndefOr[scala.Double] = js.undefined
  /** A `ReadableStream` to use for communicating with the server instead of creating and using a new TCP connection (useful for connection hopping). */
  var sock: js.UndefOr[nodeLib.NodeJSNs.ReadableStream] = js.undefined
  /** Performs a strict server vendor check before sending vendor-specific requests. */
  var strictVendor: js.UndefOr[scala.Boolean] = js.undefined
  /** Try keyboard-interactive user authentication if primary user authentication method fails. */
  var tryKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  /** Username for authentication. */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

