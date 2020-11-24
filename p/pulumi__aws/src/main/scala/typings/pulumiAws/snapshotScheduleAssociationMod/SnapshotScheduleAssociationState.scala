package typings.pulumiAws.snapshotScheduleAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotScheduleAssociationState extends js.Object {
  
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The snapshot schedule identifier.
    */
  val scheduleIdentifier: js.UndefOr[Input[String]] = js.native
}
object SnapshotScheduleAssociationState {
  
  @scala.inline
  def apply(): SnapshotScheduleAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotScheduleAssociationState]
  }
  
  @scala.inline
  implicit class SnapshotScheduleAssociationStateOps[Self <: SnapshotScheduleAssociationState] (val x: Self) extends AnyVal {
    
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
    def deleteClusterIdentifier: Self = this.set("clusterIdentifier", js.undefined)
    
    @scala.inline
    def setScheduleIdentifier(value: Input[String]): Self = this.set("scheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleIdentifier: Self = this.set("scheduleIdentifier", js.undefined)
  }
}
