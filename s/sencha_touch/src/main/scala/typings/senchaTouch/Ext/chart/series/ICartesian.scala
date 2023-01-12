package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.chart.axis.IAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICartesian
  extends StObject
     with ISeries {
  
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
    * @param x Object
    * @param y Object
    * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
    */
  @JSName("getItemForPoint")
  var getItemForPoint_ICartesian: js.UndefOr[js.Function2[/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns the value of xAxis
    * @returns Ext.chart.axis.Axis
    */
  var getXAxis: js.UndefOr[js.Function0[IAxis]] = js.undefined
  
  /** [Method] Returns the value of xField
    * @returns String
    */
  var getXField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of yAxis
    * @returns Ext.chart.axis.Axis
    */
  var getYAxis: js.UndefOr[js.Function0[IAxis]] = js.undefined
  
  /** [Method] Returns the value of yField
    * @returns String
    */
  var getYField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Provide legend information to target array
    * @param target Object
    */
  @JSName("provideLegendInfo")
  var provideLegendInfo_ICartesian: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of xAxis
    * @param xAxis Ext.chart.axis.Axis The new value.
    */
  var setXAxis: js.UndefOr[js.Function1[/* xAxis */ js.UndefOr[IAxis], Unit]] = js.undefined
  
  /** [Method] Sets the value of xField
    * @param xField String The new value.
    */
  var setXField: js.UndefOr[js.Function1[/* xField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of yAxis
    * @param yAxis Ext.chart.axis.Axis The new value.
    */
  var setYAxis: js.UndefOr[js.Function1[/* yAxis */ js.UndefOr[IAxis], Unit]] = js.undefined
  
  /** [Method] Sets the value of yField
    * @param yField String The new value.
    */
  var setYField: js.UndefOr[js.Function1[/* yField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (Ext.chart.axis.Axis) */
  var xAxis: js.UndefOr[IAxis] = js.undefined
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.chart.axis.Axis) */
  var yAxis: js.UndefOr[IAxis] = js.undefined
  
  /** [Config Option] (String) */
  var yField: js.UndefOr[String] = js.undefined
}
object ICartesian {
  
  inline def apply(): ICartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesian]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICartesian] (val x: Self) extends AnyVal {
    
    inline def setGetItemForPoint(value: (/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "getItemForPoint", js.Any.fromFunction2(value))
    
    inline def setGetItemForPointUndefined: Self = StObject.set(x, "getItemForPoint", js.undefined)
    
    inline def setGetXAxis(value: () => IAxis): Self = StObject.set(x, "getXAxis", js.Any.fromFunction0(value))
    
    inline def setGetXAxisUndefined: Self = StObject.set(x, "getXAxis", js.undefined)
    
    inline def setGetXField(value: () => String): Self = StObject.set(x, "getXField", js.Any.fromFunction0(value))
    
    inline def setGetXFieldUndefined: Self = StObject.set(x, "getXField", js.undefined)
    
    inline def setGetYAxis(value: () => IAxis): Self = StObject.set(x, "getYAxis", js.Any.fromFunction0(value))
    
    inline def setGetYAxisUndefined: Self = StObject.set(x, "getYAxis", js.undefined)
    
    inline def setGetYField(value: () => String): Self = StObject.set(x, "getYField", js.Any.fromFunction0(value))
    
    inline def setGetYFieldUndefined: Self = StObject.set(x, "getYField", js.undefined)
    
    inline def setProvideLegendInfo(value: /* target */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "provideLegendInfo", js.Any.fromFunction1(value))
    
    inline def setProvideLegendInfoUndefined: Self = StObject.set(x, "provideLegendInfo", js.undefined)
    
    inline def setSetXAxis(value: /* xAxis */ js.UndefOr[IAxis] => Unit): Self = StObject.set(x, "setXAxis", js.Any.fromFunction1(value))
    
    inline def setSetXAxisUndefined: Self = StObject.set(x, "setXAxis", js.undefined)
    
    inline def setSetXField(value: /* xField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setXField", js.Any.fromFunction1(value))
    
    inline def setSetXFieldUndefined: Self = StObject.set(x, "setXField", js.undefined)
    
    inline def setSetYAxis(value: /* yAxis */ js.UndefOr[IAxis] => Unit): Self = StObject.set(x, "setYAxis", js.Any.fromFunction1(value))
    
    inline def setSetYAxisUndefined: Self = StObject.set(x, "setYAxis", js.undefined)
    
    inline def setSetYField(value: /* yField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setYField", js.Any.fromFunction1(value))
    
    inline def setSetYFieldUndefined: Self = StObject.set(x, "setYField", js.undefined)
    
    inline def setXAxis(value: IAxis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
    
    inline def setYAxis(value: IAxis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    
    inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
  }
}
