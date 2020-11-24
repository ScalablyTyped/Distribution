package typings.pulumiKubernetes.inputMod.batch.v2alpha1

import typings.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CronJobStatus represents the current state of a cron job.
  */
@js.native
trait CronJobStatus extends js.Object {
  
  /**
    * A list of pointers to currently running jobs.
    */
  var active: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.native
  
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  var lastScheduleTime: js.UndefOr[Input[String]] = js.native
}
object CronJobStatus {
  
  @scala.inline
  def apply(): CronJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CronJobStatus]
  }
  
  @scala.inline
  implicit class CronJobStatusOps[Self <: CronJobStatus] (val x: Self) extends AnyVal {
    
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
    def setActiveVarargs(value: Input[ObjectReference]*): Self = this.set("active", js.Array(value :_*))
    
    @scala.inline
    def setActive(value: Input[js.Array[Input[ObjectReference]]]): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setLastScheduleTime(value: Input[String]): Self = this.set("lastScheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastScheduleTime: Self = this.set("lastScheduleTime", js.undefined)
  }
}
