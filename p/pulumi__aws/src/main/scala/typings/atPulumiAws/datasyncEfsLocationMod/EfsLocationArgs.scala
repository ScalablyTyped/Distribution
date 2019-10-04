package typings.atPulumiAws.datasyncEfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.typesInputMod.datasyncNs.EfsLocationEc2Config
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EfsLocationArgs extends js.Object {
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: Input[EfsLocationEc2Config]
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: Input[ARN]
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object EfsLocationArgs {
  @scala.inline
  def apply(
    ec2Config: Input[EfsLocationEc2Config],
    efsFileSystemArn: Input[ARN],
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null
  ): EfsLocationArgs = {
    val __obj = js.Dynamic.literal(ec2Config = ec2Config.asInstanceOf[js.Any], efsFileSystemArn = efsFileSystemArn.asInstanceOf[js.Any])
    if (subdirectory != null) __obj.updateDynamic("subdirectory")(subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EfsLocationArgs]
  }
}

