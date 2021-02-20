package typings.senchaTouch.Ext.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToggle extends ISlider {
  
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
  implicit class IToggleMutableBuilder[Self <: IToggle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveLabel(value: String): Self = StObject.set(x, "activeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveLabelUndefined: Self = StObject.set(x, "activeLabel", js.undefined)
    
    @scala.inline
    def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    @scala.inline
    def setGetActiveLabel(value: () => String): Self = StObject.set(x, "getActiveLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveLabelUndefined: Self = StObject.set(x, "getActiveLabel", js.undefined)
    
    @scala.inline
    def setGetInactiveLabel(value: () => String): Self = StObject.set(x, "getInactiveLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInactiveLabelUndefined: Self = StObject.set(x, "getInactiveLabel", js.undefined)
    
    @scala.inline
    def setGetMaxValueCls(value: () => String): Self = StObject.set(x, "getMaxValueCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxValueClsUndefined: Self = StObject.set(x, "getMaxValueCls", js.undefined)
    
    @scala.inline
    def setGetMinValueCls(value: () => String): Self = StObject.set(x, "getMinValueCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinValueClsUndefined: Self = StObject.set(x, "getMinValueCls", js.undefined)
    
    @scala.inline
    def setInactiveLabel(value: String): Self = StObject.set(x, "inactiveLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveLabelUndefined: Self = StObject.set(x, "inactiveLabel", js.undefined)
    
    @scala.inline
    def setMaxValueCls(value: String): Self = StObject.set(x, "maxValueCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueClsUndefined: Self = StObject.set(x, "maxValueCls", js.undefined)
    
    @scala.inline
    def setMinValueCls(value: String): Self = StObject.set(x, "minValueCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueClsUndefined: Self = StObject.set(x, "minValueCls", js.undefined)
    
    @scala.inline
    def setSetActiveLabel(value: /* activeLabel */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setActiveLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveLabelUndefined: Self = StObject.set(x, "setActiveLabel", js.undefined)
    
    @scala.inline
    def setSetInactiveLabel(value: /* inactiveLabel */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setInactiveLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInactiveLabelUndefined: Self = StObject.set(x, "setInactiveLabel", js.undefined)
    
    @scala.inline
    def setSetMaxValueCls(value: /* maxValueCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMaxValueCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxValueClsUndefined: Self = StObject.set(x, "setMaxValueCls", js.undefined)
    
    @scala.inline
    def setSetMinValueCls(value: /* minValueCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMinValueCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValueClsUndefined: Self = StObject.set(x, "setMinValueCls", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* newValue */ js.UndefOr[Double] => _): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setToggle(value: () => _): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
