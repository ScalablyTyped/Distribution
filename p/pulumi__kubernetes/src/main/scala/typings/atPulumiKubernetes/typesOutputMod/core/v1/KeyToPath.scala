package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val key: String
  /**
    * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
    * specified, the volume defaultMode will be used. This might be in conflict with other
    * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  val mode: Double
  /**
    * The relative path of the file to map the key to. May not be an absolute path. May not
    * contain the path element '..'. May not start with the string '..'.
    */
  val path: String
}

object KeyToPath {
  @scala.inline
  def apply(key: String, mode: Double, path: String): KeyToPath = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyToPath]
  }
}

