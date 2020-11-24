package typings.pulumiAws.fileSystemPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemPolicyArgs extends js.Object {
  
  /**
    * The ID of the EFS file system.
    */
  val fileSystemId: Input[String] = js.native
  
  /**
    * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
    */
  val policy: Input[String] = js.native
}
object FileSystemPolicyArgs {
  
  @scala.inline
  def apply(fileSystemId: Input[String], policy: Input[String]): FileSystemPolicyArgs = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPolicyArgs]
  }
  
  @scala.inline
  implicit class FileSystemPolicyArgsOps[Self <: FileSystemPolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
}
