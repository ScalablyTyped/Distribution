package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maps a string key to a path within a volume.
  */
@js.native
trait KeyToPath extends js.Object {
  /**
    * The key to project.
    */
  var key: Input[String] = js.native
  /**
    * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Input[Double]] = js.native
  /**
    * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
    */
  var path: Input[String] = js.native
}

object KeyToPath {
  @scala.inline
  def apply(key: Input[String], path: Input[String]): KeyToPath = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyToPath]
  }
  @scala.inline
  implicit class KeyToPathOps[Self <: KeyToPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Input[Double]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

