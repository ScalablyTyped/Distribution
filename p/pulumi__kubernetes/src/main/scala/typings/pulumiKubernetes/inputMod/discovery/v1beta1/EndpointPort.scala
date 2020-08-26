package typings.pulumiKubernetes.inputMod.discovery.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointPort represents a Port used by an EndpointSlice
  */
@js.native
trait EndpointPort extends js.Object {
  /**
    * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
    */
  var appProtocol: js.UndefOr[Input[String]] = js.native
  /**
    * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
    */
  var port: js.UndefOr[Input[Double]] = js.native
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.native
}

object EndpointPort {
  @scala.inline
  def apply(): EndpointPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointPort]
  }
  @scala.inline
  implicit class EndpointPortOps[Self <: EndpointPort] (val x: Self) extends AnyVal {
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
    def setAppProtocol(value: Input[String]): Self = this.set("appProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppProtocol: Self = this.set("appProtocol", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

