package typings.pulumiAws.efsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.EfsLocationEc2Config
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EfsLocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: js.UndefOr[Input[EfsLocationEc2Config]] = js.native
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  val uri: js.UndefOr[Input[String]] = js.native
}

object EfsLocationState {
  @scala.inline
  def apply(): EfsLocationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EfsLocationState]
  }
  @scala.inline
  implicit class EfsLocationStateOps[Self <: EfsLocationState] (val x: Self) extends AnyVal {
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
    def setEc2Config(value: Input[EfsLocationEc2Config]): Self = this.set("ec2Config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2Config: Self = this.set("ec2Config", js.undefined)
    @scala.inline
    def setEfsFileSystemArn(value: Input[ARN]): Self = this.set("efsFileSystemArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEfsFileSystemArn: Self = this.set("efsFileSystemArn", js.undefined)
    @scala.inline
    def setSubdirectory(value: Input[String]): Self = this.set("subdirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdirectory: Self = this.set("subdirectory", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUri(value: Input[String]): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

