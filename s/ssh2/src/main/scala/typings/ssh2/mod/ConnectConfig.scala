package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectConfig extends StObject {
  
  /** Path to ssh-agent's UNIX socket for ssh-agent-based user authentication (or 'pageant' when using Pagent on Windows). */
  var agent: js.UndefOr[(BaseAgent[String | Buffer | ParsedKey]) | String] = js.undefined
  
  /** Set to `true` to use OpenSSH agent forwarding (`auth-agent@openssh.com`) for the life of the connection. */
  var agentForward: js.UndefOr[Boolean] = js.undefined
  
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.undefined
  
  /** Function with parameters (methodsLeft, partialSuccess, callback) where methodsLeft and partialSuccess are null on the first authentication attempt, otherwise are an array and boolean respectively. Return or call callback() with the name of the authentication method to try next (pass false to signal no more methods to try). Valid method names are: 'none', 'password', 'publickey', 'agent', 'keyboard-interactive', 'hostbased'. Default: function that follows a set method order: None -> Password -> Private Key -> Agent (-> keyboard-interactive if tryKeyboard is true) -> Hostbased. */
  var authHandler: js.UndefOr[(js.Array[AuthMethod | AuthenticationType]) | AuthHandlerMiddleware] = js.undefined
  
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[DebugFunction] = js.undefined
  
  /** Only connect via resolved IPv4 address for `host`. */
  var forceIPv4: js.UndefOr[Boolean] = js.undefined
  
  /** Only connect via resolved IPv6 address for `host`. */
  var forceIPv6: js.UndefOr[Boolean] = js.undefined
  
  /** Hostname or IP address of the server. */
  var host: js.UndefOr[String] = js.undefined
  
  /** The host's key is hashed using this method and passed to `hostVerifier`. */
  var hostHash: js.UndefOr[String] = js.undefined
  
  /** Verifies a hexadecimal hash of the host's key. */
  var hostVerifier: js.UndefOr[
    HostVerifier | SyncHostVerifier | HostFingerprintVerifier | SyncHostFingerprintVerifier
  ] = js.undefined
  
  /** A custom server software name/version identifier. Default: 'ssh2js' + moduleVersion + 'srv' */
  var ident: js.UndefOr[Buffer | String] = js.undefined
  
  /** How many consecutive, unanswered SSH-level keepalive packets that can be sent to the server before disconnection. */
  var keepaliveCountMax: js.UndefOr[Double] = js.undefined
  
  /** How often (in milliseconds) to send SSH-level keepalive packets to the server. Set to 0 to disable. */
  var keepaliveInterval: js.UndefOr[Double] = js.undefined
  
  /** IP address of the network interface to use to connect to the server. Default: (none -- determined by OS) */
  var localAddress: js.UndefOr[String] = js.undefined
  
  /** Along with `localUsername` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localHostname: js.UndefOr[String] = js.undefined
  
  /** The local port number to connect from. Default: (none -- determined by OS) */
  var localPort: js.UndefOr[Double] = js.undefined
  
  /** Along with `localHostname` and `privateKey`, set this to a non-empty string for hostbased user authentication. */
  var localUsername: js.UndefOr[String] = js.undefined
  
  /** For an encrypted private key, this is the passphrase used to decrypt it. */
  var passphrase: js.UndefOr[Buffer | String] = js.undefined
  
  /** Password for password-based user authentication. */
  var password: js.UndefOr[String] = js.undefined
  
  /** Port number of the server. */
  var port: js.UndefOr[Double] = js.undefined
  
  /** Buffer or string that contains a private key for either key-based or hostbased user authentication (OpenSSH format). */
  var privateKey: js.UndefOr[Buffer | String] = js.undefined
  
  /** * How long (in milliseconds) to wait for the SSH handshake to complete. */
  var readyTimeout: js.UndefOr[Double] = js.undefined
  
  /** A `ReadableStream` to use for communicating with the server instead of creating and using a new TCP connection (useful for connection hopping). */
  var sock: js.UndefOr[Readable] = js.undefined
  
  /** Performs a strict server vendor check before sending vendor-specific requests. */
  var strictVendor: js.UndefOr[Boolean] = js.undefined
  
  /** The underlying socket timeout in ms. Default: none) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** Try keyboard-interactive user authentication if primary user authentication method fails. */
  var tryKeyboard: js.UndefOr[Boolean] = js.undefined
  
  /** Username for authentication. */
  var username: js.UndefOr[String] = js.undefined
}
object ConnectConfig {
  
  inline def apply(): ConnectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectConfig] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: (BaseAgent[String | Buffer | ParsedKey]) | String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentForward(value: Boolean): Self = StObject.set(x, "agentForward", value.asInstanceOf[js.Any])
    
    inline def setAgentForwardUndefined: Self = StObject.set(x, "agentForward", js.undefined)
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAlgorithms(value: Algorithms): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setAuthHandler(value: (js.Array[AuthMethod | AuthenticationType]) | AuthHandlerMiddleware): Self = StObject.set(x, "authHandler", value.asInstanceOf[js.Any])
    
    inline def setAuthHandlerFunction3(
      value: (/* authsLeft */ js.Array[AuthenticationType], /* partialSuccess */ Boolean, /* next */ NextAuthHandler) => Unit
    ): Self = StObject.set(x, "authHandler", js.Any.fromFunction3(value))
    
    inline def setAuthHandlerUndefined: Self = StObject.set(x, "authHandler", js.undefined)
    
    inline def setAuthHandlerVarargs(value: (AuthMethod | AuthenticationType)*): Self = StObject.set(x, "authHandler", js.Array(value*))
    
    inline def setDebug(value: /* message */ String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setForceIPv4(value: Boolean): Self = StObject.set(x, "forceIPv4", value.asInstanceOf[js.Any])
    
    inline def setForceIPv4Undefined: Self = StObject.set(x, "forceIPv4", js.undefined)
    
    inline def setForceIPv6(value: Boolean): Self = StObject.set(x, "forceIPv6", value.asInstanceOf[js.Any])
    
    inline def setForceIPv6Undefined: Self = StObject.set(x, "forceIPv6", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostHash(value: String): Self = StObject.set(x, "hostHash", value.asInstanceOf[js.Any])
    
    inline def setHostHashUndefined: Self = StObject.set(x, "hostHash", js.undefined)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostVerifier(value: HostVerifier | SyncHostVerifier | HostFingerprintVerifier | SyncHostFingerprintVerifier): Self = StObject.set(x, "hostVerifier", value.asInstanceOf[js.Any])
    
    inline def setHostVerifierFunction1(value: (/* key */ Buffer) | (/* fingerprint */ String) => Boolean): Self = StObject.set(x, "hostVerifier", js.Any.fromFunction1(value))
    
    inline def setHostVerifierFunction2(
      value: ((/* key */ Buffer) | (/* fingerprint */ String), /* verify */ VerifyCallback) => Boolean | Unit
    ): Self = StObject.set(x, "hostVerifier", js.Any.fromFunction2(value))
    
    inline def setHostVerifierUndefined: Self = StObject.set(x, "hostVerifier", js.undefined)
    
    inline def setIdent(value: Buffer | String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    inline def setKeepaliveCountMax(value: Double): Self = StObject.set(x, "keepaliveCountMax", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveCountMaxUndefined: Self = StObject.set(x, "keepaliveCountMax", js.undefined)
    
    inline def setKeepaliveInterval(value: Double): Self = StObject.set(x, "keepaliveInterval", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveIntervalUndefined: Self = StObject.set(x, "keepaliveInterval", js.undefined)
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setLocalHostname(value: String): Self = StObject.set(x, "localHostname", value.asInstanceOf[js.Any])
    
    inline def setLocalHostnameUndefined: Self = StObject.set(x, "localHostname", js.undefined)
    
    inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
    
    inline def setLocalUsername(value: String): Self = StObject.set(x, "localUsername", value.asInstanceOf[js.Any])
    
    inline def setLocalUsernameUndefined: Self = StObject.set(x, "localUsername", js.undefined)
    
    inline def setPassphrase(value: Buffer | String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPrivateKey(value: Buffer | String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setReadyTimeout(value: Double): Self = StObject.set(x, "readyTimeout", value.asInstanceOf[js.Any])
    
    inline def setReadyTimeoutUndefined: Self = StObject.set(x, "readyTimeout", js.undefined)
    
    inline def setSock(value: Readable): Self = StObject.set(x, "sock", value.asInstanceOf[js.Any])
    
    inline def setSockUndefined: Self = StObject.set(x, "sock", js.undefined)
    
    inline def setStrictVendor(value: Boolean): Self = StObject.set(x, "strictVendor", value.asInstanceOf[js.Any])
    
    inline def setStrictVendorUndefined: Self = StObject.set(x, "strictVendor", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTryKeyboard(value: Boolean): Self = StObject.set(x, "tryKeyboard", value.asInstanceOf[js.Any])
    
    inline def setTryKeyboardUndefined: Self = StObject.set(x, "tryKeyboard", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
