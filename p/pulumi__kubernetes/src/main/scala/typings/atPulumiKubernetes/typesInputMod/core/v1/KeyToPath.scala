package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var key: Input[String]
  /**
    * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
    * specified, the volume defaultMode will be used. This might be in conflict with other
    * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The relative path of the file to map the key to. May not be an absolute path. May not
    * contain the path element '..'. May not start with the string '..'.
    */
  var path: Input[String]
}

object KeyToPath {
  @scala.inline
  def apply(key: Input[String], path: Input[String], mode: Input[Double] = null): KeyToPath = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyToPath]
  }
}

