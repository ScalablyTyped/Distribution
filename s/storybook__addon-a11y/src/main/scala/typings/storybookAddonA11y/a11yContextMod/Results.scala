package typings.storybookAddonA11y.a11yContextMod

import typings.axeCore.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results extends js.Object {
  
  var incomplete: js.Array[Result] = js.native
  
  var passes: js.Array[Result] = js.native
  
  var violations: js.Array[Result] = js.native
}
object Results {
  
  @scala.inline
  def apply(incomplete: js.Array[Result], passes: js.Array[Result], violations: js.Array[Result]): Results = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    
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
    def setIncompleteVarargs(value: Result*): Self = this.set("incomplete", js.Array(value :_*))
    
    @scala.inline
    def setIncomplete(value: js.Array[Result]): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassesVarargs(value: Result*): Self = this.set("passes", js.Array(value :_*))
    
    @scala.inline
    def setPasses(value: js.Array[Result]): Self = this.set("passes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationsVarargs(value: Result*): Self = this.set("violations", js.Array(value :_*))
    
    @scala.inline
    def setViolations(value: js.Array[Result]): Self = this.set("violations", value.asInstanceOf[js.Any])
  }
}
