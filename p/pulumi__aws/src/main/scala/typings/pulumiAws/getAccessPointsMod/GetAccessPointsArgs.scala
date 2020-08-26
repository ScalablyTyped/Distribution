package typings.pulumiAws.getAccessPointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointsArgs extends js.Object {
  /**
    * EFS File System identifier.
    */
  val fileSystemId: String = js.native
}

object GetAccessPointsArgs {
  @scala.inline
  def apply(fileSystemId: String): GetAccessPointsArgs = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointsArgs]
  }
  @scala.inline
  implicit class GetAccessPointsArgsOps[Self <: GetAccessPointsArgs] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
  }
  
}

