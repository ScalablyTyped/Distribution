package typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotScheduleAssociationState extends js.Object {
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The snapshot schedule identifier.
    */
  val scheduleIdentifier: js.UndefOr[Input[String]] = js.undefined
}

object SnapshotScheduleAssociationState {
  @scala.inline
  def apply(clusterIdentifier: Input[String] = null, scheduleIdentifier: Input[String] = null): SnapshotScheduleAssociationState = {
    val __obj = js.Dynamic.literal()
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (scheduleIdentifier != null) __obj.updateDynamic("scheduleIdentifier")(scheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotScheduleAssociationState]
  }
}

