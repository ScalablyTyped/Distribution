package typings.sentryTypes.exceptionMod

import typings.sentryTypes.mechanismMod.Mechanism
import typings.sentryTypes.stacktraceMod.Stacktrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exception extends js.Object {
  
  var mechanism: js.UndefOr[Mechanism] = js.native
  
  var module: js.UndefOr[String] = js.native
  
  var stacktrace: js.UndefOr[Stacktrace] = js.native
  
  var thread_id: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object Exception {
  
  @scala.inline
  def apply(): Exception = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exception]
  }
  
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
    
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
    def setMechanism(value: Mechanism): Self = this.set("mechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMechanism: Self = this.set("mechanism", js.undefined)
    
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setStacktrace(value: Stacktrace): Self = this.set("stacktrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacktrace: Self = this.set("stacktrace", js.undefined)
    
    @scala.inline
    def setThread_id(value: Double): Self = this.set("thread_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThread_id: Self = this.set("thread_id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
