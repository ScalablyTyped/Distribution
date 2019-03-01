package typings
package atPulumiAwsLib.efsMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountTargetState extends js.Object {
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name of the file system.
    */
  val fileSystemArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the file system for which the mount target is intended.
    */
  val fileSystemId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The address (within the address range of the specified subnet) at
    * which the file system may be mounted via the mount target.
    */
  val ipAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of up to 5 VPC security group IDs (that must
    * be for the same VPC as subnet specified) in effect for the mount target.
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ID of the subnet to add the mount target in.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object MountTargetState {
  @scala.inline
  def apply(
    dnsName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    fileSystemArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    fileSystemId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    networkInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): MountTargetState = {
    val __obj = js.Dynamic.literal()
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (fileSystemArn != null) __obj.updateDynamic("fileSystemArn")(fileSystemArn.asInstanceOf[js.Any])
    if (fileSystemId != null) __obj.updateDynamic("fileSystemId")(fileSystemId.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetState]
  }
}

