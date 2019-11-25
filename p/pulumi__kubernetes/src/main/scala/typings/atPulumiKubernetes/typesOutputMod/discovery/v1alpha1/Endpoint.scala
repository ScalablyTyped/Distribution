package typings.atPulumiKubernetes.typesOutputMod.discovery.v1alpha1

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.typesOutputMod.core.v1.ObjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Endpoint represents a single logical "backend" implementing a service.
  */
trait Endpoint extends js.Object {
  /**
    * addresses of this endpoint. The contents of this field are interpreted according to the
    * corresponding EndpointSlice addressType field. This allows for cases like dual-stack (IPv4
    * and IPv6) networking. Consumers (e.g. kube-proxy) must handle different types of addresses
    * in the context of their own capabilities. This must contain at least one address but no
    * more than 100.
    */
  val addresses: js.Array[String]
  /**
    * conditions contains information about the current status of the endpoint.
    */
  val conditions: EndpointConditions
  /**
    * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish
    * endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same
    * hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label
    * (RFC 1123) validation.
    */
  val hostname: String
  /**
    * targetRef is a reference to a Kubernetes object that represents this endpoint.
    */
  val targetRef: ObjectReference
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
  val topology: StringDictionary[String]
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
}

