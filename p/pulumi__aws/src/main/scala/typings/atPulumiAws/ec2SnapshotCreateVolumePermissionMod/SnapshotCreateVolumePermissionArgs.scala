package typings.atPulumiAws.ec2SnapshotCreateVolumePermissionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreateVolumePermissionArgs extends js.Object {
  /**
    * An AWS Account ID to add create volume permissions
    */
  val accountId: Input[String]
  /**
    * A snapshot ID
    */
  val snapshotId: Input[String]
}

object SnapshotCreateVolumePermissionArgs {
  @scala.inline
  def apply(accountId: Input[String], snapshotId: Input[String]): SnapshotCreateVolumePermissionArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotCreateVolumePermissionArgs]
  }
}

