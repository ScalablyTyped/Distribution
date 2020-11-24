package typings.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisabledTimes extends js.Object {
  
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
}
object DisabledTimes {
  
  @scala.inline
  def apply(): DisabledTimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledTimes]
  }
  
  @scala.inline
  implicit class DisabledTimesOps[Self <: DisabledTimes] (val x: Self) extends AnyVal {
    
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
    def setDisabledHours(value: () => js.Array[Double]): Self = this.set("disabledHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    
    @scala.inline
    def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = this.set("disabledMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisabledMinutes: Self = this.set("disabledMinutes", js.undefined)
    
    @scala.inline
    def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = this.set("disabledSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDisabledSeconds: Self = this.set("disabledSeconds", js.undefined)
  }
}
