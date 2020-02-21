package typings.pulumiAws.efsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.EfsLocationEc2Config
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EfsLocationArgs extends js.Object {
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: Input[EfsLocationEc2Config] = js.native
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: Input[ARN] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object EfsLocationArgs {
  @scala.inline
  def apply(
    ec2Config: Input[EfsLocationEc2Config],
    efsFileSystemArn: Input[ARN],
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): EfsLocationArgs = {
    val __obj = js.Dynamic.literal(ec2Config = ec2Config.asInstanceOf[js.Any], efsFileSystemArn = efsFileSystemArn.asInstanceOf[js.Any])
    if (subdirectory != null) __obj.updateDynamic("subdirectory")(subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EfsLocationArgs]
  }
}

