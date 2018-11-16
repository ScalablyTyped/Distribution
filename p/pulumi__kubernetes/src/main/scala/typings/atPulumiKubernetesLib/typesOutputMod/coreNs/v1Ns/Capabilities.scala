package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Adds and removes POSIX capabilities from running containers.
         */

trait Capabilities extends js.Object {
  /**
               * Added capabilities
               */
  val add: js.Array[java.lang.String]
  /**
               * Removed capabilities
               */
  val drop: js.Array[java.lang.String]
}

