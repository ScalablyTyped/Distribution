package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

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
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  /**
               * name is the name of the group.
               */
  val name: java.lang.String
  /**
               * preferredVersion is the version preferred by the API server, which probably is the storage
               * version.
               */
  val preferredVersion: GroupVersionForDiscovery
  /**
               * a map of client CIDR to server address that is serving this group. This is to help clients
               * reach servers in the most network-efficient way possible. Clients can use the appropriate
               * server address as per the CIDR that they match. In case of multiple matches, clients should
               * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
               * client can match. For example: the master will return an internal IP CIDR only, if the
               * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
               * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
               */
  val serverAddressByClientCIDRs: js.Array[ServerAddressByClientCIDR]
  /**
               * versions are the versions supported in this group.
               */
  val versions: js.Array[GroupVersionForDiscovery]
}

