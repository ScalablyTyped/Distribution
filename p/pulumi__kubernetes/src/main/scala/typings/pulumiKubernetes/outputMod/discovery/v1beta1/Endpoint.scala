package typings.pulumiKubernetes.outputMod.discovery.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Endpoint represents a single logical "backend" implementing a service.
  */
@js.native
trait Endpoint extends js.Object {
  /**
    * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
    */
  var addresses: js.Array[String] = js.native
  /**
    * conditions contains information about the current status of the endpoint.
    */
  var conditions: EndpointConditions = js.native
  /**
    * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
    */
  var hostname: String = js.native
  /**
    * targetRef is a reference to a Kubernetes object that represents this endpoint.
    */
  var targetRef: ObjectReference = js.native
  /**
    * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
    *   where the endpoint is located. This should match the corresponding
    *   node label.
    * * topology.kubernetes.io/zone: the value indicates the zone where the
    *   endpoint is located. This should match the corresponding node label.
    * * topology.kubernetes.io/region: the value indicates the region where the
    *   endpoint is located. This should match the corresponding node label.
    */
  var topology: StringDictionary[String] = js.native
}

object Endpoint {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    conditions: EndpointConditions,
    hostname: String,
    targetRef: ObjectReference,
    topology: StringDictionary[String]
  ): Endpoint = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditions(value: EndpointConditions): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetRef(value: ObjectReference): Self = this.set("targetRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopology(value: StringDictionary[String]): Self = this.set("topology", value.asInstanceOf[js.Any])
  }
  
}

