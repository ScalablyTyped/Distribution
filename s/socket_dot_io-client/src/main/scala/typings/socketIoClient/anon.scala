package typings.socketIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.engineIoClient.anon.Threshold
import typings.socketIoParser.mod.PacketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Context extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var description: String
  }
  object Context {
    
    inline def apply(description: String): Context = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<socket.io-client.socket.io-client/build/esm/manager.ManagerOptions> */
  trait PartialManagerOptions extends StObject {
    
    var addTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var agent: js.UndefOr[String | Boolean] = js.undefined
    
    var autoConnect: js.UndefOr[Boolean] = js.undefined
    
    var autoUnref: js.UndefOr[Boolean] = js.undefined
    
    var ca: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var closeOnBeforeunload: js.UndefOr[Boolean] = js.undefined
    
    var extraHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var forceBase64: js.UndefOr[Boolean] = js.undefined
    
    var forceNew: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var multiplex: js.UndefOr[Boolean] = js.undefined
    
    var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.undefined
    
    var parser: js.UndefOr[Any] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var perMessageDeflate: js.UndefOr[Threshold] = js.undefined
    
    var pfx: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var protocols: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var query: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var randomizationFactor: js.UndefOr[Double] = js.undefined
    
    var reconnection: js.UndefOr[Boolean] = js.undefined
    
    var reconnectionAttempts: js.UndefOr[Double] = js.undefined
    
    var reconnectionDelay: js.UndefOr[Double] = js.undefined
    
    var reconnectionDelayMax: js.UndefOr[Double] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var rememberUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timestampParam: js.UndefOr[String] = js.undefined
    
    var timestampRequests: js.UndefOr[Boolean] = js.undefined
    
    var transportOptions: js.UndefOr[js.Object] = js.undefined
    
    var transports: js.UndefOr[js.Array[String]] = js.undefined
    
    var upgrade: js.UndefOr[Boolean] = js.undefined
    
    var useNativeTimers: js.UndefOr[Boolean] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object PartialManagerOptions {
    
    inline def apply(): PartialManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setAddTrailingSlash(value: Boolean): Self = StObject.set(x, "addTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setAddTrailingSlashUndefined: Self = StObject.set(x, "addTrailingSlash", js.undefined)
      
      inline def setAgent(value: String | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      inline def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
      
      inline def setAutoUnref(value: Boolean): Self = StObject.set(x, "autoUnref", value.asInstanceOf[js.Any])
      
      inline def setAutoUnrefUndefined: Self = StObject.set(x, "autoUnref", js.undefined)
      
      inline def setCa(value: String | js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setCloseOnBeforeunload(value: Boolean): Self = StObject.set(x, "closeOnBeforeunload", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBeforeunloadUndefined: Self = StObject.set(x, "closeOnBeforeunload", js.undefined)
      
      inline def setExtraHeaders(value: StringDictionary[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setForceBase64(value: Boolean): Self = StObject.set(x, "forceBase64", value.asInstanceOf[js.Any])
      
      inline def setForceBase64Undefined: Self = StObject.set(x, "forceBase64", js.undefined)
      
      inline def setForceNew(value: Boolean): Self = StObject.set(x, "forceNew", value.asInstanceOf[js.Any])
      
      inline def setForceNewUndefined: Self = StObject.set(x, "forceNew", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMultiplex(value: Boolean): Self = StObject.set(x, "multiplex", value.asInstanceOf[js.Any])
      
      inline def setMultiplexUndefined: Self = StObject.set(x, "multiplex", js.undefined)
      
      inline def setOnlyBinaryUpgrades(value: Boolean): Self = StObject.set(x, "onlyBinaryUpgrades", value.asInstanceOf[js.Any])
      
      inline def setOnlyBinaryUpgradesUndefined: Self = StObject.set(x, "onlyBinaryUpgrades", js.undefined)
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPerMessageDeflate(value: Threshold): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocols(value: String | js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRandomizationFactor(value: Double): Self = StObject.set(x, "randomizationFactor", value.asInstanceOf[js.Any])
      
      inline def setRandomizationFactorUndefined: Self = StObject.set(x, "randomizationFactor", js.undefined)
      
      inline def setReconnection(value: Boolean): Self = StObject.set(x, "reconnection", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
      
      inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayMax(value: Double): Self = StObject.set(x, "reconnectionDelayMax", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayMaxUndefined: Self = StObject.set(x, "reconnectionDelayMax", js.undefined)
      
      inline def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
      
      inline def setReconnectionUndefined: Self = StObject.set(x, "reconnection", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRememberUpgrade(value: Boolean): Self = StObject.set(x, "rememberUpgrade", value.asInstanceOf[js.Any])
      
      inline def setRememberUpgradeUndefined: Self = StObject.set(x, "rememberUpgrade", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTimestampParam(value: String): Self = StObject.set(x, "timestampParam", value.asInstanceOf[js.Any])
      
      inline def setTimestampParamUndefined: Self = StObject.set(x, "timestampParam", js.undefined)
      
      inline def setTimestampRequests(value: Boolean): Self = StObject.set(x, "timestampRequests", value.asInstanceOf[js.Any])
      
      inline def setTimestampRequestsUndefined: Self = StObject.set(x, "timestampRequests", js.undefined)
      
      inline def setTransportOptions(value: js.Object): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
      
      inline def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
      
      inline def setTransports(value: js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value*))
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      inline def setUseNativeTimers(value: Boolean): Self = StObject.set(x, "useNativeTimers", value.asInstanceOf[js.Any])
      
      inline def setUseNativeTimersUndefined: Self = StObject.set(x, "useNativeTimers", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  /* Inlined std.Partial<socket.io-client.socket.io-client/build/esm/manager.ManagerOptions & socket.io-client.socket.io-client/build/esm/socket.SocketOptions> */
  trait PartialManagerOptionsSock extends StObject {
    
    var ackTimeout: js.UndefOr[Double] = js.undefined
    
    var addTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var agent: js.UndefOr[String | Boolean] = js.undefined
    
    var auth: js.UndefOr[
        StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
      ] = js.undefined
    
    var autoConnect: js.UndefOr[Boolean] = js.undefined
    
    var autoUnref: js.UndefOr[Boolean] = js.undefined
    
    var ca: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var closeOnBeforeunload: js.UndefOr[Boolean] = js.undefined
    
    var extraHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var forceBase64: js.UndefOr[Boolean] = js.undefined
    
    var forceNew: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var multiplex: js.UndefOr[Boolean] = js.undefined
    
    var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.undefined
    
    var parser: js.UndefOr[Any] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var perMessageDeflate: js.UndefOr[Threshold] = js.undefined
    
    var pfx: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var protocols: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var query: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var randomizationFactor: js.UndefOr[Double] = js.undefined
    
    var reconnection: js.UndefOr[Boolean] = js.undefined
    
    var reconnectionAttempts: js.UndefOr[Double] = js.undefined
    
    var reconnectionDelay: js.UndefOr[Double] = js.undefined
    
    var reconnectionDelayMax: js.UndefOr[Double] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var rememberUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timestampParam: js.UndefOr[String] = js.undefined
    
    var timestampRequests: js.UndefOr[Boolean] = js.undefined
    
    var transportOptions: js.UndefOr[js.Object] = js.undefined
    
    var transports: js.UndefOr[js.Array[String]] = js.undefined
    
    var upgrade: js.UndefOr[Boolean] = js.undefined
    
    var useNativeTimers: js.UndefOr[Boolean] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object PartialManagerOptionsSock {
    
    inline def apply(): PartialManagerOptionsSock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialManagerOptionsSock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialManagerOptionsSock] (val x: Self) extends AnyVal {
      
      inline def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      inline def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
      
      inline def setAddTrailingSlash(value: Boolean): Self = StObject.set(x, "addTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setAddTrailingSlashUndefined: Self = StObject.set(x, "addTrailingSlash", js.undefined)
      
      inline def setAgent(value: String | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(
        value: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
      ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthFunction1(value: /* cb */ js.Function1[/* data */ js.Object, Unit] => Unit): Self = StObject.set(x, "auth", js.Any.fromFunction1(value))
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      inline def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
      
      inline def setAutoUnref(value: Boolean): Self = StObject.set(x, "autoUnref", value.asInstanceOf[js.Any])
      
      inline def setAutoUnrefUndefined: Self = StObject.set(x, "autoUnref", js.undefined)
      
      inline def setCa(value: String | js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setCloseOnBeforeunload(value: Boolean): Self = StObject.set(x, "closeOnBeforeunload", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBeforeunloadUndefined: Self = StObject.set(x, "closeOnBeforeunload", js.undefined)
      
      inline def setExtraHeaders(value: StringDictionary[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setForceBase64(value: Boolean): Self = StObject.set(x, "forceBase64", value.asInstanceOf[js.Any])
      
      inline def setForceBase64Undefined: Self = StObject.set(x, "forceBase64", js.undefined)
      
      inline def setForceNew(value: Boolean): Self = StObject.set(x, "forceNew", value.asInstanceOf[js.Any])
      
      inline def setForceNewUndefined: Self = StObject.set(x, "forceNew", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMultiplex(value: Boolean): Self = StObject.set(x, "multiplex", value.asInstanceOf[js.Any])
      
      inline def setMultiplexUndefined: Self = StObject.set(x, "multiplex", js.undefined)
      
      inline def setOnlyBinaryUpgrades(value: Boolean): Self = StObject.set(x, "onlyBinaryUpgrades", value.asInstanceOf[js.Any])
      
      inline def setOnlyBinaryUpgradesUndefined: Self = StObject.set(x, "onlyBinaryUpgrades", js.undefined)
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPerMessageDeflate(value: Threshold): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocols(value: String | js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRandomizationFactor(value: Double): Self = StObject.set(x, "randomizationFactor", value.asInstanceOf[js.Any])
      
      inline def setRandomizationFactorUndefined: Self = StObject.set(x, "randomizationFactor", js.undefined)
      
      inline def setReconnection(value: Boolean): Self = StObject.set(x, "reconnection", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
      
      inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayMax(value: Double): Self = StObject.set(x, "reconnectionDelayMax", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayMaxUndefined: Self = StObject.set(x, "reconnectionDelayMax", js.undefined)
      
      inline def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
      
      inline def setReconnectionUndefined: Self = StObject.set(x, "reconnection", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRememberUpgrade(value: Boolean): Self = StObject.set(x, "rememberUpgrade", value.asInstanceOf[js.Any])
      
      inline def setRememberUpgradeUndefined: Self = StObject.set(x, "rememberUpgrade", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTimestampParam(value: String): Self = StObject.set(x, "timestampParam", value.asInstanceOf[js.Any])
      
      inline def setTimestampParamUndefined: Self = StObject.set(x, "timestampParam", js.undefined)
      
      inline def setTimestampRequests(value: Boolean): Self = StObject.set(x, "timestampRequests", value.asInstanceOf[js.Any])
      
      inline def setTimestampRequestsUndefined: Self = StObject.set(x, "timestampRequests", js.undefined)
      
      inline def setTransportOptions(value: js.Object): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
      
      inline def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
      
      inline def setTransports(value: js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value*))
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      inline def setUseNativeTimers(value: Boolean): Self = StObject.set(x, "useNativeTimers", value.asInstanceOf[js.Any])
      
      inline def setUseNativeTimersUndefined: Self = StObject.set(x, "useNativeTimers", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  /* Inlined std.Partial<socket.io-parser.socket.io-parser.Packet & {  query :string,   options :any}> */
  trait PartialPacketquerystringo extends StObject {
    
    var attachments: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var nsp: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[PacketType] = js.undefined
  }
  object PartialPacketquerystringo {
    
    inline def apply(): PartialPacketquerystringo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPacketquerystringo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPacketquerystringo] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: Double): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNsp(value: String): Self = StObject.set(x, "nsp", value.asInstanceOf[js.Any])
      
      inline def setNspUndefined: Self = StObject.set(x, "nsp", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setType(value: PacketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<socket.io-client.socket.io-client/build/esm/socket.SocketOptions> */
  trait PartialSocketOptions extends StObject {
    
    var ackTimeout: js.UndefOr[Double] = js.undefined
    
    var auth: js.UndefOr[
        StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
      ] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
  }
  object PartialSocketOptions {
    
    inline def apply(): PartialSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSocketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSocketOptions] (val x: Self) extends AnyVal {
      
      inline def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      inline def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
      
      inline def setAuth(
        value: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
      ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthFunction1(value: /* cb */ js.Function1[/* data */ js.Object, Unit] => Unit): Self = StObject.set(x, "auth", js.Any.fromFunction1(value))
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
}
