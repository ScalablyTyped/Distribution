package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressSpec describes the Ingress the user wishes to exist.
  */
trait IngressSpec extends StObject {
  
  /**
    * DefaultBackend is the backend that should handle requests that don't match any rule. If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
    */
  var defaultBackend: js.UndefOr[Input[IngressBackend]] = js.undefined
  
  /**
    * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
    */
  var ingressClassName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
    */
  var rules: js.UndefOr[Input[js.Array[Input[IngressRule]]]] = js.undefined
  
  /**
    * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
    */
  var tls: js.UndefOr[Input[js.Array[Input[IngressTLS]]]] = js.undefined
}
object IngressSpec {
  
  @scala.inline
  def apply(): IngressSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressSpec]
  }
  
  @scala.inline
  implicit class IngressSpecMutableBuilder[Self <: IngressSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultBackend(value: Input[IngressBackend]): Self = StObject.set(x, "defaultBackend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBackendUndefined: Self = StObject.set(x, "defaultBackend", js.undefined)
    
    @scala.inline
    def setIngressClassName(value: Input[String]): Self = StObject.set(x, "ingressClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressClassNameUndefined: Self = StObject.set(x, "ingressClassName", js.undefined)
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[IngressRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Input[IngressRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setTls(value: Input[js.Array[Input[IngressTLS]]]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    @scala.inline
    def setTlsVarargs(value: Input[IngressTLS]*): Self = StObject.set(x, "tls", js.Array(value :_*))
  }
}
