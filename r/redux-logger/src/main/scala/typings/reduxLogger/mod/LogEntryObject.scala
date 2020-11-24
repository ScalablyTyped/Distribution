package typings.reduxLogger.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntryObject extends js.Object {
  
  var action: js.UndefOr[String | Boolean | ActionToString] = js.native
  
  var error: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
  
  var nextState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  
  var prevState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  
  var started: js.UndefOr[Double] = js.native
  
  var startedTime: js.UndefOr[Date] = js.native
  
  var took: js.UndefOr[Double] = js.native
}
object LogEntryObject {
  
  @scala.inline
  def apply(): LogEntryObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntryObject]
  }
  
  @scala.inline
  implicit class LogEntryObjectOps[Self <: LogEntryObject] (val x: Self) extends AnyVal {
    
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
    def setActionFunction1(value: /* action */ js.Any => String): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAction(value: String | Boolean | ActionToString): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setError(value: /* error */ js.Any => _): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setNextState(value: /* state */ js.Any => _): Self = this.set("nextState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNextState: Self = this.set("nextState", js.undefined)
    
    @scala.inline
    def setPrevState(value: /* state */ js.Any => _): Self = this.set("prevState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrevState: Self = this.set("prevState", js.undefined)
    
    @scala.inline
    def setStarted(value: Double): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
    
    @scala.inline
    def setStartedTime(value: Date): Self = this.set("startedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedTime: Self = this.set("startedTime", js.undefined)
    
    @scala.inline
    def setTook(value: Double): Self = this.set("took", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTook: Self = this.set("took", js.undefined)
  }
}
