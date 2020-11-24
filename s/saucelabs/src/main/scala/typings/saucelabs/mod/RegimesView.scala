package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegimesView
  extends /* key */ StringDictionary[js.Any] {
  
  var metric_name: js.UndefOr[js.Array[Active]] = js.native
}
object RegimesView {
  
  @scala.inline
  def apply(): RegimesView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegimesView]
  }
  
  @scala.inline
  implicit class RegimesViewOps[Self <: RegimesView] (val x: Self) extends AnyVal {
    
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
    def setMetric_nameVarargs(value: Active*): Self = this.set("metric_name", js.Array(value :_*))
    
    @scala.inline
    def setMetric_name(value: js.Array[Active]): Self = this.set("metric_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric_name: Self = this.set("metric_name", js.undefined)
  }
}
