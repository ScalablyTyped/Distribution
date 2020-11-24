package typings.reactIntl.componentsRelativeMod

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var currentValueInSeconds: Double = js.native
  
  var prevUnit: js.UndefOr[RelativeTimeUnit] = js.native
  
  var prevValue: js.UndefOr[Double] = js.native
}
object State {
  
  @scala.inline
  def apply(currentValueInSeconds: Double): State = {
    val __obj = js.Dynamic.literal(currentValueInSeconds = currentValueInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setCurrentValueInSeconds(value: Double): Self = this.set("currentValueInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUnit(value: RelativeTimeUnit): Self = this.set("prevUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevUnit: Self = this.set("prevUnit", js.undefined)
    
    @scala.inline
    def setPrevValue(value: Double): Self = this.set("prevValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevValue: Self = this.set("prevValue", js.undefined)
  }
}
