package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var nameservers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
    */
  var options: js.UndefOr[Input[js.Array[Input[PodDNSConfigOption]]]] = js.undefined
  
  /**
    * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
    */
  var searches: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object PodDNSConfig {
  
  @scala.inline
  def apply(): PodDNSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDNSConfig]
  }
  
  @scala.inline
  implicit class PodDNSConfigMutableBuilder[Self <: PodDNSConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameservers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nameservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameserversUndefined: Self = StObject.set(x, "nameservers", js.undefined)
    
    @scala.inline
    def setNameserversVarargs(value: Input[String]*): Self = StObject.set(x, "nameservers", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: Input[js.Array[Input[PodDNSConfigOption]]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Input[PodDNSConfigOption]*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSearches(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchesUndefined: Self = StObject.set(x, "searches", js.undefined)
    
    @scala.inline
    def setSearchesVarargs(value: Input[String]*): Self = StObject.set(x, "searches", js.Array(value :_*))
  }
}
