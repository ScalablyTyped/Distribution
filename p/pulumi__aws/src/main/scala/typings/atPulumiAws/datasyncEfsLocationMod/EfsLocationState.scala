package typings.atPulumiAws.datasyncEfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.typesInputMod.datasync.EfsLocationEc2Config
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EfsLocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: js.UndefOr[Input[EfsLocationEc2Config]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: js.UndefOr[Input[ARN]] = js.undefined
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  val uri: js.UndefOr[Input[String]] = js.undefined
}

object EfsLocationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    ec2Config: Input[EfsLocationEc2Config] = null,
    efsFileSystemArn: Input[ARN] = null,
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null,
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

