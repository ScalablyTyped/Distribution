package typings.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRotate extends IAbstract {
  
  /** [Method] Placeholder method
    * @param e Object
    */
  @JSName("onGesture")
  var onGesture_IRotate: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}
object IRotate {
  
  @scala.inline
  def apply(): IRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRotate]
  }
  
  @scala.inline
  implicit class IRotateOps[Self <: IRotate] (val x: Self) extends AnyVal {
    
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
    def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onGesture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGesture: Self = this.set("onGesture", js.undefined)
  }
}
