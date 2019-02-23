package typings
package atPulumiAwsLib.datasyncEfsLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EfsLocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupArnsSubnetArn]
  ] = js.undefined
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
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
  val uri: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

