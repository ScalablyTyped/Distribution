package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIVersions lists the versions that are available, to allow clients to discover the API at
  * /api, which is the root path of the legacy v1 API.
  */
trait APIVersions extends js.Object {
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
    * a map of client CIDR to server address that is serving this group. This is to help clients
    * reach servers in the most network-efficient way possible. Clients can use the appropriate
    * server address as per the CIDR that they match. In case of multiple matches, clients should
    * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
    * client can match. For example: the master will return an internal IP CIDR only, if the
    * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
    * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
    */
  var serverAddressByClientCIDRs: Input[js.Array[Input[ServerAddressByClientCIDR]]]
  /**
    * versions are the api versions that are available.
    */
  var versions: Input[js.Array[Input[String]]]
}

object APIVersions {
  @scala.inline
  def apply(
    serverAddressByClientCIDRs: Input[js.Array[Input[ServerAddressByClientCIDR]]],
    versions: Input[js.Array[Input[String]]],
    apiVersion: Input[String] = null,
    kind: Input[String] = null
  ): APIVersions = {
    val __obj = js.Dynamic.literal(serverAddressByClientCIDRs = serverAddressByClientCIDRs.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIVersions]
  }
}

