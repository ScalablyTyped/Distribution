package typings.pulumiAws.getMountTargetMod

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
  @scala.inline
  implicit class GetMountTargetArgsOps[Self <: GetMountTargetArgs] (val x: Self) extends AnyVal {
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
    def setMountTargetId(value: String): Self = this.set("mountTargetId", value.asInstanceOf[js.Any])
  }
  
}

