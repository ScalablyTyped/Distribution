package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIGroup contains the name, the supported versions, and the preferred version of a group.
  */
trait APIGroup extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * name is the name of the group.
    */
  var name: Input[String]
  /**
    * preferredVersion is the version preferred by the API server, which probably is the storage
    * version.
    */
  var preferredVersion: js.UndefOr[Input[GroupVersionForDiscovery]] = js.undefined
  /**
    * a map of client CIDR to server address that is serving this group. This is to help clients
    * reach servers in the most network-efficient way possible. Clients can use the appropriate
    * server address as per the CIDR that they match. In case of multiple matches, clients should
    * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
    * client can match. For example: the master will return an internal IP CIDR only, if the
    * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
    * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
    */
  var serverAddressByClientCIDRs: js.UndefOr[Input[js.Array[Input[ServerAddressByClientCIDR]]]] = js.undefined
  /**
    * versions are the versions supported in this group.
    */
  var versions: Input[js.Array[Input[GroupVersionForDiscovery]]]
}

object APIGroup {
  @scala.inline
  def apply(
    name: Input[String],
    versions: Input[js.Array[Input[GroupVersionForDiscovery]]],
    apiVersion: Input[String] = null,
    kind: Input[String] = null,
    preferredVersion: Input[GroupVersionForDiscovery] = null,
    serverAddressByClientCIDRs: Input[js.Array[Input[ServerAddressByClientCIDR]]] = null
  ): APIGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (preferredVersion != null) __obj.updateDynamic("preferredVersion")(preferredVersion.asInstanceOf[js.Any])
    if (serverAddressByClientCIDRs != null) __obj.updateDynamic("serverAddressByClientCIDRs")(serverAddressByClientCIDRs.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGroup]
  }
}

