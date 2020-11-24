package typings.rrule.rrulestrMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRuleStrOptions extends js.Object {
  
  var cache: Boolean = js.native
  
  var compatible: Boolean = js.native
  
  var dtstart: Date | Null = js.native
  
  var forceset: Boolean = js.native
  
  var tzid: String | Null = js.native
  
  var unfold: Boolean = js.native
}
object RRuleStrOptions {
  
  @scala.inline
  def apply(cache: Boolean, compatible: Boolean, forceset: Boolean, unfold: Boolean): RRuleStrOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], compatible = compatible.asInstanceOf[js.Any], forceset = forceset.asInstanceOf[js.Any], unfold = unfold.asInstanceOf[js.Any])
    __obj.asInstanceOf[RRuleStrOptions]
  }
  
  @scala.inline
  implicit class RRuleStrOptionsOps[Self <: RRuleStrOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatible(value: Boolean): Self = this.set("compatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceset(value: Boolean): Self = this.set("forceset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfold(value: Boolean): Self = this.set("unfold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtstart(value: Date): Self = this.set("dtstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtstartNull: Self = this.set("dtstart", null)
    
    @scala.inline
    def setTzid(value: String): Self = this.set("tzid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTzidNull: Self = this.set("tzid", null)
  }
}
