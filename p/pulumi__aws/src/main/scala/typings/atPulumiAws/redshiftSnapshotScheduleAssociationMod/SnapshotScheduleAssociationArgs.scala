package typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotScheduleAssociationArgs extends js.Object {
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Input[String]
  /**
    * The snapshot schedule identifier.
    */
  val scheduleIdentifier: Input[String]
}

object SnapshotScheduleAssociationArgs {
  @scala.inline
  def apply(clusterIdentifier: Input[String], scheduleIdentifier: Input[String]): SnapshotScheduleAssociationArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], scheduleIdentifier = scheduleIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotScheduleAssociationArgs]
  }
}

