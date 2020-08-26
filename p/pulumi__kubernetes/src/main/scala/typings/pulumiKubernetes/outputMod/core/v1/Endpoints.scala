package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Endpoints is a collection of endpoints that implement the actual service. Example:
  *   Name: "mysvc",
  *   Subsets: [
  *     {
  *       Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
  *       Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
  *     },
  *     {
  *       Addresses: [{"ip": "10.10.3.3"}],
  *       Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
  *     },
  *  ]
  */
@js.native
trait Endpoints extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Endpoints = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  /**
    * The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
    */
  var subsets: js.Array[EndpointSubset] = js.native
}

object Endpoints {
  @scala.inline
  def apply(
    apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Endpoints,
    metadata: ObjectMeta,
    subsets: js.Array[EndpointSubset]
  ): Endpoints = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], subsets = subsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoints]
  }
  @scala.inline
  implicit class EndpointsOps[Self <: Endpoints] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: typings.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Endpoints): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubsetsVarargs(value: EndpointSubset*): Self = this.set("subsets", js.Array(value :_*))
    @scala.inline
    def setSubsets(value: js.Array[EndpointSubset]): Self = this.set("subsets", value.asInstanceOf[js.Any])
  }
  
}

