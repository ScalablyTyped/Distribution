package typings.pulumiAws.snapshotScheduleAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotScheduleAssociationArgs extends js.Object {
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Input[String] = js.native
  /**
    * The snapshot schedule identifier.
    */
  val scheduleIdentifier: Input[String] = js.native
}

object SnapshotScheduleAssociationArgs {
  @scala.inline
  def apply(clusterIdentifier: Input[String], scheduleIdentifier: Input[String]): SnapshotScheduleAssociationArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], scheduleIdentifier = scheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotScheduleAssociationArgs]
  }
  @scala.inline
  implicit class SnapshotScheduleAssociationArgsOps[Self <: SnapshotScheduleAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterIdentifier(value: Input[String]): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduleIdentifier(value: Input[String]): Self = this.set("scheduleIdentifier", value.asInstanceOf[js.Any])
  }
  
}

