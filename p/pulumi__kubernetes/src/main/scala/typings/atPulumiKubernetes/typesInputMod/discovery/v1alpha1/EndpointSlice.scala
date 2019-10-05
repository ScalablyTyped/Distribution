package typings.atPulumiKubernetes.typesInputMod.discovery.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`discoveryDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object EndpointSlice {
  @scala.inline
  def apply(
    endpoints: Input[js.Array[Input[Endpoint]]],
    addressType: Input[String] = null,
    apiVersion: Input[`discoveryDOTk8sDOTio/v1alpha1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.EndpointSlice] = null,
    metadata: Input[ObjectMeta] = null,
    ports: Input[js.Array[Input[EndpointPort]]] = null
  ): EndpointSlice = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
    if (addressType != null) __obj.updateDynamic("addressType")(addressType.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSlice]
  }
}

