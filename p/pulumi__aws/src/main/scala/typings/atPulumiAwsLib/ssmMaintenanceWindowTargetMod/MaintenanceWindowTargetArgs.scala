package typings
package atPulumiAwsLib.ssmMaintenanceWindowTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTargetArgs extends js.Object {
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of target being registered with the Maintenance Window. Possible values `INSTANCE`.
    */
  val resourceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=instanceid1,instanceid2. Tags are specified using Key=tag name,Values=tag value.
    */
  val targets: atPulumiPulumiLib.resourceMod.Input[
    js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ValuesKeyInput]]
  ]
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

