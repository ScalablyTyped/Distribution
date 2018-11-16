package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API
         * volumes support ownership management and SELinux relabeling.
         */

trait DownwardAPIVolumeSource extends js.Object {
  /**
               * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
               * Defaults to 0644. Directories within the path are not affected by this setting. This might
               * be in conflict with other options that affect the file mode, like fsGroup, and the result
               * can be other mode bits set.
               */
  val defaultMode: scala.Double
  /**
               * Items is a list of downward API volume file
               */
  val items: js.Array[DownwardAPIVolumeFile]
}

