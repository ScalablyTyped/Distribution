package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tunnel
  extends /* key */ StringDictionary[js.Any] {
  
  var creation_time: js.UndefOr[Double] = js.native
  
  var direct_domains: js.UndefOr[js.Array[String]] = js.native
  
  var domain_names: js.UndefOr[js.Array[String]] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var last_connected: js.UndefOr[Double] = js.native
  
  var launch_time: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[TunnelMetaData] = js.native
  
  var no_proxy_caching: js.UndefOr[Boolean] = js.native
  
  var no_ssl_bump_domains: js.UndefOr[js.Array[String]] = js.native
  
  var owner: js.UndefOr[String] = js.native
  
  var shared_tunnel: js.UndefOr[Boolean] = js.native
  
  var shutdown_time: js.UndefOr[Double] = js.native
  
  var ssh_port: js.UndefOr[Double] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var tunnel_identifier: js.UndefOr[String] = js.native
  
  var use_caching_proxy: js.UndefOr[Boolean] = js.native
  
  var use_kgp: js.UndefOr[Boolean] = js.native
  
  var user_shutdown: js.UndefOr[Boolean] = js.native
  
  var vm_version: js.UndefOr[String] = js.native
}
object Tunnel {
  
  @scala.inline
  def apply(id: String): Tunnel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tunnel]
  }
  
  @scala.inline
  implicit class TunnelOps[Self <: Tunnel] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_time(value: Double): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation_time: Self = this.set("creation_time", js.undefined)
    
    @scala.inline
    def setDirect_domainsVarargs(value: String*): Self = this.set("direct_domains", js.Array(value :_*))
    
    @scala.inline
    def setDirect_domains(value: js.Array[String]): Self = this.set("direct_domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirect_domains: Self = this.set("direct_domains", js.undefined)
    
    @scala.inline
    def setDomain_namesVarargs(value: String*): Self = this.set("domain_names", js.Array(value :_*))
    
    @scala.inline
    def setDomain_names(value: js.Array[String]): Self = this.set("domain_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain_names: Self = this.set("domain_names", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLast_connected(value: Double): Self = this.set("last_connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_connected: Self = this.set("last_connected", js.undefined)
    
    @scala.inline
    def setLaunch_time(value: Double): Self = this.set("launch_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunch_time: Self = this.set("launch_time", js.undefined)
    
    @scala.inline
    def setMetadata(value: TunnelMetaData): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNo_proxy_caching(value: Boolean): Self = this.set("no_proxy_caching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_proxy_caching: Self = this.set("no_proxy_caching", js.undefined)
    
    @scala.inline
    def setNo_ssl_bump_domainsVarargs(value: String*): Self = this.set("no_ssl_bump_domains", js.Array(value :_*))
    
    @scala.inline
    def setNo_ssl_bump_domains(value: js.Array[String]): Self = this.set("no_ssl_bump_domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_ssl_bump_domains: Self = this.set("no_ssl_bump_domains", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setShared_tunnel(value: Boolean): Self = this.set("shared_tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared_tunnel: Self = this.set("shared_tunnel", js.undefined)
    
    @scala.inline
    def setShutdown_time(value: Double): Self = this.set("shutdown_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutdown_time: Self = this.set("shutdown_time", js.undefined)
    
    @scala.inline
    def setSsh_port(value: Double): Self = this.set("ssh_port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsh_port: Self = this.set("ssh_port", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTunnel_identifier(value: String): Self = this.set("tunnel_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnel_identifier: Self = this.set("tunnel_identifier", js.undefined)
    
    @scala.inline
    def setUse_caching_proxy(value: Boolean): Self = this.set("use_caching_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse_caching_proxy: Self = this.set("use_caching_proxy", js.undefined)
    
    @scala.inline
    def setUse_kgp(value: Boolean): Self = this.set("use_kgp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse_kgp: Self = this.set("use_kgp", js.undefined)
    
    @scala.inline
    def setUser_shutdown(value: Boolean): Self = this.set("user_shutdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_shutdown: Self = this.set("user_shutdown", js.undefined)
    
    @scala.inline
    def setVm_version(value: String): Self = this.set("vm_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVm_version: Self = this.set("vm_version", js.undefined)
  }
}
