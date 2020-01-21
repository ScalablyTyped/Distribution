package typings.pulumiKubernetes.inputMod.discovery.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Endpoint represents a single logical "backend" implementing a service.
  */
trait Endpoint extends js.Object {
  /**
    * addresses of this endpoint. The contents of this field are interpreted according to the
    * corresponding EndpointSlice addressType field. Consumers must handle different types of
    * addresses in the context of their own capabilities. This must contain at least one address
    * but no more than 100.
    */
  var addresses: Input[js.Array[Input[String]]]
  /**
    * conditions contains information about the current status of the endpoint.
    */
  var conditions: js.UndefOr[Input[EndpointConditions]] = js.undefined
  /**
    * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish
    * endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same
    * hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label
    * (RFC 1123) validation.
    */
  var hostname: js.UndefOr[Input[String]] = js.undefined
  /**
    * targetRef is a reference to a Kubernetes object that represents this endpoint.
    */
  var targetRef: js.UndefOr[Input[ObjectReference]] = js.undefined
  /**
    * topology contains arbitrary topology information associated with the endpoint. These
    * key/value pairs must conform with the label format.
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may
    * include a maximum of 16 key/value pairs. This includes, but is not limited to the following
    * well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
    *   where the endpoint is located. This should match the corresponding
    *   node label.
    * * topology.kubernetes.io/zone: the value indicates the zone where the
    *   endpoint is located. This should match the corresponding node label.
    * * topology.kubernetes.io/region: the value indicates the region where the
    *   endpoint is located. This should match the corresponding node label.
    */
  var topology: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(
    addresses: Input[js.Array[Input[String]]],
    conditions: Input[EndpointConditions] = null,
    hostname: Input[String] = null,
    targetRef: Input[ObjectReference] = null,
    topology: Input[StringDictionary[Input[String]]] = null
  ): Endpoint = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (targetRef != null) __obj.updateDynamic("targetRef")(targetRef.asInstanceOf[js.Any])
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

