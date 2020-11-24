package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertView
  extends /* key */ StringDictionary[js.Any] {
  
  var metric_name: js.UndefOr[AssertDetails] = js.native
}
object AssertView {
  
  @scala.inline
  def apply(): AssertView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertView]
  }
  
  @scala.inline
  implicit class AssertViewOps[Self <: AssertView] (val x: Self) extends AnyVal {
    
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
    def setMetric_name(value: AssertDetails): Self = this.set("metric_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric_name: Self = this.set("metric_name", js.undefined)
  }
}
