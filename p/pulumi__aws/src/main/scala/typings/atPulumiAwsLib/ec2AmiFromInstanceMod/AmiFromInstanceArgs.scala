package typings
package atPulumiAwsLib.ec2AmiFromInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiFromInstanceArgs extends js.Object {
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIops]
      ]
    ]
  ] = js.undefined
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeviceNameVirtualNameInput]
      ]
    ]
  ] = js.undefined
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

