package typings.senchaTouch.Ext.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToggle
  extends StObject
     with ISlider {
  
  /** [Config Option] (String) */
  var activeLabel: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IToggle: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of activeLabel
    * @returns String
    */
  var getActiveLabel: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of inactiveLabel
    * @returns String
    */
  var getInactiveLabel: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of maxValueCls
    * @returns String
    */
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of minValueCls
    * @returns String
    */
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var inactiveLabel: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of activeLabel
    * @param activeLabel String The new value.
    */
  var setActiveLabel: js.UndefOr[js.Function1[/* activeLabel */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of inactiveLabel
    * @param inactiveLabel String The new value.
    */
  var setInactiveLabel: js.UndefOr[js.Function1[/* inactiveLabel */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxValueCls
    * @param maxValueCls String The new value.
    */
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of minValueCls
    * @param minValueCls String The new value.
    */
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of the toggle
    * @param newValue Number 1 for toggled, 0 for untoggled.
    * @returns Object this
    */
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[Double], Any]] = js.undefined
  
  /** [Method] Toggles the value of this toggle field
    * @returns Object this
    */
  var toggle: js.UndefOr[js.Function0[Any]] = js.undefined
}
object IToggle {
  
  inline def apply(): IToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IToggle] (val x: Self) extends AnyVal {
    
    inline def setActiveLabel(value: String): Self = StObject.set(x, "activeLabel", value.asInstanceOf[js.Any])
    
    inline def setActiveLabelUndefined: Self = StObject.set(x, "activeLabel", js.undefined)
    
    inline def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setGetActiveLabel(value: () => String): Self = StObject.set(x, "getActiveLabel", js.Any.fromFunction0(value))
    
    inline def setGetActiveLabelUndefined: Self = StObject.set(x, "getActiveLabel", js.undefined)
    
    inline def setGetInactiveLabel(value: () => String): Self = StObject.set(x, "getInactiveLabel", js.Any.fromFunction0(value))
    
    inline def setGetInactiveLabelUndefined: Self = StObject.set(x, "getInactiveLabel", js.undefined)
    
    inline def setGetMaxValueCls(value: () => String): Self = StObject.set(x, "getMaxValueCls", js.Any.fromFunction0(value))
    
    inline def setGetMaxValueClsUndefined: Self = StObject.set(x, "getMaxValueCls", js.undefined)
    
    inline def setGetMinValueCls(value: () => String): Self = StObject.set(x, "getMinValueCls", js.Any.fromFunction0(value))
    
    inline def setGetMinValueClsUndefined: Self = StObject.set(x, "getMinValueCls", js.undefined)
    
    inline def setInactiveLabel(value: String): Self = StObject.set(x, "inactiveLabel", value.asInstanceOf[js.Any])
    
    inline def setInactiveLabelUndefined: Self = StObject.set(x, "inactiveLabel", js.undefined)
    
    inline def setMaxValueCls(value: String): Self = StObject.set(x, "maxValueCls", value.asInstanceOf[js.Any])
    
    inline def setMaxValueClsUndefined: Self = StObject.set(x, "maxValueCls", js.undefined)
    
    inline def setMinValueCls(value: String): Self = StObject.set(x, "minValueCls", value.asInstanceOf[js.Any])
    
    inline def setMinValueClsUndefined: Self = StObject.set(x, "minValueCls", js.undefined)
    
    inline def setSetActiveLabel(value: /* activeLabel */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setActiveLabel", js.Any.fromFunction1(value))
    
    inline def setSetActiveLabelUndefined: Self = StObject.set(x, "setActiveLabel", js.undefined)
    
    inline def setSetInactiveLabel(value: /* inactiveLabel */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setInactiveLabel", js.Any.fromFunction1(value))
    
    inline def setSetInactiveLabelUndefined: Self = StObject.set(x, "setInactiveLabel", js.undefined)
    
    inline def setSetMaxValueCls(value: /* maxValueCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMaxValueCls", js.Any.fromFunction1(value))
    
    inline def setSetMaxValueClsUndefined: Self = StObject.set(x, "setMaxValueCls", js.undefined)
    
    inline def setSetMinValueCls(value: /* minValueCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMinValueCls", js.Any.fromFunction1(value))
    
    inline def setSetMinValueClsUndefined: Self = StObject.set(x, "setMinValueCls", js.undefined)
    
    inline def setSetValue(value: /* newValue */ js.UndefOr[Double] => Any): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setToggle(value: () => Any): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
