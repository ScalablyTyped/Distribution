package typings.atPulumiAws.efsGetMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMountTargetArgs extends js.Object {
  /**
    * ID of the mount target that you want to have described
    */
  val mountTargetId: String = js.native
}

object GetMountTargetArgs {
  @scala.inline
  def apply(mountTargetId: String): GetMountTargetArgs = {
    val __obj = js.Dynamic.literal(mountTargetId = mountTargetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMountTargetArgs]
  }
}

