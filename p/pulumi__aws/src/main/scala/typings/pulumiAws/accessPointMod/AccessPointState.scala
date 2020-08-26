package typings.pulumiAws.accessPointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.efs.AccessPointPosixUser
import typings.pulumiAws.inputMod.efs.AccessPointRootDirectory
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointState extends js.Object {
  /**
    * Amazon Resource Name of the access point.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name of the file system.
    */
  val fileSystemArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the file system for which the access point is intended.
    */
  val fileSystemId: js.UndefOr[Input[String]] = js.native
  val ownerId: js.UndefOr[Input[String]] = js.native
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

object AccessPointState {
  @scala.inline
  def apply(): AccessPointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointState]
  }
  @scala.inline
  implicit class AccessPointStateOps[Self <: AccessPointState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setFileSystemArn(value: Input[String]): Self = this.set("fileSystemArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemArn: Self = this.set("fileSystemArn", js.undefined)
    @scala.inline
    def setFileSystemId(value: Input[String]): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemId: Self = this.set("fileSystemId", js.undefined)
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
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

