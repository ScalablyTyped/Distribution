package typings.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICrosshair extends IAbstract {
  
  /** [Config Option] (Object) */
  var axes: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of axes
    * @returns Object
    */
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of lines
    * @returns Object
    */
  var getLines: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Object) */
  var lines: js.UndefOr[js.Any] = js.native
  
  /** [Method] Placeholder method
    * @param e Object
    */
  @JSName("onGesture")
  var onGesture_ICrosshair: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of axes
    * @param axes Object The new value.
    */
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of lines
    * @param lines Object The new value.
    */
  var setLines: js.UndefOr[js.Function1[/* lines */ js.UndefOr[js.Any], Unit]] = js.native
}
object ICrosshair {
  
  @scala.inline
  def apply(): ICrosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICrosshair]
  }
  
  @scala.inline
  implicit class ICrosshairOps[Self <: ICrosshair] (val x: Self) extends AnyVal {
    
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
    def setAxes(value: js.Any): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    
    @scala.inline
    def setGetAxes(value: () => _): Self = this.set("getAxes", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAxes: Self = this.set("getAxes", js.undefined)
    
    @scala.inline
    def setGetLines(value: () => _): Self = this.set("getLines", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLines: Self = this.set("getLines", js.undefined)
    
    @scala.inline
    def setLines(value: js.Any): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onGesture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGesture: Self = this.set("onGesture", js.undefined)
    
    @scala.inline
    def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = this.set("setAxes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAxes: Self = this.set("setAxes", js.undefined)
    
    @scala.inline
    def setSetLines(value: /* lines */ js.UndefOr[js.Any] => Unit): Self = this.set("setLines", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLines: Self = this.set("setLines", js.undefined)
  }
}
