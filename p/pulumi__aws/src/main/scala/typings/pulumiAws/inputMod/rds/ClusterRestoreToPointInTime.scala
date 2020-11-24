package typings.pulumiAws.inputMod.rds

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterRestoreToPointInTime extends js.Object {
  
  /**
    * Date and time in UTC format to restore the database cluster to. Conflicts with `useLatestRestorableTime`.
    */
  var restoreToTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * Type of restore to be performed.
    * Valid options are `full-copy` (default) and `copy-on-write`.
    */
  var restoreType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The identifier of the source database cluster from which to restore.
    */
  var sourceClusterIdentifier: Input[String] = js.native
  
  /**
    * Set to true to restore the database cluster to the latest restorable backup time. Defaults to false. Conflicts with `restoreToTime`.
    */
  var useLatestRestorableTime: js.UndefOr[Input[Boolean]] = js.native
}
object ClusterRestoreToPointInTime {
  
  @scala.inline
  def apply(sourceClusterIdentifier: Input[String]): ClusterRestoreToPointInTime = {
    val __obj = js.Dynamic.literal(sourceClusterIdentifier = sourceClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRestoreToPointInTime]
  }
  
  @scala.inline
  implicit class ClusterRestoreToPointInTimeOps[Self <: ClusterRestoreToPointInTime] (val x: Self) extends AnyVal {
    
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
    def setSourceClusterIdentifier(value: Input[String]): Self = this.set("sourceClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreToTime(value: Input[String]): Self = this.set("restoreToTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreToTime: Self = this.set("restoreToTime", js.undefined)
    
    @scala.inline
    def setRestoreType(value: Input[String]): Self = this.set("restoreType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreType: Self = this.set("restoreType", js.undefined)
    
    @scala.inline
    def setUseLatestRestorableTime(value: Input[Boolean]): Self = this.set("useLatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLatestRestorableTime: Self = this.set("useLatestRestorableTime", js.undefined)
  }
}
