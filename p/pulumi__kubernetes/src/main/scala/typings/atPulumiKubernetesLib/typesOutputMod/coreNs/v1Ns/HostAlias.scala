package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the
         * pod's hosts file.
         */

trait HostAlias extends js.Object {
  /**
               * Hostnames for the above IP address.
               */
  val hostnames: js.Array[java.lang.String]
  /**
               * IP address of the host file entry.
               */
  val ip: java.lang.String
}

