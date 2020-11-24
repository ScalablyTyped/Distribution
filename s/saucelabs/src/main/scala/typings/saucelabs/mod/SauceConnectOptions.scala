package typings.saucelabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceConnectOptions extends js.Object {
  
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
  implicit class SauceConnectOptionsOps[Self <: SauceConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCainfo(value: String): Self = this.set("cainfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCainfo: Self = this.set("cainfo", js.undefined)
    
    @scala.inline
    def setCapath(value: String): Self = this.set("capath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapath: Self = this.set("capath", js.undefined)
    
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    
    @scala.inline
    def setDirectDomains(value: String): Self = this.set("directDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectDomains: Self = this.set("directDomains", js.undefined)
    
    @scala.inline
    def setDns(value: String): Self = this.set("dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDns: Self = this.set("dns", js.undefined)
    
    @scala.inline
    def setDoctor(value: Boolean): Self = this.set("doctor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoctor: Self = this.set("doctor", js.undefined)
    
    @scala.inline
    def setFastFailRegexps(value: String): Self = this.set("fastFailRegexps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastFailRegexps: Self = this.set("fastFailRegexps", js.undefined)
    
    @scala.inline
    def setLogStats(value: Double): Self = this.set("logStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStats: Self = this.set("logStats", js.undefined)
    
    @scala.inline
    def setLogfile(value: String): Self = this.set("logfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogfile: Self = this.set("logfile", js.undefined)
    
    @scala.inline
    def setLogger(value: /* output */ String => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxLogsize(value: Double): Self = this.set("maxLogsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLogsize: Self = this.set("maxLogsize", js.undefined)
    
    @scala.inline
    def setMaxMissedAcks(value: Double): Self = this.set("maxMissedAcks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMissedAcks: Self = this.set("maxMissedAcks", js.undefined)
    
    @scala.inline
    def setMetricsAddress(value: String): Self = this.set("metricsAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsAddress: Self = this.set("metricsAddress", js.undefined)
    
    @scala.inline
    def setNoAutodetect(value: Boolean): Self = this.set("noAutodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAutodetect: Self = this.set("noAutodetect", js.undefined)
    
    @scala.inline
    def setNoProxyCaching(value: Boolean): Self = this.set("noProxyCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoProxyCaching: Self = this.set("noProxyCaching", js.undefined)
    
    @scala.inline
    def setNoRemoveCollidingTunnels(value: Boolean): Self = this.set("noRemoveCollidingTunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRemoveCollidingTunnels: Self = this.set("noRemoveCollidingTunnels", js.undefined)
    
    @scala.inline
    def setNoSslBumpDomains(value: String): Self = this.set("noSslBumpDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSslBumpDomains: Self = this.set("noSslBumpDomains", js.undefined)
    
    @scala.inline
    def setPac(value: String): Self = this.set("pac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePac: Self = this.set("pac", js.undefined)
    
    @scala.inline
    def setPidfile(value: String): Self = this.set("pidfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePidfile: Self = this.set("pidfile", js.undefined)
    
    @scala.inline
    def setProxyTunnel(value: Boolean): Self = this.set("proxyTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyTunnel: Self = this.set("proxyTunnel", js.undefined)
    
    @scala.inline
    def setProxyUserpwd(value: String): Self = this.set("proxyUserpwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUserpwd: Self = this.set("proxyUserpwd", js.undefined)
    
    @scala.inline
    def setReadyfile(value: String): Self = this.set("readyfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyfile: Self = this.set("readyfile", js.undefined)
    
    @scala.inline
    def setRestUrl(value: String): Self = this.set("restUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestUrl: Self = this.set("restUrl", js.undefined)
    
    @scala.inline
    def setScVersion(value: String): Self = this.set("scVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScVersion: Self = this.set("scVersion", js.undefined)
    
    @scala.inline
    def setScproxyPort(value: String): Self = this.set("scproxyPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScproxyPort: Self = this.set("scproxyPort", js.undefined)
    
    @scala.inline
    def setScproxyReadLimit(value: String): Self = this.set("scproxyReadLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScproxyReadLimit: Self = this.set("scproxyReadLimit", js.undefined)
    
    @scala.inline
    def setScproxyWriteLimit(value: String): Self = this.set("scproxyWriteLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScproxyWriteLimit: Self = this.set("scproxyWriteLimit", js.undefined)
    
    @scala.inline
    def setSePort(value: Double): Self = this.set("sePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSePort: Self = this.set("sePort", js.undefined)
    
    @scala.inline
    def setSharedTunnel(value: Boolean): Self = this.set("sharedTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedTunnel: Self = this.set("sharedTunnel", js.undefined)
    
    @scala.inline
    def setTunnelCainfo(value: String): Self = this.set("tunnelCainfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelCainfo: Self = this.set("tunnelCainfo", js.undefined)
    
    @scala.inline
    def setTunnelCapath(value: String): Self = this.set("tunnelCapath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelCapath: Self = this.set("tunnelCapath", js.undefined)
    
    @scala.inline
    def setTunnelCert(value: String): Self = this.set("tunnelCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelCert: Self = this.set("tunnelCert", js.undefined)
    
    @scala.inline
    def setTunnelDomains(value: String): Self = this.set("tunnelDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelDomains: Self = this.set("tunnelDomains", js.undefined)
    
    @scala.inline
    def setTunnelIdentifier(value: String): Self = this.set("tunnelIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelIdentifier: Self = this.set("tunnelIdentifier", js.undefined)
  }
}
