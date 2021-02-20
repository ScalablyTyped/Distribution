package typings.saucelabs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceConnectOptions extends StObject {
  
  /**
    * Perform basic authentication when an URL on <host:port> asks for a username and password.
    */
  var auth: js.UndefOr[String] = js.native
  
  /**
    * CA certificate bundle to use for verifying REST connections. (default "/usr/local/etc/openssl/cert.pem")
    */
  var cainfo: js.UndefOr[String] = js.native
  
  /**
    * Directory of CA certs to use for verifying REST connections. (default "/etc/ssl/certs")
    */
  var capath: js.UndefOr[String] = js.native
  
  /**
    * Path to YAML config file. Please refer to https://wiki.saucelabs.com/display/DOCS/Sauce+Connect+Command+Line+Reference for a sample configuration file.
    */
  var configFile: js.UndefOr[String] = js.native
  
  /**
    * Comma-separated list of domains. Requests whose host matches one of these will be relayed directly through the internet, instead of through the tunnel.
    */
  var directDomains: js.UndefOr[String] = js.native
  
  /**
    * Use specified name server. To specify multiple servers, separate them with comma. Use IP addresses, optionally with a port number, the two separated by a colon. Example: --dns 8.8.8.8,8.8.4.4:53
    */
  var dns: js.UndefOr[String] = js.native
  
  /**
    * Perform checks to detect possible misconfiguration or problems.
    */
  var doctor: js.UndefOr[Boolean] = js.native
  
  /**
    * Comma-separated list of regular expressions. Requests matching one of these will get dropped instantly and will not go through the tunnel.
    */
  var fastFailRegexps: js.UndefOr[String] = js.native
  
  /**
    * Log statistics about HTTP traffic every <seconds>.
    */
  var logStats: js.UndefOr[Double] = js.native
  
  /**
    * Specify custom logfile.
    */
  var logfile: js.UndefOr[String] = js.native
  
  /**
    * A function to optionally write sauce-connect-launcher log messages, e.g. console.log
    */
  var logger: js.UndefOr[js.Function1[/* output */ String, Unit]] = js.native
  
  /**
    * Rotate logfile after reaching <bytes> size. Disabled by default.
    */
  var maxLogsize: js.UndefOr[Double] = js.native
  
  /**
    * The maximum amount of keepalive acks that can be missed before the client will trigger a reconnect. (default 30) (default: 30)
    */
  var maxMissedAcks: js.UndefOr[Double] = js.native
  
  /**
    * host:port for the internal web server used to expose client side metrics. (default "localhost:8888")
    */
  var metricsAddress: js.UndefOr[String] = js.native
  
  /**
    * Disable the autodetection of proxy settings.
    */
  var noAutodetect: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable caching in Sauce Connect. All requests will be sent through the tunnel.
    */
  var noProxyCaching: js.UndefOr[Boolean] = js.native
  
  /**
    * Don't remove identified tunnels with the same name, or any other default tunnels if this is a default tunnel. Jobs will be distributed between these tunnels, enabling load balancing and high availability. By default, colliding tunnels will be removed when Sauce Connect is starting up.
    */
  var noRemoveCollidingTunnels: js.UndefOr[Boolean] = js.native
  
  /**
    * Comma-separated list of domains. Requests whose host matches one of these will not be SSL re-encrypted.
    */
  var noSslBumpDomains: js.UndefOr[String] = js.native
  
  /**
    * Proxy autoconfiguration. Can be an http(s) or local file:// (absolute path only) URI.
    */
  var pac: js.UndefOr[String] = js.native
  
  /**
    * File that will be created with the pid of the process.
    */
  var pidfile: js.UndefOr[String] = js.native
  
  /**
    * Use the proxy configured with -p for the tunnel connection.
    */
  var proxyTunnel: js.UndefOr[Boolean] = js.native
  
  /**
    * Username and password required to access the proxy configured with -p.
    */
  var proxyUserpwd: js.UndefOr[String] = js.native
  
  /**
    * File that will be touched to signal when tunnel is ready.
    */
  var readyfile: js.UndefOr[String] = js.native
  
  /**
    * Advanced feature: Connect to Sauce REST API at alternative URL. Use only if directed to do so by Sauce Labs support. (default "https://saucelabs.com/rest/v1")
    */
  var restUrl: js.UndefOr[String] = js.native
  
  /**
    * Specify the Sauce Connect version you want to use. (default: 4.6.2)
    */
  var scVersion: js.UndefOr[String] = js.native
  
  /**
    * Port on which scproxy will be listening.
    */
  var scproxyPort: js.UndefOr[String] = js.native
  
  /**
    * Rate limit reads in scproxy to X bytes per second. This option can be used to adjust local network transfer rate in order not to overload the tunnel connection.
    */
  var scproxyReadLimit: js.UndefOr[String] = js.native
  
  /**
    * Rate limit writes in scproxy to X bytes per second. This option can be used to adjust local network transfer rate in order not to overload the tunnel connection.
    */
  var scproxyWriteLimit: js.UndefOr[String] = js.native
  
  /**
    * Port on which Sauce Connect's Selenium relay will listen for requests. Selenium commands reaching Connect on this port will be relayed to Sauce Labs securely and reliably through Connect's tunnel (default 4445) (default: 4445)
    */
  var sePort: js.UndefOr[Double] = js.native
  
  /**
    * Let sub-accounts of the tunnel owner use the tunnel if requested.
    */
  var sharedTunnel: js.UndefOr[Boolean] = js.native
  
  /**
    * CA certificate bundle to use for verifying tunnel connections. (default "/usr/local/etc/openssl/cert.pem")
    */
  var tunnelCainfo: js.UndefOr[String] = js.native
  
  /**
    * Directory of CA certs to use for verifying tunnel connections. (default "/etc/ssl/certs")
    */
  var tunnelCapath: js.UndefOr[String] = js.native
  
  /**
    * Specify certificate to use for the tunnel connection, either public or private. Default: private. (default "private")
    */
  var tunnelCert: js.UndefOr[String] = js.native
  
  /**
    * Inverse of '--direct-domains'. Only requests for domains in this list will be sent through the tunnel. Overrides '--direct-domains'.
    */
  var tunnelDomains: js.UndefOr[String] = js.native
  
  /**
    * Don't automatically assign jobs to this tunnel. Jobs will use it only by explicitly providing the right identifier.
    */
  var tunnelIdentifier: js.UndefOr[String] = js.native
}
object SauceConnectOptions {
  
  @scala.inline
  def apply(): SauceConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SauceConnectOptions]
  }
  
  @scala.inline
  implicit class SauceConnectOptionsMutableBuilder[Self <: SauceConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCainfo(value: String): Self = StObject.set(x, "cainfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCainfoUndefined: Self = StObject.set(x, "cainfo", js.undefined)
    
    @scala.inline
    def setCapath(value: String): Self = StObject.set(x, "capath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapathUndefined: Self = StObject.set(x, "capath", js.undefined)
    
    @scala.inline
    def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    @scala.inline
    def setDirectDomains(value: String): Self = StObject.set(x, "directDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectDomainsUndefined: Self = StObject.set(x, "directDomains", js.undefined)
    
    @scala.inline
    def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
    
    @scala.inline
    def setDoctor(value: Boolean): Self = StObject.set(x, "doctor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoctorUndefined: Self = StObject.set(x, "doctor", js.undefined)
    
    @scala.inline
    def setFastFailRegexps(value: String): Self = StObject.set(x, "fastFailRegexps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastFailRegexpsUndefined: Self = StObject.set(x, "fastFailRegexps", js.undefined)
    
    @scala.inline
    def setLogStats(value: Double): Self = StObject.set(x, "logStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStatsUndefined: Self = StObject.set(x, "logStats", js.undefined)
    
    @scala.inline
    def setLogfile(value: String): Self = StObject.set(x, "logfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogfileUndefined: Self = StObject.set(x, "logfile", js.undefined)
    
    @scala.inline
    def setLogger(value: /* output */ String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMaxLogsize(value: Double): Self = StObject.set(x, "maxLogsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLogsizeUndefined: Self = StObject.set(x, "maxLogsize", js.undefined)
    
    @scala.inline
    def setMaxMissedAcks(value: Double): Self = StObject.set(x, "maxMissedAcks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMissedAcksUndefined: Self = StObject.set(x, "maxMissedAcks", js.undefined)
    
    @scala.inline
    def setMetricsAddress(value: String): Self = StObject.set(x, "metricsAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsAddressUndefined: Self = StObject.set(x, "metricsAddress", js.undefined)
    
    @scala.inline
    def setNoAutodetect(value: Boolean): Self = StObject.set(x, "noAutodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAutodetectUndefined: Self = StObject.set(x, "noAutodetect", js.undefined)
    
    @scala.inline
    def setNoProxyCaching(value: Boolean): Self = StObject.set(x, "noProxyCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProxyCachingUndefined: Self = StObject.set(x, "noProxyCaching", js.undefined)
    
    @scala.inline
    def setNoRemoveCollidingTunnels(value: Boolean): Self = StObject.set(x, "noRemoveCollidingTunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRemoveCollidingTunnelsUndefined: Self = StObject.set(x, "noRemoveCollidingTunnels", js.undefined)
    
    @scala.inline
    def setNoSslBumpDomains(value: String): Self = StObject.set(x, "noSslBumpDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSslBumpDomainsUndefined: Self = StObject.set(x, "noSslBumpDomains", js.undefined)
    
    @scala.inline
    def setPac(value: String): Self = StObject.set(x, "pac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacUndefined: Self = StObject.set(x, "pac", js.undefined)
    
    @scala.inline
    def setPidfile(value: String): Self = StObject.set(x, "pidfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidfileUndefined: Self = StObject.set(x, "pidfile", js.undefined)
    
    @scala.inline
    def setProxyTunnel(value: Boolean): Self = StObject.set(x, "proxyTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyTunnelUndefined: Self = StObject.set(x, "proxyTunnel", js.undefined)
    
    @scala.inline
    def setProxyUserpwd(value: String): Self = StObject.set(x, "proxyUserpwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUserpwdUndefined: Self = StObject.set(x, "proxyUserpwd", js.undefined)
    
    @scala.inline
    def setReadyfile(value: String): Self = StObject.set(x, "readyfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyfileUndefined: Self = StObject.set(x, "readyfile", js.undefined)
    
    @scala.inline
    def setRestUrl(value: String): Self = StObject.set(x, "restUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestUrlUndefined: Self = StObject.set(x, "restUrl", js.undefined)
    
    @scala.inline
    def setScVersion(value: String): Self = StObject.set(x, "scVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScVersionUndefined: Self = StObject.set(x, "scVersion", js.undefined)
    
    @scala.inline
    def setScproxyPort(value: String): Self = StObject.set(x, "scproxyPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScproxyPortUndefined: Self = StObject.set(x, "scproxyPort", js.undefined)
    
    @scala.inline
    def setScproxyReadLimit(value: String): Self = StObject.set(x, "scproxyReadLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScproxyReadLimitUndefined: Self = StObject.set(x, "scproxyReadLimit", js.undefined)
    
    @scala.inline
    def setScproxyWriteLimit(value: String): Self = StObject.set(x, "scproxyWriteLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScproxyWriteLimitUndefined: Self = StObject.set(x, "scproxyWriteLimit", js.undefined)
    
    @scala.inline
    def setSePort(value: Double): Self = StObject.set(x, "sePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSePortUndefined: Self = StObject.set(x, "sePort", js.undefined)
    
    @scala.inline
    def setSharedTunnel(value: Boolean): Self = StObject.set(x, "sharedTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTunnelUndefined: Self = StObject.set(x, "sharedTunnel", js.undefined)
    
    @scala.inline
    def setTunnelCainfo(value: String): Self = StObject.set(x, "tunnelCainfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelCainfoUndefined: Self = StObject.set(x, "tunnelCainfo", js.undefined)
    
    @scala.inline
    def setTunnelCapath(value: String): Self = StObject.set(x, "tunnelCapath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelCapathUndefined: Self = StObject.set(x, "tunnelCapath", js.undefined)
    
    @scala.inline
    def setTunnelCert(value: String): Self = StObject.set(x, "tunnelCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelCertUndefined: Self = StObject.set(x, "tunnelCert", js.undefined)
    
    @scala.inline
    def setTunnelDomains(value: String): Self = StObject.set(x, "tunnelDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelDomainsUndefined: Self = StObject.set(x, "tunnelDomains", js.undefined)
    
    @scala.inline
    def setTunnelIdentifier(value: String): Self = StObject.set(x, "tunnelIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelIdentifierUndefined: Self = StObject.set(x, "tunnelIdentifier", js.undefined)
  }
}
