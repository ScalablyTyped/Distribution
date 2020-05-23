package typings.promiseSftp.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.promiseSftp.anon.Echo
import typings.promiseSftp.promiseSftpStrings.force
import typings.promiseSftp.promiseSftpStrings.md5
import typings.promiseSftp.promiseSftpStrings.sha1
import typings.ssh2Streams.mod.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for SftpPromise#connect()
  */
/* Inlined ssh2.ssh2.ConnectConfig & {changePassword ? (message : string, language : string): bluebird.bluebird.^<string>,   autoReconnect ? :boolean,   privateKeyFile ? :string, tryKeyboard ? (name : string, instructions : string, instructionsLang : string, prompts : std.Array<{  prompt  :string,   echo  :boolean}>): std.Array<string | bluebird.bluebird.^<string>> | bluebird.bluebird.^<std.Array<string>>,   user ? :string,   connTimeout ? :number,   pasvTimeout ? :number,   keepalive ? :number} */
@js.native
trait Options extends js.Object {
  /** Path to ssh-agent's UNIX socket for ssh-agent-based user authentication (or 'pageant' when using Pagent on Windows). */
  var agent: js.UndefOr[String] = js.native
  /** Set to `true` to use OpenSSH agent forwarding (`auth-agent@openssh.com`) for the life of the connection. */
  var agentForward: js.UndefOr[Boolean] = js.native
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.native
  /**
    * Whether to attempt to automatically reconnect using the existing
    * config if the connection is unexpectedly closed. Auto-reconnection is
    * lazy, and so will wait until a command needs to be issued before
    * attempting to reconnect.
    */
  var autoReconnect: js.UndefOr[Boolean] = js.native
  /**
    * When using password-based user authentication, set this option to
    * handle password change requests. If this option isn't set, and the
    * server requests a password change, I haven't tested what will happen.
    */
  var changePassword: js.UndefOr[
    js.Function2[/* message */ String, /* language */ String, typings.bluebird.mod.^[String]]
  ] = js.native
  /** Compression settings: true (prefer), false (never), 'force' (require) */
  var compress: js.UndefOr[Boolean | force] = js.native
  /** Alias for `readyTimeout` */
  var connTimeout: js.UndefOr[Double] = js.native
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
  /** Alias for `keepaliveInterval` */
  var keepalive: js.UndefOr[Double] = js.native
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
  /** Alias for `readyTimeout` */
  var pasvTimeout: js.UndefOr[Double] = js.native
  /** Port number of the server. */
  var port: js.UndefOr[Double] = js.native
  /** Buffer or string that contains a private key for either key-based or hostbased user authentication (OpenSSH format). */
  var privateKey: js.UndefOr[Buffer | String] = js.native
  /**
    * Path and name of a file containing a private key as would be passed
    * to the privateKey option. If privateKey is also set, priority is
    * given to the privateKey option.
    */
  var privateKeyFile: js.UndefOr[String] = js.native
  /** * How long (in milliseconds) to wait for the SSH handshake to complete. */
  var readyTimeout: js.UndefOr[Double] = js.native
  /** A `ReadableStream` to use for communicating with the server instead of creating and using a new TCP connection (useful for connection hopping). */
  var sock: js.UndefOr[ReadableStream] = js.native
  /** Performs a strict server vendor check before sending vendor-specific requests. */
  var strictVendor: js.UndefOr[Boolean] = js.native
  /** Try keyboard-interactive user authentication if primary user authentication method fails. */
  var tryKeyboard: js.UndefOr[
    Boolean | (js.Function4[
      /* name */ String, 
      /* instructions */ String, 
      /* instructionsLang */ String, 
      /* prompts */ js.Array[Echo], 
      (js.Array[String | typings.bluebird.mod.^[String]]) | typings.bluebird.mod.^[js.Array[String]]
    ])
  ] = js.native
  /** Alias for `username` */
  var user: js.UndefOr[String] = js.native
  /** Username for authentication. */
  var username: js.UndefOr[String] = js.native
}

