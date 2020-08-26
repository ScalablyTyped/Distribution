package typings.pulumiAws.workspacesDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryArgs extends js.Object {
  /**
    * The directory identifier for registration in WorkSpaces service.
    */
  val directoryId: Input[String] = js.native
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  val selfServicePermissions: js.UndefOr[Input[DirectorySelfServicePermissions]] = js.native
  /**
    * The identifiers of the subnets where the directory resides.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags assigned to the WorkSpaces directory.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DirectoryArgs {
  @scala.inline
  def apply(directoryId: Input[String]): DirectoryArgs = {
    val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryArgs]
  }
  @scala.inline
  implicit class DirectoryArgsOps[Self <: DirectoryArgs] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: Input[String]): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfServicePermissions(value: Input[DirectorySelfServicePermissions]): Self = this.set("selfServicePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfServicePermissions: Self = this.set("selfServicePermissions", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

