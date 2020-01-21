package typings.pulumiKubernetes.inputMod.networking.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressSpec describes the Ingress the user wishes to exist.
  */
trait IngressSpec extends js.Object {
  /**
    * A default backend capable of servicing requests that don't match any rule. At least one of
    * 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer
    * controller or defaulting logic to specify a global default.
    */
  var backend: js.UndefOr[Input[IngressBackend]] = js.undefined
  /**
    * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all
    * traffic is sent to the default backend.
    */
  var rules: js.UndefOr[Input[js.Array[Input[IngressRule]]]] = js.undefined
  /**
    * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple
    * members of this list specify different hosts, they will be multiplexed on the same port
    * according to the hostname specified through the SNI TLS extension, if the ingress
    * controller fulfilling the ingress supports SNI.
    */
  var tls: js.UndefOr[Input[js.Array[Input[IngressTLS]]]] = js.undefined
}

object IngressSpec {
  @scala.inline
  def apply(
    backend: Input[IngressBackend] = null,
    rules: Input[js.Array[Input[IngressRule]]] = null,
    tls: Input[js.Array[Input[IngressTLS]]] = null
  ): IngressSpec = {
    val __obj = js.Dynamic.literal()
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressSpec]
  }
}

