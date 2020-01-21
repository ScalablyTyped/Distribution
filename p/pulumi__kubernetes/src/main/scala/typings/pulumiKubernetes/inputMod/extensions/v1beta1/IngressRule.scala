package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressRule represents the rules mapping the paths under a specified host to the related
  * backend services. Incoming requests are first evaluated for a host match, then routed to the
  * backend associated with the matching IngressRuleValue.
  */
trait IngressRule extends js.Object {
  /**
    * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the
    * following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not
    * allowed. Currently an IngressRuleValue can only apply to the
    * 	  IP in the Spec of the parent Ingress.
    * 2. The `:` delimiter is not respected because ports are not allowed.
    * 	  Currently the port of an Ingress is implicitly :80 for http and
    * 	  :443 for https.
    * Both these may change in the future. Incoming requests are matched against the host before
    * the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on
    * the specified IngressRuleValue.
    */
  var host: js.UndefOr[Input[String]] = js.undefined
  var http: js.UndefOr[Input[HTTPIngressRuleValue]] = js.undefined
}

object IngressRule {
  @scala.inline
  def apply(host: Input[String] = null, http: Input[HTTPIngressRuleValue] = null): IngressRule = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressRule]
  }
}

