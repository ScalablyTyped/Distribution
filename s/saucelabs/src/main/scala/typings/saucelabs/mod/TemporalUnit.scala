package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporalUnit
  extends /* key */ StringDictionary[js.Any] {
  
  var dateBased: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Duration] = js.native
  
  var durationEstimated: js.UndefOr[Boolean] = js.native
  
  var timeBased: js.UndefOr[Boolean] = js.native
}
object TemporalUnit {
  
  @scala.inline
  def apply(): TemporalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalUnit]
  }
  
  @scala.inline
  implicit class TemporalUnitOps[Self <: TemporalUnit] (val x: Self) extends AnyVal {
    
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
    def setDateBased(value: Boolean): Self = this.set("dateBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateBased: Self = this.set("dateBased", js.undefined)
    
    @scala.inline
    def setDuration(value: Duration): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationEstimated(value: Boolean): Self = this.set("durationEstimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationEstimated: Self = this.set("durationEstimated", js.undefined)
    
    @scala.inline
    def setTimeBased(value: Boolean): Self = this.set("timeBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeBased: Self = this.set("timeBased", js.undefined)
  }
}
