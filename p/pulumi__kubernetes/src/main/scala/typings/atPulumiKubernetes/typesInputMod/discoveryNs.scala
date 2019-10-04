package typings.atPulumiKubernetes.typesInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`discoveryDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.ObjectReference
import typings.atPulumiKubernetes.typesInputMod.discoveryNs.v1alpha1Ns.Endpoint
import typings.atPulumiKubernetes.typesInputMod.discoveryNs.v1alpha1Ns.EndpointConditions
import typings.atPulumiKubernetes.typesInputMod.discoveryNs.v1alpha1Ns.EndpointPort
import typings.atPulumiKubernetes.typesInputMod.discoveryNs.v1alpha1Ns.EndpointSlice
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "discovery")
@js.native
object discoveryNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
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
    
    /**
      * EndpointConditions represents the current condition of an endpoint.
      */
    trait EndpointConditions extends js.Object {
      /**
        * ready indicates that this endpoint is prepared to receive traffic, according to whatever
        * system is managing the endpoint. A nil value indicates an unknown state. In most cases
        * consumers should interpret this unknown state as ready.
        */
      var ready: js.UndefOr[Input[Boolean]] = js.undefined
    }
    
    /**
      * EndpointPort represents a Port used by an EndpointSlice
      */
    trait EndpointPort extends js.Object {
      /**
        * The name of this port. All ports in an EndpointSlice must have a unique name. If the
        * EndpointSlice is dervied from a Kubernetes service, this corresponds to the
        * Service.ports[].name. Name must either be an empty string or pass IANA_SVC_NAME validation:
        * * must be no more than 15 characters long * may contain only [-a-z0-9] * must contain at
        * least one letter [a-z] * it must not start or end with a hyphen, nor contain adjacent
        * hyphens Default is empty string.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      /**
        * The port number of the endpoint. If this is not specified, ports are not restricted and
        * must be interpreted in the context of the specific consumer.
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
        */
      var protocol: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * EndpointSlice represents a subset of the endpoints that implement a service. For a given
      * service there may be multiple EndpointSlice objects, selected by labels, which must be joined
      * to produce the full set of endpoints.
      */
    trait EndpointSlice extends js.Object {
      /**
        * addressType specifies the type of address carried by this EndpointSlice. All addresses in
        * this slice must be the same type. Default is IP
        */
      var addressType: js.UndefOr[Input[String]] = js.undefined
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`discoveryDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of
        * 1000 endpoints.
        */
      var endpoints: Input[js.Array[Input[Endpoint]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.EndpointSlice]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * ports specifies the list of network ports exposed by each endpoint in this slice. Each port
        * must have a unique name. When ports is empty, it indicates that there are no defined ports.
        * When a port is defined with a nil port value, it indicates "all ports". Each slice may
        * include a maximum of 100 ports.
        */
      var ports: js.UndefOr[Input[js.Array[Input[EndpointPort]]]] = js.undefined
    }
    
    /**
      * EndpointSliceList represents a list of endpoint slices
      */
    trait EndpointSliceList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`discoveryDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * List of endpoint slices
        */
      var items: Input[js.Array[Input[EndpointSlice]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.EndpointSliceList]] = js.undefined
      /**
        * Standard list metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    def isEndpointSlice(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.discovery.v1alpha1.EndpointSlice */ Boolean = js.native
    def isEndpointSliceList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.discovery.v1alpha1.EndpointSliceList */ Boolean = js.native
  }
  
}

