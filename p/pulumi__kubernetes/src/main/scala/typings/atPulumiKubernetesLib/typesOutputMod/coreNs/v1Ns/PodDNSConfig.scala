package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from
         * DNSPolicy.
         */

trait PodDNSConfig extends js.Object {
  /**
               * A list of DNS name server IP addresses. This will be appended to the base nameservers
               * generated from DNSPolicy. Duplicated nameservers will be removed.
               */
  val nameservers: js.Array[java.lang.String]
  /**
               * A list of DNS resolver options. This will be merged with the base options generated from
               * DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will
               * override those that appear in the base DNSPolicy.
               */
  val options: js.Array[PodDNSConfigOption]
  /**
               * A list of DNS search domains for host-name lookup. This will be appended to the base search
               * paths generated from DNSPolicy. Duplicated search paths will be removed.
               */
  val searches: js.Array[java.lang.String]
}

