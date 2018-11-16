package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Local represents directly-attached storage with node affinity
         */

trait LocalVolumeSource extends js.Object {
  /**
               * The full path to the volume on the node For alpha, this path must be a directory Once block
               * as a source is supported, then this path can point to a block device
               */
  val path: java.lang.String
}

