package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
  */
trait PodDNSConfig extends StObject {
  
  /**
    * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
    */
  var nameservers: js.Array[String]
  
  /**
    * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
    */
  var options: js.Array[PodDNSConfigOption]
  
  /**
    * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
    */
  var searches: js.Array[String]
}
object PodDNSConfig {
  
  @scala.inline
  def apply(nameservers: js.Array[String], options: js.Array[PodDNSConfigOption], searches: js.Array[String]): PodDNSConfig = {
    val __obj = js.Dynamic.literal(nameservers = nameservers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], searches = searches.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDNSConfig]
  }
  
  @scala.inline
  implicit class PodDNSConfigMutableBuilder[Self <: PodDNSConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameservers(value: js.Array[String]): Self = StObject.set(x, "nameservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameserversVarargs(value: String*): Self = StObject.set(x, "nameservers", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[PodDNSConfigOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: PodDNSConfigOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSearches(value: js.Array[String]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchesVarargs(value: String*): Self = StObject.set(x, "searches", js.Array(value :_*))
  }
}
