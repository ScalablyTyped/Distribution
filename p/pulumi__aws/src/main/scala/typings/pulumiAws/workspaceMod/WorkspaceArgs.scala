package typings.pulumiAws.workspaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.WorkspaceWorkspaceProperties
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceArgs extends js.Object {
  /**
    * The ID of the bundle for the WorkSpace.
    */
  val bundleId: Input[String] = js.native
  /**
    * The ID of the directory for the WorkSpace.
    */
  val directoryId: Input[String] = js.native
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  val rootVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The tags for the WorkSpace.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
    */
  val userName: Input[String] = js.native
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  val userVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  val volumeEncryptionKey: js.UndefOr[Input[String]] = js.native
  /**
    * The WorkSpace properties.
    */
  val workspaceProperties: js.UndefOr[Input[WorkspaceWorkspaceProperties]] = js.native
}

object WorkspaceArgs {
  @scala.inline
  def apply(bundleId: Input[String], directoryId: Input[String], userName: Input[String]): WorkspaceArgs = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceArgs]
  }
  @scala.inline
  implicit class WorkspaceArgsOps[Self <: WorkspaceArgs] (val x: Self) extends AnyVal {
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
    def setBundleId(value: Input[String]): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryId(value: Input[String]): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: Input[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootVolumeEncryptionEnabled(value: Input[Boolean]): Self = this.set("rootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootVolumeEncryptionEnabled: Self = this.set("rootVolumeEncryptionEnabled", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUserVolumeEncryptionEnabled(value: Input[Boolean]): Self = this.set("userVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVolumeEncryptionEnabled: Self = this.set("userVolumeEncryptionEnabled", js.undefined)
    @scala.inline
    def setVolumeEncryptionKey(value: Input[String]): Self = this.set("volumeEncryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeEncryptionKey: Self = this.set("volumeEncryptionKey", js.undefined)
    @scala.inline
    def setWorkspaceProperties(value: Input[WorkspaceWorkspaceProperties]): Self = this.set("workspaceProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceProperties: Self = this.set("workspaceProperties", js.undefined)
  }
  
}

