package typings.pulumiAws.transferUserMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserArgs extends js.Object {
  /**
    * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
    */
  val homeDirectory: js.UndefOr[Input[String]] = js.native
  /**
    * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
    */
  val role: Input[String] = js.native
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: Input[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The name used for log in to your SFTP server.
    */
  val userName: Input[String] = js.native
}

object UserArgs {
  @scala.inline
  def apply(role: Input[String], serverId: Input[String], userName: Input[String]): UserArgs = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
  @scala.inline
  implicit class UserArgsOps[Self <: UserArgs] (val x: Self) extends AnyVal {
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
    def setRole(value: Input[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerId(value: Input[String]): Self = this.set("serverId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: Input[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomeDirectory(value: Input[String]): Self = this.set("homeDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeDirectory: Self = this.set("homeDirectory", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

