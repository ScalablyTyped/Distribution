package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active
  extends /* key */ StringDictionary[js.Any] {
  
  var active: Boolean = js.native
  
  var baseline: js.UndefOr[Dictkey] = js.native
  
  var baseline_url: String = js.native
  
  var regime_end: Double = js.native
  
  var regime_start: Double = js.native
}
object Active {
  
  @scala.inline
  def apply(active: Boolean, baseline_url: String, regime_end: Double, regime_start: Double): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], baseline_url = baseline_url.asInstanceOf[js.Any], regime_end = regime_end.asInstanceOf[js.Any], regime_start = regime_start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseline_url(value: String): Self = this.set("baseline_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegime_end(value: Double): Self = this.set("regime_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegime_start(value: Double): Self = this.set("regime_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseline(value: Dictkey): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
  }
}
