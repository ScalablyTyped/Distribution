package typings.pulumiAws.inputMod.lambda

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionFileSystemConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
    */
  var arn: Input[String] = js.native
  /**
    * The path where the function can access the file system, starting with /mnt/.
    */
  var localMountPath: Input[String] = js.native
}

object FunctionFileSystemConfig {
  @scala.inline
  def apply(arn: Input[String], localMountPath: Input[String]): FunctionFileSystemConfig = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], localMountPath = localMountPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionFileSystemConfig]
  }
  @scala.inline
  implicit class FunctionFileSystemConfigOps[Self <: FunctionFileSystemConfig] (val x: Self) extends AnyVal {
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
    def setLocalMountPath(value: Input[String]): Self = this.set("localMountPath", value.asInstanceOf[js.Any])
  }
  
}

