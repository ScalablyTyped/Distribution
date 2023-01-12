package typings.saucelabs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SauceConnectOptions extends StObject {
  
  /**
    * Perform basic authentication when an URL on <host:port> asks for a username and password.
    */
  var auth: js.UndefOr[String] = js.undefined
  
  /**
    * CA certificate bundle to use for verifying REST connections. (default "/usr/local/etc/openssl/cert.pem")
    */
  var cainfo: js.UndefOr[String] = js.undefined
  
  /**
    * Directory of CA certs to use for verifying REST connections. (default "/etc/ssl/certs")
    */
  var capath: js.UndefOr[String] = js.undefined
  
  /**
    * Path to YAML config file.
    */
  var configFile: js.UndefOr[String] = js.undefined
  
  /**
    * Comma-separated list of domains. Requests whose host matches one of these will be relayed directly through the internet, instead of through the tunnel.
    */
  var directDomains: js.UndefOr[String] = js.undefined
  
  /**
    * Use specified name server(s). Example: --dns 8.8.8.8,8.8.4.4:53
    */
  var dns: js.UndefOr[String] = js.undefined
  
  /**
    * Perform checks to detect possible misconfiguration or problems.
    */
  var doctor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Comma-separated list of regular expressions. Requests matching one of these will get dropped instantly and will not go through the tunnel.
    */
  var fastFailRegexps: js.UndefOr[String] = js.undefined
  
  /**
    * Log statistics about HTTP traffic every <seconds>.
    */
  var logStats: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify custom logfile.
    */
  var logfile: js.UndefOr[String] = js.undefined
  
  /**
    * A function to optionally write sauce-connect-launcher log messages, e.g. console.log
    */
  var logger: js.UndefOr[js.Function1[/* output */ String, Unit]] = js.undefined
  
  /**
    * Rotate logfile after reaching <bytes> size. Disabled by default.
    */
  var maxLogsize: js.UndefOr[Double] = js.undefined
  
  /**
    * The max number of keepalive acks that can be missed before triggering reconnect.
    */
  var maxMissedAcks: js.UndefOr[Double] = js.undefined
  
  /**
    * host:port server used to expose client-side metrics.
    */
  var metricsAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Disable the autodetection of proxy settings.
    */
  var noAutodetect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable caching in Sauce Connect. All requests will be sent through the tunnel.
    */
  var noProxyCaching: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Don't remove identified tunnels with the same name, or any other default tunnels if this is a default tunnel. Jobs will be distributed between these tunnels, enabling load balancing and high availability. By default, colliding tunnels will be removed when Sauce Connect is starting up.
    */
  var noRemoveCollidingTunnels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Comma-separated list of domains. Requests whose host matches one of these will not be SSL re-encrypted.
    */
  var noSslBumpDomains: js.UndefOr[String] = js.undefined
  
  /**
    * Proxy autoconfiguration. Can be an http(s) or local file:// (absolute path only) URI.
    */
  var pac: js.UndefOr[String] = js.undefined
  
  /**
    * File that will be created with the pid of the process.
    */
  var pidfile: js.UndefOr[String] = js.undefined
  
  /**
    * Use the proxy configured with -p for the tunnel connection.
    */
  var proxyTunnel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Username and password required to access the proxy configured with -p.
    */
  var proxyUserpwd: js.UndefOr[String] = js.undefined
  
  /**
    * File that will be touched to signal when tunnel is ready.
    */
  var readyfile: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the Sauce Connect version you want to use. (default: 4.8.0)
    */
  var scVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Port on which scproxy will be listening.
    */
  var scproxyPort: js.UndefOr[String] = js.undefined
  
  /**
    * Rate limit reads in scproxy to X bytes per second. This option can be used to adjust local network transfer rate in order not to overload the tunnel connection.
    */
  var scproxyReadLimit: js.UndefOr[String] = js.undefined
  
  /**
    * Rate limit writes in scproxy to X bytes per second. This option can be used to adjust local network transfer rate in order not to overload the tunnel connection.
    */
  var scproxyWriteLimit: js.UndefOr[String] = js.undefined
  
  /**
    * Port on which Sauce Connect's Selenium relay will listen for requests. Selenium commands reaching Connect on this port will be relayed to Sauce Labs securely and reliably through Connect's tunnel (default 4445) (default: 4445)
    */
  var sePort: js.UndefOr[Double] = js.undefined
  
  /**
    * Let sub-accounts of the tunnel owner use the tunnel if requested.
    */
  var sharedTunnel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * host:port server used to expose client status.
    */
  var statusAddress: js.UndefOr[String] = js.undefined
  
  /**
    * CA certificate bundle to use for verifying tunnel connections. (default "/usr/local/etc/openssl/cert.pem")
    */
  var tunnelCainfo: js.UndefOr[String] = js.undefined
  
  /**
    * Directory of CA certs to use for verifying tunnel connections. (default "/etc/ssl/certs")
    */
  var tunnelCapath: js.UndefOr[String] = js.undefined
  
  /**
    * Specify certificate to use for the tunnel connection, either public or private. Default: private. (default "private")
    */
  var tunnelCert: js.UndefOr[String] = js.undefined
  
  /**
    * Inverse of '--direct-domains'. Only requests for domains in this list will be sent through the tunnel. Overrides '--direct-domains'.
    */
  var tunnelDomains: js.UndefOr[String] = js.undefined
  
  /**
    * Tunnel name used for this tunnel or the tunnels in the same HA pool.
    */
  var tunnelIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Tunnel name used for this tunnel or the tunnels in the same HA pool.
    */
  var tunnelName: js.UndefOr[String] = js.undefined
  
  /**
    * The tunnel is a part of a high availability tunnel pool.
    */
  var tunnelPool: js.UndefOr[String] = js.undefined
  
  /**
    * Enable verbose logging. Can be used up to two times.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object SauceConnectOptions {
  
  inline def apply(): SauceConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SauceConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SauceConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCainfo(value: String): Self = StObject.set(x, "cainfo", value.asInstanceOf[js.Any])
    
    inline def setCainfoUndefined: Self = StObject.set(x, "cainfo", js.undefined)
    
    inline def setCapath(value: String): Self = StObject.set(x, "capath", value.asInstanceOf[js.Any])
    
    inline def setCapathUndefined: Self = StObject.set(x, "capath", js.undefined)
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setDirectDomains(value: String): Self = StObject.set(x, "directDomains", value.asInstanceOf[js.Any])
    
    inline def setDirectDomainsUndefined: Self = StObject.set(x, "directDomains", js.undefined)
    
    inline def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
    
    inline def setDoctor(value: Boolean): Self = StObject.set(x, "doctor", value.asInstanceOf[js.Any])
    
    inline def setDoctorUndefined: Self = StObject.set(x, "doctor", js.undefined)
    
    inline def setFastFailRegexps(value: String): Self = StObject.set(x, "fastFailRegexps", value.asInstanceOf[js.Any])
    
    inline def setFastFailRegexpsUndefined: Self = StObject.set(x, "fastFailRegexps", js.undefined)
    
    inline def setLogStats(value: Double): Self = StObject.set(x, "logStats", value.asInstanceOf[js.Any])
    
    inline def setLogStatsUndefined: Self = StObject.set(x, "logStats", js.undefined)
    
    inline def setLogfile(value: String): Self = StObject.set(x, "logfile", value.asInstanceOf[js.Any])
    
    inline def setLogfileUndefined: Self = StObject.set(x, "logfile", js.undefined)
    
    inline def setLogger(value: /* output */ String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxLogsize(value: Double): Self = StObject.set(x, "maxLogsize", value.asInstanceOf[js.Any])
    
    inline def setMaxLogsizeUndefined: Self = StObject.set(x, "maxLogsize", js.undefined)
    
    inline def setMaxMissedAcks(value: Double): Self = StObject.set(x, "maxMissedAcks", value.asInstanceOf[js.Any])
    
    inline def setMaxMissedAcksUndefined: Self = StObject.set(x, "maxMissedAcks", js.undefined)
    
    inline def setMetricsAddress(value: String): Self = StObject.set(x, "metricsAddress", value.asInstanceOf[js.Any])
    
    inline def setMetricsAddressUndefined: Self = StObject.set(x, "metricsAddress", js.undefined)
    
    inline def setNoAutodetect(value: Boolean): Self = StObject.set(x, "noAutodetect", value.asInstanceOf[js.Any])
    
    inline def setNoAutodetectUndefined: Self = StObject.set(x, "noAutodetect", js.undefined)
    
    inline def setNoProxyCaching(value: Boolean): Self = StObject.set(x, "noProxyCaching", value.asInstanceOf[js.Any])
    
    inline def setNoProxyCachingUndefined: Self = StObject.set(x, "noProxyCaching", js.undefined)
    
    inline def setNoRemoveCollidingTunnels(value: Boolean): Self = StObject.set(x, "noRemoveCollidingTunnels", value.asInstanceOf[js.Any])
    
    inline def setNoRemoveCollidingTunnelsUndefined: Self = StObject.set(x, "noRemoveCollidingTunnels", js.undefined)
    
    inline def setNoSslBumpDomains(value: String): Self = StObject.set(x, "noSslBumpDomains", value.asInstanceOf[js.Any])
    
    inline def setNoSslBumpDomainsUndefined: Self = StObject.set(x, "noSslBumpDomains", js.undefined)
    
    inline def setPac(value: String): Self = StObject.set(x, "pac", value.asInstanceOf[js.Any])
    
    inline def setPacUndefined: Self = StObject.set(x, "pac", js.undefined)
    
    inline def setPidfile(value: String): Self = StObject.set(x, "pidfile", value.asInstanceOf[js.Any])
    
    inline def setPidfileUndefined: Self = StObject.set(x, "pidfile", js.undefined)
    
    inline def setProxyTunnel(value: Boolean): Self = StObject.set(x, "proxyTunnel", value.asInstanceOf[js.Any])
    
    inline def setProxyTunnelUndefined: Self = StObject.set(x, "proxyTunnel", js.undefined)
    
    inline def setProxyUserpwd(value: String): Self = StObject.set(x, "proxyUserpwd", value.asInstanceOf[js.Any])
    
    inline def setProxyUserpwdUndefined: Self = StObject.set(x, "proxyUserpwd", js.undefined)
    
    inline def setReadyfile(value: String): Self = StObject.set(x, "readyfile", value.asInstanceOf[js.Any])
    
    inline def setReadyfileUndefined: Self = StObject.set(x, "readyfile", js.undefined)
    
    inline def setScVersion(value: String): Self = StObject.set(x, "scVersion", value.asInstanceOf[js.Any])
    
    inline def setScVersionUndefined: Self = StObject.set(x, "scVersion", js.undefined)
    
    inline def setScproxyPort(value: String): Self = StObject.set(x, "scproxyPort", value.asInstanceOf[js.Any])
    
    inline def setScproxyPortUndefined: Self = StObject.set(x, "scproxyPort", js.undefined)
    
    inline def setScproxyReadLimit(value: String): Self = StObject.set(x, "scproxyReadLimit", value.asInstanceOf[js.Any])
    
    inline def setScproxyReadLimitUndefined: Self = StObject.set(x, "scproxyReadLimit", js.undefined)
    
    inline def setScproxyWriteLimit(value: String): Self = StObject.set(x, "scproxyWriteLimit", value.asInstanceOf[js.Any])
    
    inline def setScproxyWriteLimitUndefined: Self = StObject.set(x, "scproxyWriteLimit", js.undefined)
    
    inline def setSePort(value: Double): Self = StObject.set(x, "sePort", value.asInstanceOf[js.Any])
    
    inline def setSePortUndefined: Self = StObject.set(x, "sePort", js.undefined)
    
    inline def setSharedTunnel(value: Boolean): Self = StObject.set(x, "sharedTunnel", value.asInstanceOf[js.Any])
    
    inline def setSharedTunnelUndefined: Self = StObject.set(x, "sharedTunnel", js.undefined)
    
    inline def setStatusAddress(value: String): Self = StObject.set(x, "statusAddress", value.asInstanceOf[js.Any])
    
    inline def setStatusAddressUndefined: Self = StObject.set(x, "statusAddress", js.undefined)
    
    inline def setTunnelCainfo(value: String): Self = StObject.set(x, "tunnelCainfo", value.asInstanceOf[js.Any])
    
    inline def setTunnelCainfoUndefined: Self = StObject.set(x, "tunnelCainfo", js.undefined)
    
    inline def setTunnelCapath(value: String): Self = StObject.set(x, "tunnelCapath", value.asInstanceOf[js.Any])
    
    inline def setTunnelCapathUndefined: Self = StObject.set(x, "tunnelCapath", js.undefined)
    
    inline def setTunnelCert(value: String): Self = StObject.set(x, "tunnelCert", value.asInstanceOf[js.Any])
    
    inline def setTunnelCertUndefined: Self = StObject.set(x, "tunnelCert", js.undefined)
    
    inline def setTunnelDomains(value: String): Self = StObject.set(x, "tunnelDomains", value.asInstanceOf[js.Any])
    
    inline def setTunnelDomainsUndefined: Self = StObject.set(x, "tunnelDomains", js.undefined)
    
    inline def setTunnelIdentifier(value: String): Self = StObject.set(x, "tunnelIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTunnelIdentifierUndefined: Self = StObject.set(x, "tunnelIdentifier", js.undefined)
    
    inline def setTunnelName(value: String): Self = StObject.set(x, "tunnelName", value.asInstanceOf[js.Any])
    
    inline def setTunnelNameUndefined: Self = StObject.set(x, "tunnelName", js.undefined)
    
    inline def setTunnelPool(value: String): Self = StObject.set(x, "tunnelPool", value.asInstanceOf[js.Any])
    
    inline def setTunnelPoolUndefined: Self = StObject.set(x, "tunnelPool", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
