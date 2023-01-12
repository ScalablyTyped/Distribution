package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tunnel
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var creation_time: js.UndefOr[Double] = js.undefined
  
  var direct_domains: js.UndefOr[js.Array[String]] = js.undefined
  
  var domain_names: js.UndefOr[js.Array[String]] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var last_connected: js.UndefOr[Double] = js.undefined
  
  var launch_time: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[TunnelMetaData] = js.undefined
  
  var no_proxy_caching: js.UndefOr[Boolean] = js.undefined
  
  var no_ssl_bump_domains: js.UndefOr[js.Array[String]] = js.undefined
  
  var owner: js.UndefOr[String] = js.undefined
  
  var shared_tunnel: js.UndefOr[Boolean] = js.undefined
  
  var shutdown_time: js.UndefOr[Double] = js.undefined
  
  var ssh_port: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var tunnel_identifier: js.UndefOr[String] = js.undefined
  
  var use_caching_proxy: js.UndefOr[Boolean] = js.undefined
  
  var use_kgp: js.UndefOr[Boolean] = js.undefined
  
  var user_shutdown: js.UndefOr[Boolean] = js.undefined
  
  var vm_version: js.UndefOr[String] = js.undefined
}
object Tunnel {
  
  inline def apply(id: String): Tunnel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tunnel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tunnel] (val x: Self) extends AnyVal {
    
    inline def setCreation_time(value: Double): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    inline def setDirect_domains(value: js.Array[String]): Self = StObject.set(x, "direct_domains", value.asInstanceOf[js.Any])
    
    inline def setDirect_domainsUndefined: Self = StObject.set(x, "direct_domains", js.undefined)
    
    inline def setDirect_domainsVarargs(value: String*): Self = StObject.set(x, "direct_domains", js.Array(value*))
    
    inline def setDomain_names(value: js.Array[String]): Self = StObject.set(x, "domain_names", value.asInstanceOf[js.Any])
    
    inline def setDomain_namesUndefined: Self = StObject.set(x, "domain_names", js.undefined)
    
    inline def setDomain_namesVarargs(value: String*): Self = StObject.set(x, "domain_names", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_connected(value: Double): Self = StObject.set(x, "last_connected", value.asInstanceOf[js.Any])
    
    inline def setLast_connectedUndefined: Self = StObject.set(x, "last_connected", js.undefined)
    
    inline def setLaunch_time(value: Double): Self = StObject.set(x, "launch_time", value.asInstanceOf[js.Any])
    
    inline def setLaunch_timeUndefined: Self = StObject.set(x, "launch_time", js.undefined)
    
    inline def setMetadata(value: TunnelMetaData): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNo_proxy_caching(value: Boolean): Self = StObject.set(x, "no_proxy_caching", value.asInstanceOf[js.Any])
    
    inline def setNo_proxy_cachingUndefined: Self = StObject.set(x, "no_proxy_caching", js.undefined)
    
    inline def setNo_ssl_bump_domains(value: js.Array[String]): Self = StObject.set(x, "no_ssl_bump_domains", value.asInstanceOf[js.Any])
    
    inline def setNo_ssl_bump_domainsUndefined: Self = StObject.set(x, "no_ssl_bump_domains", js.undefined)
    
    inline def setNo_ssl_bump_domainsVarargs(value: String*): Self = StObject.set(x, "no_ssl_bump_domains", js.Array(value*))
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setShared_tunnel(value: Boolean): Self = StObject.set(x, "shared_tunnel", value.asInstanceOf[js.Any])
    
    inline def setShared_tunnelUndefined: Self = StObject.set(x, "shared_tunnel", js.undefined)
    
    inline def setShutdown_time(value: Double): Self = StObject.set(x, "shutdown_time", value.asInstanceOf[js.Any])
    
    inline def setShutdown_timeUndefined: Self = StObject.set(x, "shutdown_time", js.undefined)
    
    inline def setSsh_port(value: Double): Self = StObject.set(x, "ssh_port", value.asInstanceOf[js.Any])
    
    inline def setSsh_portUndefined: Self = StObject.set(x, "ssh_port", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTunnel_identifier(value: String): Self = StObject.set(x, "tunnel_identifier", value.asInstanceOf[js.Any])
    
    inline def setTunnel_identifierUndefined: Self = StObject.set(x, "tunnel_identifier", js.undefined)
    
    inline def setUse_caching_proxy(value: Boolean): Self = StObject.set(x, "use_caching_proxy", value.asInstanceOf[js.Any])
    
    inline def setUse_caching_proxyUndefined: Self = StObject.set(x, "use_caching_proxy", js.undefined)
    
    inline def setUse_kgp(value: Boolean): Self = StObject.set(x, "use_kgp", value.asInstanceOf[js.Any])
    
    inline def setUse_kgpUndefined: Self = StObject.set(x, "use_kgp", js.undefined)
    
    inline def setUser_shutdown(value: Boolean): Self = StObject.set(x, "user_shutdown", value.asInstanceOf[js.Any])
    
    inline def setUser_shutdownUndefined: Self = StObject.set(x, "user_shutdown", js.undefined)
    
    inline def setVm_version(value: String): Self = StObject.set(x, "vm_version", value.asInstanceOf[js.Any])
    
    inline def setVm_versionUndefined: Self = StObject.set(x, "vm_version", js.undefined)
  }
}
