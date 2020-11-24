package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.chart.axis.IAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICartesian extends ISeries {
  
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
    * @param x Object
    * @param y Object
    * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
    */
  @JSName("getItemForPoint")
  var getItemForPoint_ICartesian: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of xAxis
    * @returns Ext.chart.axis.Axis
    */
  var getXAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  
  /** [Method] Returns the value of xField
    * @returns String
    */
  var getXField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of yAxis
    * @returns Ext.chart.axis.Axis
    */
  var getYAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  
  /** [Method] Returns the value of yField
    * @returns String
    */
  var getYField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Provide legend information to target array
    * @param target Object
    */
  @JSName("provideLegendInfo")
  var provideLegendInfo_ICartesian: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of xAxis
    * @param xAxis Ext.chart.axis.Axis The new value.
    */
  var setXAxis: js.UndefOr[js.Function1[/* xAxis */ js.UndefOr[IAxis], Unit]] = js.native
  
  /** [Method] Sets the value of xField
    * @param xField String The new value.
    */
  var setXField: js.UndefOr[js.Function1[/* xField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of yAxis
    * @param yAxis Ext.chart.axis.Axis The new value.
    */
  var setYAxis: js.UndefOr[js.Function1[/* yAxis */ js.UndefOr[IAxis], Unit]] = js.native
  
  /** [Method] Sets the value of yField
    * @param yField String The new value.
    */
  var setYField: js.UndefOr[js.Function1[/* yField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (Ext.chart.axis.Axis) */
  var xAxis: js.UndefOr[IAxis] = js.native
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.chart.axis.Axis) */
  var yAxis: js.UndefOr[IAxis] = js.native
  
  /** [Config Option] (String) */
  var yField: js.UndefOr[String] = js.native
}
object ICartesian {
  
  @scala.inline
  def apply(): ICartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesian]
  }
  
  @scala.inline
  implicit class ICartesianOps[Self <: ICartesian] (val x: Self) extends AnyVal {
    
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
    def setGetItemForPoint(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => _): Self = this.set("getItemForPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemForPoint: Self = this.set("getItemForPoint", js.undefined)
    
    @scala.inline
    def setGetXAxis(value: () => IAxis): Self = this.set("getXAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXAxis: Self = this.set("getXAxis", js.undefined)
    
    @scala.inline
    def setGetXField(value: () => String): Self = this.set("getXField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXField: Self = this.set("getXField", js.undefined)
    
    @scala.inline
    def setGetYAxis(value: () => IAxis): Self = this.set("getYAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetYAxis: Self = this.set("getYAxis", js.undefined)
    
    @scala.inline
    def setGetYField(value: () => String): Self = this.set("getYField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetYField: Self = this.set("getYField", js.undefined)
    
    @scala.inline
    def setProvideLegendInfo(value: /* target */ js.UndefOr[js.Any] => Unit): Self = this.set("provideLegendInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProvideLegendInfo: Self = this.set("provideLegendInfo", js.undefined)
    
    @scala.inline
    def setSetXAxis(value: /* xAxis */ js.UndefOr[IAxis] => Unit): Self = this.set("setXAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetXAxis: Self = this.set("setXAxis", js.undefined)
    
    @scala.inline
    def setSetXField(value: /* xField */ js.UndefOr[String] => Unit): Self = this.set("setXField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetXField: Self = this.set("setXField", js.undefined)
    
    @scala.inline
    def setSetYAxis(value: /* yAxis */ js.UndefOr[IAxis] => Unit): Self = this.set("setYAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetYAxis: Self = this.set("setYAxis", js.undefined)
    
    @scala.inline
    def setSetYField(value: /* yField */ js.UndefOr[String] => Unit): Self = this.set("setYField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetYField: Self = this.set("setYField", js.undefined)
    
    @scala.inline
    def setXAxis(value: IAxis): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
    
    @scala.inline
    def setYAxis(value: IAxis): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    
    @scala.inline
    def setYField(value: String): Self = this.set("yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
}
