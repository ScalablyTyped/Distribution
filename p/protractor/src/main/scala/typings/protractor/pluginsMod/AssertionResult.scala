package typings.protractor.pluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertionResult extends js.Object {
  
  var errorMsg: js.UndefOr[String] = js.native
  
  var passed: Boolean = js.native
  
  var stackTrace: js.UndefOr[String] = js.native
}
object AssertionResult {
  
  @scala.inline
  def apply(passed: Boolean): AssertionResult = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
  
  @scala.inline
  implicit class AssertionResultOps[Self <: AssertionResult] (val x: Self) extends AnyVal {
    
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
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMsg(value: String): Self = this.set("errorMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMsg: Self = this.set("errorMsg", js.undefined)
    
    @scala.inline
    def setStackTrace(value: String): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
  }
}
