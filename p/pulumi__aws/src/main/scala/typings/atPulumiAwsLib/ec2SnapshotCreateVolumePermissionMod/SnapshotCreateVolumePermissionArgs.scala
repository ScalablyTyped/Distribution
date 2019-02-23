package typings
package atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreateVolumePermissionArgs extends js.Object {
  /**
    * An AWS Account ID to add create volume permissions
    */
  val accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A snapshot ID
    */
  val snapshotId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

