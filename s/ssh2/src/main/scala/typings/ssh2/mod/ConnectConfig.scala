package typings.ssh2.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.ssh2.ssh2Strings.force
import typings.ssh2.ssh2Strings.md5
import typings.ssh2.ssh2Strings.sha1
import typings.ssh2Streams.mod.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectConfig extends js.Object {
  /** Path to ssh-agent's UNIX socket for ssh-agent-based user authentication (or 'pageant' when using Pagent on Windows). */
  var agent: js.UndefOr[String] = js.native
  /** Set to `true` to use OpenSSH agent forwarding (`auth-agent@openssh.com`) for the life of the connection. */
  var agentForward: js.UndefOr[Boolean] = js.native
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.native
  /** Compression settings: true (prefer), false (never), 'force' (require) */
  var compress: js.UndefOr[Boolean | force] = js.native
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  /** Only connect via resolved IPv4 address for `host`. */
  var forceIPv4: js.UndefOr[Boolean] = js.native
  /** Only connect via resolved IPv6 address for `host`. */
  var forceIPv6: js.UndefOr[Boolean] = js.native
  /** Hostname or IP address of the server. */
  var host: js.UndefOr[String] = js.native
  /** The host's key is hashed using this method and passed to `hostVerifier`. */
  var hostHash: js.UndefOr[md5 | sha1] = js.native
  /** Verifies a hexadecimal hash of the host's key. */
  var hostVerifier: js.UndefOr[js.Function1[/* keyHash */ String, Boolean]] = js.native
  /** How many consecutive, unanswered SSH-level keepalive packets that can be sent to the server before disconnection. */
  var keepaliveCountMax: js.UndefOr[Double] = js.native
  /** How often (in milliseconds) to send SSH-level keepalive packets to the server. Set to 0 to disable. */
  var keepaliveInterval: js.UndefOr[Double] = js.native
  /** Along with `localUsername` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localHostname: js.UndefOr[String] = js.native
  /** Along with `localHostname` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localUsername: js.UndefOr[String] = js.native
  /** For an encrypted private key, this is the passphrase used to decrypt it. */
  var passphrase: js.UndefOr[String] = js.native
  /** Password for password-based user authentication. */
  var password: js.UndefOr[String] = js.native
  /** Port number of the server. */
  var port: js.UndefOr[Double] = js.native
  /** Buffer or string that contains a private key for either key-based or hostbased user authentication (OpenSSH format). */
  var privateKey: js.UndefOr[Buffer | String] = js.native
  /** * How long (in milliseconds) to wait for the SSH handshake to complete. */
  var readyTimeout: js.UndefOr[Double] = js.native
  /** A `ReadableStream` to use for communicating with the server instead of creating and using a new TCP connection (useful for connection hopping). */
  var sock: js.UndefOr[ReadableStream] = js.native
  /** Performs a strict server vendor check before sending vendor-specific requests. */
  var strictVendor: js.UndefOr[Boolean] = js.native
  /** Try keyboard-interactive user authentication if primary user authentication method fails. */
  var tryKeyboard: js.UndefOr[Boolean] = js.native
  /** Username for authentication. */
  var username: js.UndefOr[String] = js.native
}

object ConnectConfig {
  @scala.inline
  def apply(): ConnectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfig]
  }
  @scala.inline
  implicit class ConnectConfigOps[Self <: ConnectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent(value: String): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAgentForward(value: Boolean): Self = this.set("agentForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentForward: Self = this.set("agentForward", js.undefined)
    @scala.inline
    def setAlgorithms(value: Algorithms): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    @scala.inline
    def setCompress(value: Boolean | force): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setDebug(value: /* information */ String => _): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setForceIPv4(value: Boolean): Self = this.set("forceIPv4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIPv4: Self = this.set("forceIPv4", js.undefined)
    @scala.inline
    def setForceIPv6(value: Boolean): Self = this.set("forceIPv6", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIPv6: Self = this.set("forceIPv6", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHostHash(value: md5 | sha1): Self = this.set("hostHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostHash: Self = this.set("hostHash", js.undefined)
    @scala.inline
    def setHostVerifier(value: /* keyHash */ String => Boolean): Self = this.set("hostVerifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHostVerifier: Self = this.set("hostVerifier", js.undefined)
    @scala.inline
    def setKeepaliveCountMax(value: Double): Self = this.set("keepaliveCountMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepaliveCountMax: Self = this.set("keepaliveCountMax", js.undefined)
    @scala.inline
    def setKeepaliveInterval(value: Double): Self = this.set("keepaliveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepaliveInterval: Self = this.set("keepaliveInterval", js.undefined)
    @scala.inline
    def setLocalHostname(value: String): Self = this.set("localHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalHostname: Self = this.set("localHostname", js.undefined)
    @scala.inline
    def setLocalUsername(value: String): Self = this.set("localUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalUsername: Self = this.set("localUsername", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPrivateKey(value: Buffer | String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    @scala.inline
    def setReadyTimeout(value: Double): Self = this.set("readyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadyTimeout: Self = this.set("readyTimeout", js.undefined)
    @scala.inline
    def setSock(value: ReadableStream): Self = this.set("sock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSock: Self = this.set("sock", js.undefined)
    @scala.inline
    def setStrictVendor(value: Boolean): Self = this.set("strictVendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictVendor: Self = this.set("strictVendor", js.undefined)
    @scala.inline
    def setTryKeyboard(value: Boolean): Self = this.set("tryKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTryKeyboard: Self = this.set("tryKeyboard", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

