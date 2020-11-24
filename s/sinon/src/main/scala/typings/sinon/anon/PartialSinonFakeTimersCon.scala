package typings.sinon.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<sinon.sinon.SinonFakeTimersConfig> */
@js.native
trait PartialSinonFakeTimersCon extends js.Object {
  
  var now: js.UndefOr[Double | Date] = js.native
  
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.native
  
  var toFake: js.UndefOr[js.Array[String]] = js.native
}
object PartialSinonFakeTimersCon {
  
  @scala.inline
  def apply(): PartialSinonFakeTimersCon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonFakeTimersCon]
  }
  
  @scala.inline
  implicit class PartialSinonFakeTimersConOps[Self <: PartialSinonFakeTimersCon] (val x: Self) extends AnyVal {
    
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
    def setNow(value: Double | Date): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setShouldAdvanceTime(value: Boolean): Self = this.set("shouldAdvanceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldAdvanceTime: Self = this.set("shouldAdvanceTime", js.undefined)
    
    @scala.inline
    def setToFakeVarargs(value: String*): Self = this.set("toFake", js.Array(value :_*))
    
    @scala.inline
    def setToFake(value: js.Array[String]): Self = this.set("toFake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToFake: Self = this.set("toFake", js.undefined)
  }
}
