package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberOfLogicalProcessors extends js.Object {
  
  var numberOfLogicalProcessors: js.UndefOr[Double] = js.native
  
  var unsupported: Boolean = js.native
}
object NumberOfLogicalProcessors {
  
  @scala.inline
  def apply(unsupported: Boolean): NumberOfLogicalProcessors = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfLogicalProcessors]
  }
  
  @scala.inline
  implicit class NumberOfLogicalProcessorsOps[Self <: NumberOfLogicalProcessors] (val x: Self) extends AnyVal {
    
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
    def setUnsupported(value: Boolean): Self = this.set("unsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLogicalProcessors(value: Double): Self = this.set("numberOfLogicalProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLogicalProcessors: Self = this.set("numberOfLogicalProcessors", js.undefined)
  }
}
