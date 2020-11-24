package typings.senchaTouch.Ext.slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToggle extends ISlider {
  
  /** [Method] Sets the increment configuration
    * @returns Number
    */
  @JSName("applyIncrement")
  var applyIncrement_IToggle: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of maxValueCls
    * @returns String
    */
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of minValueCls
    * @returns String
    */
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of maxValueCls
    * @param maxValueCls String The new value.
    */
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of minValueCls
    * @param minValueCls String The new value.
    */
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of value
    * @param newValue Object
    * @param oldValue Object
    */
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object IToggle {
  
  @scala.inline
  def apply(): IToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToggle]
  }
  
  @scala.inline
  implicit class IToggleOps[Self <: IToggle] (val x: Self) extends AnyVal {
    
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
    def setApplyIncrement(value: () => Double): Self = this.set("applyIncrement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteApplyIncrement: Self = this.set("applyIncrement", js.undefined)
    
    @scala.inline
    def setGetMaxValueCls(value: () => String): Self = this.set("getMaxValueCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxValueCls: Self = this.set("getMaxValueCls", js.undefined)
    
    @scala.inline
    def setGetMinValueCls(value: () => String): Self = this.set("getMinValueCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinValueCls: Self = this.set("getMinValueCls", js.undefined)
    
    @scala.inline
    def setMaxValueCls(value: String): Self = this.set("maxValueCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValueCls: Self = this.set("maxValueCls", js.undefined)
    
    @scala.inline
    def setMinValueCls(value: String): Self = this.set("minValueCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValueCls: Self = this.set("minValueCls", js.undefined)
    
    @scala.inline
    def setSetMaxValueCls(value: /* maxValueCls */ js.UndefOr[String] => Unit): Self = this.set("setMaxValueCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxValueCls: Self = this.set("setMaxValueCls", js.undefined)
    
    @scala.inline
    def setSetMinValueCls(value: /* minValueCls */ js.UndefOr[String] => Unit): Self = this.set("setMinValueCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinValueCls: Self = this.set("setMinValueCls", js.undefined)
    
    @scala.inline
    def setSetValue(value: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Unit): Self = this.set("setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
}
