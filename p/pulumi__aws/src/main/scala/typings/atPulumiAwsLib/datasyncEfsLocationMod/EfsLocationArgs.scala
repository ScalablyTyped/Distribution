package typings
package atPulumiAwsLib.datasyncEfsLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EfsLocationArgs extends js.Object {
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupArnsSubnetArn]
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}

object EfsLocationArgs {
  @scala.inline
  def apply(
    ec2Config: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupArnsSubnetArn],
    efsFileSystemArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN],
    subdirectory: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): EfsLocationArgs = {
    val __obj = js.Dynamic.literal(ec2Config = ec2Config.asInstanceOf[js.Any], efsFileSystemArn = efsFileSystemArn.asInstanceOf[js.Any])
    if (subdirectory != null) __obj.updateDynamic("subdirectory")(subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EfsLocationArgs]
  }
}

