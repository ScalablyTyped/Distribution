package typings.protractor.pluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecResult extends js.Object {
  
  var assertions: js.Array[AssertionResult] = js.native
  
  var description: String = js.native
}
object SpecResult {
  
  @scala.inline
  def apply(assertions: js.Array[AssertionResult], description: String): SpecResult = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecResult]
  }
  
  @scala.inline
  implicit class SpecResultOps[Self <: SpecResult] (val x: Self) extends AnyVal {
    
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
    def setAssertionsVarargs(value: AssertionResult*): Self = this.set("assertions", js.Array(value :_*))
    
    @scala.inline
    def setAssertions(value: js.Array[AssertionResult]): Self = this.set("assertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
  }
}
