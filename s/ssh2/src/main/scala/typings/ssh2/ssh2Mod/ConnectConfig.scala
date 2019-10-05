package typings.ssh2.ssh2Mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.ssh2.ssh2Strings.force
import typings.ssh2.ssh2Strings.md5
import typings.ssh2.ssh2Strings.sha1
import typings.ssh2DashStreams.ssh2DashStreamsMod.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectConfig extends js.Object {
  /** Path to ssh-agent's UNIX socket for ssh-agent-based user authentication (or 'pageant' when using Pagent on Windows). */
  var agent: js.UndefOr[String] = js.undefined
  /** Set to `true` to use OpenSSH agent forwarding (`auth-agent@openssh.com`) for the life of the connection. */
  var agentForward: js.UndefOr[Boolean] = js.undefined
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.undefined
  /** Compression settings: true (prefer), false (never), 'force' (require) */
  var compress: js.UndefOr[Boolean | force] = js.undefined
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.undefined
  /** Only connect via resolved IPv4 address for `host`. */
  var forceIPv4: js.UndefOr[Boolean] = js.undefined
  /** Only connect via resolved IPv6 address for `host`. */
  var forceIPv6: js.UndefOr[Boolean] = js.undefined
  /** Hostname or IP address of the server. */
  var host: js.UndefOr[String] = js.undefined
  /** The host's key is hashed using this method and passed to `hostVerifier`. */
  var hostHash: js.UndefOr[md5 | sha1] = js.undefined
  /** Verifies a hexadecimal hash of the host's key. */
  var hostVerifier: js.UndefOr[js.Function1[/* keyHash */ String, Boolean]] = js.undefined
  /** How many consecutive, unanswered SSH-level keepalive packets that can be sent to the server before disconnection. */
  var keepaliveCountMax: js.UndefOr[Double] = js.undefined
  /** How often (in milliseconds) to send SSH-level keepalive packets to the server. Set to 0 to disable. */
  var keepaliveInterval: js.UndefOr[Double] = js.undefined
  /** Along with `localUsername` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localHostname: js.UndefOr[String] = js.undefined
  /** Along with `localHostname` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localUsername: js.UndefOr[String] = js.undefined
  /** For an encrypted private key, this is the passphrase used to decrypt it. */
  var passphrase: js.UndefOr[String] = js.undefined
  /** Password for password-based user authentication. */
  var password: js.UndefOr[String] = js.undefined
  /** Port number of the server. */
  var port: js.UndefOr[Double] = js.undefined
  /** Buffer or string that contains a private key for either key-based or hostbased user authentication (OpenSSH format). */
  var privateKey: js.UndefOr[Buffer | String] = js.undefined
  /** * How long (in milliseconds) to wait for the SSH handshake to complete. */
  var readyTimeout: js.UndefOr[Double] = js.undefined
  /** A `ReadableStream` to use for communicating with the server instead of creating and using a new TCP connection (useful for connection hopping). */
  var sock: js.UndefOr[ReadableStream] = js.undefined
  /** Performs a strict server vendor check before sending vendor-specific requests. */
  var strictVendor: js.UndefOr[Boolean] = js.undefined
  /** Try keyboard-interactive user authentication if primary user authentication method fails. */
  var tryKeyboard: js.UndefOr[Boolean] = js.undefined
  /** Username for authentication. */
  var username: js.UndefOr[String] = js.undefined
}

object ConnectConfig {
  @scala.inline
  def apply(
    agent: String = null,
    agentForward: js.UndefOr[Boolean] = js.undefined,
    algorithms: Algorithms = null,
    compress: Boolean | force = null,
    debug: /* information */ String => _ = null,
    forceIPv4: js.UndefOr[Boolean] = js.undefined,
    forceIPv6: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostHash: md5 | sha1 = null,
    hostVerifier: /* keyHash */ String => Boolean = null,
    keepaliveCountMax: Int | Double = null,
    keepaliveInterval: Int | Double = null,
    localHostname: String = null,
    localUsername: String = null,
    passphrase: String = null,
    password: String = null,
    port: Int | Double = null,
    privateKey: Buffer | String = null,
    readyTimeout: Int | Double = null,
    sock: ReadableStream = null,
    strictVendor: js.UndefOr[Boolean] = js.undefined,
    tryKeyboard: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): ConnectConfig = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (!js.isUndefined(agentForward)) __obj.updateDynamic("agentForward")(agentForward)
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (!js.isUndefined(forceIPv4)) __obj.updateDynamic("forceIPv4")(forceIPv4)
    if (!js.isUndefined(forceIPv6)) __obj.updateDynamic("forceIPv6")(forceIPv6)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostHash != null) __obj.updateDynamic("hostHash")(hostHash.asInstanceOf[js.Any])
    if (hostVerifier != null) __obj.updateDynamic("hostVerifier")(js.Any.fromFunction1(hostVerifier))
    if (keepaliveCountMax != null) __obj.updateDynamic("keepaliveCountMax")(keepaliveCountMax.asInstanceOf[js.Any])
    if (keepaliveInterval != null) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.asInstanceOf[js.Any])
    if (localHostname != null) __obj.updateDynamic("localHostname")(localHostname)
    if (localUsername != null) __obj.updateDynamic("localUsername")(localUsername)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (readyTimeout != null) __obj.updateDynamic("readyTimeout")(readyTimeout.asInstanceOf[js.Any])
    if (sock != null) __obj.updateDynamic("sock")(sock)
    if (!js.isUndefined(strictVendor)) __obj.updateDynamic("strictVendor")(strictVendor)
    if (!js.isUndefined(tryKeyboard)) __obj.updateDynamic("tryKeyboard")(tryKeyboard)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ConnectConfig]
  }
}

