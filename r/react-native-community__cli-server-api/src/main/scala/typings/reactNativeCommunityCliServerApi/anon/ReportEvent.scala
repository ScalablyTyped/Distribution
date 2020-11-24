package typings.reactNativeCommunityCliServerApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportEvent extends js.Object {
  
  def reportEvent(event: js.Any): Unit = js.native
}
object ReportEvent {
  
  @scala.inline
  def apply(reportEvent: js.Any => Unit): ReportEvent = {
    val __obj = js.Dynamic.literal(reportEvent = js.Any.fromFunction1(reportEvent))
    __obj.asInstanceOf[ReportEvent]
  }
  
  @scala.inline
  implicit class ReportEventOps[Self <: ReportEvent] (val x: Self) extends AnyVal {
    
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
    def setReportEvent(value: js.Any => Unit): Self = this.set("reportEvent", js.Any.fromFunction1(value))
  }
}
