package typings.pulumiKubernetes.outputMod.discovery.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
  */
@js.native
trait EndpointSlice extends js.Object {
  
  /**
    * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
    */
  var addressType: String = js.native
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: discoveryDotk8sDotioSlashv1beta1 = js.native
  
  /**
    * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
    */
  var endpoints: js.Array[Endpoint] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice = js.native
  
  /**
    * Standard object's metadata.
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
    */
  var ports: js.Array[EndpointPort] = js.native
}
object EndpointSlice {
  
  @scala.inline
  def apply(
    addressType: String,
    apiVersion: discoveryDotk8sDotioSlashv1beta1,
    endpoints: js.Array[Endpoint],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice,
    metadata: ObjectMeta,
    ports: js.Array[EndpointPort]
  ): EndpointSlice = {
    val __obj = js.Dynamic.literal(addressType = addressType.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSlice]
  }
  
  @scala.inline
  implicit class EndpointSliceOps[Self <: EndpointSlice] (val x: Self) extends AnyVal {
    
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
    def setAddressType(value: String): Self = this.set("addressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: discoveryDotk8sDotioSlashv1beta1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[Endpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: EndpointPort*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[EndpointPort]): Self = this.set("ports", value.asInstanceOf[js.Any])
  }
}
