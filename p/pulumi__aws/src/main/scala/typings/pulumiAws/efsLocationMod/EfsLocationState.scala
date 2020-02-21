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
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val uri: js.UndefOr[Input[String]] = js.native
}

object EfsLocationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    ec2Config: Input[EfsLocationEc2Config] = null,
    efsFileSystemArn: Input[ARN] = null,
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    uri: Input[String] = null
  ): EfsLocationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (ec2Config != null) __obj.updateDynamic("ec2Config")(ec2Config.asInstanceOf[js.Any])
    if (efsFileSystemArn != null) __obj.updateDynamic("efsFileSystemArn")(efsFileSystemArn.asInstanceOf[js.Any])
    if (subdirectory != null) __obj.updateDynamic("subdirectory")(subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EfsLocationState]
  }
}

