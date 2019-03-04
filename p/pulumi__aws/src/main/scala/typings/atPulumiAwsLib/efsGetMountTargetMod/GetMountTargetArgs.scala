package typings
package atPulumiAwsLib.efsGetMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMountTargetArgs extends js.Object {
  /**
    * ID of the mount target that you want to have described
    */
  val mountTargetId: java.lang.String
}

object GetMountTargetArgs {
  @scala.inline
  def apply(mountTargetId: java.lang.String): GetMountTargetArgs = {
    val __obj = js.Dynamic.literal(mountTargetId = mountTargetId)
  
    __obj.asInstanceOf[GetMountTargetArgs]
  }
}

