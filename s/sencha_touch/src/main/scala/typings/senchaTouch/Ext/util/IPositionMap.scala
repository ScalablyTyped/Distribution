package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositionMap extends IBase {
  
  /** [Method] Returns the value of minimumHeight
    * @returns Number
    */
  var getMinimumHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of minimumHeight
    * @param minimumHeight Number The new value.
    */
  var setMinimumHeight: js.UndefOr[js.Function1[/* minimumHeight */ js.UndefOr[Double], Unit]] = js.native
}
object IPositionMap {
  
  @scala.inline
  def apply(): IPositionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionMap]
  }
  
  @scala.inline
  implicit class IPositionMapOps[Self <: IPositionMap] (val x: Self) extends AnyVal {
    
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
    def setGetMinimumHeight(value: () => Double): Self = this.set("getMinimumHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinimumHeight: Self = this.set("getMinimumHeight", js.undefined)
    
    @scala.inline
    def setSetMinimumHeight(value: /* minimumHeight */ js.UndefOr[Double] => Unit): Self = this.set("setMinimumHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinimumHeight: Self = this.set("setMinimumHeight", js.undefined)
  }
}
