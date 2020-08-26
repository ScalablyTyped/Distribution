package typings.pulumiAws.accessPointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.efs.AccessPointPosixUser
import typings.pulumiAws.inputMod.efs.AccessPointRootDirectory
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointArgs extends js.Object {
  /**
    * The ID of the file system for which the access point is intended.
    */
  val fileSystemId: Input[String] = js.native
  /**
    * The operating system user and group applied to all file system requests made using the access point. See Posix User below.
    */
  val posixUser: js.UndefOr[Input[AccessPointPosixUser]] = js.native
  /**
    * Specifies the directory on the Amazon EFS file system that the access point provides access to. See Root Directory below.
    */
  val rootDirectory: js.UndefOr[Input[AccessPointRootDirectory]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object AccessPointArgs {
  @scala.inline
  def apply(fileSystemId: Input[String]): AccessPointArgs = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointArgs]
  }
  @scala.inline
  implicit class AccessPointArgsOps[Self <: AccessPointArgs] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: Input[String]): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosixUser(value: Input[AccessPointPosixUser]): Self = this.set("posixUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosixUser: Self = this.set("posixUser", js.undefined)
    @scala.inline
    def setRootDirectory(value: Input[AccessPointRootDirectory]): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDirectory: Self = this.set("rootDirectory", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

