package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceRestoreToPointInTime extends js.Object {
  
  /**
    * The date and time to restore from. Value must be a time in Universal Coordinated Time (UTC) format and must be before the latest restorable time for the DB instance. Cannot be specified with `useLatestRestorableTime`.
    */
  var restoreTime: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the source DB instance from which to restore. Must match the identifier of an existing DB instance. Required if `sourceDbiResourceId` is not specified.
    */
  var sourceDbInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The resource ID of the source DB instance from which to restore. Required if `sourceDbInstanceIdentifier` is not specified.
    */
  var sourceDbiResourceId: js.UndefOr[String] = js.native
  
  /**
    * A boolean value that indicates whether the DB instance is restored from the latest backup time. Defaults to `false`. Cannot be specified with `restoreTime`.
    */
  var useLatestRestorableTime: js.UndefOr[Boolean] = js.native
}
object InstanceRestoreToPointInTime {
  
  @scala.inline
  def apply(): InstanceRestoreToPointInTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRestoreToPointInTime]
  }
  
  @scala.inline
  implicit class InstanceRestoreToPointInTimeOps[Self <: InstanceRestoreToPointInTime] (val x: Self) extends AnyVal {
    
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
    def setRestoreTime(value: String): Self = this.set("restoreTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreTime: Self = this.set("restoreTime", js.undefined)
    
    @scala.inline
    def setSourceDbInstanceIdentifier(value: String): Self = this.set("sourceDbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDbInstanceIdentifier: Self = this.set("sourceDbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setSourceDbiResourceId(value: String): Self = this.set("sourceDbiResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDbiResourceId: Self = this.set("sourceDbiResourceId", js.undefined)
    
    @scala.inline
    def setUseLatestRestorableTime(value: Boolean): Self = this.set("useLatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLatestRestorableTime: Self = this.set("useLatestRestorableTime", js.undefined)
  }
}
