package typings.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrag extends IRecognizer {
  
  /** [Method] Returns the value of minDistance
    * @returns Number
    */
  var getMinDistance: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (Number) */
  var minDistance: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of minDistance
    * @param minDistance Number The new value.
    */
  var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.native
}
object IDrag {
  
  @scala.inline
  def apply(): IDrag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrag]
  }
  
  @scala.inline
  implicit class IDragOps[Self <: IDrag] (val x: Self) extends AnyVal {
    
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
    def setGetMinDistance(value: () => Double): Self = this.set("getMinDistance", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinDistance: Self = this.set("getMinDistance", js.undefined)
    
    @scala.inline
    def setMinDistance(value: Double): Self = this.set("minDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDistance: Self = this.set("minDistance", js.undefined)
    
    @scala.inline
    def setSetMinDistance(value: /* minDistance */ js.UndefOr[Double] => Unit): Self = this.set("setMinDistance", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinDistance: Self = this.set("setMinDistance", js.undefined)
  }
}
