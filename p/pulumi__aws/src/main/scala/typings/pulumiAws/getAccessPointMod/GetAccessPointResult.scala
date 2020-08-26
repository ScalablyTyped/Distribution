package typings.pulumiAws.getAccessPointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.GetAccessPointPosixUser
import typings.pulumiAws.outputMod.efs.GetAccessPointRootDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointResult extends js.Object {
  val accessPointId: String = js.native
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: String = js.native
  /**
    * Amazon Resource Name of the file system.
    */
  val fileSystemArn: String = js.native
  /**
    * The ID of the file system for which the access point is intended.
    */
  val fileSystemId: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val ownerId: String = js.native
  /**
    * Single element list containing operating system user and group applied to all file system requests made using the access point.
    */
  val posixUsers: js.Array[GetAccessPointPosixUser] = js.native
  val rootDirectories: js.Array[GetAccessPointRootDirectory] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetAccessPointResult {
  @scala.inline
  def apply(
    accessPointId: String,
    arn: String,
    fileSystemArn: String,
    fileSystemId: String,
    id: String,
    ownerId: String,
    posixUsers: js.Array[GetAccessPointPosixUser],
    rootDirectories: js.Array[GetAccessPointRootDirectory]
  ): GetAccessPointResult = {
    val __obj = js.Dynamic.literal(accessPointId = accessPointId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], fileSystemArn = fileSystemArn.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], posixUsers = posixUsers.asInstanceOf[js.Any], rootDirectories = rootDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointResult]
  }
  @scala.inline
  implicit class GetAccessPointResultOps[Self <: GetAccessPointResult] (val x: Self) extends AnyVal {
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
    def setAccessPointId(value: String): Self = this.set("accessPointId", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystemArn(value: String): Self = this.set("fileSystemArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosixUsersVarargs(value: GetAccessPointPosixUser*): Self = this.set("posixUsers", js.Array(value :_*))
    @scala.inline
    def setPosixUsers(value: js.Array[GetAccessPointPosixUser]): Self = this.set("posixUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDirectoriesVarargs(value: GetAccessPointRootDirectory*): Self = this.set("rootDirectories", js.Array(value :_*))
    @scala.inline
    def setRootDirectories(value: js.Array[GetAccessPointRootDirectory]): Self = this.set("rootDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

