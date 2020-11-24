package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToggle
  extends typings.senchaTouch.Ext.field.ISlider {
  
  /** [Config Option] (String) */
  var activeLabel: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IToggle: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of activeLabel
    * @returns String
    */
  var getActiveLabel: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of inactiveLabel
    * @returns String
    */
  var getInactiveLabel: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of maxValueCls
    * @returns String
    */
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of minValueCls
    * @returns String
    */
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var inactiveLabel: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of activeLabel
    * @param activeLabel String The new value.
    */
  var setActiveLabel: js.UndefOr[js.Function1[/* activeLabel */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of inactiveLabel
    * @param inactiveLabel String The new value.
    */
  var setInactiveLabel: js.UndefOr[js.Function1[/* inactiveLabel */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of maxValueCls
    * @param maxValueCls String The new value.
    */
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of minValueCls
    * @param minValueCls String The new value.
    */
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of the toggle
    * @param newValue Number 1 for toggled, 0 for untoggled.
    * @returns Object this
    */
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Toggles the value of this toggle field
    * @returns Object this
    */
  var toggle: js.UndefOr[js.Function0[_]] = js.native
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
    def setActiveLabel(value: String): Self = this.set("activeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveLabel: Self = this.set("activeLabel", js.undefined)
    
    @scala.inline
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    
    @scala.inline
    def setGetActiveLabel(value: () => String): Self = this.set("getActiveLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActiveLabel: Self = this.set("getActiveLabel", js.undefined)
    
    @scala.inline
    def setGetInactiveLabel(value: () => String): Self = this.set("getInactiveLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInactiveLabel: Self = this.set("getInactiveLabel", js.undefined)
    
    @scala.inline
    def setGetMaxValueCls(value: () => String): Self = this.set("getMaxValueCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxValueCls: Self = this.set("getMaxValueCls", js.undefined)
    
    @scala.inline
    def setGetMinValueCls(value: () => String): Self = this.set("getMinValueCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinValueCls: Self = this.set("getMinValueCls", js.undefined)
    
    @scala.inline
    def setInactiveLabel(value: String): Self = this.set("inactiveLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveLabel: Self = this.set("inactiveLabel", js.undefined)
    
    @scala.inline
    def setMaxValueCls(value: String): Self = this.set("maxValueCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValueCls: Self = this.set("maxValueCls", js.undefined)
    
    @scala.inline
    def setMinValueCls(value: String): Self = this.set("minValueCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValueCls: Self = this.set("minValueCls", js.undefined)
    
    @scala.inline
    def setSetActiveLabel(value: /* activeLabel */ js.UndefOr[String] => Unit): Self = this.set("setActiveLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveLabel: Self = this.set("setActiveLabel", js.undefined)
    
    @scala.inline
    def setSetInactiveLabel(value: /* inactiveLabel */ js.UndefOr[String] => Unit): Self = this.set("setInactiveLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInactiveLabel: Self = this.set("setInactiveLabel", js.undefined)
    
    @scala.inline
    def setSetMaxValueCls(value: /* maxValueCls */ js.UndefOr[String] => Unit): Self = this.set("setMaxValueCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxValueCls: Self = this.set("setMaxValueCls", js.undefined)
    
    @scala.inline
    def setSetMinValueCls(value: /* minValueCls */ js.UndefOr[String] => Unit): Self = this.set("setMinValueCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinValueCls: Self = this.set("setMinValueCls", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* newValue */ js.UndefOr[Double] => _): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setToggle(value: () => _): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
