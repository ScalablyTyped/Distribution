package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServicePort contains information on service's port.
  */
trait ServicePort extends js.Object {
  /**
    * The application protocol for this port. This field follows standard Kubernetes label
    * syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and
    * http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed
    * names such as mycompany.com/my-custom-protocol. Field can be enabled with
    * ServiceAppProtocol feature gate.
    */
  var appProtocol: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of this port within the service. This must be a DNS_LABEL. All ports within a
    * ServiceSpec must have unique names. When considering the endpoints for a Service, this must
    * match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on
    * this service.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
    * Usually assigned by the system. If specified, it will be allocated to the service if unused
    * or else creation of the service will fail. Default is to auto-allocate a port if the
    * ServiceType of this Service requires one. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
    */
  var nodePort: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The port that will be exposed by this service.
    */
  var port: Input[Double]
  /**
    * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
  /**
    * Number or name of the port to access on the pods targeted by the service. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked
    * up as a named port in the target Pod's container ports. If this is not specified, the value
    * of the 'port' field is used (an identity map). This field is ignored for services with
    * clusterIP=None, and should be omitted or set equal to the 'port' field. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
    */
  var targetPort: js.UndefOr[Input[Double | String]] = js.undefined
}

object ServicePort {
  @scala.inline
  def apply(
    port: Input[Double],
    appProtocol: Input[String] = null,
    name: Input[String] = null,
    nodePort: Input[Double] = null,
    protocol: Input[String] = null,
    targetPort: Input[Double | String] = null
  ): ServicePort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (appProtocol != null) __obj.updateDynamic("appProtocol")(appProtocol.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodePort != null) __obj.updateDynamic("nodePort")(nodePort.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (targetPort != null) __obj.updateDynamic("targetPort")(targetPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePort]
  }
}

