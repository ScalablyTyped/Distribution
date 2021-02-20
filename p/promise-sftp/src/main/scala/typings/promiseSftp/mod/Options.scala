package typings.promiseSftp.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.promiseSftp.anon.Echo
import typings.promiseSftp.promiseSftpStrings.force
import typings.promiseSftp.promiseSftpStrings.md5
import typings.promiseSftp.promiseSftpStrings.sha1
import typings.ssh2Streams.mod.Algorithms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for SftpPromise#connect()
  */
/* Inlined ssh2.ssh2.ConnectConfig & {  changePassword :(message : string, language : string): bluebird.bluebird.^<string> | undefined,   autoReconnect :boolean | undefined,   privateKeyFile :string | undefined,   tryKeyboard :(name : string, instructions : string, instructionsLang : string, prompts : std.Array<{  prompt :string,   echo :boolean}>): std.Array<string | bluebird.bluebird.^<string>> | bluebird.bluebird.^<std.Array<string>> | undefined,   user :string | undefined,   connTimeout :number | undefined,   pasvTimeout :number | undefined,   keepalive :number | undefined} */
@js.native
trait Options extends StObject {
  
  /** Path to ssh-agent's UNIX socket for ssh-agent-based user authentication (or 'pageant' when using Pagent on Windows). */
  var agent: js.UndefOr[String] = js.native
  
  /** Set to `true` to use OpenSSH agent forwarding (`auth-agent@openssh.com`) for the life of the connection. */
  var agentForward: js.UndefOr[Boolean] = js.native
  
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.native
  
  /** Function with parameters (methodsLeft, partialSuccess, callback) where methodsLeft and partialSuccess are null on the first authentication attempt, otherwise are an array and boolean respectively. Return or call callback() with the name of the authentication method to try next (pass false to signal no more methods to try). Valid method names are: 'none', 'password', 'publickey', 'agent', 'keyboard-interactive', 'hostbased'. Default: function that follows a set method order: None -> Password -> Private Key -> Agent (-> keyboard-interactive if tryKeyboard is true) -> Hostbased. */
  var authHandler: js.UndefOr[
    js.Function3[
      /* methodsLeft */ js.Array[String] | Null, 
      /* partialSuccess */ Boolean | Null, 
      /* callback */ js.Function, 
      _
    ]
  ] = js.native
  
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
  /**
    * Set this option to a function to try keyboard-interactive user
    * authentication if primary user authentication method fails.
    *
    * NOTE: This function may be called more than once, with the same or different prompts.
    * @param name - is generally what you'd use as a header or GUI window
    * title to describe the purpose of the `prompts`
    */
  var tryKeyboard: js.UndefOr[Boolean] with (js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* instructions */ String, 
      /* instructionsLang */ String, 
      /* prompts */ js.Array[Echo], 
      (js.Array[String | typings.bluebird.mod.^[String]]) | typings.bluebird.mod.^[js.Array[String]]
    ]
  ]) = js.native
  
  /** Alias for `username` */
  var user: js.UndefOr[String] = js.native
  
  /** Username for authentication. */
  var username: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    tryKeyboard: js.UndefOr[Boolean] with (js.UndefOr[
      js.Function4[
        /* name */ String, 
        /* instructions */ String, 
        /* instructionsLang */ String, 
        /* prompts */ js.Array[Echo], 
        (js.Array[String | typings.bluebird.mod.^[String]]) | typings.bluebird.mod.^[js.Array[String]]
      ]
    ])
  ): Options = {
    val __obj = js.Dynamic.literal(tryKeyboard = tryKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentForward(value: Boolean): Self = StObject.set(x, "agentForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentForwardUndefined: Self = StObject.set(x, "agentForward", js.undefined)
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setAlgorithms(value: Algorithms): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    @scala.inline
    def setAuthHandler(
      value: (/* methodsLeft */ js.Array[String] | Null, /* partialSuccess */ Boolean | Null, /* callback */ js.Function) => _
    ): Self = StObject.set(x, "authHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAuthHandlerUndefined: Self = StObject.set(x, "authHandler", js.undefined)
    
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    @scala.inline
    def setChangePassword(value: (/* message */ String, /* language */ String) => typings.bluebird.mod.^[String]): Self = StObject.set(x, "changePassword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangePasswordUndefined: Self = StObject.set(x, "changePassword", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean | force): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    @scala.inline
    def setConnTimeout(value: Double): Self = StObject.set(x, "connTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnTimeoutUndefined: Self = StObject.set(x, "connTimeout", js.undefined)
    
    @scala.inline
    def setDebug(value: /* information */ String => _): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setForceIPv4(value: Boolean): Self = StObject.set(x, "forceIPv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIPv4Undefined: Self = StObject.set(x, "forceIPv4", js.undefined)
    
    @scala.inline
    def setForceIPv6(value: Boolean): Self = StObject.set(x, "forceIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIPv6Undefined: Self = StObject.set(x, "forceIPv6", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostHash(value: md5 | sha1): Self = StObject.set(x, "hostHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostHashUndefined: Self = StObject.set(x, "hostHash", js.undefined)
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHostVerifier(value: /* keyHash */ String => Boolean): Self = StObject.set(x, "hostVerifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHostVerifierUndefined: Self = StObject.set(x, "hostVerifier", js.undefined)
    
    @scala.inline
    def setKeepalive(value: Double): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepaliveCountMax(value: Double): Self = StObject.set(x, "keepaliveCountMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepaliveCountMaxUndefined: Self = StObject.set(x, "keepaliveCountMax", js.undefined)
    
    @scala.inline
    def setKeepaliveInterval(value: Double): Self = StObject.set(x, "keepaliveInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepaliveIntervalUndefined: Self = StObject.set(x, "keepaliveInterval", js.undefined)
    
    @scala.inline
    def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    @scala.inline
    def setLocalHostname(value: String): Self = StObject.set(x, "localHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalHostnameUndefined: Self = StObject.set(x, "localHostname", js.undefined)
    
    @scala.inline
    def setLocalUsername(value: String): Self = StObject.set(x, "localUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUsernameUndefined: Self = StObject.set(x, "localUsername", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPasvTimeout(value: Double): Self = StObject.set(x, "pasvTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasvTimeoutUndefined: Self = StObject.set(x, "pasvTimeout", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: Buffer | String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyFile(value: String): Self = StObject.set(x, "privateKeyFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyFileUndefined: Self = StObject.set(x, "privateKeyFile", js.undefined)
    
    @scala.inline
    def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    @scala.inline
    def setReadyTimeout(value: Double): Self = StObject.set(x, "readyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyTimeoutUndefined: Self = StObject.set(x, "readyTimeout", js.undefined)
    
    @scala.inline
    def setSock(value: ReadableStream): Self = StObject.set(x, "sock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSockUndefined: Self = StObject.set(x, "sock", js.undefined)
    
    @scala.inline
    def setStrictVendor(value: Boolean): Self = StObject.set(x, "strictVendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictVendorUndefined: Self = StObject.set(x, "strictVendor", js.undefined)
    
    @scala.inline
    def setTryKeyboard(
      value: js.UndefOr[Boolean] with (js.UndefOr[
          js.Function4[
            /* name */ String, 
            /* instructions */ String, 
            /* instructionsLang */ String, 
            /* prompts */ js.Array[Echo], 
            (js.Array[String | typings.bluebird.mod.^[String]]) | typings.bluebird.mod.^[js.Array[String]]
          ]
        ])
    ): Self = StObject.set(x, "tryKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
