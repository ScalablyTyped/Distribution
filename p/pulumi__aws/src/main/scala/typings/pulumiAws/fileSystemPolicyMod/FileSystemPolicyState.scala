package typings.pulumiAws.fileSystemPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemPolicyState extends js.Object {
  /**
    * The ID of the EFS file system.
    */
  val fileSystemId: js.UndefOr[Input[String]] = js.native
  /**
    * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
    */
  val policy: js.UndefOr[Input[String]] = js.native
}

object FileSystemPolicyState {
  @scala.inline
  def apply(): FileSystemPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemPolicyState]
  }
  @scala.inline
  implicit class FileSystemPolicyStateOps[Self <: FileSystemPolicyState] (val x: Self) extends AnyVal {
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
    def deleteFileSystemId: Self = this.set("fileSystemId", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

