package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressTLS describes the transport layer security associated with an Ingress.
  */
@js.native
trait IngressTLS extends js.Object {
  
  /**
    * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
    */
  var hosts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
    */
  var secretName: js.UndefOr[Input[String]] = js.native
}
object IngressTLS {
  
  @scala.inline
  def apply(): IngressTLS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressTLS]
  }
  
  @scala.inline
  implicit class IngressTLSOps[Self <: IngressTLS] (val x: Self) extends AnyVal {
    
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
    def setHostsVarargs(value: Input[String]*): Self = this.set("hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: Input[js.Array[Input[String]]]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setSecretName(value: Input[String]): Self = this.set("secretName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretName: Self = this.set("secretName", js.undefined)
  }
}
