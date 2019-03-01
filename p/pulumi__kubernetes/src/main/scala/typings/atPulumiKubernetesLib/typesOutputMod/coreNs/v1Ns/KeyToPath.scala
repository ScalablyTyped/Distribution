package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maps a string key to a path within a volume.
  */
trait KeyToPath extends js.Object {
  /**
    * The key to project.
    */
  val key: java.lang.String
  /**
    * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
    * specified, the volume defaultMode will be used. This might be in conflict with other
    * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  val mode: scala.Double
  /**
    * The relative path of the file to map the key to. May not be an absolute path. May not
    * contain the path element '..'. May not start with the string '..'.
    */
  val path: java.lang.String
}

object KeyToPath {
  @scala.inline
  def apply(key: java.lang.String, mode: scala.Double, path: java.lang.String): KeyToPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[KeyToPath]
  }
}

